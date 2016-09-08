package transformerProcessor.filter;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


import transformerProcessor.PrologEngineSingleton;
//import jpl.Atom;
//import jpl.Query;
//import jpl.Util;
import transformerProcessor.TermProcessor;
import transformerProcessor.TransformationController;
import transformerProcessor.TransformationRule;
import transformerProcessor.exceptions.InvalidLayerRequirement;

import com.sun.tools.javac.util.Pair;
import com.ugos.jiprolog.engine.JIPEngine;
import com.ugos.jiprolog.engine.JIPQuery;
import com.ugos.jiprolog.engine.JIPTerm;
import com.ugos.jiprolog.engine.JIPTermParser;
import com.ugos.jiprolog.engine.JIPVariable;

import dsltrans.AbstractAttributeRelation;
import dsltrans.AbstractTemporalRelation;
import dsltrans.AnyMatchClass;
import dsltrans.ApplyClass;
import dsltrans.Attribute;
import dsltrans.ExistsMatchClass;
import dsltrans.MatchAssociation;
import dsltrans.MatchClass;
import dsltrans.MatchMayBeSameRelation;
import dsltrans.MatchModel;
import dsltrans.NegativeBackwardRestriction;
import dsltrans.NegativeIndirectAssociation;
import dsltrans.NegativeMatchAssociation;
import dsltrans.PositiveBackwardRestriction;
import dsltrans.PositiveIndirectAssociation;
import dsltrans.PositiveMatchAssociation;
import dsltrans.PositiveMatchClass;
import dsltrans.Rule;
import dsltrans.impl.AttributeEqualityImpl;
import dsltrans.impl.AttributeInequalityImpl;
import emfInterpreter.instance.InstanceAttribute;
import emfInterpreter.instance.InstanceDatabase;
import emfInterpreter.instance.InstanceEntity;
import emfInterpreter.instance.InstanceRelation;
import emfInterpreter.metamodel.MetaModelDatabase;

/*
 * All the Prolog related stuff is in this class.
 */
public class MatchFilter {
	private JIPEngine prologEngineSingleton;
	private JIPTermParser prologParser;
	private final List<MatchEntityFilter> _matchentityFilters;
	private final List<ApplyEntityFilter> _applyentityFilters;	
	private final List<MatchRelationFilter> _matchrelationFilters;
	private final List<TemporalRelationFilter> _temporalrelationFilters;
	private final InstanceDatabase _FilterDatabase;	
	private MetaModelDatabase _explicitMatchMetaModel;
	private InstanceDatabase _explicitMatchModel;
	final String entityFact = "entity";
	final String relationFact = "relation";
	final static String DIFF_ATTR_FACT = "allDifferent";
	private String _positiveJoinHead = "";
	private String _positiveJoinBody = "";
	private String _positiveJoinHead2 = "";
	private String _positiveJoinBody2 = "";
	private List<String> _negativeClassIds = null;
	private String _negativeJoinPredicate = "";
	private String _cutPredicate = "";	
	private String _query;
	private MatchModel _matchModel;
	@SuppressWarnings("rawtypes")
	private List<Hashtable> _binding;
	private List<QueryRelation> _positiveRelations;
	private String _queryCutHead="";
	private String _queryHead="";
	private int _temporalCounter=0;
	private int _applyCounter=0;
	private String _differentAttrFact= "";
	private String _differentAttrFactHead = "";
	private TransformationRule _transformationRule;
	
	private class Clause {
		Clause(String clause) {
			if(!clause.isEmpty()) {
				System.out.println(clause+".");
				JIPTerm term = prologParser.parseTerm("assert("+clause+")");
				JIPQuery query = prologEngineSingleton.openSynchronousQuery(term);
				query.nextSolution();
			}
		}
	};	
	
	private class QueryRelation {
		private String relationName = "";
		private String query = "";
		
		public QueryRelation(String relationname, String actualquery) {
			setRelationName(relationname);
			setQuery(actualquery);
		}

		public void setRelationName(String relationName) {
			this.relationName = relationName;
		}

		public String getRelationName() {
			return relationName;
		}

		public void setQuery(String query) {
			this.query = query;
		}

