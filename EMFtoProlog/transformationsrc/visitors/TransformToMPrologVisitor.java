package visitors;

import java.util.ArrayList;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import mprolog.Body;
import mprolog.Clause;
import mprolog.Functor;
import mprolog.Model;
import mprolog.Term;
import mprolog.Variable;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;


import visitors.helpers.AsGenerator;
import SATEL.Axiom;
import SATEL.AxiomDeclaration;
import SATEL.Condition;
import SATEL.ConditionAtom;
import SATEL.ConditionBody;
import SATEL.DomainQuantifier;
import SATEL.Inclusion;
import SATEL.IntentionDec;
import SATEL.TestIntentionBody;
import SATEL.TestIntentionModule;
import SATEL.APN.adtmm.ADT;
import SATEL.APN.adtmm.AbstractEquation;
import SATEL.APN.adtmm.AtomicSort;
import SATEL.APN.adtmm.CTerm;
import SATEL.APN.adtmm.CondEquation;
import SATEL.APN.adtmm.Equation;
import SATEL.APN.adtmm.Inequation;
import SATEL.APN.adtmm.Operation;
import SATEL.APN.adtmm.Sort;
import SATEL.APN.adtmm.SortDeclaration;
import SATEL.APN.adtmm.VariableRef;
import SATEL.APN.apnmm.Gate;
import SATEL.APN.apnmm.Method;
import SATEL.AlgebraicExpressions.AlgEquality;
import SATEL.AlgebraicExpressions.AlgebraicEquality;
import SATEL.AlgebraicExpressions.ArithmeticEquality;
import SATEL.AlgebraicExpressions.BooleanEquality;
import SATEL.AlgebraicExpressions.HMLEquality;
import SATEL.AlgebraicExpressions.SyncEquality;
import SATEL.AlgebraicExpressions.algterms.AlgebraicTerm;
import SATEL.AlgebraicExpressions.algterms.CompositeTerm;
import SATEL.AlgebraicExpressions.arithmeticterms.ArithmeticTerm;
import SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv;
import SATEL.AlgebraicExpressions.arithmeticterms.BOPMinus;
import SATEL.AlgebraicExpressions.arithmeticterms.BOPPlus;
import SATEL.AlgebraicExpressions.arithmeticterms.BOPTimes;
import SATEL.AlgebraicExpressions.arithmeticterms.Depth;
import SATEL.AlgebraicExpressions.arithmeticterms.IntegerValue;
import SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable;
import SATEL.AlgebraicExpressions.arithmeticterms.NBEvents;
import SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus;
import SATEL.AlgebraicExpressions.booleanterms.BOPAnd;
import SATEL.AlgebraicExpressions.booleanterms.BOPOr;
import SATEL.AlgebraicExpressions.booleanterms.BooleanTerm;
import SATEL.AlgebraicExpressions.booleanterms.BooleanValue;
import SATEL.AlgebraicExpressions.booleanterms.BooleanVariable;
import SATEL.AlgebraicExpressions.booleanterms.Equals;
import SATEL.AlgebraicExpressions.booleanterms.GT;
import SATEL.AlgebraicExpressions.booleanterms.GTE;
import SATEL.AlgebraicExpressions.booleanterms.LT;
import SATEL.AlgebraicExpressions.booleanterms.LTE;
import SATEL.AlgebraicExpressions.booleanterms.Not;
import SATEL.AlgebraicExpressions.booleanterms.NotEquals;
import SATEL.AlgebraicExpressions.booleanterms.Positive;
import SATEL.AlgebraicExpressions.booleanterms.Sequence;
import SATEL.AlgebraicExpressions.booleanterms.Trace;
import SATEL.HMLFormula.HMLAnd;
import SATEL.HMLFormula.HMLEvent;
import SATEL.HMLFormula.HMLFormula;
import SATEL.HMLFormula.HMLFormulaContent;
import SATEL.HMLFormula.HMLFormulaHMLFormulaContent;
import SATEL.HMLFormula.HMLFormulaPrimitiveHMLVarDec;
import SATEL.HMLFormula.HMLNext;
import SATEL.HMLFormula.HMLNot;
import SATEL.HMLFormula.HMLTerm;
import SATEL.HMLFormula.HMLTop;
import SATEL.HMLFormula.InputEvent;
import SATEL.HMLFormula.OutputEvent;
import SATEL.HMLFormula.Parameter;
import SATEL.HMLFormula.SynchronizationEventInputTerm;
import SATEL.HMLFormula.SynchronizationEventOutputTerm;
import SATEL.HMLFormula.SynchronizationInputTerm;
import SATEL.HMLFormula.SynchronizationOutputTerm;
import SATEL.HMLFormula.SynchronizationTerm;
import SATEL.HMLFormula.WPrimitiveObservationVarDec;
import SATEL.HMLFormula.WPrimitiveStimulationVarDec;
import SATEL.VariableDeclarations.PrimitiveBooleanVarDec;
import SATEL.VariableDeclarations.PrimitiveHMLVarDec;
import SATEL.VariableDeclarations.PrimitiveIntegerVarDec;
import SATEL.VariableDeclarations.PrimitiveObservationVarDec;
import SATEL.VariableDeclarations.PrimitiveStimulationVarDec;
import SATEL.VariableDeclarations.VariableDec;
import SATEL.VariableDeclarations.VariableDeclaration;

