package transformerProcessor.filter;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import transformerProcessor.TermProcessor;
import transformerProcessor.TransformationController;
import transformerProcessor.TransformationRule;
import transformerProcessor.exceptions.InvalidLayerRequirement;

import com.sun.tools.javac.util.Pair;

import dsltrans.ApplyAttribute;
import dsltrans.ApplyClass;
import dsltrans.Attribute;
import emfInterpreter.instance.InstanceDatabase;
import emfInterpreter.instance.InstanceEntity;
import emfInterpreter.metamodel.MetaEntity;
import emfInterpreter.metamodel.MetaModelDatabase;

public class ApplyEntityFilter extends AbstractFilter {

	private final ApplyClass _class;
	private InstanceEntity _currentEntity;
	private List<ApplyAttributeFilter> _filterAttributes;
	private TransformationRule _transformationRule;
	private boolean _imported = false;
	
	public ApplyEntityFilter(TransformationRule tr,ApplyClass mc, String id) {
		super(id);
		_class = mc;
		setCurrentEntity(null);
		setTransformationRule(tr);
		setFilterAttributes(new LinkedList<ApplyAttributeFilter>());
		setImported(tr.hasImportClass(mc));		
		
		
		for(ApplyAttribute ma : getApplyClass().getAttribute()) {
			getFilterAttributes().add(new ApplyAttributeFilter(ma,id,this, getTransformationRule().getRule()));
		}
	}	

	public ApplyClass getApplyClass() {
		return _class;
	}
	
	public MetaEntity getMetaEntity(MetaModelDatabase metamodel) throws InvalidLayerRequirement {
		String name = this.getApplyClass().getClassName();
		String packageName = this.getApplyClass().getPackageName();
		
		return metamodel.getMetaEntityByName(packageName, name);
	}
	
	public void setCurrentEntity(InstanceEntity _currentSolution) {
		this._currentEntity = _currentSolution;
	}

	public InstanceEntity getCurrentEntity() {
		return _currentEntity;
	}	
	
	public void setFilterAttributes(List<ApplyAttributeFilter> _filterAttributes) {
		this._filterAttributes = _filterAttributes;
	}

	public List<ApplyAttributeFilter> getFilterAttributes() {
		return _filterAttributes;
	}	
	
	public String getDotNotation() {
		return "'"+this.getApplyClass().getPackageName()+"."+this.getApplyClass().getClassName()+"'";
	}

	@Override
	public boolean process(InstanceDatabase model, MetaModelDatabase mmodel)
			throws SecurityException,
			IllegalArgumentException, ClassNotFoundException,
			NoSuchFieldException, IllegalAccessException,
			NoSuchMethodException, InvocationTargetException,
			InvalidLayerRequirement {
		
		MetaEntity me = mmodel.getMetaEntityByName(this.getApplyClass().getPackageName(), this.getApplyClass().getClassName());
		
		for(InstanceEntity ie : model.getLoadedClasses()) {
			if(ie.isFresh()) continue;
			// Fica aqui a implementacao do allow inheritance quando usado numa apply class.
			if( (me == ie.getMetaEntity()) || ( allowsInheritance() && ie.getMetaEntity().isSubTypeOf(me) )) {
				this.setCurrentEntity(ie);
				if(processApplyAttributes(ie,model,mmodel)) {
					ie.setDotNotation(this.getDotNotation());
					this.getFilterDatabase().addEntity(ie);
//					System.out.println("added: " + me.getDotNotation() + " hashCode: " + ie.hashCode());
//					for(InstanceAttribute ia: model.getAttributesByInstanceEntity(ie)) {
//						System.out.println("\twith attribute: " + ia.getMetaAttribute().getName() + " with value: " + (ia.getValue()== null? "null" : ia.getValue().toString()));
//					}
				}
			}
		}
		
		return !this.getFilterDatabase().isEmpty();
	}

	private boolean allowsInheritance() {
		return getApplyClass().isAllowInheritance();
	}

	public Pair<InstanceDatabase,MetaModelDatabase> resolveForeignApplyClasses(
			TransformationController control,
			InstanceDatabase imodel, 
			MetaModelDatabase immodel) throws InvalidLayerRequirement 
	{
		Pair<InstanceDatabase,MetaModelDatabase> pair = new Pair<InstanceDatabase,MetaModelDatabase>(imodel,immodel);
		if(getApplyClass().getGroupName() == null ||
				getApplyClass().getGroupName().isEmpty()) return pair;
		String groupName = getApplyClass().getGroupName();
		if(groupName.equals(getTransformationRule().getLayer().getName())) return pair;

//		MetaModelDatabase mmodel = immodel;		
		// search on previous layers...
		Map<String, Object> metamodels = control.getMetamodels();
		
		String first = this.getApplyClass().getPackageName().substring(0, 1);
		String remainder = this.getApplyClass().getPackageName().substring(1, this.getApplyClass().getPackageName().length());	
		String upperCase = first.toUpperCase()+remainder;
		
		String key = this.getApplyClass().getPackageName()+"."+upperCase;
		if(metamodels.containsKey(key)) {
			pair = new Pair<InstanceDatabase,MetaModelDatabase>(
					control.getLastDatabase(
							(MetaModelDatabase)metamodels.get(key),
							getTransformationRule().getLayer(),
							groupName
					),
					(MetaModelDatabase)metamodels.get(key)
			);
		}
		return pair;
	}
	
	private boolean processApplyAttributes(InstanceEntity ie, InstanceDatabase database,
			MetaModelDatabase metamodel) throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InvalidLayerRequirement {
		
		for(ApplyAttributeFilter af : getFilterAttributes()) {
			if(!af.process(database, metamodel)) return false;
		}
		return true; // for now we accept if the attribute instance do not exist on the database
	}

	public void setTransformationRule(TransformationRule _transformationRule) {
		this._transformationRule = _transformationRule;
	}

	public TransformationRule getTransformationRule() {
		return _transformationRule;
	}

	public TermProcessor getTermProcessor() {
		return getTransformationRule().getTermProcessor();
	}

	public boolean setCurrentByHashId(InstanceDatabase instanceDatabase, int parseInt) {
		for(InstanceEntity ie : instanceDatabase.getLoadedClasses()) {
			if(ie.hashCode() == parseInt) {
				for(ApplyAttributeFilter af:getFilterAttributes()) {
					if(!af.setCurrentByEntity(ie))
						return false;
				}
				setCurrentEntity(ie);
			}
		}
		return true;
	}

	private void setImported(boolean _imported) {
		this._imported = _imported;
	}

	public boolean isImported() {
		return _imported;
	}

	public ApplyAttributeFilter findApplyAttributeFilter(Attribute a) {
		// Percorre todos os MatchAttributeFilters e retorna aquele que corresponde ao Attribute dado.
		for(ApplyAttributeFilter af : getFilterAttributes()) {
			if (af.correspondsTo(a)) {
				return af;
			}
		}
		// No attributeFilter in this match entity filter for the given attribute.
		return null;
	}
}