		public String getQuery() {
			return query;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public MatchFilter(TransformationRule tr, Rule rule, MatchModel mm) {
		
		prologEngineSingleton = PrologEngineSingleton.getEngineSingleton();
		prologParser = prologEngineSingleton.getTermParser();
		
		_FilterDatabase = new InstanceDatabase();
		_matchentityFilters = new LinkedList<MatchEntityFilter>();
		_matchrelationFilters = new LinkedList<MatchRelationFilter>();
		_applyentityFilters = new LinkedList<ApplyEntityFilter>();
		_temporalrelationFilters = new LinkedList<TemporalRelationFilter>();
		_negativeClassIds = new ArrayList<String>();
		
		_binding = new LinkedList<Hashtable>();
		_transformationRule = tr;
		setPositiveRelations(new LinkedList<QueryRelation>());
		set_matchModel(mm);
		set_explicitMatchMetaModel(null);
		set_explicitMatchModel(null);
			
		int id = 0;
		
		for (MatchClass mc : mm.getClass_()) {
			getMatchEntityFilters().add(new MatchEntityFilter(tr,mc,"Id"+Integer.toString(id++)));
			

			if(isNegative(mc)) {
				_negativeClassIds.add("Id" + Integer.toString(id - 1));
			}
		}	
		List<ApplyClass> ac = new LinkedList<ApplyClass>();
		for(AbstractTemporalRelation br : rule.getBackwards()) {
			if(mm.getClass_().contains(br.getSourceClass()) // referent to this match model
					&& !ac.contains(br.getTargetClass())) { // gather unique apply class
				getApplyEntityFilters().add(new ApplyEntityFilter(tr,br.getTargetClass(),"Id"+Integer.toString(id++)));
				ac.add(br.getTargetClass());
			}
		}
		for (MatchAssociation ma : mm.getAssociation()) {
			if ( shouldBeBinded(ma) ) {
				getMatchRelationFilters().add(new MatchRelationFilter(ma,"Id"+Integer.toString(id++)));
			}
		}
			
		for(AbstractTemporalRelation br : rule.getBackwards()) {
			if(mm.getClass_().contains(br.getSourceClass())) {// referent to this match model
				getTemporalFilters().add(new TemporalRelationFilter(br,"Id"+Integer.toString(id++)));
			}
		}
		buildJoinPredicates();
	}

	private boolean shouldBeBinded(MatchAssociation ma) {
		return !(ma instanceof MatchMayBeSameRelation);
	}

	public InstanceDatabase getFilterDatabase() {
		return _FilterDatabase;
	}
	
	public int getNumberFilters() {
		return getMatchRelationFilters().size() + getMatchEntityFilters().size();
	}
	
	public List<MatchEntityFilter> getMatchEntityFilters() {
		return _matchentityFilters;
	}


	public List<MatchRelationFilter> getMatchRelationFilters() {
		return _matchrelationFilters;
	}

	public void clean() {
		
		prologEngineSingleton.openSynchronousQuery(prologParser.parseTerm("retractall(entity(_,_,_,_,_))")).nextSolution();
		prologEngineSingleton.openSynchronousQuery(prologParser.parseTerm("retractall(relation(_,_))")).nextSolution();
		if(!getQueryHead().isEmpty()) {
			prologEngineSingleton.openSynchronousQuery(prologParser.parseTerm("retractall(queryjoin("+getQueryHead()+"))")).nextSolution();
			prologEngineSingleton.openSynchronousQuery(prologParser.parseTerm("retractall(nqueryjoin("+getQueryHead()+"))")).nextSolution();
		}
		if(!getQueryCutHead().isEmpty()) {
			prologEngineSingleton.openSynchronousQuery(prologParser.parseTerm("retractall(cutclause("+getQueryCutHead()+"))")).nextSolution();
		}
		if(!getQueryDifferentEntitiesHead().isEmpty()) {
			prologEngineSingleton.openSynchronousQuery(prologParser.parseTerm("retractall("+ getQueryDifferentEntitiesHead() + ")")).nextSolution();
		}
		
		setQueryHead("");
		setQueryCutHead("");
		
		new Clause(entityFact + "(0,'',[],[0],[0])");
		new Clause(relationFact + "(0,[])");
	}
	
	private void setQueryDifferentEntitiesFact(String string) {
		_differentAttrFact = string;
	}

	private void setQueryDifferentEntitiesHead(String string) {
		_differentAttrFactHead = string;
	}

	private String getQueryDifferentEntitiesFact() {
		return _differentAttrFact;
	}

	private String getQueryDifferentEntitiesHead() {
		return _differentAttrFactHead;
	}

	/*
	 * Perform partial queries
	 * and then join the results using a prolog engine
	 * */
	public boolean process(TransformationController control,InstanceDatabase matchModel, InstanceDatabase applyModel,
			MetaModelDatabase matchMetaModel, MetaModelDatabase applyMetaModel,
			TermProcessor tp) throws Throwable {
		
		clean();
		getFilterDatabase().clean();

		Map<String,InstanceEntity> map = new HashMap<String,InstanceEntity>();
		if(!CreateApplyEntities(control,applyModel, applyMetaModel,map)) 
			return false;		
		if(!CreateMatchEntities(matchModel, matchMetaModel,map)) 
			return false;
		if(!CreateRelations(matchModel, matchMetaModel)) 
			return false;
		
		String orderedPositiveRelations = CreateOrderedRelations();
		float ratio = (_temporalCounter+1) / (_applyCounter+1);
		
		if(ratio < 5.0) {
			System.out.println("choosing type 1 heuristics:" + _temporalCounter +", " + _applyCounter + ", " + ratio);
			new Clause(getPositiveJoinHead()+"("+orderedPositiveRelations+getPositiveJoinBody()+")");
		} else {
			System.out.println("choosing type 2 heuristics:" + _temporalCounter +", " + _applyCounter + ", " + ratio);
			new Clause(getPositiveJoinHead2()+"("+orderedPositiveRelations+getPositiveJoinBody2()+")");
		}
		
		if(!getNegativeJoinPredicate().isEmpty()) {
			new Clause(getNegativeJoinPredicate());
		}
		
		new Clause(getCutPredicate());
		
		new Clause(getQueryDifferentEntitiesFact());
		
		System.out.println("query: " + getQuery());
		
		JIPTerm ruleMatchTerm = prologParser.parseTerm(getQuery());
		JIPQuery ruleQuery = prologEngineSingleton.openSynchronousQuery(ruleMatchTerm);
		
		JIPTerm matchSolutionTerm = ruleQuery.nextSolution();
		
		boolean atLeastOneSolution = matchSolutionTerm != null;
		
		if (atLeastOneSolution) {
			do {
				@SuppressWarnings("rawtypes")
				Hashtable matchSolutionBinding = matchSolutionTerm.getVariablesTable();
				getBindingList().add(matchSolutionBinding);
				matchSolutionTerm = ruleQuery.nextSolution();
			} while (matchSolutionTerm != null);
		}
		
		return atLeastOneSolution;
		
	}

	private boolean CreateRelations(InstanceDatabase matchModel,MetaModelDatabase matchMetaModel
	) throws InvalidLayerRequirement {
		for(MatchRelationFilter rf : getMatchRelationFilters()) {
			if ((get_explicitMatchMetaModel() != null) && (get_explicitMatchModel() != null))
				rf.process(get_explicitMatchModel(), get_explicitMatchMetaModel());
			else
				rf.process(matchModel, matchMetaModel);
			if(rf.getFilterDatabase().isEmpty() && rf.getAssociation() instanceof PositiveMatchAssociation)
				return false;
			getFilterDatabase().union(rf.getFilterDatabase());
		}
		return true;
	}	
	
	private boolean CreateMatchEntities(InstanceDatabase matchModel,
			MetaModelDatabase matchMetaModel,Map<String,InstanceEntity> map) 
					throws InvalidLayerRequirement {
			// first only process positives...
			_temporalCounter = 0;
			InstanceDatabase runningMatchModel = matchModel;
			MetaModelDatabase runningMetaModel = matchMetaModel;
			if ((get_explicitMatchMetaModel() != null) && (get_explicitMatchModel() != null)) {
				runningMatchModel = get_explicitMatchModel();
				runningMetaModel = get_explicitMatchMetaModel();
			}
				
			Map<String,String> mapString = new HashMap<String,String>();
			for(MatchEntityFilter ef : getMatchEntityFilters()) {
				ef.process(runningMatchModel, runningMetaModel);
				
				if(ef.getFilterDatabase().isEmpty() && isPositive(ef.getMatchClass()))
					return false;
				for(InstanceEntity ie: ef.getFilterDatabase().getLoadedClasses()) {
					final String id = "i"+Integer.toString(ie.hashCode());					
					if(!mapString.containsKey(id+ie.getDotNotation())) {
						String factString = entityFact + "(" + id + ", " + 
						ie.getDotNotation()+ ", " + 
						generateAttributeValues(ie,runningMatchModel,runningMetaModel) + ",[";
						for(InstanceEntity ieparent: ie.getParents())
						{
							factString += "i"+Integer.toString(ieparent.hashCode())+ ", ";
						}
						factString += "0],[";
						for(InstanceEntity iepast: ie.getTemporalChildren()) 
						{
							if(map.get("i"+Integer.toString(iepast.hashCode()))!=null) {
								factString += "i"+Integer.toString(iepast.hashCode())+ ", ";
								_temporalCounter++;
							}
						}
						factString += "0])";
						new Clause(factString);
						mapString.put(id+ie.getDotNotation(),factString);
					}
				}
				getFilterDatabase().union(ef.getFilterDatabase());
			}
		return true;
	}

	private String generateAttributeValues(InstanceEntity ie, 
			InstanceDatabase database,MetaModelDatabase metaModel) {
		
		String entry = "[";

		boolean first = true;
		for(InstanceAttribute ia : database.getAttributesByInstanceEntity(ie)) {
			if(ia.getValue()!=null) {
				if(!first)
					entry+=", ";
				first = false;
				entry += "('_" + ia.getMetaAttribute().getName() + "', '" + ia.getValue() +"')";
			}
		}			
		return entry+"]";
	}	

	private boolean CreateApplyEntities(TransformationController control, InstanceDatabase applyModel,
			MetaModelDatabase applyMetaModel,
			Map<String,InstanceEntity> map) throws ClassNotFoundException,
			NoSuchFieldException, IllegalAccessException,
			NoSuchMethodException, InvocationTargetException,
			InvalidLayerRequirement {

			_applyCounter = 0;
			Map<String,String> mapString = new HashMap<String,String>();
			
			for(ApplyEntityFilter ef: getApplyEntityFilters()) {
				Pair<InstanceDatabase,MetaModelDatabase> pair = 
					ef.resolveForeignApplyClasses(control,applyModel, applyMetaModel);
				ef.process(pair.fst, pair.snd);
	
				if(ef.getFilterDatabase().isEmpty())
					return false;
				for(InstanceEntity ie: ef.getFilterDatabase().getLoadedClasses()) {
					final String id = "i"+Integer.toString(ie.hashCode());
					if(!mapString.containsKey(id+ie.getDotNotation())) {
						String factString = entityFact + "(" + id + ", " + ie.getDotNotation() + 
						", " + generateAttributeValues(ie,pair.fst,pair.snd) + ",[0],[0])";						
						new Clause(factString);
						map.put(id, ie);
						mapString.put(id+ie.getDotNotation(),factString);
						_applyCounter++;
					}
				}
				getFilterDatabase().union(ef.getFilterDatabase());
			}
			return true;
	}

	private String CreateOrderedRelations() {
		Map<InstanceEntity,List<InstanceRelation>> ermap = new HashMap<InstanceEntity,List<InstanceRelation>>();
		for(InstanceRelation ir: getFilterDatabase().getLoadedRelations()) {
			if(!ermap.containsKey(ir.getSource())) {
				List<InstanceRelation> tempList = new LinkedList<InstanceRelation>();
				tempList.add(ir);
				ermap.put(ir.getSource(), tempList);
			} else {
				List<InstanceRelation> irList = ermap.get(ir.getSource());
				irList.add(ir);
			}
		}		
		String orderedPositiveRelations="";
		{
			Map<String,Integer> mapStringCounter = new HashMap<String,Integer>();

			for(InstanceEntity ie: ermap.keySet()) {
				final String sourceID = "i"+Integer.toString(ie.hashCode());
				String factString = relationFact + "(" + sourceID+",["; 
				
				for(InstanceRelation ir: ermap.get(ie)) {
					final String id = "i"+Integer.toString(ir.hashCode());
					final String targetID = "i"+Integer.toString(ir.getTarget().hashCode());
					factString += "('" + ir.getRelation().getName() + "'," + targetID + ","+ id + "),";
					if(mapStringCounter.containsKey(ir.getRelation().getName()))
					{
						Integer counter = mapStringCounter.get(ir.getRelation().getName());
						mapStringCounter.put(ir.getRelation().getName(),++counter);
					} else {
						mapStringCounter.put(ir.getRelation().getName(),1);
					}
				}
				factString += "('',0,0)])";
				new Clause(factString);
			}
			while(!mapStringCounter.isEmpty()) {
				// getminimum
				String minString = "";
				Integer minValue = Integer.MAX_VALUE;
				for(String relationName: mapStringCounter.keySet()) {
					Integer value = mapStringCounter.get(relationName);
					if(value < minValue) {
						minValue = value;
						minString = relationName;
					}
				}
				for(QueryRelation qr: getPositiveRelations()) {
					if(qr.getRelationName().equals(minString)) {
						orderedPositiveRelations += qr.getQuery()+", ";
					}
				}
				mapStringCounter.remove(minString);
			}
		}
		return orderedPositiveRelations;
	}
	
	public static boolean isPositive(MatchAssociation association) {
		return association instanceof PositiveMatchAssociation || association instanceof PositiveIndirectAssociation || association instanceof MatchMayBeSameRelation;
	}

	public static boolean isPositive(AbstractTemporalRelation association) {
		return association instanceof PositiveBackwardRestriction;
	}	
	
	public static boolean isAnyPositive(MatchClass mclass) {
		return mclass instanceof AnyMatchClass;
	}
	
	public static boolean isPositive(MatchClass matchClass) {
		return matchClass instanceof PositiveMatchClass;
	}
	
	private boolean isExistPositive(MatchClass target) {
		return target instanceof ExistsMatchClass;
	}
	
	private boolean isNegative(MatchClass matchClass) {
		return matchClass instanceof dsltrans.impl.NegativeMatchClassImpl;
	}
		
	public boolean updateFilters(@SuppressWarnings("rawtypes") Hashtable binding,InstanceDatabase matchModel, InstanceDatabase applyModel)
	{		
		for(MatchEntityFilter ef : getMatchEntityFilters()) {
			if(isPositive(ef.getMatchClass())) {
				String hashCode = getHashCode(binding, ef.getId());
				ef.setCurrentByHashId(getFilterDatabase(),Integer.parseInt(hashCode));
				System.out.println("solution entity: " + hashCode + " " + ef.getCurrentEntity().getDotNotation());
				for(MatchAttributeFilter maf : ef.getFilterAttributes()) {
					System.out.println("\twith attribute: " + maf.getCurrentAttribute().getMetaAttribute().getName() + " with value: " + (maf.getCurrentAttribute().getValue() == null? "null" : maf.getCurrentAttribute().getValue().toString()));						
				}
				for(InstanceAttribute ia: matchModel.getAttributesByInstanceEntity(ef.getCurrentEntity())) {
					System.out.println("\twith attribute: " + ia.getMetaAttribute().getName() + " with value: " + (ia.getValue()== null? "null" : ia.getValue().toString()));
				}
			}
		}
		for(ApplyEntityFilter ef : getApplyEntityFilters()) {
			if(!onlyNegativeTemporals(ef)) {
				String hashCode = getHashCode(binding, ef.getId());
				if (!ef.setCurrentByHashId(getFilterDatabase(),Integer.parseInt(hashCode))){
					return false;
				}
				System.out.println("solution entity: " + hashCode + " " + ef.getCurrentEntity().getDotNotation());
				for(ApplyAttributeFilter aaf : ef.getFilterAttributes()) {
					System.out.println("\twith attribute: " + aaf.getCurrentAttribute().getMetaAttribute().getName() + " with value: " + (aaf.getCurrentAttribute().getValue() == null? "null" : aaf.getCurrentAttribute().getValue().toString()));
				}
				for(InstanceAttribute ia: applyModel.getAttributesByInstanceEntity(ef.getCurrentEntity())) {
					System.out.println("\twith attribute: " + ia.getMetaAttribute().getName() + " with value: " + (ia.getValue()== null? "null" : ia.getValue().toString()));
				}
			}
		}
		for(MatchRelationFilter rf : getMatchRelationFilters()) {
			if(!isIndirect(rf.getAssociation())) { // lets ignore indirect ones
				if(isPositive(rf.getAssociation())) {
					String hashCode = getHashCode(binding, rf.getId());
					System.out.println("solution relation: " + hashCode);
					rf.setCurrentByHashId(getFilterDatabase(),Integer.parseInt(hashCode));
				}
			}
		}
		
		
		
		return true;
	}
	
	private boolean onlyNegativeTemporals(ApplyEntityFilter ef) {
		{  // temporal relations
			Iterator<TemporalRelationFilter> iter = getTemporalFilters().iterator();
			while(iter.hasNext()) {
				TemporalRelationFilter rf = iter.next();
				if(rf.getAssociation() instanceof PositiveBackwardRestriction) {
					String targetId = getIdFrom(rf.getTargetClass());
					if(ef.getId().equals(targetId))
						return false;
				}
			};
		}

		return true;
	}

	private boolean isIndirect(MatchAssociation association) {
		return association instanceof PositiveIndirectAssociation ||
		association instanceof NegativeIndirectAssociation;
	}
	
	private void buildJoinPredicates() {
		buildJoinPredicates1();
		buildJoinPredicates2();		
	}
	
	private void buildJoinPredicates1() {
		String queryBody = "";
		boolean first = true;			
		
		List<String> idList = new LinkedList<String>();
		
		// Keeps the id's from positive match and apply entities.
		List<String> positiveMatchAndApplyEntitiesIDList = new LinkedList<String>();			
		
		{ // regular match entities
			Iterator<MatchEntityFilter> iter = getMatchEntityFilters().iterator();
			while(iter.hasNext()) {
				MatchEntityFilter ef = iter.next();
				if(!exist(idList,ef.getId()))
					idList.add(ef.getId());
				
				// Collects all id's the represent positive match classes.
				if (isPositive(ef.getMatchClass()) && !exist(positiveMatchAndApplyEntitiesIDList,ef.getId())) {
					assert !(ef.getMatchClass() instanceof ApplyClass);
					positiveMatchAndApplyEntitiesIDList.add(ef.getId());
				}
			};
		}
		
		{ // referenced apply entities from backward restrictions
			Iterator<ApplyEntityFilter> iter = getApplyEntityFilters().iterator();
			while(iter.hasNext()) {
				ApplyEntityFilter ef = iter.next();
					if(!exist(idList,ef.getId()))
						idList.add(ef.getId());
					
				// Collects all id's the represent apply classes.
				if (!exist(positiveMatchAndApplyEntitiesIDList,ef.getId())) {
					assert ef.getApplyClass() instanceof ApplyClass;
					positiveMatchAndApplyEntitiesIDList.add(ef.getId());
				}
			};
		}		
		{ // regular match associations
			Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();
			while(iter.hasNext()) {
				MatchRelationFilter rf = iter.next();
				
				if(!isIndirect(rf.getAssociation())) {
					if(!exist(idList,rf.getId()))
						idList.add(rf.getId());					
				}
				if(isPositive(rf.getAssociation())
						&& !isExistPositive(rf.getAssociation().getSource()) // also exclude
						&& !isExistPositive(rf.getAssociation().getTarget()) // associations to exist elements
				) { // deal with positives first

					String sourceId = getIdFrom(rf.getSourceClass());
					String targetId = getIdFrom(rf.getTargetClass());
					if(rf.getAssociation() instanceof PositiveMatchAssociation) {
						
						String query = relationFact+"("+sourceId+",RefList"+rf.getId()+"),"+
									" member(('"+rf.getAssociation().getAssociationName()+"',"+targetId+", "+rf.getId()+"), RefList"+rf.getId()+")";
						getPositiveRelations().add(new QueryRelation(rf.getAssociation().getAssociationName(),query));
					}
				}
			};
		}		

		{ // regular match entities
			Iterator<MatchEntityFilter> iter = getMatchEntityFilters().iterator();
			while(iter.hasNext()) {
				MatchEntityFilter ef = iter.next();
					if(isAnyPositive(ef.getMatchClass())) {// deal with any positives first
						if(!first)
							queryBody += ",";
						first = false;						
						queryBody += entityFact+"("+ef.getId()+","+ef.getDotNotation()+
						", AttributeList"+ef.getId() + 
						", "+"ParentList"+ef.getId()+",TemporalChildrenList"+ef.getId()+")";
												
						for(MatchAttributeFilter maf: ef.getFilterAttributes())
							if(maf.isAtomValue()) {
								String pair = "('_"+maf.getName()+"',"+maf.getAtomValue()+")";
								queryBody += ", memberchk( "+pair+", AttributeList"+ef.getId()+")";
							}
					}
			};
		}
		
		{  // temporal relations
			Iterator<TemporalRelationFilter> iter = getTemporalFilters().iterator();
			while(iter.hasNext()) {
				TemporalRelationFilter rf = iter.next();
				if(isPositive(rf.getAssociation())
						&& !isExistPositive(rf.getSourceClass()) // also exclude
				) {
					if(!exist(idList,rf.getId()))
						idList.add(rf.getId());	
					if(!first)
						queryBody += ",";
					first = false;		
					
					String sourceId = getIdFrom(rf.getSourceClass());
					String targetId = getIdFrom(rf.getTargetClass());
					queryBody += "member("+targetId+", TemporalChildrenList"+sourceId+")";
				}
			};
		}		
		
		{ // referenced apply entities from backward restrictions
			Iterator<ApplyEntityFilter> iter = getApplyEntityFilters().iterator();
			while(iter.hasNext()) {
				ApplyEntityFilter ef = iter.next();
				
				if(checkTemporalNoCut(ef)) {
					if(!first)
						queryBody += ",";
					first = false;				
					queryBody += entityFact+"("+ef.getId()+","+ef.getDotNotation()+
					", AttributeList"+ef.getId() + 
					",[0],[0])";
																
					for(ApplyAttributeFilter maf: ef.getFilterAttributes())
						if(maf.isAtomValue()) {
							String pair = "('_"+maf.getName()+"',"+maf.getAtomValue()+")";
							queryBody += ", memberchk( "+pair+", AttributeList"+ef.getId()+")";
						}
				}
			};
		}
		
		{ // indirect match associations
			Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();
			while(iter.hasNext()) {
				MatchRelationFilter rf = iter.next();
				if(isPositive(rf.getAssociation())
						&& !isExistPositive(rf.getAssociation().getSource()) // also exclude
						&& !isExistPositive(rf.getAssociation().getTarget()) // associations to exist elements
				) { // deal with positives first

					String sourceId = getIdFrom(rf.getSourceClass());
					String targetId = getIdFrom(rf.getTargetClass());

					if(rf.getAssociation() instanceof PositiveIndirectAssociation) {
						if(!first)
							queryBody += ",";
						first = false;						
//queryBody += neighbourFact+"("+rf.getId()+","+ sourceId +","+ targetId +")";
						queryBody += "memberchk("+sourceId+", ParentList"+targetId+")";
					}
				}
			};
		}
		
		
		
		{
			// Check for attribute relations here.
			for (AbstractAttributeRelation aatr: getOwnAttributeRelations()) {
				// Catch the relevant filters and add predicates to query body.
				if(!first){
					queryBody += ",";
				}
				first = false;
				queryBody += getPredicatesFromAttributeRelation(aatr);
			}
			
		}
		
		setQueryHead(compileHead("", idList));
		
		_query = "queryjoin("+ getQueryHead() + ").";
		
		String cutclause = getCutClause();
		if(!cutclause.isEmpty()){
			queryBody += "," + cutclause;
		}	

		generateDifferentEntitiesFactCall(positiveMatchAndApplyEntitiesIDList);
		
		String negativeclause = getNegativeClauses(getQueryHead(),true);
		if(!negativeclause.isEmpty()){
			queryBody += ",not(" + negativeclause + ")";
		}
		
		{
			// Assure different id's match different entities.
			if (!getQueryDifferentEntitiesHead().isEmpty()) {
				if(!first){
					queryBody += ",";
				}
				first = false;
				queryBody += getQueryDifferentEntitiesHead();
			}
			
		}
		
		System.out.println("positiveJoinPredicate: queryjoin("+ getQueryHead()+") :- \n" + queryBody);
		_positiveJoinHead = "queryjoin("+ getQueryHead()+") :- ";
		_positiveJoinBody = queryBody;
	}

	private String getPredicatesFromAttributeRelation(
			AbstractAttributeRelation aatr) {
		
		Attribute source = aatr.getSourceAttribute();
		Attribute target = aatr.getTargetAttribute();
		
		MatchAttributeFilter source_maf = null;
		ApplyAttributeFilter source_aaf = null;
		MatchAttributeFilter target_maf = null;
		ApplyAttributeFilter target_aaf = null;
		
	
		 // There can be all combinations of attribute filters 
		 // corresponding to the source and target attributes.
		
		source_maf = findMatchAttributeFilter(source);
		if (source_maf==null) {
			// The attribute relation doesn't start in the match model.
			// It must be in the apply model. Or else it's an error...
			source_aaf = findApplyAttributeFilter(source);
			assert source_aaf != null;
		}
		assert source_maf!=null || source_aaf != null;
		
		target_maf = findMatchAttributeFilter(target);
		if (target_maf==null) {
			// The attribute relation doesn't start in the match model.
			// It must be in the apply model. Or else it's an error...
			target_aaf = findApplyAttributeFilter(target);
			assert target_aaf != null;
		}
		assert target_maf!=null || target_aaf != null;
		
		// Exactly one of the following combinations will hold.
		assert (source_maf!=null && target_maf!=null) 
				|| (source_maf!=null && target_aaf!=null)
				|| (source_aaf!=null && target_maf!=null)
				|| (source_aaf!=null && target_aaf!=null);
		
		if (source_maf!=null && target_maf!=null) {
			String pair1 = "('_"+source_maf.getName()+"', Attr"+source_maf.getId()+")";
			String pair2 = "('_"+target_maf.getName()+"', Attr"+target_maf.getId()+")";
			String res = "memberchk( "+ pair1 + ", AttributeList"+source_maf.getEntity().getId()+")";
			res += ", " + "memberchk( "+ pair2 + ", AttributeList"+target_maf.getEntity().getId()+")";
			
			// One of these must hold.
			if (aatr instanceof AttributeEqualityImpl) {
				res += ", Attr" + source_maf.getId() + " == Attr" + target_maf.getId();
			}
			if (aatr instanceof AttributeInequalityImpl) {
				res += ", Attr" + source_maf.getId() + " \\== Attr" + target_maf.getId();
			}
			
			return res;
		}
		if (source_maf!=null && target_aaf!=null) {
			String pair1 = "('_"+source_maf.getName()+"', Attr"+source_maf.getId()+")";
			String pair2 = "('_"+target_aaf.getName()+"', Attr"+target_aaf.getId()+")";
			String res = "memberchk( "+ pair1 + ", AttributeList"+source_maf.getEntity().getId()+")";
			res += ", " + "memberchk( "+ pair2 + ", AttributeList"+target_aaf.getEntity().getId()+")";
			
			// One of these must hold.
			if (aatr instanceof AttributeEqualityImpl) {
				res += ", " + source_maf.getId() + " == Attr" + target_aaf.getId();
			}
			if (aatr instanceof AttributeInequalityImpl) {
				res += ", " + source_maf.getId() + " \\== Attr" + target_aaf.getId();
			}
			return res;
		}
		if (source_aaf!=null && target_maf!=null) {
			String pair1 = "('_"+source_aaf.getName()+"', Attr"+source_aaf.getId()+")";
			String pair2 = "('_"+target_maf.getName()+"', Attr"+target_maf.getId()+")";
			String res = "memberchk( "+ pair1 + ", AttributeList"+source_aaf.getEntity().getId()+")";
			res += ", " + "memberchk( "+ pair2 + ", AttributeList"+target_maf.getEntity().getId()+")";
			
			// One of these must hold.
			if (aatr instanceof AttributeEqualityImpl) {
				res += ", " + source_aaf.getId() + " == Attr" + target_maf.getId();
			}
			if (aatr instanceof AttributeInequalityImpl) {
				res += ", " + source_aaf.getId() + " \\== Attr" + target_maf.getId();
			}
			return res;
		}
		if (source_aaf!=null && target_aaf!=null) {
			String pair1 = "('_"+source_aaf.getName()+"', Attr"+source_aaf.getId()+")";
			String pair2 = "('_"+target_aaf.getName()+"', Attr"+target_aaf.getId()+")";
			String res = "memberchk( "+ pair1 + ", AttributeList"+source_aaf.getEntity().getId()+")";
			res += ", " + "memberchk( "+ pair2 + ", AttributeList"+target_aaf.getEntity().getId()+")";
			
			// One of these must hold.
			if (aatr instanceof AttributeEqualityImpl) {
				res += ", " + source_aaf.getId() + " == Attr" + target_aaf.getId();
			}
			if (aatr instanceof AttributeInequalityImpl) {
				res += ", " + source_aaf.getId() + " \\== Attr" + target_aaf.getId();
			}
			return res;
		}
		
		assert (false);
		
		return "";
	}

	private List<AbstractAttributeRelation> getOwnAttributeRelations() {
		List<AbstractAttributeRelation> res = new LinkedList<AbstractAttributeRelation>();
		for (AbstractAttributeRelation aatr: _transformationRule.getRule().getAttributeRelations()) {
			if (containedAbstractAttributeRelation(aatr)) {
				res.add(aatr);
			}
		}
		return res;
	}

	private boolean containedAbstractAttributeRelation(
			AbstractAttributeRelation aatr) {
		Attribute source = aatr.getSourceAttribute();
		Attribute target = aatr.getTargetAttribute();
		
		MatchAttributeFilter source_maf = null;
		ApplyAttributeFilter source_aaf = null;
		MatchAttributeFilter target_maf = null;
		ApplyAttributeFilter target_aaf = null;
		
		source_maf = findMatchAttributeFilter(source);
		if (source_maf==null) {
			// The attribute relation doesn't start in the match model.
			// Let's try the apply model
			source_aaf = findApplyAttributeFilter(source);
		}
		target_maf = findMatchAttributeFilter(target);
		if (target_maf==null) {
			// The attribute relation doesn't start in the match model.
			// Let's try the apply model
			target_aaf = findApplyAttributeFilter(target);
		}
		
		return (source_maf!=null || source_aaf!=null) && (target_maf !=null || target_aaf!=null) ;
	}

	private void generateDifferentEntitiesFactCall(List<String> idList) {
		setQueryDifferentEntitiesHead("");
		setQueryDifferentEntitiesFact("");
		
		Set<String> usedIds = new HashSet<String>(idList.size());

		if(!idList.containsAll(_negativeClassIds)) {
			idList.addAll(_negativeClassIds);
		}
		
		String queryBody = "";
		assert queryBody.isEmpty();
		
		boolean first = true;
		for (int i=0; i<idList.size(); i++) {
			for (int j=i+1; j<idList.size(); j++) {
				String idi = idList.get(i);
				String idj = idList.get(j);
				
				if (!mayBeSameRelations(idi, idj)) {
					if (!first) {
						queryBody+=",";
					}
					first = false;
				
					queryBody += idi + " \\== " + idj;
					usedIds.add(idi);
					usedIds.add(idj);
				}
			}
		}
		
		assert queryBody != null;
		
		if (!queryBody.isEmpty()) {
			
			queryBody = "(" + queryBody + ")";
			
			setQueryDifferentEntitiesHead(DIFF_ATTR_FACT + "(" + compileHead("", convertSetToList(usedIds)) + ")");
			
			setQueryDifferentEntitiesFact(getQueryDifferentEntitiesHead() + " :- " + queryBody);
			
		}
	}

	private List<String> convertSetToList(Set<String> usedIds) {
		
		List<String> res = new LinkedList<String>();
		
		for (String el : usedIds) {
			res.add(el);
		}
		
		return res;
	}

	private boolean mayBeSameRelations(String idi, String idj) {
		assert !idi.equals(idj);
		
		/*
		 * 
		 * 	get corresponding entities
		 * 	if entities are in the same match or apply model {
		 *   return true if there is a maybesame relation between them.
		 *   false otherwise
		 */
		
		MatchClass mc_i = findMatchClass(idi);
		MatchClass mc_j = findMatchClass(idj);
		
		if (mc_i != null && mc_j != null) {
			return _transformationRule.hasMayBeSameRelation(mc_i, mc_j);
		}
		
		ApplyClass ac_i = findApplyClass(idi);
		ApplyClass ac_j = findApplyClass(idj);
		
		if (ac_i != null && ac_j != null) {
			return _transformationRule.hasMayBeSameRelation(ac_i, ac_j);
		}
		
		return false;
	}

	private ApplyClass findApplyClass(String idi) {
		for(ApplyEntityFilter ef : getApplyEntityFilters()) {
			if (ef.getId().equals(idi)) {
				return ef.getApplyClass();
			}
		}
		return null;
	}

	private MatchClass findMatchClass(String idi) {
		for(MatchEntityFilter ef : getMatchEntityFilters()) {
			if (ef.getId().equals(idi)) {
				return ef.getMatchClass();
			}
		}
		return null;
	}

	private void buildJoinPredicates2() {
		String queryBody = "";
		boolean first = true;			
		
		List<String> idList = new LinkedList<String>();			
		
		// Keeps the id's from positive match and apply entities.
		List<String> positiveMatchAndApplyEntitiesIDList = new LinkedList<String>();			
				
		
		{ // regular match entities
			Iterator<MatchEntityFilter> iter = getMatchEntityFilters().iterator();
			while(iter.hasNext()) {
				MatchEntityFilter ef = iter.next();
					if(!exist(idList,ef.getId()))
						idList.add(ef.getId());
				
				// Collects all id's the represent positive match classes.
				if (isPositive(ef.getMatchClass()) && !exist(positiveMatchAndApplyEntitiesIDList,ef.getId())) {
					assert !(ef.getMatchClass() instanceof ApplyClass);
					positiveMatchAndApplyEntitiesIDList.add(ef.getId());
				}
			};
		}
		
		{ // referenced apply entities from backward restrictions
			Iterator<ApplyEntityFilter> iter = getApplyEntityFilters().iterator();
			while(iter.hasNext()) {
				ApplyEntityFilter ef = iter.next();
					if(!exist(idList,ef.getId()))
						idList.add(ef.getId());
				
				// Collects all id's the represent apply classes.
				if (!exist(positiveMatchAndApplyEntitiesIDList,ef.getId())) {
					assert ef.getApplyClass() instanceof ApplyClass;
					positiveMatchAndApplyEntitiesIDList.add(ef.getId());
				}
			};
		}		
		{ // regular match associations
			Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();
			while(iter.hasNext()) {
				MatchRelationFilter rf = iter.next();
				
				if(!isIndirect(rf.getAssociation())) {
					if(!exist(idList,rf.getId()))
						idList.add(rf.getId());					
				}
//				if(isPositive(rf.getAssociation())
//						&& !isExistPositive(rf.getAssociation().getSource()) // also exclude
//						&& !isExistPositive(rf.getAssociation().getTarget()) // associations to exist elements
//				) { // deal with positives first
//
//					String sourceId = getIdFrom(rf.getSourceClass());
//					String targetId = getIdFrom(rf.getTargetClass());
//					if(rf.getAssociation() instanceof PositiveMatchAssociation) {
//						
//						String query = relationFact+"("+sourceId+",RefList"+rf.getId()+"),"+
//									" member(('"+rf.getAssociation().getAssociationName()+"',"+targetId+", "+rf.getId()+"), RefList"+rf.getId()+")";
//						getPositiveRelations().add(new QueryRelation(rf.getAssociation().getAssociationName(),query));
//					}
//				}
			};
		}		

		{ // regular match entities
			Iterator<MatchEntityFilter> iter = getMatchEntityFilters().iterator();
			while(iter.hasNext()) {
				MatchEntityFilter ef = iter.next();
					if(isAnyPositive(ef.getMatchClass())) {// deal with any positives first
						if(!first)
							queryBody += ",";
						first = false;						
						queryBody += entityFact+"("+ef.getId()+","+ef.getDotNotation()+
						", AttributeList"+ef.getId() + 
						", "+"ParentList"+ef.getId()+",TemporalChildrenList"+ef.getId()+")";
																							
						for(MatchAttributeFilter maf: ef.getFilterAttributes())
							if(maf.isAtomValue()) {
								String pair = "('_"+maf.getName()+"',"+maf.getAtomValue()+")";
								queryBody += ", memberchk( "+pair+", AttributeList"+ef.getId()+")";
							}						
						
					}
			};
		}
		
		{ // referenced apply entities from backward restrictions
			Iterator<ApplyEntityFilter> iter = getApplyEntityFilters().iterator();
			while(iter.hasNext()) {
				ApplyEntityFilter ef = iter.next();
				
				if(checkTemporalNoCut(ef)) {
					if(!first)
						queryBody += ",";
					first = false;				
					queryBody += entityFact+"("+ef.getId()+","+ef.getDotNotation()+
					", AttributeList"+ef.getId() + 
					",[0],[0])";
																			
					for(ApplyAttributeFilter maf: ef.getFilterAttributes())
						if(maf.isAtomValue()) {
							String pair = "('_"+maf.getName()+"',"+maf.getAtomValue()+")";
							queryBody += ", memberchk( "+pair+", AttributeList"+ef.getId()+")";
						}						

				}
			};
		}
		
		{ // indirect match associations
			Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();
			while(iter.hasNext()) {
				MatchRelationFilter rf = iter.next();
				if(isPositive(rf.getAssociation())
						&& !isExistPositive(rf.getAssociation().getSource()) // also exclude
						&& !isExistPositive(rf.getAssociation().getTarget()) // associations to exist elements
				) { // deal with positives first

					String sourceId = getIdFrom(rf.getSourceClass());
					String targetId = getIdFrom(rf.getTargetClass());

					if(rf.getAssociation() instanceof PositiveIndirectAssociation) {
						if(!first)
							queryBody += ",";
						first = false;						
//queryBody += neighbourFact+"("+rf.getId()+","+ sourceId +","+ targetId +")";
						queryBody += "memberchk("+sourceId+", ParentList"+targetId+")";
					}
				}
			};
		}		
		
		{  // temporal relations
			Iterator<TemporalRelationFilter> iter = getTemporalFilters().iterator();
			while(iter.hasNext()) {
				TemporalRelationFilter rf = iter.next();
				if(isPositive(rf.getAssociation())
						&& !isExistPositive(rf.getSourceClass()) // also exclude
				) {
					if(!exist(idList,rf.getId()))
						idList.add(rf.getId());	
					if(!first)
						queryBody += ",";
					first = false;		
					
					String sourceId = getIdFrom(rf.getSourceClass());
					String targetId = getIdFrom(rf.getTargetClass());
					queryBody += "memberchk("+targetId+", TemporalChildrenList"+sourceId+")";
				}
			};
		}		
		
		
		
		{
			// Check for attribute relations here.
			for (AbstractAttributeRelation aatr: getOwnAttributeRelations()) {
				// Catch the relevant filters and add predicates to query body.
				if(!first){
					queryBody += ",";
				}
				first = false;
				queryBody += getPredicatesFromAttributeRelation(aatr);
			}
			
		}
		
		setQueryHead(compileHead("", idList));
		
		_query = "queryjoin("+ getQueryHead() + ").";
		
		String cutclause = getCutClause();
		if(!cutclause.isEmpty()){
			queryBody += "," + cutclause;
		}
		
		generateDifferentEntitiesFactCall(positiveMatchAndApplyEntitiesIDList);
		
		String negativeclause = getNegativeClauses(getQueryHead(),false);
		if(!negativeclause.isEmpty()){
			queryBody += ",not(" + negativeclause + ")";
		}
		
		{
			// Assure different id's match different entities.
			if (!getQueryDifferentEntitiesHead().isEmpty()) {
				if(!first){
					queryBody += ",";
				}
				first = false;
				queryBody += getQueryDifferentEntitiesHead();
			}
			
		}
		
		System.out.println("positiveJoinPredicate2: queryjoin("+ getQueryHead()+") :- \n" + queryBody);
		_positiveJoinHead2 = "queryjoin("+ getQueryHead()+") :- ";
		_positiveJoinBody2 = queryBody;
	}

	private boolean checkTemporalNoCut(ApplyEntityFilter ef) {
		boolean cancontinue = false;
		{Iterator<TemporalRelationFilter> iter = getTemporalFilters().iterator();
		while(iter.hasNext()) {
			TemporalRelationFilter rf = iter.next();
			if(isPositive(rf.getAssociation())
					&& !isExistPositive(rf.getSourceClass())
					&& rf.getTargetClass() == ef.getApplyClass()) // also exclude
					{
						cancontinue = true;
					}
		}}
		return cancontinue;
	}

	private String compileHead(String queryHead, List<String> idList) {
		boolean first = true;
		for(String id: idList) {
			if(!first)
				queryHead += ",";
			queryHead += id;
			first = false;

		}
		return queryHead;
	}
	
	private String getIdFrom(ApplyClass targetClass) {
		for(ApplyEntityFilter ef : getApplyEntityFilters()) {
			if(ef.getApplyClass() == targetClass)
				return ef.getId();
		}
		return "";
	}

	private String getCutClause() {
		String queryBody = "";
		String queryClause = "";
		if(!hasExist()) return "";
		boolean first = true;
		
		List<String> idList = new LinkedList<String>();		
		{
			Iterator<MatchEntityFilter> iter = getMatchEntityFilters().iterator();
			while(iter.hasNext()) {
				MatchEntityFilter ef = iter.next();
				if(isExistPositive(ef.getMatchClass())) {// deal with exist
					if(!exist(idList,ef.getId()))
						idList.add(ef.getId());
				}
			};			
		}{ // regular match associations
			Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();
			while(iter.hasNext()) {
				MatchRelationFilter rf = iter.next();
				if(isPositive(rf.getAssociation())
						&& (isExistPositive(rf.getAssociation().getSource())
						||  isExistPositive(rf.getAssociation().getTarget()))
				) { // deal with positives first
					
					String sourceId = getIdFrom(rf.getSourceClass());
					String targetId = getIdFrom(rf.getTargetClass());
					if(!exist(idList,sourceId))
						idList.add(sourceId);
					if(!exist(idList,targetId))
						idList.add(targetId);
					
					if(rf.getAssociation() instanceof PositiveMatchAssociation) {
						if(!first)
							queryBody += ",";
						first = false;						
//queryBody += relationFact+"("+sourceId+"," + "'" + rf.getAssociation().getAssociationName() + "'," + rf.getId() +","+ targetId +")";
						queryBody += relationFact+"("+sourceId+",RefList"+rf.getId()+"),"+
						" member(('"+rf.getAssociation().getAssociationName()+"',"+targetId+", "+rf.getId()+"), RefList"+rf.getId()+")";
						if(!exist(idList,rf.getId()))
							idList.add(rf.getId());
					}
				}
			};
		}{
			Iterator<MatchEntityFilter> iter = getMatchEntityFilters().iterator();
			while(iter.hasNext()) {
				MatchEntityFilter ef = iter.next();
				if(isExistPositive(ef.getMatchClass())) {// deal with exist
					if(!first)
						queryBody += ",";
					queryBody += entityFact+"("+ef.getId()+","+ef.getDotNotation()+
					", AttributeList"+ef.getId() + 
					", ParentList"+ef.getId()+",TemporalChildrenList"+ef.getId()+")";
					
					for(MatchAttributeFilter maf: ef.getFilterAttributes())
						if(maf.isAtomValue()) {
							String pair = "('_"+maf.getName()+"',"+maf.getAtomValue()+")";
							queryBody += ", memberchk( "+pair+", AttributeList"+ef.getId()+")";
						}
					first = false;
				}
			}
		};
		
		{  // temporal relations
			Iterator<TemporalRelationFilter> iter = getTemporalFilters().iterator();
			while(iter.hasNext()) {
				TemporalRelationFilter rf = iter.next();
				if(isPositive(rf.getAssociation()) && isExistPositive(rf.getAssociation().getSourceClass())
				) {
					if(!exist(idList,rf.getId()))
						idList.add(rf.getId());	
					if(!first)
						queryBody += ",";
					first = false;					

					String sourceId = getIdFrom(rf.getSourceClass());
					String targetId = getIdFrom(rf.getTargetClass());
					queryBody += "member("+targetId+", TemporalChildrenList"+sourceId+")";
				}
			};
		}		

		{ // referenced apply entities from backward restrictions
			Iterator<ApplyEntityFilter> iter = getApplyEntityFilters().iterator();
			while(iter.hasNext()) {
				ApplyEntityFilter ef = iter.next();
				
				if(!checkTemporalNoCut(ef)) {
					if(!exist(idList,ef.getId()))
						idList.add(ef.getId());						
					if(!first)
						queryBody += ",";
					first = false;				
					queryBody += entityFact+"("+ef.getId()+","+ef.getDotNotation()+
					", AttributeList"+ef.getId() + 
					",[0],[0])";
					
					for(ApplyAttributeFilter maf: ef.getFilterAttributes())
						if(maf.isAtomValue()) {
							String pair = "('_"+maf.getName()+"',"+maf.getAtomValue()+")";
							queryBody += ", memberchk( "+pair+", AttributeList"+ef.getId()+")";
						}											
				}
			};
		}		
		
		{ // indirect match associations
			Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();
			while(iter.hasNext()) {
				MatchRelationFilter rf = iter.next();
				if(isPositive(rf.getAssociation())
						&& (isExistPositive(rf.getAssociation().getSource())
						||  isExistPositive(rf.getAssociation().getTarget()))
				) { // deal with positives first
					
					String sourceId = getIdFrom(rf.getSourceClass());
					String targetId = getIdFrom(rf.getTargetClass());
					if(!exist(idList,sourceId))
						idList.add(sourceId);
					if(!exist(idList,targetId))
						idList.add(targetId);
					
					if(rf.getAssociation() instanceof PositiveIndirectAssociation) {
						if(!first)
							queryBody += ",";
						first = false;						
//queryBody += neighbourFact+"("+rf.getId()+","+ sourceId +","+ targetId +")";
						queryBody += "memberchk("+sourceId+", ParentList"+targetId+")";
					}
				}
			};
		}		
		
		String cutHead = compileHead("", idList);
		setQueryCutHead(cutHead);
		queryClause = "cutClause("+cutHead +")";
		cutHead = queryClause + " :- ";
		System.out.println("cutPredicate: " + cutHead + "("+queryBody+",!)");
		_cutPredicate  = cutHead + "("+queryBody+",!)";
		return queryClause;
	}

	private boolean exist(List<String> idList, String elemId) {
		for(String id: idList) {
			if(id.equals(elemId))
				return true;
		}
		return false;
	}

	private String getNegativeClauses(String positivequeryHead, boolean addToNegativeJoinPredicates) {
		List<String> queryBodyList = new LinkedList<String>();
		String queryClause = "";
		if(!hasNegatives()) return "";

		getQueryBodyByEntity(queryBodyList);
		getQueryBodyByRelation(queryBodyList);
		queryClause = "nqueryjoin(" + positivequeryHead + ")";
		if(!addToNegativeJoinPredicates) return queryClause;
		String queryHead = "nqueryjoin(" + positivequeryHead + ") :- ";
		
		boolean first = true;
		String queryBody = "";
		for(String body: queryBodyList) {
			queryBody += ((first) ? "" : ",") + body;
			first = false;
		}
		
		if(!getQueryDifferentEntitiesHead().isEmpty()) {
			queryBody += "," + getQueryDifferentEntitiesHead();
		}
		
		setNegativeJoinPredicate(queryHead + "("+queryBody+")");
		System.out.println("negativeJoinPredicates: " + queryHead + "("+queryBody+")");
		
		return queryClause;
	}

	private void getQueryBodyByRelation(List<String> queryBodyList) {
		{
			Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();
			while(iter.hasNext()) {
				MatchRelationFilter rf = iter.next();
				
				if(rf.getAssociation() instanceof NegativeMatchAssociation
						&&
						isPositive(rf.getSourceClass()) &&
						isPositive(rf.getTargetClass())		
				) {
					String relationId = rf.getId();
					String sourceId = getIdFrom(rf.getSourceClass());
					String targetId = getIdFrom(rf.getTargetClass());
					String queryBody1 = relationFact+"("+sourceId+",RefList"+relationId+"),"+
								" member(('"+rf.getAssociation().getAssociationName()+"',"+targetId+", "+relationId+"), RefList"+relationId+"),";
					String sourceDotNotation = "'"+rf.getSourceClass().getPackageName()+"."+rf.getSourceClass().getClassName()+"'";
					String targetDotNotation = "'"+rf.getTargetClass().getPackageName()+"."+rf.getTargetClass().getClassName()+"'";
					
					queryBody1 += entityFact+"("+sourceId+","+sourceDotNotation+",AttributeList"+sourceId+",_,_),";
					queryBody1 += entityFact+"("+targetId+","+targetDotNotation+",AttributeList"+targetId+",_,_)";
					queryBodyList.add(queryBody1);							
					
				} else if(rf.getAssociation() instanceof NegativeIndirectAssociation
						&&
						isPositive(rf.getSourceClass()) &&
						isPositive(rf.getTargetClass())
						) {
					String sourceId = getIdFrom(rf.getSourceClass());
							String targetId = getIdFrom(rf.getTargetClass());
					String queryBody1 = "";
					String sourceDotNotation = "'"+rf.getSourceClass().getPackageName()+"."+rf.getSourceClass().getClassName()+"'";
					String targetDotNotation = "'"+rf.getTargetClass().getPackageName()+"."+rf.getTargetClass().getClassName()+"'";
					queryBody1 += entityFact+"("+sourceId+","+sourceDotNotation+",AttributeList"+sourceId+","+"ParentList"+sourceId+",_),";
					queryBody1 += entityFact+"("+targetId+","+targetDotNotation+",AttributeList"+targetId+","+"ParentList"+targetId+",_),";
					queryBody1 += "memberchk("+ sourceId +", ParentList"+targetId +")";
					queryBodyList.add(queryBody1);					
				}
			};
		}
		{  // temporal relations
			Iterator<TemporalRelationFilter> iter = getTemporalFilters().iterator();
			while(iter.hasNext()) {
				TemporalRelationFilter rf = iter.next();
				if(rf.getAssociation() instanceof NegativeBackwardRestriction
						&&
						isPositive(rf.getSourceClass())		
				) {
					String sourceId = getIdFrom(rf.getSourceClass());
					String targetId = getIdFrom(rf.getTargetClass());										
					String sourceDotNotation = "'"+rf.getSourceClass().getPackageName()+"."+rf.getSourceClass().getClassName()+"'";
					String queryBody = entityFact+"("+sourceId+","+sourceDotNotation+",_,_,TemporalChildrenList"+sourceId+")";
					{ // referenced apply entities from backward restrictions
						Iterator<ApplyEntityFilter> appiter = getApplyEntityFilters().iterator();
						while(appiter.hasNext()) {
							ApplyEntityFilter ef = appiter.next();
							if(ef.getId().equals(targetId)) {
								queryBody += ", "+entityFact+"("+ef.getId()+","+ef.getDotNotation()+
								", AttributeList"+ef.getId() + 
								",[0],[0])";
								
								for(ApplyAttributeFilter maf: ef.getFilterAttributes())
									if(maf.isAtomValue()) {
										String pair = "('_"+maf.getName()+"',"+maf.getAtomValue()+")";
										queryBody += ", memberchk( "+pair+", AttributeList"+ef.getId()+")";
									}
								break;
							}
						};
					}
					queryBody += ", member("+targetId+", TemporalChildrenList"+sourceId+")";
					queryBodyList.add(queryBody);
				}
			};
		}
	}

	private void getQueryBodyByEntity(List<String> queryBodyList) {
		{
			Iterator<MatchEntityFilter> iter = getMatchEntityFilters().iterator();
			while(iter.hasNext()) {
				MatchEntityFilter ef = iter.next();
				if(!isPositive(ef.getMatchClass())) {
					String queryBodyByEntity = entityFact+"("+ef.getId()+","+ef.getDotNotation()+",AttributeList"+ef.getId()+",ParentList"+ef.getId()+",TemporalChildrenList"+ef.getId()+")";
					{
						List<MatchRelationFilter> mrf = getNegativeRelations(ef.getMatchClass());
						for(MatchRelationFilter rf: mrf) {
							String relationId = rf.getId();
							String sourceId = getIdFrom(rf.getSourceClass());
							String targetId = getIdFrom(rf.getTargetClass());
							queryBodyByEntity += ", "+relationFact+"("+sourceId+",RefList"+relationId+"),"+
										" member(('"+rf.getAssociation().getAssociationName()+"',"+targetId+", "+relationId+"), RefList"+relationId+")";
							String sourceDotNotation = "'"+rf.getSourceClass().getPackageName()+"."+rf.getSourceClass().getClassName()+"'";
							String targetDotNotation = "'"+rf.getTargetClass().getPackageName()+"."+rf.getTargetClass().getClassName()+"'";
							
							if(rf.getTargetClass() == ef.getMatchClass())
								queryBodyByEntity += ", "+entityFact+"("+sourceId+","+sourceDotNotation+",AttributeList"+sourceId+",_,_)";
							else if(rf.getSourceClass() == ef.getMatchClass())
								queryBodyByEntity += ", "+entityFact+"("+targetId+","+targetDotNotation+",AttributeList"+targetId+",_,_)";
						}
					}
					{
						List<MatchRelationFilter> mrf = getNegativeIndirectRelations(ef.getMatchClass());
						for(MatchRelationFilter rf: mrf) {

							String sourceId = getIdFrom(rf.getSourceClass());
							String targetId = getIdFrom(rf.getTargetClass());

							String sourceDotNotation = "'"+rf.getSourceClass().getPackageName()+"."+rf.getSourceClass().getClassName()+"'";
							String targetDotNotation = "'"+rf.getTargetClass().getPackageName()+"."+rf.getTargetClass().getClassName()+"'";
							
							if(rf.getTargetClass() == ef.getMatchClass())
								queryBodyByEntity += ", "+entityFact+"("+sourceId+","+sourceDotNotation+",AttributeList"+sourceId+",ParentList"+sourceId +",_)";
							else if(rf.getSourceClass() == ef.getMatchClass())
								queryBodyByEntity += ", "+entityFact+"("+targetId+","+targetDotNotation+",AttributeList"+targetId+",ParentList"+targetId +",_)";

							queryBodyByEntity += ", memberchk("+ sourceId +", ParentList"+targetId +")";
						}
						
					}
					{
						List<MatchRelationFilter> mrf = getNegativeTemporalRelations(ef.getMatchClass());
						for(MatchRelationFilter rf: mrf) {
							String targetId = getIdFrom(rf.getTargetClass());										
							{ // referenced apply entities from backward restrictions
								Iterator<ApplyEntityFilter> appiter = getApplyEntityFilters().iterator();
								while(appiter.hasNext()) {
									ApplyEntityFilter aef = appiter.next();
									if(aef.getId().equals(targetId)) {
										queryBodyByEntity += ", "+entityFact+"("+aef.getId()+","+aef.getDotNotation()+
										", AttributeList"+aef.getId() + 
										",[0],[0])";
										
										for(ApplyAttributeFilter maf: aef.getFilterAttributes())
											if(maf.isAtomValue()) {
												String pair = "('_"+maf.getName()+"',"+maf.getAtomValue()+")";
												queryBodyByEntity += ", memberchk( "+pair+", AttributeList"+aef.getId()+")";
											}
										break;
									}
								};
							}
							queryBodyByEntity += ", member("+targetId+", TemporalChildrenList"+ef.getId()+")";
						}
					}
					// attributes
					for(MatchAttributeFilter maf: ef.getFilterAttributes()) {
						if(maf.isAtomValue()) {
							String pair = "('_"+maf.getName()+"',"+maf.getAtomValue()+")";
							queryBodyByEntity += ", memberchk( "+pair+", AttributeList"+ef.getId()+")";
						}
					}
					queryBodyList.add(queryBodyByEntity);					
				}
			}
		}
	}

	private List<MatchRelationFilter> getNegativeRelations(MatchClass matchClass) {
		List<MatchRelationFilter> result = new LinkedList<MatchRelationFilter>();
		
		Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();
		while(iter.hasNext()) {
			MatchRelationFilter rf = iter.next();
			if(rf.getAssociation() instanceof NegativeMatchAssociation
					&& (rf.getSourceClass() == matchClass || rf.getTargetClass() == matchClass))
				result.add(rf);
		}
		return result;
	}

	private List<MatchRelationFilter> getNegativeIndirectRelations(MatchClass matchClass) {
		List<MatchRelationFilter> result = new LinkedList<MatchRelationFilter>();
		
		Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();
		while(iter.hasNext()) {
			MatchRelationFilter rf = iter.next();
			if(rf.getAssociation() instanceof NegativeIndirectAssociation
					&& (rf.getSourceClass() == matchClass || rf.getTargetClass() == matchClass))
				result.add(rf);
		}
		return result;
	}

	private List<MatchRelationFilter> getNegativeTemporalRelations(MatchClass matchClass) {
		List<MatchRelationFilter> result = new LinkedList<MatchRelationFilter>();
		
		Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();
		while(iter.hasNext()) {
			MatchRelationFilter rf = iter.next();
			if(rf.getAssociation() instanceof NegativeBackwardRestriction
					&& (rf.getSourceClass() == matchClass ||
					rf.getTargetClass() == matchClass))
				result.add(rf);
		}
		return result;
	}
	
	private boolean hasNegatives() {
		{
			Iterator<MatchEntityFilter> iter = getMatchEntityFilters().iterator();
			while(iter.hasNext()) {
				MatchEntityFilter ef = iter.next();
				if(!isPositive(ef.getMatchClass())) return true;
			}
		}{
			Iterator<MatchRelationFilter> iter = getMatchRelationFilters().iterator();		
			while(iter.hasNext()) {
				MatchRelationFilter rf = iter.next();
				if(!isPositive(rf.getAssociation())) return true;				
			}
		}{
			Iterator<TemporalRelationFilter> iter = getTemporalRelationFilters().iterator();		
			while(iter.hasNext()) {
				TemporalRelationFilter rf = iter.next();
				if(!isPositive(rf.getAssociation())) return true;				
			}
		}
		return false;
	}

	private boolean hasExist() {
		{
			Iterator<MatchEntityFilter> iter = getMatchEntityFilters().iterator();
			while(iter.hasNext()) {
				MatchEntityFilter ef = iter.next();
				if(isExistPositive(ef.getMatchClass())) return true;
			}
		}
		return false;
	}
	
	private String getHashCode(@SuppressWarnings("rawtypes") Hashtable binding, String entityId){
		JIPVariable jipVar = (JIPVariable) binding.get(entityId);		
		String varInstanceName = jipVar.getValue().toString();
		String hashCode = varInstanceName.substring(1,varInstanceName.length());
		return hashCode;
		
	}
	
	private String getIdFrom(MatchClass sourceClass) {
		for(MatchEntityFilter ef : getMatchEntityFilters()) {
			if(ef.getMatchClass() == sourceClass)
				return ef.getId();
		}
		return "";
	}

	public String getPositiveJoinHead() {
		return _positiveJoinHead;
	}

	public String getPositiveJoinBody() {
		return _positiveJoinBody;
	}

	public String getPositiveJoinHead2() {
		return _positiveJoinHead2;
	}

	public String getPositiveJoinBody2() {
		return _positiveJoinBody2;
	}	
	
	public String getNegativeJoinPredicate() {
		return _negativeJoinPredicate;
	}

	public void setNegativeJoinPredicate(String s) {
		_negativeJoinPredicate = s;
	}
	
	public String getCutPredicate() {
		return _cutPredicate;
	}
	
	public String getQuery() {
		return _query;
	}

	public AbstractFilter getFilter(MatchClass match) {
		for(MatchEntityFilter ef : getMatchEntityFilters()) {
			if(ef.getMatchClass() == match)
				return ef;
			for(MatchAttributeFilter af:  ef.getFilterAttributes()) {
				if(af.getAttribute() == match)
					return af;
			}
		}
		for(MatchRelationFilter rf : getMatchRelationFilters()) {
			if(rf.getAssociation() == match)
				return rf;
		}
		return null;
	}


	public void set_explicitMatchMetaModel(MetaModelDatabase _explicitMatchMetaModel) {
		this._explicitMatchMetaModel = _explicitMatchMetaModel;
	}


	public MetaModelDatabase get_explicitMatchMetaModel() {
		return _explicitMatchMetaModel;
	}


	public void set_explicitMatchModel(InstanceDatabase _explicitMatchModel) {
		this._explicitMatchModel = _explicitMatchModel;
	}


	public InstanceDatabase get_explicitMatchModel() {
		return _explicitMatchModel;
	}
	
	public boolean hasExplicitSource() {
		return (get_explicitMatchMetaModel() != null);
	}


	public void set_matchModel(MatchModel _matchModel) {
		this._matchModel = _matchModel;
	}


	public MatchModel get_matchModel() {
		return _matchModel;
	}


	public List<ApplyEntityFilter> getApplyEntityFilters() {
		return _applyentityFilters;
	}

	public List<TemporalRelationFilter> getTemporalFilters() {
		return getTemporalRelationFilters();
	}

	private List<TemporalRelationFilter> getTemporalRelationFilters() {
		return _temporalrelationFilters;
	}

	public void setPositiveRelations(List<QueryRelation> _positiveRelations) {
		this._positiveRelations = _positiveRelations;
	}

	public List<QueryRelation> getPositiveRelations() {
		return _positiveRelations;
	}

	private void setQueryCutHead(String _queryCutHead) {
		this._queryCutHead = _queryCutHead;
	}

	private String getQueryCutHead() {
		return _queryCutHead;
	}

	private void setQueryHead(String _queryHead) {
		this._queryHead = _queryHead;
	}

	private String getQueryHead() {
		return _queryHead;
	}

	public void setBindingList(@SuppressWarnings("rawtypes") List<Hashtable> _binding) {
		this._binding = _binding;
	}

	@SuppressWarnings("rawtypes")
	public List<Hashtable> getBindingList() {
		return _binding;
	}

	public MatchAttributeFilter findMatchAttributeFilter(Attribute a) {
		// Percorre todos os MatchEntityFilter e em cada um deles procura um MatchAttributeFilter correspondente ao Attribute dado. O primeiro que encontra, retorna.Nunca haverao dois MatchAttributeFilter para o mesmo Attribute.
		MatchAttributeFilter result = null;
		for(MatchEntityFilter ef : getMatchEntityFilters()) {
			result = ef.findMatchAttributeFilter(a);
			if (result != null) {
				return result;
			}
		}
		assert result == null;
		return null;
	}

	public ApplyAttributeFilter findApplyAttributeFilter(Attribute a) {
		// Percorre todos os ApplyEntityFilters e em cada um deles procura um ApplyAttributeFilter correspondente ao Attribute dado. O primeiro que encontra, retorna. Nunca haverao dois ApplyAttributeFilter para o mesmo Attribute.
		ApplyAttributeFilter result = null;
		for(ApplyEntityFilter ef : getApplyEntityFilters()) {
			result = ef.findApplyAttributeFilter(a);
			if (result != null) {
				return result;
			}
		}
		assert result == null;
		return null;
	}

	public boolean isValid() {
		// An MatchFilter is valid when there is no pair 
		// (MatchEntityFilter, MatchEntityFilter) or (ApplyEntityFilter, ApplyEntityFilter) 
		// that refers to the same instanceEntity.
		
		// This is deactivated because is is now done directly in prolog.
		
//		for (MatchEntityFilter pinedMatchEntityFilter : getMatchEntityFilters()) {
//			for (MatchEntityFilter matchEntityFilter : getMatchEntityFilters()) {
//				if (pinedMatchEntityFilter != matchEntityFilter && pinedMatchEntityFilter.getCurrentEntity() == matchEntityFilter.getCurrentEntity()) {
//					return false;
//				}
//			}
//		}
//		
//		// Now check for ApplyEntityFilters
//		
//		for (ApplyEntityFilter pinedApplyEntityFilter : getApplyEntityFilters()) {
//			for (ApplyEntityFilter applyEntityFilter : getApplyEntityFilters()) {
//				if (pinedApplyEntityFilter != applyEntityFilter && pinedApplyEntityFilter.getCurrentEntity() == applyEntityFilter.getCurrentEntity()) {
//					return false;
//				}
//			}
//		}
		
		return true;
	}

}
