package emfInterpreter.instance;

import emfInterpreter.metamodel.AbstractRelation;

public class InstanceRelation {
	private InstanceEntity _source;
	private InstanceEntity _target;
	private AbstractRelation _relation;
	
	public InstanceRelation(InstanceEntity source, AbstractRelation relation, InstanceEntity target) {
		setSource(source);
		setTarget(target);
		setRelation(relation);
	}

	public void setSource(InstanceEntity _object) {
		this._source = _object;
	}

	public InstanceEntity getSource() {
		return _source;
	}

	public void setTarget(InstanceEntity _object) {
		this._target = _object;
	}

	public InstanceEntity getTarget() {
		return _target;
	}	
	
	public void setRelation(AbstractRelation relation) {
		this._relation = relation;
	}

	public AbstractRelation getRelation() {
		return _relation;
	}
	
	public boolean isEqual(InstanceRelation ie) {
		return this.getSource().isEqual(ie.getSource()) &&
				this.getTarget().isEqual(ie.getTarget()) &&
				this.getRelation().isEqual(ie.getRelation());
	}
	
	public String print() {
		if(getRelation().isContainment())
			return getSource().print()+"<"+ getRelation().getName() +">-->" + getTarget().print();
		return getSource().print()+"("+ getRelation().getName() +")-->" + getTarget().print();
	}
}
