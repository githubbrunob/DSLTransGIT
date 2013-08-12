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

package java5totext.input.binding;


import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.IPackageBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.WildcardType;

/**
 * @author ebreton
 *
 */
public class JDTDelegateBindingFactory implements IBindingFactory {
	
	@SuppressWarnings("unused")
	private static final boolean USE_JDT_BINDING_RESOLVER = true;
	private static IBindingFactory instance = new JDTDelegateBindingFactory();
	public static String UNRESOLVED = "UNRESOLVED";
	public static final String WILDCARD_SYMBOL = "?";
	
	private JDTDelegateBindingFactory(){
		super();
	}
	
	public static IBindingFactory getInstance(){
		return JDTDelegateBindingFactory.instance;
	}
	
	public Binding getBindingForName(Name name) {
		Binding result = this.getBinding(name.resolveBinding());
		if (result == null) {
			System.out.println("*** WARNING : binding '" + name + "' unresolved.");
			result = new UnresolvedBinding(name.getFullyQualifiedName());
		}
		return result;
	}
	
	public Binding getBindingForPrimitiveType(PrimitiveType type){
		Binding result = new Binding();
		result.setName(type.getPrimitiveTypeCode().toString());
		return result;
	}
	
	public Binding getBindingForParameterizedType(ParameterizedType type){
		Binding result = null;
		ITypeBinding binding = type.resolveBinding();
		if (binding == null) {
			System.out.println("*** WARNING : binding '" + type.toString() + "' unresolved.");
			result = new UnresolvedBinding(type.toString());
		}
		else {
			// type and type.getType() have the same "resolveBinding()"
			// So we take a slightly different identifier for type here
			result = new Binding("(PT)" + binding.getQualifiedName());
		}
		return result;
	}
	
	public Binding getBindingForWildCardType(WildcardType type){
		Binding result = null;
		ITypeBinding binding = type.resolveBinding();
		if (binding == null) {
			System.out.println("*** WARNING : binding '" + type.toString() + "' unresolved.");
			result = new UnresolvedBinding(type.toString());
		}
		else {
			result = this.getClassBinding(binding);
		}
		return result;
	}
	
	public Binding getBindingForArrayType(ArrayType type) {
		Binding result = null;
		ITypeBinding binding = type.resolveBinding();
		if (binding == null) {
			System.out.println("*** WARNING : binding '" + type.toString() + "' unresolved.");
			result = new UnresolvedBinding(type.toString());
		}
		else {
			result = this.getClassBinding(binding);
		}
		return result;
	}
	
	public Binding getBindingForClassInstanceCreation(ClassInstanceCreation constructorCall) {
		Binding result = null;
		IMethodBinding binding = constructorCall.resolveConstructorBinding();
		if (binding == null) {
			System.out.println("*** WARNING : binding '" + constructorCall.toString() + "' unresolved.");
			result = new UnresolvedBinding(constructorCall.toString());
		}
		else {
			result = this.getMethodBinding(binding);
		}
		return result;
	}
	
	public Binding getBindingForConstructorInvocation(ConstructorInvocation constructorCall) {
		Binding result = null;
		IMethodBinding binding = constructorCall.resolveConstructorBinding();
		if (binding == null) {
			System.out.println("*** WARNING : binding '" + constructorCall.toString() + "' unresolved.");
			result = new UnresolvedBinding(constructorCall.toString());
		}
		else {
			result = this.getMethodBinding(binding);
		}
		return result;
	}
	
	public Binding getBindingForSuperConstructorInvocation(SuperConstructorInvocation constructorCall) {
		Binding result = null;
		IMethodBinding binding = constructorCall.resolveConstructorBinding();
		if (binding == null) {
			System.out.println("*** WARNING : binding '" + constructorCall.toString() + "' unresolved.");
			result = new UnresolvedBinding(constructorCall.toString());
		}
		else {
			result = this.getMethodBinding(binding);
		}
		return result;
	}
	
