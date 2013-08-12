/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.grammar;

public class PlGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static PlGrammarInformationProvider INSTANCE = new PlGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static mprolog.resource.pl.grammar.PlContainment PL_0_0_0_0 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getModel().getEStructuralFeature(mprolog.MprologPackage.MODEL__OWNED_CLAUSE), mprolog.resource.pl.grammar.PlCardinality.STAR, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_0_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_0_0_0_0);
	public final static mprolog.resource.pl.grammar.PlChoice PL_0_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_0_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_0 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getModel(), PL_0_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_1_0_0_0_0_0_0 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getClause().getEStructuralFeature(mprolog.MprologPackage.CLAUSE__OWNED_HEAD), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_1_0_0_0_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_1_0_0_0_0_0_0);
	public final static mprolog.resource.pl.grammar.PlChoice PL_1_0_0_0_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_1_0_0_0_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_1_0_0_0 = new mprolog.resource.pl.grammar.PlCompound(PL_1_0_0_0_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_1_0_0_1_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword(":-", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_1_0_0_1_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getClause().getEStructuralFeature(mprolog.MprologPackage.CLAUSE__OWNED_BODY), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_1_0_0_1_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_1_0_0_1_0_0_0, PL_1_0_0_1_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_1_0_0_1_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_1_0_0_1_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_1_0_0_1 = new mprolog.resource.pl.grammar.PlCompound(PL_1_0_0_1_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_1_0_0_2 = new mprolog.resource.pl.grammar.PlKeyword(".", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlSequence PL_1_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_1_0_0_0, PL_1_0_0_1, PL_1_0_0_2);
	public final static mprolog.resource.pl.grammar.PlChoice PL_1_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_1_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_1 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getClause(), PL_1_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_2_0_0_0 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getHead().getEStructuralFeature(mprolog.MprologPackage.HEAD__OWNED_FUNCTOR), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_2_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_2_0_0_0);
	public final static mprolog.resource.pl.grammar.PlChoice PL_2_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_2_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_2 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getHead(), PL_2_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_3_0_0_0 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getBody().getEStructuralFeature(mprolog.MprologPackage.BODY__OWNED_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_3_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_3_0_0_0);
	public final static mprolog.resource.pl.grammar.PlChoice PL_3_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_3_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_3 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getBody(), PL_3_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlPlaceholder PL_4_0_0_0 = new mprolog.resource.pl.grammar.PlPlaceholder(mprolog.MprologPackage.eINSTANCE.getVariable().getEStructuralFeature(mprolog.MprologPackage.VARIABLE__NAME), "VARIABLE", mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_4_0_0_1_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword(",", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_4_0_0_1_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getVariable().getEStructuralFeature(mprolog.MprologPackage.VARIABLE__NEXT_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_4_0_0_1_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_4_0_0_1_0_0_0, PL_4_0_0_1_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_4_0_0_1_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_4_0_0_1_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_4_0_0_1 = new mprolog.resource.pl.grammar.PlCompound(PL_4_0_0_1_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlSequence PL_4_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_4_0_0_0, PL_4_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_4_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_4_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_4 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getVariable(), PL_4_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_5_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword("(", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_5_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getParenthesis().getEStructuralFeature(mprolog.MprologPackage.PARENTHESIS__OWNED_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_5_0_0_2 = new mprolog.resource.pl.grammar.PlKeyword(")", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_5_0_0_3_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword(",", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_5_0_0_3_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getParenthesis().getEStructuralFeature(mprolog.MprologPackage.PARENTHESIS__NEXT_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_5_0_0_3_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_5_0_0_3_0_0_0, PL_5_0_0_3_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_5_0_0_3_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_5_0_0_3_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_5_0_0_3 = new mprolog.resource.pl.grammar.PlCompound(PL_5_0_0_3_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlSequence PL_5_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_5_0_0_0, PL_5_0_0_1, PL_5_0_0_2, PL_5_0_0_3);
	public final static mprolog.resource.pl.grammar.PlChoice PL_5_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_5_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_5 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getParenthesis(), PL_5_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlPlaceholder PL_6_0_0_0_0_0_0 = new mprolog.resource.pl.grammar.PlPlaceholder(mprolog.MprologPackage.eINSTANCE.getFunctor().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT), "NUMBER", mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_6_0_0_0_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_6_0_0_0_0_0_0);
	public final static mprolog.resource.pl.grammar.PlPlaceholder PL_6_0_0_0_0_1_0 = new mprolog.resource.pl.grammar.PlPlaceholder(mprolog.MprologPackage.eINSTANCE.getFunctor().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT), "ATOM", mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_6_0_0_0_0_1_1_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword("(", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_6_0_0_0_0_1_1_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getFunctor().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__OWNED_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_6_0_0_0_0_1_1_0_0_2 = new mprolog.resource.pl.grammar.PlKeyword(")", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlSequence PL_6_0_0_0_0_1_1_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_6_0_0_0_0_1_1_0_0_0, PL_6_0_0_0_0_1_1_0_0_1, PL_6_0_0_0_0_1_1_0_0_2);
	public final static mprolog.resource.pl.grammar.PlChoice PL_6_0_0_0_0_1_1_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_6_0_0_0_0_1_1_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_6_0_0_0_0_1_1 = new mprolog.resource.pl.grammar.PlCompound(PL_6_0_0_0_0_1_1_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlSequence PL_6_0_0_0_0_1 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_6_0_0_0_0_1_0, PL_6_0_0_0_0_1_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_6_0_0_0_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_6_0_0_0_0_0, PL_6_0_0_0_0_1);
	public final static mprolog.resource.pl.grammar.PlCompound PL_6_0_0_0 = new mprolog.resource.pl.grammar.PlCompound(PL_6_0_0_0_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_6_0_0_1_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword(",", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_6_0_0_1_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getFunctor().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__NEXT_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_6_0_0_1_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_6_0_0_1_0_0_0, PL_6_0_0_1_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_6_0_0_1_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_6_0_0_1_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_6_0_0_1 = new mprolog.resource.pl.grammar.PlCompound(PL_6_0_0_1_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlSequence PL_6_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_6_0_0_0, PL_6_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_6_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_6_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_6 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getFunctor(), PL_6_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlPlaceholder PL_7_0_0_0 = new mprolog.resource.pl.grammar.PlPlaceholder(mprolog.MprologPackage.eINSTANCE.getQuotedAtom().getEStructuralFeature(mprolog.MprologPackage.QUOTED_ATOM__TEXT), "QUOTED_39_39", mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_7_0_0_1_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword(",", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_7_0_0_1_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getQuotedAtom().getEStructuralFeature(mprolog.MprologPackage.QUOTED_ATOM__NEXT_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_7_0_0_1_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_7_0_0_1_0_0_0, PL_7_0_0_1_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_7_0_0_1_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_7_0_0_1_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_7_0_0_1 = new mprolog.resource.pl.grammar.PlCompound(PL_7_0_0_1_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlSequence PL_7_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_7_0_0_0, PL_7_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_7_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_7_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_7 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getQuotedAtom(), PL_7_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_8_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword("[", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_8_0_0_1_0_0_0 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getList().getEStructuralFeature(mprolog.MprologPackage.LIST__OWNED_HEAD_TERMS), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_8_0_0_1_0_0_1_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword("|", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_8_0_0_1_0_0_1_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getList().getEStructuralFeature(mprolog.MprologPackage.LIST__OWNED_TAIL_TERMS), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_8_0_0_1_0_0_1_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_8_0_0_1_0_0_1_0_0_0, PL_8_0_0_1_0_0_1_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_8_0_0_1_0_0_1_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_8_0_0_1_0_0_1_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_8_0_0_1_0_0_1 = new mprolog.resource.pl.grammar.PlCompound(PL_8_0_0_1_0_0_1_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlSequence PL_8_0_0_1_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_8_0_0_1_0_0_0, PL_8_0_0_1_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_8_0_0_1_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_8_0_0_1_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_8_0_0_1 = new mprolog.resource.pl.grammar.PlCompound(PL_8_0_0_1_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_8_0_0_2 = new mprolog.resource.pl.grammar.PlKeyword("]", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_8_0_0_3_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword(",", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_8_0_0_3_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getList().getEStructuralFeature(mprolog.MprologPackage.LIST__NEXT_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_8_0_0_3_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_8_0_0_3_0_0_0, PL_8_0_0_3_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_8_0_0_3_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_8_0_0_3_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_8_0_0_3 = new mprolog.resource.pl.grammar.PlCompound(PL_8_0_0_3_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlSequence PL_8_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_8_0_0_0, PL_8_0_0_1, PL_8_0_0_2, PL_8_0_0_3);
	public final static mprolog.resource.pl.grammar.PlChoice PL_8_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_8_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_8 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getList(), PL_8_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_9_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword("(", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_9_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getInfixExpression().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__LEFT_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlContainment PL_9_0_0_2 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getInfixExpression().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__OWNED_OPERATOR), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlContainment PL_9_0_0_3 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getInfixExpression().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__RIGHT_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_9_0_0_4 = new mprolog.resource.pl.grammar.PlKeyword(")", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlKeyword PL_9_0_0_5_0_0_0 = new mprolog.resource.pl.grammar.PlKeyword(",", mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlContainment PL_9_0_0_5_0_0_1 = new mprolog.resource.pl.grammar.PlContainment(mprolog.MprologPackage.eINSTANCE.getInfixExpression().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__NEXT_TERM), mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_9_0_0_5_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_9_0_0_5_0_0_0, PL_9_0_0_5_0_0_1);
	public final static mprolog.resource.pl.grammar.PlChoice PL_9_0_0_5_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_9_0_0_5_0_0);
	public final static mprolog.resource.pl.grammar.PlCompound PL_9_0_0_5 = new mprolog.resource.pl.grammar.PlCompound(PL_9_0_0_5_0, mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK);
	public final static mprolog.resource.pl.grammar.PlSequence PL_9_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_9_0_0_0, PL_9_0_0_1, PL_9_0_0_2, PL_9_0_0_3, PL_9_0_0_4, PL_9_0_0_5);
	public final static mprolog.resource.pl.grammar.PlChoice PL_9_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_9_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_9 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getInfixExpression(), PL_9_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	public final static mprolog.resource.pl.grammar.PlPlaceholder PL_10_0_0_0 = new mprolog.resource.pl.grammar.PlPlaceholder(mprolog.MprologPackage.eINSTANCE.getOperator().getEStructuralFeature(mprolog.MprologPackage.OPERATOR__SYMBOL), "OPERATOR", mprolog.resource.pl.grammar.PlCardinality.ONE, 0);
	public final static mprolog.resource.pl.grammar.PlSequence PL_10_0_0 = new mprolog.resource.pl.grammar.PlSequence(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_10_0_0_0);
	public final static mprolog.resource.pl.grammar.PlChoice PL_10_0 = new mprolog.resource.pl.grammar.PlChoice(mprolog.resource.pl.grammar.PlCardinality.ONE, PL_10_0_0);
	public final static mprolog.resource.pl.grammar.PlRule PL_10 = new mprolog.resource.pl.grammar.PlRule(mprolog.MprologPackage.eINSTANCE.getOperator(), PL_10_0, mprolog.resource.pl.grammar.PlCardinality.ONE);
	
	public final static mprolog.resource.pl.grammar.PlRule[] RULES = new mprolog.resource.pl.grammar.PlRule[] {
		PL_0,
		PL_1,
		PL_2,
		PL_3,
		PL_4,
		PL_5,
		PL_6,
		PL_7,
		PL_8,
		PL_9,
		PL_10,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (mprolog.resource.pl.grammar.PlRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(mprolog.resource.pl.grammar.PlSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof mprolog.resource.pl.grammar.PlKeyword) {
			keywords.add(((mprolog.resource.pl.grammar.PlKeyword) element).getValue());
		} else if (element instanceof mprolog.resource.pl.grammar.PlBooleanTerminal) {
			keywords.add(((mprolog.resource.pl.grammar.PlBooleanTerminal) element).getTrueLiteral());
			keywords.add(((mprolog.resource.pl.grammar.PlBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof mprolog.resource.pl.grammar.PlEnumerationTerminal) {
			mprolog.resource.pl.grammar.PlEnumerationTerminal terminal = (mprolog.resource.pl.grammar.PlEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (mprolog.resource.pl.grammar.PlSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
