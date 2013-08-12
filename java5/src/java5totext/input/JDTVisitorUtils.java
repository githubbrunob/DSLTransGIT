 /*******************************************************************************
 * Copyright (c) 2008 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sébastien Minguet (Mia-Software) - initial API and implementation
 *    Frédéric Madiot (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Erwan Breton (Sodifrance) - initial API and implementation
 *******************************************************************************/

package java5totext.input;

import java.util.Iterator;
import java5totext.input.binding.Binding;
import java5totext.input.binding.JDTDelegateBindingFactory;

import Java5.ArrayType;
import Java5.MethodDeclaration;
import Java5.Modifier;
import Java5.NamedElement;
import Java5.NamedElementRef;
import Java5.ParameterizedType;
import Java5.PrimitiveType;
import Java5.WildCardType;


/**
 * The class provides tools for the JDTVisitor
 * @author Fabien Giquel, Sebastien Minguet  *
 */
public class JDTVisitorUtils {
	
	public static  void manageBindingDeclaration(NamedElement element, org.eclipse.jdt.core.dom.Name name, JDTVisitor visitor) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForName(name);
		if (!id.isUnresolved()) {// in some circonstances JDT may not resolve a declaration (too many compil errors ?), we do not want to register a wrong qualified target
			if (JDTDelegateBindingFactory.getInstance().isLocalVariable(name)) {
				visitor.localBindings.addTarget(id.toString(), element);
			}
			else {
				visitor.globalBindings.addTarget(id.toString(), element);
			}
		}
	}
	
	public static  void manageBindingRef(NamedElementRef element, org.eclipse.jdt.core.dom.Name name, JDTVisitor visitor) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForName(name);
		if (JDTDelegateBindingFactory.getInstance().isLocalVariable(name)) {
			visitor.localBindings.addPending(element, id);
		}
		else {
			visitor.globalBindings.addPending(element, id);
		}
	}
	
	public static  void manageBindingRef(NamedElementRef element, org.eclipse.jdt.core.dom.Type type, JDTVisitor visitor) {
		if (type instanceof org.eclipse.jdt.core.dom.SimpleType) {
			JDTVisitorUtils.manageBindingRef(element, (org.eclipse.jdt.core.dom.SimpleType)type, visitor);
		}
		else if (type instanceof org.eclipse.jdt.core.dom.PrimitiveType) {
			JDTVisitorUtils.manageBindingRef(element, (org.eclipse.jdt.core.dom.PrimitiveType)type, visitor);
		}
		else if (type instanceof org.eclipse.jdt.core.dom.ParameterizedType) {
			JDTVisitorUtils.manageBindingRef(element, (org.eclipse.jdt.core.dom.ParameterizedType)type, visitor);
		}
		else if (type instanceof org.eclipse.jdt.core.dom.WildcardType) {
			JDTVisitorUtils.manageBindingRef(element, (org.eclipse.jdt.core.dom.WildcardType)type, visitor);
		}
		else if (type instanceof org.eclipse.jdt.core.dom.ArrayType) {
			JDTVisitorUtils.manageBindingRef(element, (org.eclipse.jdt.core.dom.ArrayType)type, visitor);
		}
	}
	
	public static void manageBindingRef(NamedElementRef element, org.eclipse.jdt.core.dom.SimpleType type, JDTVisitor visitor) {
		JDTVisitorUtils.manageBindingRef(element, type.getName(), visitor);
	}
	
	public static  void manageBindingRef(NamedElementRef element, org.eclipse.jdt.core.dom.PrimitiveType type, JDTVisitor visitor) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForPrimitiveType(type);
		PrimitiveType primitiveType= (PrimitiveType) visitor.globalBindings.getTarget(id.toString());
		if (primitiveType == null) {
			String idPrimitive = type.getPrimitiveTypeCode().toString();
			if (org.eclipse.jdt.core.dom.PrimitiveType.INT == type.getPrimitiveTypeCode())
				primitiveType = visitor.getFactory().createPrimitiveTypeInt();
			else if (org.eclipse.jdt.core.dom.PrimitiveType.LONG == type.getPrimitiveTypeCode())
				primitiveType = visitor.getFactory().createPrimitiveTypeLong();
			else if (org.eclipse.jdt.core.dom.PrimitiveType.FLOAT == type.getPrimitiveTypeCode())
				primitiveType = visitor.getFactory().createPrimitiveTypeFloat();
			else if (org.eclipse.jdt.core.dom.PrimitiveType.DOUBLE == type.getPrimitiveTypeCode())
				primitiveType = visitor.getFactory().createPrimitiveTypeDouble();
			else if (org.eclipse.jdt.core.dom.PrimitiveType.BOOLEAN == type.getPrimitiveTypeCode())
				primitiveType = visitor.getFactory().createPrimitiveTypeBoolean();
			else if (org.eclipse.jdt.core.dom.PrimitiveType.VOID == type.getPrimitiveTypeCode())
				primitiveType = visitor.getFactory().createPrimitiveTypeVoid();
			else if (org.eclipse.jdt.core.dom.PrimitiveType.CHAR== type.getPrimitiveTypeCode())
				primitiveType = visitor.getFactory().createPrimitiveTypeChar();
			else if (org.eclipse.jdt.core.dom.PrimitiveType.SHORT == type.getPrimitiveTypeCode())
				primitiveType = visitor.getFactory().createPrimitiveTypeShort();
			else if (org.eclipse.jdt.core.dom.PrimitiveType.BYTE == type.getPrimitiveTypeCode())
				primitiveType = visitor.getFactory().createPrimitiveTypeByte();
			else
				primitiveType = visitor.getFactory().createPrimitiveType();
			primitiveType.setName(idPrimitive);
			visitor.getJdtModel().getOrphanTypes().add(primitiveType);
			visitor.globalBindings.addTarget(id.toString(), primitiveType);
		}		
		element.setElement(primitiveType);		
		
	}
	
	public static   void manageBindingRef(NamedElementRef element, org.eclipse.jdt.core.dom.ParameterizedType type, JDTVisitor visitor) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForParameterizedType(type);
		ParameterizedType parameterizedType = (ParameterizedType) visitor.globalBindings.getTarget(id.toString());
		if (parameterizedType == null) {
			parameterizedType = visitor.getFactory().createParameterizedType();
			// only for informations
			parameterizedType.setName(type.toString());
			if (visitor.getBijectiveMap().get(type.getType()) != null) {
				parameterizedType.setType((NamedElementRef) visitor.getBijectiveMap().get(type.getType()));
			}
			for (Iterator<?> i=type.typeArguments().iterator()  ;i.hasNext();){
				NamedElementRef itElement= (NamedElementRef) visitor.getBijectiveMap().get(i.next());
				if (itElement != null)
					parameterizedType.getTypeArguments().add(itElement);
			}
			visitor.getJdtModel().getOrphanTypes().add(parameterizedType);
			visitor.globalBindings.addTarget(id.toString(), parameterizedType);
		}		
		element.setElement(parameterizedType);		
	}
	
	public static   void manageBindingRef(NamedElementRef element, org.eclipse.jdt.core.dom.WildcardType type, JDTVisitor visitor) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForWildCardType(type);
		WildCardType wildCardType= (WildCardType) visitor.globalBindings.getTarget(id.toString());
		if (wildCardType == null) {
			wildCardType = visitor.getFactory().createWildCardType();
			wildCardType.setName(JDTDelegateBindingFactory.WILDCARD_SYMBOL);
			if (visitor.getBijectiveMap().get(type.getBound()) != null)
				wildCardType.setBound((NamedElementRef) visitor.getBijectiveMap().get(type.getBound()));
			wildCardType.setIsUpperBound(type.isUpperBound());
			visitor.getJdtModel().getOrphanTypes().add(wildCardType);
			visitor.globalBindings.addTarget(id.toString(), wildCardType);
		}		
		element.setElement(wildCardType);		
	}
	
	public static  void manageBindingRef(NamedElementRef element, org.eclipse.jdt.core.dom.ArrayType type, JDTVisitor visitor) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForArrayType(type);
		ArrayType arrayType= (ArrayType) visitor.globalBindings.getTarget(id.toString());
		if (arrayType == null) {
			arrayType = visitor.getFactory().createArrayType();
			arrayType.setDimensions(type.getDimensions());
			arrayType.setProxy(true);
			arrayType.setName(type.toString());
			if (visitor.getBijectiveMap().get(type.getElementType()) != null) {
				arrayType.setElementType((NamedElementRef) visitor.getBijectiveMap().get(type.getElementType()));
			}
			visitor.getJdtModel().getOrphanTypes().add(arrayType);
			visitor.globalBindings.addTarget(id.toString(), arrayType);
		}
		element.setElement(arrayType);	
	}
	
	public static void manageBindingRef(NamedElementRef element, org.eclipse.jdt.core.dom.ClassInstanceCreation constructorCall, JDTVisitor visitor) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForClassInstanceCreation(constructorCall);
		MethodDeclaration method = (MethodDeclaration) visitor.globalBindings.getTarget(id.toString());
		if (method != null)
			element.setElement(method);
		else
			visitor.globalBindings.addPending(element, id);
	}
	
	public static void manageBindingRef(NamedElementRef element, org.eclipse.jdt.core.dom.ConstructorInvocation constructorCall, JDTVisitor visitor) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForConstructorInvocation(constructorCall);
		MethodDeclaration method = (MethodDeclaration) visitor.globalBindings.getTarget(id.toString());
		if (method != null)
			element.setElement(method);
		else
			visitor.globalBindings.addPending(element, id);
	}
	
	public static void manageBindingRef(NamedElementRef element, org.eclipse.jdt.core.dom.SuperConstructorInvocation constructorCall, JDTVisitor visitor) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForSuperConstructorInvocation(constructorCall);
		MethodDeclaration method = (MethodDeclaration) visitor.globalBindings.getTarget(id.toString());
		if (method != null)
			element.setElement(method);
		else
			visitor.globalBindings.addPending(element, id);
	}
	
	public static  Modifier getModifier(int jdtModifier, JDTVisitor visitor) {
		Modifier resultModifer= visitor.getFactory().createModifier();
		if (org.eclipse.jdt.core.dom.Modifier.isPrivate(jdtModifier))
			resultModifer.setVisibility(org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.PRIVATE_KEYWORD.toString());
		if (org.eclipse.jdt.core.dom.Modifier.isProtected(jdtModifier))
			resultModifer.setVisibility(org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.PROTECTED_KEYWORD.toString());
		if (org.eclipse.jdt.core.dom.Modifier.isPublic(jdtModifier))
			resultModifer.setVisibility(org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.PUBLIC_KEYWORD.toString());
		if (org.eclipse.jdt.core.dom.Modifier.isStatic(jdtModifier))
			resultModifer.setStatic(true);
		if (org.eclipse.jdt.core.dom.Modifier.isAbstract(jdtModifier))
			resultModifer.setInheritance(org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.ABSTRACT_KEYWORD.toString());
		if (org.eclipse.jdt.core.dom.Modifier.isFinal(jdtModifier))
			resultModifer.setInheritance(org.eclipse.jdt.core.dom.Modifier.ModifierKeyword.FINAL_KEYWORD.toString());
		if (org.eclipse.jdt.core.dom.Modifier.isNative(jdtModifier))
			resultModifer.setNative(true);
		if (org.eclipse.jdt.core.dom.Modifier.isStrictfp(jdtModifier))
			resultModifer.setStrictfp(true);
		if (org.eclipse.jdt.core.dom.Modifier.isSynchronized(jdtModifier))
			resultModifer.setSynchronized(true);
		if (org.eclipse.jdt.core.dom.Modifier.isTransient(jdtModifier))
			resultModifer.setTransient(true);
		if (org.eclipse.jdt.core.dom.Modifier.isVolatile(jdtModifier))
			resultModifer.setVolatile(true);

		return resultModifer;
	}
}
