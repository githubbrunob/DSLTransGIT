package dsltrans.tests;

import dsltrans.metamodel.MetaEntity;
import dsltrans.metamodel.MetaRelation;

public class GenericMetaRelation implements MetaRelation {
	
	private MetaEntity _sourceObject;
	private MetaEntity _targetObject;
	private boolean isSet;
	private boolean isContainment;
	private String name;
	
	public GenericMetaRelation(String name, MetaEntity source, MetaEntity target, boolean isSet, boolean isContainment) {
		this._sourceObject = source;
		this._targetObject = target;
		this.isSet = isSet;
		this.isContainment = isContainment;
		this.name = name;
	}
	
	@Override
	public MetaEntity getSource() {
		return _sourceObject;
	}

	@Override
	public MetaEntity getTarget() {
		return _targetObject;
	}

	@Override
	public boolean isEqual(MetaRelation ar) {
		if(ar instanceof GenericMetaRelation) {
			GenericMetaRelation mr = (GenericMetaRelation) ar;
			return this.getName().equals(mr.getName()) &&
					this.getSource() == mr.getSource() &&
					this.getTarget() == mr.getTarget();
		}
		return false;
	}

	@Override
	public boolean isSet() {
		return isSet;
	}

	@Override
	public boolean isContainment() {
		return isContainment;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String print() {
		if(isContainment())
			return getSource().print()+"<"+ getName() +">-->" + getTarget().print();
		return getSource().print()+"("+ getName() +")-->" + getTarget().print();
	}
	
}
