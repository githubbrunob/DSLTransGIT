package emfInterpreter.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;

public class MetaAttribute {
	private MetaEntity _object = null;
	private EAttribute _attribute = null;
	
	public MetaAttribute(MetaEntity ent, EAttribute attr) {
		setObject(ent);
		setAttribute(attr);
	}

	public String getType() {
		EDataType data = getAttribute().getEAttributeType();
		return data.getInstanceTypeName();
	}
	
	public void setObject(MetaEntity _object) {
		this._object = _object;
	}

	public MetaEntity getObject() {
		return _object;
	}

	public void setAttribute(EAttribute _attribute) {
		this._attribute = _attribute;
	}

	public EAttribute getAttribute() {
		return _attribute;
	}
	
	public String getName() {
		return getAttribute().getName();
	}

	public boolean isSubTypeOf(MetaEntity me) {
		if(me == this.getObject()) return true;		
		return me.isSubTypeOf(this.getObject());
	}
	
	public String print() {
		return getObject().print() + "." + getName() + " : " + getType();	
	}
	
	public boolean isDSLTransType() {
		return false;
	}
}
