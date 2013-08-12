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
import java.util.List;

/**
 * @author ebreton
 *
 */
public class ClassBinding extends Binding {
	
	private ClassBinding declaringClass = null;
	private PackageBinding ownerPackage = null; 
	private boolean isInterface = false;
	private boolean isAnnotation = false;
	private ClassBinding superClass = null;
	private List<ClassBinding> superInterfaces = null;
	private List<String> typeParameters;
	
	public ClassBinding getDeclaringClass() {
		return this.declaringClass;
	}
	public void setDeclaringClass(ClassBinding declaringClass) {
		this.declaringClass = declaringClass;
	}
	public PackageBinding getOwnerPackage() {
		return this.ownerPackage;
	}
	public void setOwnerPackage(PackageBinding ownerPackage) {
		this.ownerPackage = ownerPackage;
	}
	public String toString(){
		String result = "";
		if (this.getOwnerPackage()!=null){
			result += this.getOwnerPackage().toString() + ".";	
		}
		if (this.getDeclaringClass()!=null){
			result += this.getDeclaringClass().toString() + ".";	
		}		
		return result + this.getName();
	}
	public boolean isInterface() {
		return this.isInterface;
	}
	public void setIsInterface(boolean isInterface) {
		this.isInterface = isInterface;
	}
	public ClassBinding getSuperClass() {
		return this.superClass;
	}
	public void setSuperClass(ClassBinding superClass) {
		this.superClass = superClass;
	}
	public List<ClassBinding> getSuperInterfaces() {
		return this.superInterfaces;
	}
	public void addSuperInterfaces(ClassBinding superInterface) {
		if (this.superInterfaces == null) {
			this.superInterfaces = new ArrayList<ClassBinding>();
		}
		this.superInterfaces.add(superInterface);
	}
	public List<String> getTypeParameters() {
		return this.typeParameters;
	}
	public void addTypeParameters(String typeParameter) {
		if (this.typeParameters == null) {
			this.typeParameters = new ArrayList<String>();
		}
		this.typeParameters.add(typeParameter);
	}
	/**
	 * @param isAnnotation the isAnnotation to set
	 */
	public void setAnnotation(boolean isAnnotation) {
		this.isAnnotation = isAnnotation;
	}
	/**
	 * @return the isAnnotation
	 */
	public boolean isAnnotation() {
		return this.isAnnotation;
	}
	
}
