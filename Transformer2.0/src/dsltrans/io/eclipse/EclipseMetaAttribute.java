package dsltrans.io.eclipse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;

import dsltrans.metamodel.MetaAttribute;
import dsltrans.metamodel.MetaEntity;

public class EclipseMetaAttribute implements MetaAttribute {
	private MetaEntity _object = null;
	private EAttribute _attribute = null;
	
	public EclipseMetaAttribute(MetaEntity ent, EAttribute attr) {
		this._object = ent; 
		this._attribute = attr;
	}

	public String getType() {
		EDataType data = _attribute.getEAttributeType();
		String instanceTypeName =  data.getInstanceTypeName();
		return instanceTypeName;
	}
	
	public MetaEntity getContainnerMetaEntity() {
		return _object;
	}

	public Object getDefaultValue(){
		return this._attribute.getDefaultValue();
	}
	
	public String getDefaultValueString(){
		return this._attribute.getDefaultValueLiteral();
	}
	
	public String getName() {
		return _attribute.getName();
	}

	public boolean isSubTypeOf(MetaEntity me) {
		if(me == this.getContainnerMetaEntity()) return true;		
		return me.isSubTypeOf(this.getContainnerMetaEntity());
	}
	
	public String print() {
		return getContainnerMetaEntity().print() + "." + getName() + " : " + getType();	
	}
	
	public boolean isDSLTransType() {
		return false;
	}
}