public class TransformToMPrologVisitor implements SATELApnVisitor, HelpersTransformMPrologVisitor {


	private static final String TAG_GENERATORS = "GENERATORS";
	private static final String TAG_CTERM_LIST = "CTERMLIST";


	public Model accept(SATEL.Model satelmodel) {
		return visit(satelmodel,new Environ(null));
	}

	@Override
	public Model visit(SATEL.Model model, Environ env) {		
		mprolog.Model prologmodel = PrologFactory.newModel("Unnamed");
		EList<TestIntentionModule> modules = model.getTestIntentionModule();
		for (TestIntentionModule testIntentionModule : modules) {
			prologmodel.getOwnedClause().addAll(visit(testIntentionModule,env));
		}
		return prologmodel;
	}

	@Override
	public EList<Clause> visit(TestIntentionModule testIntentionModule, Environ env) {
		EList<Clause> clauses = new BasicEList<Clause>();
		TestIntentionBody body = testIntentionModule.getTestIntentionBody();
		clauses.addAll(visit(body,env));

		EList<ADT> algebras = testIntentionModule.getAlgebra();

		HashSet<Operation> envgen ;
		env.addBinding(TAG_GENERATORS, envgen=new HashSet<Operation>());
		
		for (ADT adt : algebras) { 			
			envgen.addAll(adt.getOwnedGenerators());
		}

		for (ADT adt : algebras) { 			

			clauses.addAll(visit(adt,env));

		}
		return clauses;
	}
	@Override
	public EList<Clause> visit(TestIntentionBody body,Environ env) {
		visit(body.getVariableDeclaration(), env);
		AxiomDeclaration axiomDecl = body.getAxiomDeclaration();
		return visit(axiomDecl, env);
	}
	
	@Override
	public void visit(VariableDeclaration variableDeclaration, Environ env) {
		EList<VariableDec> vars = variableDeclaration.getVariable();
		for (VariableDec variableDec : vars) {
			env.addBinding(variableDec.getName(), PrologFactory.genNewVar());
		}
	}

	@Override
	public EList<Clause> visit(AxiomDeclaration axiomDecl, Environ env) {
		EList<Axiom> axioms = axiomDecl.getAxiom();
		EList<Clause> clauses = new BasicEList<Clause>();
		for (Axiom axiom : axioms) {
			clauses.add(visit(axiom,env));
		}
		return clauses;
	}
	@Override
	public Clause visit(Axiom axiom, Environ env) {
		Inclusion inclusion = axiom.getInclusion();
		Term left = visit(inclusion,env);
		Condition cond = axiom.getCondition() ;
		Term right;
		if (cond!=null) {
			right = visit(cond, env);
			return PrologFactory.newClause(PrologFactory.newHead((Functor) left), PrologFactory.newBody(right));
		} else
			return PrologFactory.newClause(PrologFactory.newHead((Functor) left));
	}
	@Override
	public Term visit(Condition cond, Environ env) {
		DomainQuantifier domainQtfier;
		if ((domainQtfier=cond.getDomainQuantifier())!=null)
			;//Visit
		ConditionBody condBody = cond.getConditionBody();

		return visit(condBody, env);
	}

