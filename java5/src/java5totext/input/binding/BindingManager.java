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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Java5.AbstractTypeDeclaration;
import Java5.AnnotationTypeMemberDeclaration;
import Java5.ClassDeclaration;
import Java5.FieldDeclaration;
import Java5.Java5Factory;
import Java5.MethodDeclaration;
import Java5.Model;
import Java5.NamedElement;
import Java5.NamedElementRef;
import Java5.PackageDeclaration;
import Java5.SingleVariableDeclaration;
import Java5.TypeDeclaration;
import Java5.TypeParameter;
import Java5.UnresolvedItem;



public class BindingManager {

	private Map<String, NamedElement> targets = new HashMap<String, NamedElement>();
	private Map<String, UnresolvedItem> unresolvedItems = new HashMap<String, UnresolvedItem>();
	private List<PendingElement> pendings = new ArrayList<PendingElement>();	
	private Java5Factory factory;
	private static final char DOT_SEPARATOR = '.';

	private class PendingElement {
		private  NamedElementRef ref;
		private Binding binding;
		
		public PendingElement(NamedElementRef ref, Binding binding){
			this.ref = ref;
			this.binding = binding;
		}

		public NamedElementRef getRef() {
			return this.ref;
		}
		
		public Binding getBinding() {
			return this.binding;
		}
		
	}
	
	public BindingManager(Java5Factory factory) {
		this.factory = factory;
	}
	
	public BindingManager(BindingManager aBindingManager) {
		this.factory = aBindingManager.factory;
		this.targets = new HashMap<String, NamedElement>(aBindingManager.targets);
		this.pendings = new ArrayList<PendingElement>(aBindingManager.pendings);
	}
	
	public void addTarget(String id, NamedElement element) {
		this.targets.put(id, element);
	}
	
	public void addTarget(Binding binding, NamedElement element) {
		this.targets.put(binding.toString(), element);
	}	
	
	public boolean containsTarget(String id) {
		if (id.equals(JDTDelegateBindingFactory.UNRESOLVED))
			return false;
		return this.targets.containsKey(id);
	}
	
	public boolean containsTarget(Binding binding) {
		return this.containsTarget(binding.toString());
	}	
	
	public NamedElement getTarget(String id) {
		if (id.equals(JDTDelegateBindingFactory.UNRESOLVED))
			return null;
		return this.targets.get(id);
	}
	
	public NamedElement getTarget(Binding binding) {
		return this.getTarget(binding.toString());
	}	
	
	public void addPending(NamedElementRef ref, Binding binding) {
		this.pendings.add(new PendingElement(ref, binding));
	}	
	
	public void resolveBindings(Model model){
		List<PendingElement> unresolvedBindings = new ArrayList<PendingElement>();
		for (Iterator<PendingElement> i=this.pendings.iterator() ;i.hasNext();){
			PendingElement pe = i.next();
			NamedElement target = this.getTarget(pe.getBinding().toString());
			if (target == null){
				unresolvedBindings.add(pe);
			}
			else {
				pe.getRef().setElement(target);	
			}
		}			
		this.manageUnresolvedBindings(model, unresolvedBindings);
	}
	
	private void manageUnresolvedBindings(Model model, List<PendingElement> unresolvedBindings) {
		if (model != null) {
			for (Iterator<PendingElement> i=unresolvedBindings.iterator() ;i.hasNext();) {
				PendingElement pe = i.next();
				NamedElement target = this.getNamedElement(pe.getBinding(), model);
				if (target != null)
					pe.getRef().setElement(target);
			}
		}
	}
	
	private  NamedElement getNamedElement(Binding binding, Model model){
		NamedElement result = null;
		if (binding instanceof PackageBinding) {
			result = this.getPackageDeclaration((PackageBinding)binding, model);
		}
		else if (binding instanceof ClassBinding) {
			result = this.getTypeDeclaration((ClassBinding)binding, model);
		}
//		else if ((binding instanceof FieldBinding) 
//				&& (((FieldBinding) binding).getDeclaringClass() != null)) {
//			result = this.getFieldDeclaration((FieldBinding)binding, model);
//		}
		else if (binding instanceof FieldBinding) {
			result = this.getFieldDeclaration((FieldBinding)binding, model);
		}
		else if (binding instanceof MethodBinding) {
			if (((MethodBinding) binding).isAnnotationMember()) {
				result = this.getAnnotationTypeMemberDeclaration((MethodBinding)binding, model);
			} else {
				result = this.getMethodDeclaration((MethodBinding)binding, model);
			}
		}
		else { // --> binding.isUnresolved() : elements which caused a problem during resolving
			result = this.unresolvedItems.get(binding.getName());
			if (result == null) {
				result = this.factory.createUnresolvedItem();
				result.setName(binding.getName());
				result.setProxy(true);
				model.getUnresolvedItems().add((UnresolvedItem)result);
				this.unresolvedItems.put(binding.getName(), (UnresolvedItem) result);
			}
		}
		return result;
	}
	
