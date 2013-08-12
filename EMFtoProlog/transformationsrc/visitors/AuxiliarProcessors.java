package visitors;

import java.util.ArrayList;

import mprolog.Functor;
import mprolog.MprologPackage;
import mprolog.Term;
import mprolog.Variable;

public class AuxiliarProcessors {
	/**
	 * Processa a lista de bindings produzida com o fim de gerar o prolog de um ADT.generator
	 * Cria o functor para o body tipo: nat(V), nat(B),...
	 * @param bindings
	 * @param index
	 * @return
	 */
	public static Functor processListBody(ArrayList<Pair<String, String>> bindings,int index) {
		if (bindings.isEmpty() || index>=bindings.size())
			return null;
		Variable variable = PrologFactory.newVariable(bindings.get(index).second);
		return PrologFactory.newFunctor(bindings.get(index).first, variable, processListBody( bindings, index+1) );
	}

	/**
	 * Processa a lista de bindings produzida com o fim de gerar o prolog de um ADT.generator
	 * Cria o conteudo do functor da head da clausula
	 * @param bindings
	 * @param index
	 * @return
	 */
	public static Term processList(ArrayList<Pair<String, String>> bindings, int index) {
		if (bindings.isEmpty() || index>=bindings.size())
			return null;
		return PrologFactory.newVariable(bindings.get(index).second, processList( bindings,index+1));
	}

	/**
	 * functor.ownedTerm.(*nextTerm).nextTerm = t
	 * Se o functor nao tiver ownedTerm ... t passa a ser o ownedTerm
	 * Caso contrario pega no ownedTerm e itera (nextTerm), até encontrar o que nao tem seguinte
	 * t passa a ser esse seguinte
	 * @param functor
	 * @param t
	 */
	public static void setLastOwnedTerm(Functor functor, Term t) {
		Term ot = functor.getOwnedTerm();
		if (ot==null) functor.setOwnedTerm(t);
		else 
		{
			while (ot.getNextTerm()!=null)
				ot=ot.getNextTerm();
			ot.setNextTerm(PrologFactory.copy(t));
		}
	}
	
	/**
	 * Se o term é nulo, o resultado desta afectacao é t???
	 * Caso contrario itera nextTerm ate encontrar o que nao tem seguinte,   t passa a ser esse seguinte
	 * term.*nextTerm.nextTerm = t
	 * @param term
	 * @param t
	 * @return
	 */
	public static Term setLastTerm(Term term, Term t) {
		Term first = term;
		if (term==null) return first; //nao seria t??????
		else 
		{
			while (term.getNextTerm()!=null)
				term=term.getNextTerm();
			term.setNextTerm(PrologFactory.copy(t));
		}
		return first;
	}
	
	
	/**
	 * Devolve o ultimo ownedTerm nao nulo do fzunctor por iteracao de nextTerm OU null se nao houver ownedterm
	 * f(ownedTerm = A,B,C,D) retorna D
	 * @param functor
	 * @return
	 */
	public static Term  getLastOwnedTerm(Functor functor) {
		Term ot = functor.getOwnedTerm();
		if (ot==null) return null;
		while (ot.getNextTerm()!=null)
			ot=ot.getNextTerm();
		return ot;
	}
	
	
	/**
	 * Pega num lista ordenada de terms, e cria uma corrent de terms, ligadas pela propriedade nextterm
	 * @param terms
	 * @return
	 */
	public static Term aggregateListOfTerms(ArrayList<Term> terms) {
		if (terms.isEmpty()) return null;
		for (int i = 1 ; i < terms.size(); i++ ) 
			terms.get(i-1).setNextTerm(terms.get(i));
		return terms.get(0);
	}

	/**
	 * replaceOwnedTerm(Functor(A,B,C,D),K) = Functor(A,B,C,K)
	 * replaceOwnedTerm(Functor(),K) = Functor(K)
	 * @param functor
	 * @param t
	 */
	public static void replaceLastOwnedTerm(Functor functor, Term t) {
		Term ot = functor.getOwnedTerm();
		if (ot==null) functor.setOwnedTerm(t);
		else 
		{   Term last =ot; 
			while (ot.getNextTerm()!=null) {
				last =ot;
				ot=ot.getNextTerm();
			}
			last.setNextTerm(PrologFactory.copy(t));
		}
		
	}


}
