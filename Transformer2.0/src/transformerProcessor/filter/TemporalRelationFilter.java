package transformerProcessor.filter;

import java.lang.reflect.InvocationTargetException;

import persistence.InstanceDatabase;
import persistence.InstanceRelation;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import dsltrans.AbstractTemporalRelation;
import dsltrans.ApplyClass;
import dsltrans.MatchClass;
import emfInterpreter.metamodel.MetaModelDatabase;

public class TemporalRelationFilter  extends AbstractFilter {
	
	private final AbstractTemporalRelation _association;
	private InstanceRelation _currentRelation;

	public TemporalRelationFilter(AbstractTemporalRelation ma, String id) {
		super(id);
		_association = ma;
		setCurrentRelation(null);
	}

	public AbstractTemporalRelation getAssociation() {
		return _association;
	}
	
	public MatchClass getSourceClass() {
		return getAssociation().getSourceClass();
	}

	public ApplyClass getTargetClass() {
		return getAssociation().getTargetClass();
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
		return false;
	}

	public void setCurrentByHashId(InstanceDatabase filterDatabase, int parseInt) {
		for(InstanceRelation ir : filterDatabase.getLoadedRelations()) {
			if(ir.hashCode() == parseInt) {
				setCurrentRelation(ir);
				return;
			}
		}
	}

}