	@Override
	public Term visit(ConditionBody condBody, Environ env) {
		EList<ConditionAtom> condAtoms = condBody.getConditionAtom();

		Iterator<ConditionAtom> it = condAtoms.iterator();
		Term initial = visit(it.next(), env);
		Term last  = initial;
		while (it.hasNext()) {
			Term term = visit(it.next(), env);
			last.setNextTerm(term);
			last = term;
		}
		return initial;
	}

	@Override
	public Term visit(ConditionAtom ca, Environ env) {
		if (ca instanceof AlgebraicEquality) {
			return visit((AlgebraicEquality)ca, env);
		}
		else if (ca instanceof BooleanTerm ) {
			return visit((BooleanTerm)ca, env);
		} else if (ca instanceof Inclusion)
			return visit((Inclusion)ca, env);
		return null;

	}

	@Override
	public Term visit(AlgEquality ae, Environ env) {
		Term lT =visit(ae.getAlgebraicTermL(), env);
		Term rT = visit(ae.getAlgebraicTermR(), env);
		return PrologFactory.newInfix(lT, rT, "=");
	}
	@Override
	public Term visit(SyncEquality se, Environ env) {
		Term lT =visit(se.getSynchronizationTermL(), env);
		Term rT = visit(se.getSynchronizationTermR(), env);
		return PrologFactory.newInfix(lT, rT, "=");
	}

	@Override
	public Term visit(HMLEquality he, Environ env) {
		Term lT = visit(he.getHmlTermL(), env);
		Term rT= visit(he.getHmlTermR(), env);
		return PrologFactory.newInfix(lT, rT, "=");
	}

	
	@Override
	public Term visit(SynchronizationTerm synchronizationTerm, Environ env) {
		if (synchronizationTerm instanceof SynchronizationEventInputTerm)
			return visit((SynchronizationEventInputTerm)synchronizationTerm, env);
		else if (synchronizationTerm instanceof SynchronizationEventOutputTerm)
			return visit((SynchronizationEventOutputTerm)synchronizationTerm, env);			
		else if (synchronizationTerm instanceof WPrimitiveObservationVarDec)
			return visit((WPrimitiveObservationVarDec)synchronizationTerm, env);
		else if (synchronizationTerm instanceof WPrimitiveStimulationVarDec)
			return visit((WPrimitiveStimulationVarDec)synchronizationTerm, env);
		throw new RuntimeException();
	}

	@Override
	public Term visit(AlgebraicEquality ae, Environ env) {
		if (ae instanceof AlgEquality)
			return visit((AlgEquality)ae, env);
		else if (ae instanceof SyncEquality)
			return visit((SyncEquality)ae, env);
		else if (ae instanceof HMLEquality)
			return visit((HMLEquality)ae, env);
		else if (ae instanceof ArithmeticEquality)
			return visit((ArithmeticEquality)ae, env);
		else if (ae instanceof BooleanEquality)
			return visit((BooleanEquality)ae, env);
		throw new RuntimeException();
	}


	@Override
	public Term visit(Not not, Environ env){
		Term childNot = visit(not.getBooleanTerm(), env);
		//se o chidlNot for variavel ou constante 
		return PrologFactory.newFunctor("boolNot", visit(not.getBooleanTerm(),env));
	}
	
	@Override
	public Term visit(Sequence sequence, Environ env){
		return PrologFactory.newFunctor("boolSequence", visit(sequence.getHmlTerm(),env));
	}
	@Override
	public Term visit(Positive positive, Environ env){
		return PrologFactory.newFunctor("boolPositive", visit(positive.getHmlTerm(),env));
	}

	@Override
	public Term visit(Trace trace, Environ env){
		return PrologFactory.newFunctor("boolTrace", visit(trace.getHmlTerm(),env));
	}
	@Override
	public Term visit(BooleanVariable booleanVariable, Environ env){
		return visit(booleanVariable.getBooleanVariable(), env);
	}
	

