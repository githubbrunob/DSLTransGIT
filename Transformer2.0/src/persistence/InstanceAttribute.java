package persistence;

import emfInterpreter.metamodel.MetaAttribute;

public class InstanceAttribute {
	private InstanceEntity _entity;
	private MetaAttribute _attribute;
	private Object _value;
	
	public InstanceAttribute(InstanceEntity ent, MetaAttribute attr, Object value) {
		setEntity(ent);
		setMetaAttribute(attr);
		setValue(value);
	}

	public InstanceAttribute(InstanceEntity ie, MetaAttribute ma) { // create with default value
		System.out.println("creating attribute: " + ma.getName() + " on a " + ie.getDotNotation());
		setEntity(ie);
		setMetaAttribute(ma);
		setValue(ma.getAttribute().getDefaultValue());
	}

	public void setEntity(InstanceEntity _object) {
		this._entity = _object;
	}

	public InstanceEntity getEntity() {
		return _entity;
	}

	public void setMetaAttribute(MetaAttribute _attribute) {
		this._attribute = _attribute;
	}

	public MetaAttribute getMetaAttribute() {
		return _attribute;
	}

	public void setValue(Object value) {
		this._value = value;
	}

	public Object getValue() {
		return _value;
	}
	
	public String print() {
		return _entity.print() + "." + _attribute.getName() + " = " + ((this._value != null)? this._value.toString():"");
	}
}
