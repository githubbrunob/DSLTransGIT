package visitors;



import SATEL.APN.adtmm.Operation;
import mprolog.Body;
import mprolog.Clause;
import mprolog.Functor;
import mprolog.Head;
import mprolog.InfixExpression;
import mprolog.List;
import mprolog.Model;
import mprolog.MprologFactory;
import mprolog.Operator;
import mprolog.QuotedAtom;
import mprolog.Term;
import mprolog.Variable;

public class PrologFactory {
	private static int varIndex = 0;
	private static MprologFactory factory = MprologFactory.eINSTANCE;

	public static String genNewVar() {
		return "V"+varIndex++;
	}

	public static Model newModel(String name) {
		Model model = factory.createModel();
		model.setName(name);
		return model;
	}

	public static Clause newClause(Head head, Body body) {
		Clause clause = factory.createClause();
		if (head!=null)
			clause.setOwnedHead(head);
		if (body!=null && body.getOwnedTerm()!=null)
			clause.setOwnedBody(body);
		return clause;
	}
	public static Clause newClause(Head head) {
		Clause clause = factory.createClause();
		if (head!=null)
			clause.setOwnedHead(head);
		return clause;
	}

	public static Head newHead(Functor functor) {
		Head head = factory.createHead();
		if (functor!=null)
			head.setOwnedFunctor(functor);
		return head;
	}
	public static Body newBody(Term term) {
		Body body = factory.createBody();
		if (term!=null)
			body.setOwnedTerm(term);
		return body;
	}

	public static Variable newVariable(String name, Term term) {
		Variable variable = factory.createVariable();
		variable.setName(name);
		if (term!=null)
			variable.setNextTerm(term);
		return variable;
	}
	public static Variable newVariable(String name) {
		Variable variable = factory.createVariable();
		variable.setName(name);
		return variable;
	}
	public static Functor newFunctor(String text, Term ownedTerm, Term nextTerm) {
		Functor functor = factory.createFunctor();
		if (nextTerm!=null)
			functor.setNextTerm(nextTerm);
		if (ownedTerm!=null) 
			functor.setOwnedTerm(ownedTerm);
		functor.setText(text);
		return functor;
	}
	public static Functor newFunctor(String text, Term ownedTerm) {
		Functor functor = factory.createFunctor();
		if (ownedTerm!=null) 
			functor.setOwnedTerm(ownedTerm);
		functor.setText(text);
		return functor;
	}
	public static Functor newFunctor(int integer, Term ownedTerm) {
		return newFunctor(integer+"", ownedTerm);
	}
	public static Variable newVariable(Variable variable) {
		Variable var = factory.createVariable();
		var.setName(variable.getName());
		return var;
	}
	public static Term copy(Term term) {
		if (term == null) return null;
		if (term instanceof Variable) {
			return newVariable(((Variable) term).getName(), copy(term.getNextTerm()));
		} else if (term instanceof Functor) {
			return newFunctor(((Functor) term).getText(), copy(((Functor) term).getOwnedTerm()),copy(term.getNextTerm()));
		} else return null;
	}

	public static Term newInfix(Term left, Term right, String string) {
		InfixExpression ie = factory.createInfixExpression();
		Operator op = factory.createOperator();
		op.setSymbol(string);
		ie.setLeftTerm(left);
		ie.setRightTerm(right);
		ie.setOwnedOperator(op);
		return ie;
	}

	public static Term newQuotedAtom(String name, Term term) {
		QuotedAtom quotedAtom = factory.createQuotedAtom();
		quotedAtom.setText(name);
		if (term!=null)
			quotedAtom.setNextTerm(term);
		return quotedAtom;
	}

	public static List newList(Term head, Term tail, Term next) {
		List list = factory.createList();
		if (head!=null)
			list.setOwnedHeadTerms(head);
		if (tail!=null)
			list.setOwnedTailTerms(tail);
		if (head!=null)
			list.setNextTerm(next);
		return list;
	}

}