	@Override
	public Term visit(BooleanValue boolValue, Environ env){
		return PrologFactory.newFunctor(Boolean.toString(boolValue.isValue()),null);
	}
	@Override
	public Term visit(BOPAnd bopAnd, Environ env){
		Term leftT = visit(bopAnd.getBooleanTermL(), env);
		Term rightT = visit(bopAnd.getBooleanTermR(), env);
		leftT.setNextTerm(rightT);
		return PrologFactory.newFunctor("boolAnd", leftT);
	}
	@Override
	public Term visit(BOPOr bopOr, Environ env){
		Term leftT = visit(bopOr.getBooleanTermL(), env);
		Term rightT = visit(bopOr.getBooleanTermR(), env);
		leftT.setNextTerm(rightT);
		return PrologFactory.newFunctor("boolOr", leftT);
	}
	@Override
	public Term visit(Equals equals, Environ env){
		Term leftT = visit(equals.getArithmeticTermL(), env);
		Term rightT = visit(equals.getArithmeticTermR(), env);
		leftT.setNextTerm(rightT);
		return PrologFactory.newFunctor("boolEquals", leftT);
	}
	@Override
	public Term visit(NotEquals notEquals, Environ env){
		Term leftT = visit(notEquals.getArithmeticTermL(), env);
		Term rightT = visit(notEquals.getArithmeticTermR(), env);
		leftT.setNextTerm(rightT);
		return PrologFactory.newFunctor("boolNotEquals", leftT);
	}
	@Override
	public Term visit(GT gt, Environ env){
		Term leftT = visit(gt.getArithmeticTermL(), env);
		Term rightT = visit(gt.getArithmeticTermR(), env);
		leftT.setNextTerm(rightT);
		return PrologFactory.newFunctor("boolGT", leftT);
	}
	@Override
	public Term visit(LT lt, Environ env){
		Term leftT = visit(lt.getArithmeticTermL(), env);
		Term rightT = visit(lt.getArithmeticTermR(), env);
		leftT.setNextTerm(rightT);
		return PrologFactory.newFunctor("boolLT", leftT);
	}
	@Override
	public Term visit(GTE gte, Environ env){
		Term leftT = visit(gte.getArithmeticTermL(), env);
		Term rightT = visit(gte.getArithmeticTermR(), env);
		leftT.setNextTerm(rightT);
		return PrologFactory.newFunctor("boolGTE", leftT);
	}
	@Override
	public Term visit(LTE lte, Environ env){
		Term leftT = visit(lte.getArithmeticTermL(), env);
		Term rightT = visit(lte.getArithmeticTermR(), env);
		leftT.setNextTerm(rightT);
		return PrologFactory.newFunctor("boolLTE", leftT);
	}

	@Override
	public Term visit(IntegerVariable integerVariable, Environ env) {
		return visit(integerVariable.getIntegerVariable(),env);
	}


	@Override
	public Term visit(IntegerValue integerValue, Environ env) {
		return PrologFactory.newFunctor(integerValue.getValue(),null);
	}

	@Override
	public Term visit(BOPPlus bopPlus, Environ env) {
		Term leftT = visit(bopPlus.getArithmeticTermL(), env);
		Term rightT = visit(bopPlus.getArithmeticTermR(), env);
		leftT.setNextTerm(rightT);
		Variable var;
		rightT.setNextTerm(var=PrologFactory.newVariable(PrologFactory.genNewVar()));
		return PrologFactory.newFunctor("bopPlus", leftT, PrologFactory.newVariable(var));
	}
	@Override
	public Term visit(BOPMinus bopMinus, Environ env) {
		Term leftT = visit(bopMinus.getArithmeticTermL(), env);
		Term rightT = visit(bopMinus.getArithmeticTermR(), env);
		leftT.setNextTerm(rightT);
		Variable var;
		rightT.setNextTerm(var=PrologFactory.newVariable(PrologFactory.genNewVar()));
		return PrologFactory.newFunctor("bopMinus", leftT, PrologFactory.newVariable(var));
	}
	@Override
	public Term visit(BOPTimes bopTimes, Environ env) {
		Term leftT = visit(bopTimes.getArithmeticTermL(), env);
		Term rightT = visit(bopTimes.getArithmeticTermR(), env);
		leftT.setNextTerm(rightT);
		Variable var;
		rightT.setNextTerm(var=PrologFactory.newVariable(PrologFactory.genNewVar()));
		return PrologFactory.newFunctor("bopTimes", leftT, PrologFactory.newVariable(var));
	}
	@Override
	public Term visit(BOPDiv bopDiv, Environ env) {
		Term leftT = visit(bopDiv.getArithmeticTermL(), env);
		Term rightT = visit(bopDiv.getArithmeticTermR(), env);
		leftT.setNextTerm(rightT);
		Variable var;
		rightT.setNextTerm(var=PrologFactory.newVariable(PrologFactory.genNewVar()));
		return PrologFactory.newFunctor("bopDiv", leftT, PrologFactory.newVariable(var));
	}
	@Override
	public Term visit(NBEvents nbEvents, Environ env) {
		Term hT = visit(nbEvents.getHmlTerm(), env);
		Variable var;
		hT.setNextTerm(var=PrologFactory.newVariable(PrologFactory.genNewVar()));
		return PrologFactory.newFunctor("nbEvents", hT, var);
	}
	@Override
	public Term visit(UOPMinus uopMinus, Environ env) {
		Term hT = visit(uopMinus.getArithmeticTerm(), env);
		Variable var;
		hT.setNextTerm(var=PrologFactory.newVariable(PrologFactory.genNewVar()));
		return PrologFactory.newFunctor("uopMinus", hT,var);
	}

