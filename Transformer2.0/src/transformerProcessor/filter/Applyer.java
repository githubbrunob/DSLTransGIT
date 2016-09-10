package transformerProcessor.filter;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import persistence.InstanceDatabase;
import persistence.InstanceDatabaseManager;
import persistence.InstanceEntity;
import persistence.InstanceRelation;
import transformerProcessor.TransformationRule;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import dsltrans.ApplyAssociation;
import dsltrans.ApplyClass;
import emfInterpreter.metamodel.MetaModelDatabase;
import emfInterpreter.metamodel.MetaRelation;

public class Applyer {
	private final List<ApplyEntity> _entities;
	private final List<ApplyRelation> _relations;

	public Applyer(TransformationRule tr, InstanceDatabaseManager instanceDatabaseManager) {
		super();
		_entities = new LinkedList<ApplyEntity>();
		_relations = new LinkedList<ApplyRelation>();
		
		int id = 0;
		for(ApplyClass mc : tr.getRule().getApply().getClass_()) {
			getEntities().add(new ApplyEntity(tr,mc,"Id"+Integer.toString(id++), instanceDatabaseManager));
		}
		for(ApplyAssociation ma : tr.getRule().getApply().getAssociation()) {
			getRelations().add(new ApplyRelation(ma,"Id"+Integer.toString(id++), instanceDatabaseManager));	
		}
	}


	public int getNumberFilters() {
		return getRelations().size() + getEntities().size();
	}
	
	public List<ApplyEntity> getEntities() {
		return _entities;
	}

	private List<ApplyRelation> getRelations() {
		return _relations;
	}

	public void updateFilters()
	{
		for(ApplyEntity ef : getEntities()) {
			ef.setCurrentEntity(null);
		}
	}

	public boolean performApply(InstanceDatabase outputModel, MetaModelDatabase applyMetaModel, InstanceDatabase matchModel)
	throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InvalidLayerRequirement {
			
		for(ApplyEntity ef : getEntities()) {
			ef.performApply(outputModel, applyMetaModel,matchModel);
		}
		
		for(ApplyRelation rf : getRelations()) {
			ApplyEntityFilter applySource = (ApplyEntityFilter)getFilter(rf.getAssociation().getSource());
			ApplyEntityFilter applyTarget = (ApplyEntityFilter)getFilter(rf.getAssociation().getTarget());
			InstanceEntity source = applySource.getCurrentEntity();
			InstanceEntity target = applyTarget.getCurrentEntity();
			MetaRelation mr = applyMetaModel.getMetaRelationByName(rf.getAssociation().getAssociationName(), source.getMetaEntity(), target.getMetaEntity());
			if(source == target && mr.isContainment()) continue;// ignore self-containments (because it will loop)
			if(mr.isSet() || !mr.isContainment())
			{
				InstanceRelation ir = new InstanceRelation(source,mr,target);
				outputModel.addRelation(ir);
			} else if(!is_special_case(outputModel, applyTarget, source,
					target, mr,applyMetaModel)) {
				InstanceRelation ir = new InstanceRelation(source,mr,target);
				outputModel.addRelation(ir);			
			}
		}
		
		return true;
	}


	private boolean is_special_case(InstanceDatabase outputModel,
			ApplyEntityFilter applyTarget, InstanceEntity source,
			InstanceEntity target, MetaRelation mr, MetaModelDatabase applyMetaModel) {
		for(InstanceRelation ir: 
			outputModel.getRelationsByInstanceEntity(source))
		{
			if(ir.getRelation()==mr) {
				System.out.println("preparing to solve special case: "+source.getDotNotation()+" ---"+mr.getName()+"---> "+target.getDotNotation());
				for(ApplyRelation selfRel : getRelations()) {
					ApplyEntityFilter SapplySource = (ApplyEntityFilter)getFilter(selfRel.getAssociation().getSource());
					ApplyEntityFilter SapplyTarget = (ApplyEntityFilter)getFilter(selfRel.getAssociation().getTarget());
					if((SapplySource==applyTarget)&&
							(SapplyTarget==applyTarget))
					{
						MetaRelation oldmr=mr;
						System.out.println("found a self reference link: "+ selfRel.getAssociation().getAssociationName());
						try {
							mr = applyMetaModel.
									getMetaRelationByName(
										selfRel.getAssociation().getAssociationName(), 
										target.getMetaEntity(), 
										target.getMetaEntity());
							System.out.println("found its meta relation: "+ mr.getName());
						} catch (InvalidLayerRequirement e) {
							System.out.println("warning link ignored due to cardinality constraints: "+source.getDotNotation()+" ---"+mr.getName()+"---> "+target.getDotNotation());
							return true;
						}
						InstanceEntity last = source.getLast(oldmr);
						source.setLast(oldmr,target);						
						if(last != null) {
							System.out.println("applying list nth time");
						} else {
							last=ir.getTarget();
							System.out.println("applying list first time");
						}
						InstanceRelation nir = new InstanceRelation(last,mr,target);
						outputModel.addRelation(nir);
						return true;
					}
				}
			}
		}
		return false;
	}	

	public AbstractFilter getFilter(ApplyClass apply) {
		for(ApplyEntity ef : getEntities()) {
			if(ef.getApplyClass() == apply)
				return ef;
			for(ApplyAttributeFilter af:  ef.getFilterAttributes()) {
				if(af.getAttribute() == apply)
					return af;
			}
		}
		for(ApplyRelation rf : getRelations()) {
			if(rf.getAssociation() == apply)
				return rf;
		}
		return null;
	}
}
