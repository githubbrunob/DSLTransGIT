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

/**
 * @author ebreton
 *
 */
public abstract class FeatureBinding extends Binding {
	
	private ClassBinding declaringClass = null;
	
	/**
	 * @return Returns the declaringClass.
	 */
	public ClassBinding getDeclaringClass() {
		return this.declaringClass;
	}
	/**
	 * @param declaringClass The declaringClass to set.
	 */
	public void setDeclaringClass(ClassBinding declaringClass) {
		this.declaringClass = declaringClass;
	}
	
	public String toString(){
		String result = "";
		if (this.getDeclaringClass()!=null){
			result += this.getDeclaringClass().toString() + ".";	
		}		
		return result + this.getName();
	}	
}
