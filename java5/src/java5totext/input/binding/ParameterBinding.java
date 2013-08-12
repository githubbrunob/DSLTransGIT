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
public class ParameterBinding extends Binding {

	private ClassBinding type = null;
	private int arrayDimensions = 0;
	/**
	 * @return Returns the arrayDimensions.
	 */
	public int getArrayDimensions() {
		return this.arrayDimensions;
	}
	/**
	 * @param arrayDimensions The arrayDimensions to set.
	 */
	public void setArrayDimensions(int arrayDimensions) {
		this.arrayDimensions = arrayDimensions;
	}
	/**
	 * @return Returns the type.
	 */
	public ClassBinding getType() {
		return this.type;
	}
	/**
	 * @param type The type to set.
	 */
	public void setType(ClassBinding type) {
		this.type = type;
	}
	
	public String toString(){
		String result = this.getType().toString();
		for (int i=0;i<this.getArrayDimensions();i++){
			result += "[]";
		}
		return result;
	}	
}
