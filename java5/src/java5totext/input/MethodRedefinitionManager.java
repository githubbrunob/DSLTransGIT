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

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import Java5.AbstractTypeDeclaration;
import Java5.BodyDeclaration;
import Java5.ClassDeclaration;
import Java5.ClassInstanceCreation;
import Java5.Java5Factory;
import Java5.MethodDeclaration;
import Java5.Model;
import Java5.NamedElement;
import Java5.NamedElementRef;
import Java5.SingleVariableDeclaration;
import Java5.impl.Java5FactoryImpl;


/**
 * The aim of this class is to bind method with the method overriden of a super class if any
 * @author Fabien Giquel, Sebastien Minguet 
 */
public class MethodRedefinitionManager {

	public static void resolveMethodRedefintions(Model model) {		
		Java5Factory facto = new Java5FactoryImpl();
		Object item;
		for (Iterator<?> i = model.eAllContents(); i.hasNext();){	
			item = i.next();
			//instanciate remaining proxy attributes for NamedElement
			Iterator<?> superTypes = ((EObject)item).eClass().getEAllSuperTypes().iterator();
			boolean proxySet = false;
			while (superTypes.hasNext() && !proxySet) {
				if (((EClassifier)superTypes.next()).getInstanceClass().getCanonicalName().indexOf("NamedElement") != -1){
					((NamedElement)item).setProxy(((NamedElement)item).isProxy());
					proxySet = true;
				}				
			}
			if(facto.createMethodDeclaration().eClass().isInstance(item)){
				MethodDeclaration miaMethod = (MethodDeclaration) item;	
				if (miaMethod.isProxy() == false) {
					String signature = getRawSignature(miaMethod);
					
					NamedElementRef superClassRef = null;
					AbstractTypeDeclaration declaringType = miaMethod.getAbstractTypeDeclaration();
					if (declaringType != null && facto.createClassDeclaration().eClass().isInstance(declaringType)) {
						superClassRef = ((ClassDeclaration)declaringType).getSuperClass();
					}
					if (declaringType == null && miaMethod.getAnonymousClassDeclarationOwner() != null) {
						ClassInstanceCreation cic = miaMethod.getAnonymousClassDeclarationOwner().getClassInstanceCreation();
						if (cic != null)
							superClassRef = cic.getType();
					}
						
					boolean bFound = false;
					// Look for similar method signature in super classes
					while (!bFound && superClassRef != null 
								&& facto.createClassDeclaration().eClass().isInstance(superClassRef.getElement())) // super class might be "Unresolved" typed
					{
						ClassDeclaration superClass = (ClassDeclaration) superClassRef.getElement();
						for (BodyDeclaration bodyDecl : superClass.getBodyDeclarations()) {
							if (facto.createMethodDeclaration().eClass().isInstance(bodyDecl) 
									&& signature.equals(getRawSignature((MethodDeclaration) bodyDecl))) {
								bFound = true;
								miaMethod.setRedefinedMethodDeclaration((MethodDeclaration) bodyDecl);
							}
						}
						superClassRef = superClass.getSuperClass();
					}
				}
			}
		}
	}

	private static String getRawSignature(MethodDeclaration aMethod) {
		String signature;
		signature = aMethod.getName();
		for (SingleVariableDeclaration aParam : aMethod.getParameters()) {
			signature += "|";
			signature += getRawSignature(aParam.getType());
			if (aParam.isVarargs()) {
				signature += "...";
			}
		}
		return signature;
	}

	private static String getRawSignature(NamedElementRef typeRef) {
		String signature;
		if (typeRef.getElement().eClass().isInstance(AbstractTypeDeclaration.class))
			signature = ((AbstractTypeDeclaration) typeRef.getElement()).getQualifiedName();
		else
			signature = typeRef.getElement().getName();
		return signature;
	}
}