	@Override
	public Term visit(ArithmeticTerm at, Environ env) {
		if (at instanceof IntegerVariable)
			return visit((IntegerVariable)at, env);
		else if (at instanceof IntegerValue)
			return visit((IntegerValue)at, env);
		else if (at instanceof BOPPlus)
			return visit((BOPPlus)at, env);
		else if (at instanceof BOPMinus)
			return visit((BOPMinus)at, env);
		else if (at instanceof BOPTimes)
			return visit((BOPTimes)at, env);
		else if (at instanceof BOPDiv)
			return visit((BOPDiv)at, env);
		else if (at instanceof NBEvents)
			return visit((NBEvents)at, env);
		else if (at instanceof Depth)
			return visit((Depth)at,env);
		else if (at instanceof UOPMinus)
			return visit((UOPMinus)at, env);
		return null;
	}

	@Override
	public Term visit(BooleanTerm bt, Environ env) {
		if (bt instanceof Not )
			return visit((Not)bt, env);
		else if (bt instanceof Sequence)
			return visit((Sequence)bt, env);
		else if (bt instanceof Positive)
			return visit((Positive)bt, env);
		else if (bt instanceof Trace)
			return visit((Trace)bt, env);
		else if (bt instanceof BooleanVariable)
			return visit((BooleanVariable)bt, env);
		else if (bt instanceof BooleanValue)
			return visit((BooleanValue)bt, env);
		else if (bt instanceof BOPAnd)
			return visit((BOPAnd)bt, env);
		else if (bt instanceof BOPOr)
			return visit((BOPOr)bt, env);
		else if (bt instanceof Equals)
			return visit((Equals)bt, env);
		else if (bt instanceof NotEquals)
			return visit((NotEquals)bt, env);
		else if (bt instanceof GT) 
			return visit((GT)bt, env);
		else if (bt instanceof LT) 
			return visit((LT)bt, env);
		else if (bt instanceof GTE) 
			return visit((GTE)bt, env);
		else if (bt instanceof LTE) 
			return visit((LTE)bt, env);
		return null;
	}

	@Override
	public Term visit(Inclusion inclusion, Environ env) {
		IntentionDec in = inclusion.getIn();
		Term intention = visit(in, env);
		HMLTerm hmlTerm = inclusion.getHmlTerm();
		Term term = visit(hmlTerm,env);
		return PrologFactory.newFunctor("in", PrologFactory.newList(term, null, intention) , null);
	}

	@Override
	public Term visit(HMLTerm hmlTerm, Environ env) {
		EList<HMLFormula> hmlTerms = hmlTerm.getHmlFormula();
		Iterator<HMLFormula> it = hmlTerms.iterator();
		Term cur = visit(it.next(), env);
		Term result = cur;
		while (it.hasNext())  {
			cur.setNextTerm(visit(it.next(), env));
			cur=cur.getNextTerm();
		}
		return result;
	}
	@Override
	public Term visit(HMLFormula hmlFormula, Environ env) {
		if (hmlFormula instanceof HMLFormulaHMLFormulaContent) 
			return visit((HMLFormulaHMLFormulaContent)hmlFormula, env);
		else if (hmlFormula instanceof HMLFormulaPrimitiveHMLVarDec)
			return visit((HMLFormulaPrimitiveHMLVarDec)hmlFormula, env);
		return null;
	}

