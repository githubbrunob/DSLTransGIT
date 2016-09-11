package dsltrans.transformer.filter;

import java.util.LinkedList;
import java.util.List;

import dsltrans.Attribute;
import dsltrans.MatchAttribute;
import dsltrans.MatchClass;
import dsltrans.metamodel.MetaEntity;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.model.InstanceAttribute;
import dsltrans.model.InstanceDatabase;
import dsltrans.model.InstanceDatabaseManager;
import dsltrans.model.InstanceEntity;
import dsltrans.transformer.TransformationRule;
import dsltrans.transformer.exceptions.InvalidLayerRequirement;

public class MatchEntityFilter extends AbstractFilter {

	private final MatchClass _class;
	private InstanceEntity _currentEntity;
	private List<MatchAttributeFilter> _filterAttributes;
	private TransformationRule _transformationrule;
	
	public MatchEntityFilter(TransformationRule tr, MatchClass mc, String id, InstanceDatabaseManager instanceDatabaseManager) {
		super(id, instanceDatabaseManager);
		setTransformationRule(tr);
		_class = mc;
		setCurrentEntity(null);
		setFilterAttributes(new LinkedList<MatchAttributeFilter>());
		
		for(MatchAttribute ma : getMatchClass().getAttribute()) {
			getFilterAttributes().add(new MatchAttributeFilter(ma,id, this, instanceDatabaseManager));
		}
	}

	public MatchClass getMatchClass() {
		return _class;
	}

	@Override
	public boolean process(InstanceDatabase database, MetaModelDatabase metamodel) throws InvalidLayerRequirement {
		
		MetaEntity me = metamodel.getMetaEntityByName(this.getMatchClass().getPackageName(), this.getMatchClass().getClassName());
		
		for(InstanceEntity ie : database.getLoadedClasses()) {
			// Eh aqui que fica a implementacao do allowInheritance nas match classes.
			if(( (me == ie.getMetaEntity()) || ( allowsInheritance() && ie.getMetaEntity().isSubTypeOf(me) ) )   && performMatchAttributes(ie,database,metamodel)) {
				ie.setDotNotation(this.getDotNotation());
				this.getFilterDatabase().addEntity(ie);
			}
		}
		return !this.getFilterDatabase().isEmpty();
	}

	private boolean allowsInheritance() {
		return getMatchClass().isAllowInheritance();
	}

	private boolean performMatchAttributes(InstanceEntity ie, InstanceDatabase database,
			MetaModelDatabase metamodel) {
		
		for(MatchAttributeFilter af : getFilterAttributes()) {
			this.setCurrentEntity(ie);
			if(!af.process(database, metamodel)) return false;
			
			for(InstanceAttribute ia : database.getLoadedAttributes()) {
				if(ia.getMetaAttribute().getName().equals(af.getAttribute().getAttributeName()) &&
					ia.getEntity().hashCode() == ie.hashCode())
				{
					af.getFilterDatabase().addAttribute(ia);
				}
			}			
		}
		return true; // for now we accept if the attribute instance do not exist on the database
	}

	public void setCurrentEntity(InstanceEntity _currentSolution) {
		this._currentEntity = _currentSolution;
	}

	public InstanceEntity getCurrentEntity() {
		return _currentEntity;
	}

	public void setFilterAttributes(List<MatchAttributeFilter> _filterAttributes) {
		this._filterAttributes = _filterAttributes;
	}

	public List<MatchAttributeFilter> getFilterAttributes() {
		return _filterAttributes;
	}

	public void setCurrentByHashId(InstanceDatabase instanceDatabase, int parseInt) {
		for(InstanceEntity ie : instanceDatabase.getLoadedClasses()) {
			if(ie.hashCode() == parseInt) {
				for(MatchAttributeFilter af:getFilterAttributes())
					af.setCurrentByEntity(ie);
				setCurrentEntity(ie);
				return;
			}
		}	
	}

	public String getDotNotation() {
		return "'"+this.getMatchClass().getPackageName()+"."+this.getMatchClass().getClassName()+"'";
	}

	public void setTransformationRule(TransformationRule _transformationrule) {
		this._transformationrule = _transformationrule;
	}

	public TransformationRule getTransformationRule() {
		return _transformationrule;
	}

	public MatchAttributeFilter findMatchAttributeFilter(Attribute a) {
		// Percorre todos os MatchAttributeFilters e retorna aquele que corresponde ao Attribute dado.
		for(MatchAttributeFilter af : getFilterAttributes()) {
			if (af.correspondsTo(a)) {
				return af;
			}
		}
		// No attributeFilter in this match entity filter for the given attribute.
		return null;
	}

}