	private Binding getBinding(IBinding binding) {
		Binding result = null;
		if (binding instanceof IMethodBinding) {
			result = this.getMethodBinding((IMethodBinding)binding);
		}
		else if (binding instanceof ITypeBinding) {
			result = this.getClassBinding((ITypeBinding)binding);
		}
		else if (binding instanceof IPackageBinding) {
			result = this.getPackageBinding((IPackageBinding)binding);
		}
		else if (binding instanceof IVariableBinding && 
				((IVariableBinding)binding).isField()) {
			result = this.getFieldBinding((IVariableBinding)binding);
		}
		else if (binding instanceof IVariableBinding && 
				!((IVariableBinding)binding).isField()) {
			result = this.getVariableBinding((IVariableBinding)binding);
		}		
		return result;
	}
	
	private MethodBinding getMethodBinding(IMethodBinding binding) {
		/*
		 * Here, we have to add some code to manage annotation members binding
		 */
		MethodBinding result = new MethodBinding();
		result.setName(binding.getName());
		result.setDeclaringClass(this.getClassBinding(binding.getDeclaringClass()));
		for (int i=0;i<binding.getParameterTypes().length;i++){
			result.getParameters().add(this.getParameterBinding(binding.getParameterTypes()[i]));
		}
		result.setAnnotationMember(binding.isAnnotationMember());
		return result;
	}
	
	private ParameterBinding getParameterBinding(ITypeBinding binding) {
		ParameterBinding result = new ParameterBinding();
		result.setArrayDimensions(binding.getDimensions());
		result.setType(this.getClassBinding(binding));
		return result;
	}	
	
	private PackageBinding getPackageBinding(IPackageBinding binding) {
		PackageBinding result = new PackageBinding();
		result.setName(binding.getName());
		return result;
	}
	
	private ClassBinding getClassBinding(ITypeBinding bindingParameter) {
		ITypeBinding binding = bindingParameter;
		ClassBinding result = null;
		/*
		 * How to manage Annotation declarations ?
		 */
		if (!binding.isAnonymous()) { // Anonymous classes are traduced with an AnonymousClassDeclaration instance
			/*
			 * A specific case should be managed correctly :
			 * in case of generic usage, a parameterized type binding encapsulates
			 * real type in a second binding.
			 */
			if (binding.isParameterizedType()) {
				binding = binding.getTypeDeclaration();
			}
			result = new ClassBinding();
			result.setIsInterface(binding.isInterface());
			result.setAnnotation(binding.isAnnotation());
			result.setName(binding.getName());
			if (binding.getPackage()!=null) {
				result.setOwnerPackage(this.getPackageBinding(binding.getPackage()));
			}
			if (binding.getDeclaringClass()!=null) {
				result.setDeclaringClass(this.getClassBinding(binding.getDeclaringClass()));
			}
			if (binding.getSuperclass()!=null) {
				result.setSuperClass(this.getClassBinding(binding.getSuperclass()));
			}
			if (binding.getInterfaces()!=null) {
				for (ITypeBinding anInterface : binding.getInterfaces()) {
					result.addSuperInterfaces(this.getClassBinding(anInterface));
				}
			}
			/*
			 * TODO complete binding resolution
			 * For generics, it includes type parameters.
			 */
			if (binding.getTypeParameters() != null) {
				for (ITypeBinding typeParameter : binding.getTypeParameters()) {
					result.addTypeParameters(typeParameter.getName());
				}
			}
		}
		return result;
	}
	
	private FieldBinding getFieldBinding(IVariableBinding binding) {
		FieldBinding result = new FieldBinding();
		result.setName(binding.getName());
		if (binding.getDeclaringClass() != null) {
			result.setDeclaringClass(getClassBinding(binding.getDeclaringClass()));
		} else if (binding.isField()) {
			// cas de l'attribut length sur les types de tableau
			// pris en compte dans le BindingManager
			System.err.println(binding);
		}
		return result;
	}
	
	private VariableBinding getVariableBinding(IVariableBinding binding) {
		VariableBinding result = new VariableBinding();
		result.setName(String.valueOf(binding.getVariableId()));
		return result;
	}	
	

	public boolean isLocalVariable(Name name) {
		IBinding binding = name.resolveBinding();
		return (binding instanceof IVariableBinding && 
			!((IVariableBinding)binding).isField());
	}
}
