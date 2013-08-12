package transformerProcessor.filter;

import dsltrans.MatchAssociation;
import dsltrans.MatchClass;
import dsltrans.NegativeIndirectAssociation;
import dsltrans.NegativeMatchAssociation;
import dsltrans.PositiveIndirectAssociation;
import dsltrans.PositiveMatchAssociation;
import transformerProcessor.exceptions.InvalidLayerRequirement;
import emfInterpreter.instance.InstanceDatabase;
import emfInterpreter.instance.InstanceRelation;
import emfInterpreter.metamodel.MetaEntity;
import emfInterpreter.metamodel.MetaModelDatabase;

public class MatchRelationFilter  extends AbstractFilter {
	
	private final MatchAssociation _association;
	private InstanceRelation _currentRelation;

	public MatchRelationFilter(MatchAssociation ma, String id) {
		super(id);
		_association = ma;
		setCurrentRelation(null);
	}

	public MatchAssociation getAssociation() {
		return _association;
	}
	
	public MatchClass getSourceClass() {
		return getAssociation().getSource();
	}

	public MatchClass getTargetClass() {
		return getAssociation().getTarget();
	}	
	
	@Override
	public boolean process(InstanceDatabase database, MetaModelDatabase metamodel) throws InvalidLayerRequirement {

		MetaEntity sme = metamodel.getMetaEntityByName(this.getAssociation().getSource().getPackageName(), this.getAssociation().getSource().getClassName());
		MetaEntity tme = metamodel.getMetaEntityByName(this.getAssociation().getTarget().getPackageName(), this.getAssociation().getTarget().getClassName());

		if(isDirect()) {
						
			for(InstanceRelation ir : database.getLoadedRelations()) {
				if(ir.getRelation().getName().
						equals(getAssociation().getAssociationName())
				   &&
				   (ir.getSource().getMetaEntity().isSubTypeOf(sme))
				   &&
				   (ir.getTarget().getMetaEntity().isSubTypeOf(tme))
				)
				{
//					System.out.println(sme.getDotNotation()+" s | t "+tme.getDotNotation()+" added relation: " + ir.getRelation().getName() + " hashCode: " + ir.hashCode() + " source: " + ir.getSource().getMetaEntity().getDotNotation() + " hash: " + ir.getSource().hashCode() + " source: " + ir.getTarget().getMetaEntity().getDotNotation() + " hash: " + ir.getTarget().hashCode());					
					getFilterDatabase().addRelation(ir);
				}
			}			
		} else return !this.getFilterDatabase().isEmpty();

		return !this.getFilterDatabase().isEmpty();
	}

	public boolean isDirect() { return getAssociation() instanceof PositiveMatchAssociation ||
		getAssociation() instanceof NegativeMatchAssociation; }

	public boolean isIndirect() { return getAssociation() instanceof PositiveIndirectAssociation ||
		getAssociation() instanceof NegativeIndirectAssociation; }	
	
	public void setCurrentRelation(InstanceRelation _currentRelation) {
		this._currentRelation = _currentRelation;
	}

	public InstanceRelation getCurrentRelation() {
		return _currentRelation;
	}

	public void setCurrentByHashId(InstanceDatabase instanceDatabase, int parseInt) {
		for(InstanceRelation ir : instanceDatabase.getLoadedRelations()) {
			if(ir.hashCode() == parseInt) {
				setCurrentRelation(ir);
				return;
			}
		}	
	}

}
