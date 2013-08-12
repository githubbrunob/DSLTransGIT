package emfInterpreter.metamodel;

import org.eclipse.emf.ecore.EReference;

public class MetaRelation extends AbstractRelation {
//	private MetaEntity _sourceObject;
//	private MetaEntity _targetObject;
	private EReference _reference;
	
	public MetaRelation(MetaEntity source, EReference ref, MetaEntity target) {
//		setSource(source);
//		setTarget(target);
		super(source,target);
		setReference(ref);
	}

	public boolean isSet() {
		return getReference().isMany();
	}
	
	public boolean isContainment() {
		return getReference().isContainment();
	}
	
//	public void setSource(MetaEntity _object) {
//		this._sourceObject = _object;
//	}
//
//	public MetaEntity getSource() {
//		return _sourceObject;
//	}
//
//	public void setTarget(MetaEntity _object) {
//		this._targetObject = _object;
//	}
//
//	public MetaEntity getTarget() {
//		return _targetObject;
//	}	
//	
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
	public boolean isEqual(AbstractRelation ar) {
		if(ar instanceof MetaRelation) {
			MetaRelation mr = (MetaRelation) ar;
			return this.getSource() == mr.getSource() &&
					this.getTarget() == mr.getTarget() &&
					this.getReference() == mr.getReference();
		}
		return false;
	}
	
}
