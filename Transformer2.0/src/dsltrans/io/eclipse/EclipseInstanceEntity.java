package dsltrans.io.eclipse;

import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import dsltrans.metamodel.MetaEntity;
import dsltrans.model.InstanceEntity;

public class EclipseInstanceEntity extends InstanceEntity {
	
	private EObjectImpl _object=null;
	private EModelElementImpl _objectmeta=null; // EClassImpl, EAttributeImpl, EReferenceImpl
	
	public EclipseInstanceEntity(EModelElementImpl object, MetaEntity entity){
		super(entity);
		this._objectmeta = object;
	}
	
	public EclipseInstanceEntity(EObjectImpl object, MetaEntity entity){
		super(entity);
		this._object = object;
	}
	
	public EObjectImpl getObject() {
		return _object;
	}

	public EModelElementImpl getObjectMeta() {
		return _objectmeta;
	}
	
	public String print() {
		return getObject().toString()+"["+Integer.toString(this.hashCode())+"]";	
	}
	
	public boolean isEqual(InstanceEntity source) {
		if (source instanceof EclipseInstanceEntity){
			return this.getObject()==((EclipseInstanceEntity) source).getObject();			
		}
		return false;
	}
}
