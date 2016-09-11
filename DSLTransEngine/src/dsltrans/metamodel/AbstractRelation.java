package dsltrans.metamodel;


public abstract class AbstractRelation {
	private MetaEntity _sourceObject;
	private MetaEntity _targetObject;
	
	public AbstractRelation(MetaEntity source, MetaEntity target) {
		setSource(source);
		setTarget(target);
	}

	public abstract boolean isEqual(AbstractRelation ar);
	
	public abstract boolean isSet();
	
	public abstract boolean isContainment();
	
	public void setSource(MetaEntity _object) {
		this._sourceObject = _object;
	}

	public MetaEntity getSource() {
		return _sourceObject;
	}

	public void setTarget(MetaEntity _object) {
		this._targetObject = _object;
	}

	public MetaEntity getTarget() {
		return _targetObject;
	}	
	
	public abstract String getName();

	public String print() {
		return getSource().print()+"("+ getName() +")-->" + getTarget().print();
	}
	
}
