package transformerProcessor.filter;

import java.lang.reflect.InvocationTargetException;

import dsltrans.ApplyAssociation;
import dsltrans.ApplyClass;

import transformerProcessor.exceptions.InvalidLayerRequirement;

import emfInterpreter.instance.InstanceDatabase;
import emfInterpreter.instance.InstanceRelation;
import emfInterpreter.metamodel.MetaModelDatabase;

public class ApplyRelation extends AbstractFilter {
	
	private final ApplyAssociation _association;
	private InstanceRelation _currentRelation;

	public ApplyRelation(ApplyAssociation ma, String id) {
		super(id);
		_association = ma;
		setCurrentRelation(null);
	}

	public ApplyAssociation getAssociation() {
		return _association;
	}
	
	public ApplyClass getSourceClass() {
		return getAssociation().getSource();
	}

	public ApplyClass getTargetClass() {
		return getAssociation().getTarget();
	}	
	
	public boolean performApply(InstanceDatabase database, MetaModelDatabase metamodel) {
		for(InstanceRelation ir : database.getLoadedRelations()) {
			if(ir.getRelation().getName().
					equals(getAssociation().getAssociationName())
			)
			{
				getFilterDatabase().addRelation(ir);
			}
		}			
		return !this.getFilterDatabase().isEmpty();
	}

	public void setCurrentRelation(InstanceRelation _currentRelation) {
		this._currentRelation = _currentRelation;
	}

	public InstanceRelation getCurrentRelation() {
		return _currentRelation;
	}

	public void setCurrentByHashId(int parseInt) {
		for(InstanceRelation ir : getFilterDatabase().getLoadedRelations()) {
			if(ir.hashCode() == parseInt) {
				setCurrentRelation(ir);
				return;
			}
		}	
	}

	@Override
	public boolean process(InstanceDatabase model, MetaModelDatabase mmodel)
			throws SecurityException,
			IllegalArgumentException, ClassNotFoundException,
			NoSuchFieldException, IllegalAccessException,
			NoSuchMethodException, InvocationTargetException,
			InvalidLayerRequirement {
		// TODO Auto-generated method stub
		return false;
	}

}