	@Override
	public Term visit(HMLFormulaHMLFormulaContent hmlFormula, Environ env) {
		return visit(hmlFormula.getHmlFormulaContent(), env);
	}
	@Override
	public Term visit(HMLFormulaContent hmlFormulaContent, Environ env) {
		if (hmlFormulaContent instanceof HMLNext)
			return visit((HMLNext)hmlFormulaContent, env);
		else if (hmlFormulaContent instanceof HMLNot)
			return visit((HMLNot)hmlFormulaContent, env);
		else if (hmlFormulaContent instanceof HMLAnd)
			return visit((HMLAnd)hmlFormulaContent, env);
		else if (hmlFormulaContent instanceof HMLTop)
			return visit((HMLTop)hmlFormulaContent, env);
		return null;
	}

	@Override 
	public Term visit(HMLNext hmlNext, Environ env) {
		Term eventTerm = visit(hmlNext.getHmlEvent(), env);
		Term fContTerm = visit(hmlNext.getHmlFormulaContent(), env);
		eventTerm.setNextTerm(fContTerm);
		return PrologFactory.newFunctor("hmlNext", eventTerm , null);
	}
	@Override
	public Term visit(HMLEvent hmlEvent, Environ env) {
		Term iTerm = visit(hmlEvent.getInputTerm(), env);
		Term oTerm = visit(hmlEvent.getOutputTerm(), env);
		iTerm.setNextTerm(oTerm);
		return PrologFactory.newFunctor("hmlEvent", iTerm, null);
	}
	@Override
	public Term visit(SynchronizationOutputTerm outputTerm, Environ env) {
		if (outputTerm instanceof SynchronizationEventOutputTerm)
			return visit((SynchronizationEventOutputTerm) outputTerm, env);
		else if (outputTerm instanceof WPrimitiveObservationVarDec) 
			return visit((WPrimitiveObservationVarDec) outputTerm, env);
		return null;
	}

	@Override 
	public Term visit(WPrimitiveObservationVarDec wprimitiveObsVarDec, Environ env) {
		return visit(wprimitiveObsVarDec.getPrimitiveObservation(), env);
	}

	

	@Override
	public Term visit(SynchronizationInputTerm inputTerm, Environ env) {
		if (inputTerm instanceof SynchronizationEventInputTerm)
			return visit((SynchronizationEventInputTerm)inputTerm, env);
		else if ( inputTerm instanceof WPrimitiveStimulationVarDec)
			return visit((WPrimitiveStimulationVarDec)inputTerm, env);
		return null;
	}

	@Override
	public Term visit(WPrimitiveStimulationVarDec wprimitiveStimulationVarDec, Environ env) {
		return visit(wprimitiveStimulationVarDec.getPrimitiveStimulation(), env);
	}

	@Override
	public Term visit(SynchronizationEventOutputTerm outputTerm, Environ env) {
		Functor evTerm =  visit(outputTerm.getEvent(), env);
		Parameter params = outputTerm.getParameters();
		if (params!=null) {
			Term parameters = visit(params, env);
			evTerm.setOwnedTerm(parameters);
		}
		return evTerm;
	}

	@Override
	public Functor visit(OutputEvent event, Environ env) {
		return visit((Gate)event, env);
	}
	@Override
	public Functor visit(Gate event, Environ env) {
		return PrologFactory.newFunctor("g_"+event.getName(), null, null);
	}


	@Override
	public Term visit(SynchronizationEventInputTerm inputTerm, Environ env) {
		Functor evTerm =  visit(inputTerm.getEvent(), env);
		Parameter params = inputTerm.getParameters();
		if (params!=null) {
			Term parameters = visit(params, env);
			evTerm.setOwnedTerm(parameters);
		}
		return evTerm;
	}

	@Override
	public Term visit(Parameter param, Environ env) {
		Term t = visit(param.getValue(), env);
		if (param.getNext()!=null)
			t.setNextTerm(visit(param.getNext(),env));
		return t;
	}

	@Override 
	public Term visit(AlgebraicTerm value, Environ env) {
		if (value instanceof VariableRef)
			return visit((VariableRef) value, env);
		else if (value instanceof CompositeTerm)
			return visit((CompositeTerm)value, env);
		return null;
	}


	@Override 
	public Term visit(CompositeTerm cterm, Environ env) {
		visit(cterm.getOp(), env);
		//	if cterm.getTerms()!=null && !cterm.getTerms().isEmpty()
		return null;
	}