	private PackageDeclaration getPackageDeclaration(PackageBinding binding, Model model){
		PackageDeclaration result= (PackageDeclaration)this.getTarget(binding); 
		if (result == null) {
			result = createProxiesPackageHierarchy(binding, model);
			this.addTarget(binding, result);
		}
		return result;
	}
	
	/*
	 * We have to let this abstract type, because this method will manage
	 * primitives and also objects declarations
	 */
	private   NamedElement getTypeDeclaration(ClassBinding binding, Model model){
		NamedElement result = this.getTarget(binding); // J2SE5AbstractTypeDeclaration or J2SE5PrimitiveType
		if (result == null) {
			if (binding.isAnnotation()) {
				result = this.factory.createAnnotationTypeDeclaration();
			} else if (binding.isInterface()) {
				result = this.factory.createInterfaceDeclaration();
			} else {
				result = this.factory.createClassDeclaration();
			}
			result.setName(binding.getName());
			result.setProxy(true);
			if (binding.getOwnerPackage() != null && binding.getDeclaringClass() == null) {
				PackageDeclaration owner = this.getPackageDeclaration(binding.getOwnerPackage(), model);
				if (owner != null) {
					owner.getOwnedElements().add((AbstractTypeDeclaration) result);
					}
			}
			else if (binding.getDeclaringClass() != null) {
				TypeDeclaration declaring= (TypeDeclaration)this.getTypeDeclaration(binding.getDeclaringClass(), model);
				if (declaring != null) {
					declaring.getBodyDeclarations().add((TypeDeclaration) result);
				}
			}
			// declaring the super class
			if (!binding.isInterface() && binding.getSuperClass() != null) {
				TypeDeclaration superClass= (TypeDeclaration)this.getTypeDeclaration(binding.getSuperClass(), model);
				if (superClass != null) {
					NamedElementRef superClassRef= this.factory.createNamedElementRef();
					superClassRef.setElement(superClass);
					((ClassDeclaration) result).setSuperClass(superClassRef);
				}
			}
			// declaring the super interfaces
			if (binding.getSuperInterfaces() != null) {
				for (ClassBinding anInterface : binding.getSuperInterfaces()) {
					TypeDeclaration superInterface = (TypeDeclaration)this.getTypeDeclaration(anInterface, model);
					if (superInterface != null) {
						NamedElementRef superClassRef= this.factory.createNamedElementRef();
						superClassRef.setElement(superInterface);
						((AbstractTypeDeclaration) result).getSuperInterfaces().add(superClassRef);
					}
				}
			}
			// declaring the type parameters
			if (binding.getTypeParameters() != null) {
				for (String typeParameterName : binding.getTypeParameters()) {
					TypeParameter typeParameter = this.factory.createTypeParameter();
					typeParameter.setName(typeParameterName);
					typeParameter.setProxy(true);
					((TypeDeclaration) result).getTypeParameters().add(typeParameter);
				}
			}
			this.addTarget(binding, result);
		}

		return result;
	}
	
	private   FieldDeclaration getFieldDeclaration(FieldBinding binding, Model model){
		FieldDeclaration result= (FieldDeclaration)this.getTarget(binding);
		if (result == null) {
			result = this.factory.createFieldDeclaration();
			result.setProxy(true);
			result.setName(binding.getName());
			if (binding.getDeclaringClass() != null) {
				TypeDeclaration declaring= (TypeDeclaration)this.getTypeDeclaration(binding.getDeclaringClass(), model);
				if (declaring != null) {
					declaring.getBodyDeclarations().add(result);
				}
			} else {
				// cas particulier des attributs sur les types dynamiques
				// exemple : attribut "length" sur les tableaux
				
			}
			this.addTarget(binding, result);
		}		
		return result;
	}
	
