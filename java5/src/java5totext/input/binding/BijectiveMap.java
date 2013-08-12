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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BijectiveMap<Key, Value> {

	private Map<Key, Value> keyValue = new HashMap<Key, Value>();
	private Map<Value, Key> valueKey = new HashMap<Value, Key>();
	
	public BijectiveMap() {
		super();
	}

	public void put(Key key, Value value) {
		this.keyValue.put(key, value);
		this.valueKey.put(value, key);
	}

	public Value getValue(Key key) {
		return this.keyValue.get(key);
	}

	@SuppressWarnings("unchecked")
	public Value get(Object key) {
		Value result = null;
//		if (key instanceof Key) {
			result = this.getValue((Key) key);
//		}
		return result;
	}
	public Key getKey(Value value) {
		return this.valueKey.get(value);
	}
	
	public Collection<Value> getValues() {
		return this.keyValue.values();
	}
	
	public Collection<Key> getKeys() {
		return this.valueKey.values();
	}
}