	@Override
	public Functor visit(InputEvent event, Environ env) {
		return visit((Method)event, env);
	}

	@Override
	public Functor visit(Method method, Environ env) {
		return PrologFactory.newFunctor("m_"+method.getName(), null, null);
	}

	@Override 
	public Term visit(HMLNot hmlNot, Environ env) {
		return PrologFactory.newFunctor("hmlNot", visit(hmlNot.getHmlFormulaContent(),env), null);
	}
	@Override 
	public Term visit(HMLAnd hmlAnd, Environ env) {
		Term left = visit(hmlAnd.getHmlFormulaContentL(), env);
		Term right = visit(hmlAnd.getHmlFormulaContentR(), env);
		left.setNextTerm(right);
		return PrologFactory.newFunctor("hmlAnd",left,null);
	}
	@Override 
	public Term visit(HMLTop hmlTop, Environ env) {
		return PrologFactory.newFunctor("hmlTop", null, null);
	}


	@Override 
	public Term visit(HMLFormulaPrimitiveHMLVarDec hmlFormula, Environ env) {
		return visit(hmlFormula.getPrimitiveHMLVarDec(), env);
	}
	@Override
	public Term visit(VariableDec variableDec, Environ env) {
			return PrologFactory.newVariable((String) env.getBinding(variableDec.getName()));
	}

	@Override
	public Term visit(IntentionDec in, Environ env) {
		return PrologFactory.newQuotedAtom(in.getName(),null);
	}

	@Override 
	public EList<Clause> visit(ADT adt, Environ env) {
		EList<Clause> clauses = new BasicEList<Clause>();
		EList<Operation> generators = adt.getOwnedGenerators();		

		for (Operation operation : generators) {
			clauses.add(visit(new AsGenerator(operation),env));
		}
		EList<CondEquation> axioms = adt.getOwnedAxioms();
		for (CondEquation condEquation : axioms) {
			clauses.add(visit(condEquation, env) );
		}
		return clauses;
	}

	@Override
	public Clause visit(AsGenerator asGenerator, Environ env) {
		Operation operation = asGenerator.getOperation();
		EList<Sort> args = operation.getOperationSorts();

		ArrayList<Pair<String,String>> bindings = new ArrayList<Pair<String,String>>(args.size());
		for (Sort sort : args)  {
			bindings.add(new Pair<String,String>(visit(sort,env),PrologFactory.genNewVar()));
		}

		Functor opFunctor = PrologFactory.newFunctor(operation.getName(),AuxiliarProcessors.processList(bindings,0),null);
		Functor headFunctor = PrologFactory.newFunctor(visit((AtomicSort)operation.getResult(), env), opFunctor, null);
		return PrologFactory.newClause(
				PrologFactory.newHead(headFunctor),
				PrologFactory.newBody(AuxiliarProcessors.processListBody(bindings,0)));		
	}
	@Override
	public String visit(Sort sort, Environ env) {
		if (sort instanceof AtomicSort)
			return visit((AtomicSort)sort, env);
		throw new RuntimeException("Invalid SATEL.APN.adtmm.Sort. Must be AtomicSort");
	}

	@Override
	public String visit(AtomicSort sort, Environ env) {
		return visit(sort.getDeclaration());
	}

	private String visit(SortDeclaration declaration) {
		return declaration.getName();
	}

	@Override
	public String visit(Operation operation, Environ env) {
		return operation.getName();
	}


	@Override
	public Clause visit(CondEquation condEquation, Environ env) {
		EList<AbstractEquation> conditions = condEquation.getOwnedConditions();
		Term er = visit(condEquation.getOwnedEquation(), env);
		Body body; Term bodyTerm;
		Clause cl = 
				//				return
				PrologFactory.newClause(PrologFactory.newHead((Functor) er), 
						body=PrologFactory.newBody(bodyTerm = er.getNextTerm())
						);

		for (AbstractEquation abstractEquation : conditions) {
			Term term =visit(abstractEquation, env);
			body.setOwnedTerm(AuxiliarProcessors.setLastTerm(term, bodyTerm ));
		}
		return cl;
		
	}

	private Term visit(AbstractEquation abstractEquation, Environ env) {
		if (abstractEquation instanceof Equation)
			return visit((Equation)abstractEquation, env);
		else if (abstractEquation instanceof Inequation)
			return visit ((Inequation)abstractEquation, env);
		return null;
	}