	private MethodDeclaration getMethodDeclaration(MethodBinding binding, Model model){
		MethodDeclaration result = (MethodDeclaration)this.getTarget(binding);
		if (result == null) {
			result = this.factory.createMethodDeclaration();
			result.setProxy(true);
			result.setName(binding.getName());
			if (binding.getDeclaringClass() != null) {
				AbstractTypeDeclaration declaring= (AbstractTypeDeclaration)this.getTypeDeclaration(binding.getDeclaringClass(), model);
				if (declaring != null) {
					declaring.getBodyDeclarations().add(result);
				}
			}
			for (Iterator<?> i=binding.getParameters().iterator()   ;i.hasNext();) {
				ParameterBinding param = (ParameterBinding)i.next();
				SingleVariableDeclaration paramDecl= this.factory.createSingleVariableDeclaration();
				result.getParameters().add(paramDecl);
				NamedElementRef ref= this.factory.createNamedElementRef();
				ref.setElement(this.getTypeDeclaration(param.getType(), model));
				paramDecl.setType(ref);
			}
			this.addTarget(binding, result);
		}				
		return result;
	}		
	
	private AnnotationTypeMemberDeclaration getAnnotationTypeMemberDeclaration(MethodBinding binding, Model model){
		AnnotationTypeMemberDeclaration result = (AnnotationTypeMemberDeclaration)this.getTarget(binding);
		if (result == null) {
			result = this.factory.createAnnotationTypeMemberDeclaration();
			result.setProxy(true);
			result.setName(binding.getName());
			if (binding.getDeclaringClass() != null) {
				AbstractTypeDeclaration declaring= (AbstractTypeDeclaration)this.getTypeDeclaration(binding.getDeclaringClass(), model);
				if (declaring != null) {
					declaring.getBodyDeclarations().add(result);
				}
			}
			this.addTarget(binding, result);
		}				
		return result;
	}	
	public void resolveBindings(){
		this.resolveBindings(null);
	}
	
	// create iterately a hierarchy of packages
	public    PackageDeclaration createProxiesPackageHierarchy(PackageBinding binding, Model model) {
		PackageDeclaration result= this.factory.createPackageDeclaration();
		
		result.setProxy(true);
		if (binding.getName().indexOf(DOT_SEPARATOR) == -1) {
			result.setName(binding.getName());
			model.getOwnedElements().add(result);
			} else {

			String currentPackageName = binding.getName();
//			String currentDirectoryName = java.io.File.separator + currentPackageName.replace(DOT_SEPARATOR, java.io.File.separatorChar);
			
			
			PackageDeclaration currentPackage = result;
			int lastDotIndex = currentPackageName.lastIndexOf(DOT_SEPARATOR);
//			int lastSeparatorIndex = currentDirectoryName.lastIndexOf(java.io.File.separator);
			
			currentPackage.setName(currentPackageName.substring(lastDotIndex+1));
			
			// iterate on parents packages to create them if needed
			while (lastDotIndex > 0) {
				currentPackageName = currentPackageName.substring(0, lastDotIndex);
//				if (lastSeparatorIndex > 0)
//					currentDirectoryName = currentDirectoryName.substring(0, lastSeparatorIndex);
//				else
//					currentDirectoryName = "";
				PackageDeclaration aParentPackage = null;
				if (!this.containsTarget(currentPackageName)) {
					aParentPackage = this.factory.createPackageDeclaration();
					aParentPackage.setProxy(true);
					this.addTarget(currentPackageName, aParentPackage);
					lastDotIndex = currentPackageName.lastIndexOf('.');
					if (lastDotIndex < 0) { // top level package
						aParentPackage.setName(currentPackageName);
						model.getOwnedElements().add(aParentPackage);
						}
					else {
						aParentPackage.setName(currentPackageName.substring(lastDotIndex + 1));
					}
					aParentPackage.getOwnedPackages().add(currentPackage);
				}
				else {
					aParentPackage = (PackageDeclaration) this.getTarget(currentPackageName);
					aParentPackage.getOwnedPackages().add(currentPackage);
					break;        // if this package is registered, parents packages also are
				}
				currentPackage = aParentPackage;
			}
		}
		return result;
	}
}