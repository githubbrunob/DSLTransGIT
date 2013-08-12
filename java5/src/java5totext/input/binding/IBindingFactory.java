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
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.WildcardType;

public interface IBindingFactory {

	public abstract Binding getBindingForName(Name name);

	public abstract Binding getBindingForPrimitiveType(PrimitiveType type);
	
	public abstract Binding getBindingForWildCardType(WildcardType type);
	
	public abstract Binding getBindingForParameterizedType(ParameterizedType type);
	
	public abstract Binding getBindingForArrayType(ArrayType type);
	
	public abstract Binding getBindingForClassInstanceCreation(ClassInstanceCreation constructorCall);
	
	public abstract Binding getBindingForConstructorInvocation(ConstructorInvocation constructorCall);
	
	public abstract Binding getBindingForSuperConstructorInvocation(SuperConstructorInvocation constructorCall);

	public abstract boolean isLocalVariable(Name name);

}