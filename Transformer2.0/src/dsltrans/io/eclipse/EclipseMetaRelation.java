package dsltrans.io.eclipse;

import org.eclipse.emf.ecore.EReference;

import dsltrans.metamodel.MetaEntity;
import dsltrans.metamodel.MetaRelation;

public class EclipseMetaRelation implements MetaRelation {
	private EReference _reference;
	
	private MetaEntity _sourceObject;
	private MetaEntity _targetObject;
	
	public EclipseMetaRelation(MetaEntity source, EReference ref, MetaEntity target) {
		this._sourceObject = source;
		this._targetObject = target;
		setReference(ref);
	}

	public MetaEntity getSource() {
		return _sourceObject;
	}

	public MetaEntity getTarget() {
		return _targetObject;
	}	
	
	public boolean isSet() {
		return getReference().isMany();
	}
	
	public boolean isContainment() {
		return getReference().isContainment();
	}

	public void setReference(EReference _attribute) {
		this._reference = _attribute;
	}

	public EReference getReference() {
		return _reference;
	}
	
	public String getName() {
		return getReference().getName();		
	}

	@Override
	public String print() {
		if(getReference().isContainment())
			return getSource().print()+"<"+ getName() +">-->" + getTarget().print();
		return getSource().print()+"("+ getName() +")-->" + getTarget().print();
	}

	@Override
	public boolean isEqual(MetaRelation ar) {
		if(ar instanceof EclipseMetaRelation) {
			EclipseMetaRelation mr = (EclipseMetaRelation) ar;
			return this.getSource() == mr.getSource() &&
					this.getTarget() == mr.getTarget() &&
					this.getReference() == mr.getReference();
		}
		return false;
	}
	
}