	@Override 
	public  Term visit(Equation equation, Environ env) {
		ArrayList<Term> headList , bodyList;
		//L-side is actually a functor of generators, there should not be any dependencies in headList 
		env = env.beginScope();
		env.addBinding(TAG_CTERM_LIST, (headList=new ArrayList<Term>()));
		Term left = visit(equation.getOwnedLeftTerm(), env);
		env=env.endScope();

		env = env.beginScope();
		env.addBinding(TAG_CTERM_LIST, (bodyList=new ArrayList<Term>()));
		Term right = visit(equation.getOwnedRightTerm(), env);
		env=env.endScope();

		if (!headList.isEmpty() && (headList.get(0) instanceof Functor)) {
			AuxiliarProcessors.replaceLastOwnedTerm(((Functor)headList.get(0)) ,PrologFactory.copy(right));
			headList.get(0).setNextTerm(AuxiliarProcessors.aggregateListOfTerms(bodyList));
			return headList.get(0);
		} else {
			left.setNextTerm( AuxiliarProcessors.aggregateListOfTerms(bodyList));	
			return left;
		}
	}

	@Override 
	public  Term visit(Inequation equation, Environ env) {
		ArrayList<Term> headList , bodyList;
		//L-side is actually a functor of generators, there should not be any dependencies in headList 
		env = env.beginScope();
		env.addBinding(TAG_CTERM_LIST, (headList=new ArrayList<Term>()));
		Term left = visit(equation.getOwnedLeftTerm(), env);
		env=env.endScope();

		env = env.beginScope();
		env.addBinding(TAG_CTERM_LIST, (bodyList=new ArrayList<Term>()));
		Term right = visit(equation.getOwnedRightTerm(), env);
		env=env.endScope();

		headList.addAll(bodyList);
		headList.add(PrologFactory.newInfix(left, right, "\\="));
		return AuxiliarProcessors.aggregateListOfTerms(headList);
	}


	@SuppressWarnings({ "unchecked"})
	@Override
	public Term visit(CTerm cterm, Environ env) {
		Term term;
		if (cterm.getIter()<=1) {
			term = processCTermTermList(new LinkedList<SATEL.APN.adtmm.Term>( cterm.getOwnedTerms()),env);
		}else {
			cterm.setIter(cterm.getIter()-1);
			term = visit(cterm, env);
		}

		Functor functor = PrologFactory.newFunctor(cterm.getOp().getName(),term,null);

		if (isGenerator(cterm.getOp(), env))  
			return functor;

		Variable v = PrologFactory.newVariable(PrologFactory.genNewVar());
		AuxiliarProcessors.setLastOwnedTerm(functor, v);
		ArrayList<Term> bodyList = ((ArrayList<Term>)env.getBinding(TAG_CTERM_LIST));
		bodyList.add(functor);
		return v;		
	}

	@SuppressWarnings("rawtypes")
	private boolean isGenerator(Operation operation, Environ env) {
		return ((HashSet)env.getBinding(TAG_GENERATORS)).contains(operation);  
	}


	private Term processCTermTermList(LinkedList<SATEL.APN.adtmm.Term> ownedTerms, Environ env) {
		if (ownedTerms.isEmpty())
			return null;
		mprolog.Term t = visit(ownedTerms.getFirst(),env);
		ownedTerms.removeFirst();
		t.setNextTerm(processCTermTermList(ownedTerms, env));
		return t;
	}


	@Override
	public Term visit(SATEL.APN.adtmm.Term term, Environ env) {
		if (term instanceof CTerm)
			return visit((CTerm)term, env);
		else if (term instanceof VariableRef)
			return visit((VariableRef)term, env);
		throw new RuntimeException("Invalid SATEL.APN.Term. Must be CTerm or VariableRef");
	}

	@Override
	public Term visit(VariableRef variable, Environ env) {
		return visit(variable.getVariable(), env);
	}

	@Override
	public Term visit(SATEL.APN.adtmm.Variable variable, Environ env) {
		return PrologFactory.newVariable(variable.getName());
	}

	@Override
	public void visit(SATEL.TestIntentionInterface tinterface, Environ env) {
		//tinterface.getIntention()
		//nothing to do 
	}

	

}
