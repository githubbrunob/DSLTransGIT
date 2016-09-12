package dsltrans.transformer.filter;

import java.lang.reflect.InvocationTargetException;

import dsltrans.ApplyAssociation;
import dsltrans.ApplyClass;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceDatabaseManager;
import dsltrans.model.InstanceRelation;
import dsltrans.transformer.exceptions.InvalidLayerRequirement;

public class ApplyRelation extends AbstractFilter {
	
	private final ApplyAssociation _association;
	private InstanceRelation _currentRelation;

	public ApplyRelation(ApplyAssociation ma, String id, InstanceDatabaseManager instanceDatabaseManager) {
		super(id, instanceDatabaseManager);
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
		for(InstanceRelation ir : database.getInstanceRelations()) {
			if(ir.getRelation().getName().
					equals(getAssociation().getAssociationName())
			)
			{
				getFilterDatabase().getInstanceRelations().add(ir);
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
		for(InstanceRelation ir : getFilterDatabase().getInstanceRelations()) {
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
		return false;
	}

}
