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
import java.util.Iterator;
import java.util.List;

/**
 * @author ebreton
 *
 */
public class MethodBinding extends FeatureBinding {
	
	private List<Object> parameters = new ArrayList<Object>();
	private boolean annotationMember = false;
	
	/**
	 * @return Returns the parameters.
	 */
	public List<Object> getParameters() {
		return this.parameters;
	}

	public String toString(){
		String result = "";
		if (this.getDeclaringClass()!=null){
			result += this.getDeclaringClass().toString() + ".";	
		}		
		result += this.getName()+"(";
		String separator = "";
		for (Iterator<?> i=this.getParameters().iterator();i.hasNext();) {
			result += i.next().toString() + separator;
			separator = ",";
		}
		result += ")";
		return result;
	}

	/**
	 * @param annotationMember the annotationMember to set
	 */
	public void setAnnotationMember(boolean annotationMember) {
		this.annotationMember = annotationMember;
	}

	/**
	 * @return the annotationMember
	 */
	public boolean isAnnotationMember() {
		return this.annotationMember;
	}
}
