/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

public class SOSGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static SOSGrammarInformationProvider INSTANCE = new SOSGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_0_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Semantics", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_0_0_0_1_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getSemantics().getEStructuralFeature(SOS.SOSPackage.SEMANTICS__RULES), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_0_0_0_1_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_0_0_0_1_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_0_0_0_1_0_1_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getSemantics().getEStructuralFeature(SOS.SOSPackage.SEMANTICS__SIGNATURE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_0_0_0_1_0_1 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_0_0_0_1_0_1_0);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_0_0_0_1_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_0_0_0_1_0_0, SOS_0_0_0_1_0_1);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_0_0_0_1 = new SOS.resource.SOS.grammar.SOSCompound(SOS_0_0_0_1_0, SOS.resource.SOS.grammar.SOSCardinality.STAR);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_0_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_0_0_0_0, SOS_0_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_0_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_0 = new SOS.resource.SOS.grammar.SOSRule(SOS.SOSPackage.eINSTANCE.getSemantics(), SOS_0_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_1_0_0_0_0_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Assuming", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_1_0_0_0_0_0_0_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getRule().getEStructuralFeature(SOS.SOSPackage.RULE__ASSUMES), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_1_0_0_0_0_0_0_0_0_2 = new SOS.resource.SOS.grammar.SOSKeyword("Then", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_1_0_0_0_0_0_0_0_0_3 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getRule().getEStructuralFeature(SOS.SOSPackage.RULE__CONCLUDES), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_1_0_0_0_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0_0_0_0_0_0_0_0, SOS_1_0_0_0_0_0_0_0_0_1, SOS_1_0_0_0_0_0_0_0_0_2, SOS_1_0_0_0_0_0_0_0_0_3);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_1_0_0_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0_0_0_0_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_1_0_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSCompound(SOS_1_0_0_0_0_0_0_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_1_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0_0_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_1_0_0_0_0_1_0_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Fact", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_1_0_0_0_0_1_0_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getRule().getEStructuralFeature(SOS.SOSPackage.RULE__CONCLUDES), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_1_0_0_0_0_1_0_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0_0_0_1_0_0_0_0, SOS_1_0_0_0_0_1_0_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_1_0_0_0_0_1_0_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0_0_0_1_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_1_0_0_0_0_1_0 = new SOS.resource.SOS.grammar.SOSCompound(SOS_1_0_0_0_0_1_0_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_1_0_0_0_0_1 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0_0_0_1_0);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_1_0_0_0_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0_0_0_0, SOS_1_0_0_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_1_0_0_0 = new SOS.resource.SOS.grammar.SOSCompound(SOS_1_0_0_0_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_1_0_0_1_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Where", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_1_0_0_1_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getRule().getEStructuralFeature(SOS.SOSPackage.RULE__OWNED_VARIABLES), SOS.resource.SOS.grammar.SOSCardinality.PLUS, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_1_0_0_1_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0_1_0_0_0, SOS_1_0_0_1_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_1_0_0_1_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0_1_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_1_0_0_1 = new SOS.resource.SOS.grammar.SOSCompound(SOS_1_0_0_1_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_1_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0_0, SOS_1_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_1_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_1_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_1 = new SOS.resource.SOS.grammar.SOSRule(SOS.SOSPackage.eINSTANCE.getRule(), SOS_1_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_2_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getPremisseList().getEStructuralFeature(SOS.SOSPackage.PREMISSE_LIST__HAS), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_2_0_0_1_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword(",", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_2_0_0_1_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getPremisseList().getEStructuralFeature(SOS.SOSPackage.PREMISSE_LIST__NEXT), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_2_0_0_1_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_2_0_0_1_0_0_0, SOS_2_0_0_1_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_2_0_0_1_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_2_0_0_1_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_2_0_0_1 = new SOS.resource.SOS.grammar.SOSCompound(SOS_2_0_0_1_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_2_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_2_0_0_0, SOS_2_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_2_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_2_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_2 = new SOS.resource.SOS.grammar.SOSRule(SOS.SOSPackage.eINSTANCE.getPremisseList(), SOS_2_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_3_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getAlgebraicConditionList().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_3_0_0_1_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword(",", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_3_0_0_1_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getAlgebraicConditionList().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_3_0_0_1_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_3_0_0_1_0_0_0, SOS_3_0_0_1_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_3_0_0_1_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_3_0_0_1_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_3_0_0_1 = new SOS.resource.SOS.grammar.SOSCompound(SOS_3_0_0_1_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_3_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_3_0_0_0, SOS_3_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_3_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_3_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_3 = new SOS.resource.SOS.grammar.SOSRule(SOS.SOSPackage.eINSTANCE.getAlgebraicConditionList(), SOS_3_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_4_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getConclusion().getEStructuralFeature(SOS.SOSPackage.CONCLUSION__HAS), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_4_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_4_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_4_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_4_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_4 = new SOS.resource.SOS.grammar.SOSRule(SOS.SOSPackage.eINSTANCE.getConclusion(), SOS_4_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_5_0_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getTransition().getEStructuralFeature(SOS.SOSPackage.TRANSITION__ENVIRONMENT), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_5_0_0_0_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword(":", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_5_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_5_0_0_0_0_0_0, SOS_5_0_0_0_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_5_0_0_0_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_5_0_0_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_5_0_0_0 = new SOS.resource.SOS.grammar.SOSCompound(SOS_5_0_0_0_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_5_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getTransition().getEStructuralFeature(SOS.SOSPackage.TRANSITION__PRE_STATE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_5_0_0_2 = new SOS.resource.SOS.grammar.SOSKeyword("->>", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_5_0_0_3 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getTransition().getEStructuralFeature(SOS.SOSPackage.TRANSITION__LABEL), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_5_0_0_4 = new SOS.resource.SOS.grammar.SOSKeyword("->>", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_5_0_0_5 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getTransition().getEStructuralFeature(SOS.SOSPackage.TRANSITION__POS_STATE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_5_0_0_6 = new SOS.resource.SOS.grammar.SOSKeyword("in", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_5_0_0_7 = new SOS.resource.SOS.grammar.SOSKeyword("Transition", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_5_0_0_8 = new SOS.resource.SOS.grammar.SOSKeyword("System", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_5_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_5_0_0_0, SOS_5_0_0_1, SOS_5_0_0_2, SOS_5_0_0_3, SOS_5_0_0_4, SOS_5_0_0_5, SOS_5_0_0_6, SOS_5_0_0_7, SOS_5_0_0_8);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_5_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_5_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_5 = new SOS.resource.SOS.grammar.SOSRule(SOS.SOSPackage.eINSTANCE.getTransition(), SOS_5_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_6_0_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getTypeJudment().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__ENVIRONMENT), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_6_0_0_0_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword(":", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_6_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_6_0_0_0_0_0_0, SOS_6_0_0_0_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_6_0_0_0_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_6_0_0_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_6_0_0_0 = new SOS.resource.SOS.grammar.SOSCompound(SOS_6_0_0_0_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_6_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getTypeJudment().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_6_0_0_2 = new SOS.resource.SOS.grammar.SOSKeyword("|-", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_6_0_0_3 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getTypeJudment().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_6_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_6_0_0_0, SOS_6_0_0_1, SOS_6_0_0_2, SOS_6_0_0_3);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_6_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_6_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_6 = new SOS.resource.SOS.grammar.SOSRule(SOS.SOSPackage.eINSTANCE.getTypeJudment(), SOS_6_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_7_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("(", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_7_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getAlgebraicCondition().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_7_0_0_2 = new SOS.resource.SOS.grammar.SOSKeyword(")", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_7_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_7_0_0_0, SOS_7_0_0_1, SOS_7_0_0_2);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_7_0_1_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.SOSPackage.eINSTANCE.getAlgebraicCondition().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_7_0_1 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_7_0_1_0);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_7_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_7_0_0, SOS_7_0_1);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_7 = new SOS.resource.SOS.grammar.SOSRule(SOS.SOSPackage.eINSTANCE.getAlgebraicCondition(), SOS_7_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_8_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("ADT", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_8_0_0_1 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.adtmm.AdtmmPackage.eINSTANCE.getADT().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__NAME), "TEXT", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_8_0_0_2_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Sorts", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_8_0_0_2_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getADT().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_SORTS), SOS.resource.SOS.grammar.SOSCardinality.PLUS, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_8_0_0_2_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_2_0_0_0, SOS_8_0_0_2_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_8_0_0_2_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_2_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_8_0_0_2 = new SOS.resource.SOS.grammar.SOSCompound(SOS_8_0_0_2_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_8_0_0_3_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Generators", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_8_0_0_3_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getADT().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_GENERATORS), SOS.resource.SOS.grammar.SOSCardinality.PLUS, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_8_0_0_3_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_3_0_0_0, SOS_8_0_0_3_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_8_0_0_3_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_3_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_8_0_0_3 = new SOS.resource.SOS.grammar.SOSCompound(SOS_8_0_0_3_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_8_0_0_4_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Operations", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_8_0_0_4_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getADT().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_OPERATIONS), SOS.resource.SOS.grammar.SOSCardinality.PLUS, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_8_0_0_4_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_4_0_0_0, SOS_8_0_0_4_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_8_0_0_4_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_4_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_8_0_0_4 = new SOS.resource.SOS.grammar.SOSCompound(SOS_8_0_0_4_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_8_0_0_5_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Axioms", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_8_0_0_5_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getADT().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_AXIOMS), SOS.resource.SOS.grammar.SOSCardinality.PLUS, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_8_0_0_5_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_5_0_0_0, SOS_8_0_0_5_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_8_0_0_5_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_5_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_8_0_0_5 = new SOS.resource.SOS.grammar.SOSCompound(SOS_8_0_0_5_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_8_0_0_6_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Where", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_8_0_0_6_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getADT().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__OWNED_VARIABLES), SOS.resource.SOS.grammar.SOSCardinality.PLUS, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_8_0_0_6_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_6_0_0_0, SOS_8_0_0_6_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_8_0_0_6_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_6_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_8_0_0_6 = new SOS.resource.SOS.grammar.SOSCompound(SOS_8_0_0_6_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_8_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0_0, SOS_8_0_0_1, SOS_8_0_0_2, SOS_8_0_0_3, SOS_8_0_0_4, SOS_8_0_0_5, SOS_8_0_0_6);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_8_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_8_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_8 = new SOS.resource.SOS.grammar.SOSRule(SOS.adtmm.AdtmmPackage.eINSTANCE.getADT(), SOS_8_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_9_0_0_0 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.adtmm.AdtmmPackage.eINSTANCE.getOperation().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__NAME), "TEXT", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_9_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword(":", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_9_0_0_2 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getOperation().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__OPERATION_SORTS), SOS.resource.SOS.grammar.SOSCardinality.STAR, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_9_0_0_3 = new SOS.resource.SOS.grammar.SOSKeyword("->", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_9_0_0_4 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getOperation().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__RESULT), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_9_0_0_5 = new SOS.resource.SOS.grammar.SOSKeyword(";", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_9_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_9_0_0_0, SOS_9_0_0_1, SOS_9_0_0_2, SOS_9_0_0_3, SOS_9_0_0_4, SOS_9_0_0_5);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_9_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_9_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_9 = new SOS.resource.SOS.grammar.SOSRule(SOS.adtmm.AdtmmPackage.eINSTANCE.getOperation(), SOS_9_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_10_0_0_0 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.adtmm.AdtmmPackage.eINSTANCE.getVariable().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE__NAME), "TEXT", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_10_0_0_1_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword(":", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_10_0_0_1_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getVariable().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE__VARIABLE_SORT), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_10_0_0_1_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_10_0_0_1_0_0_0, SOS_10_0_0_1_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_10_0_0_1_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_10_0_0_1_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_10_0_0_1 = new SOS.resource.SOS.grammar.SOSCompound(SOS_10_0_0_1_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_10_0_0_2 = new SOS.resource.SOS.grammar.SOSKeyword(";", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_10_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_10_0_0_0, SOS_10_0_0_1, SOS_10_0_0_2);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_10_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_10_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_10 = new SOS.resource.SOS.grammar.SOSRule(SOS.adtmm.AdtmmPackage.eINSTANCE.getVariable(), SOS_10_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_11_0_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("(", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_11_0_0_0_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getCondEquation().getEStructuralFeature(SOS.adtmm.AdtmmPackage.COND_EQUATION__OWNED_CONDITIONS), SOS.resource.SOS.grammar.SOSCardinality.PLUS, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_11_0_0_0_0_0_2 = new SOS.resource.SOS.grammar.SOSKeyword(")", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_11_0_0_0_0_0_3 = new SOS.resource.SOS.grammar.SOSKeyword("=>", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_11_0_0_0_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_11_0_0_0_0_0_0, SOS_11_0_0_0_0_0_1, SOS_11_0_0_0_0_0_2, SOS_11_0_0_0_0_0_3);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_11_0_0_0_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_11_0_0_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_11_0_0_0 = new SOS.resource.SOS.grammar.SOSCompound(SOS_11_0_0_0_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_11_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getCondEquation().getEStructuralFeature(SOS.adtmm.AdtmmPackage.COND_EQUATION__OWNED_EQUATION), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_11_0_0_2 = new SOS.resource.SOS.grammar.SOSKeyword(";", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_11_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_11_0_0_0, SOS_11_0_0_1, SOS_11_0_0_2);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_11_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_11_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_11 = new SOS.resource.SOS.grammar.SOSRule(SOS.adtmm.AdtmmPackage.eINSTANCE.getCondEquation(), SOS_11_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_12_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("@", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_12_0_0_1 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.adtmm.AdtmmPackage.eINSTANCE.getVariableRef().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE_REF__VARIABLE), "TEXT", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_12_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_12_0_0_0, SOS_12_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_12_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_12_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_12 = new SOS.resource.SOS.grammar.SOSRule(SOS.adtmm.AdtmmPackage.eINSTANCE.getVariableRef(), SOS_12_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_13_0_0_0 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.adtmm.AdtmmPackage.eINSTANCE.getCTerm().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OP), "TEXT", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_13_0_0_1_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("^", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_13_0_0_1_0_0_1_0_0_0 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.adtmm.AdtmmPackage.eINSTANCE.getCTerm().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__ITER), "INTEGER", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_13_0_0_1_0_0_1_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_13_0_0_1_0_0_1_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_13_0_0_1_0_0_1_0_1_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getCTerm().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__ITER_TERM), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_13_0_0_1_0_0_1_0_1 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_13_0_0_1_0_0_1_0_1_0);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_13_0_0_1_0_0_1_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_13_0_0_1_0_0_1_0_0, SOS_13_0_0_1_0_0_1_0_1);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_13_0_0_1_0_0_1 = new SOS.resource.SOS.grammar.SOSCompound(SOS_13_0_0_1_0_0_1_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_13_0_0_1_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_13_0_0_1_0_0_0, SOS_13_0_0_1_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_13_0_0_1_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_13_0_0_1_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_13_0_0_1 = new SOS.resource.SOS.grammar.SOSCompound(SOS_13_0_0_1_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_13_0_0_2_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("(", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_13_0_0_2_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getCTerm().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OWNED_TERMS), SOS.resource.SOS.grammar.SOSCardinality.PLUS, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_13_0_0_2_0_0_2 = new SOS.resource.SOS.grammar.SOSKeyword(")", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_13_0_0_2_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_13_0_0_2_0_0_0, SOS_13_0_0_2_0_0_1, SOS_13_0_0_2_0_0_2);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_13_0_0_2_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_13_0_0_2_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_13_0_0_2 = new SOS.resource.SOS.grammar.SOSCompound(SOS_13_0_0_2_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_13_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_13_0_0_0, SOS_13_0_0_1, SOS_13_0_0_2);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_13_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_13_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_13 = new SOS.resource.SOS.grammar.SOSRule(SOS.adtmm.AdtmmPackage.eINSTANCE.getCTerm(), SOS_13_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_14_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getEquation().getEStructuralFeature(SOS.adtmm.AdtmmPackage.EQUATION__OWNED_LEFT_TERM), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_14_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword("=", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_14_0_0_2 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getEquation().getEStructuralFeature(SOS.adtmm.AdtmmPackage.EQUATION__OWNED_RIGHT_TERM), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_14_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_14_0_0_0, SOS_14_0_0_1, SOS_14_0_0_2);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_14_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_14_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_14 = new SOS.resource.SOS.grammar.SOSRule(SOS.adtmm.AdtmmPackage.eINSTANCE.getEquation(), SOS_14_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_15_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getInequation().getEStructuralFeature(SOS.adtmm.AdtmmPackage.INEQUATION__OWNED_LEFT_TERM), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_15_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword("!=", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_15_0_0_2 = new SOS.resource.SOS.grammar.SOSContainment(SOS.adtmm.AdtmmPackage.eINSTANCE.getInequation().getEStructuralFeature(SOS.adtmm.AdtmmPackage.INEQUATION__OWNED_RIGHT_TERM), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_15_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_15_0_0_0, SOS_15_0_0_1, SOS_15_0_0_2);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_15_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_15_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_15 = new SOS.resource.SOS.grammar.SOSRule(SOS.adtmm.AdtmmPackage.eINSTANCE.getInequation(), SOS_15_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_16_0_0_0 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.adtmm.AdtmmPackage.eINSTANCE.getAtomicSort().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ATOMIC_SORT__DECLARATION), "TEXT", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_16_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_16_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_16_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_16_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_16 = new SOS.resource.SOS.grammar.SOSRule(SOS.adtmm.AdtmmPackage.eINSTANCE.getAtomicSort(), SOS_16_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_17_0_0_0 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.adtmm.AdtmmPackage.eINSTANCE.getSortDeclaration().getEStructuralFeature(SOS.adtmm.AdtmmPackage.SORT_DECLARATION__NAME), "TEXT", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_17_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_17_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_17_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_17_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_17 = new SOS.resource.SOS.grammar.SOSRule(SOS.adtmm.AdtmmPackage.eINSTANCE.getSortDeclaration(), SOS_17_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_18_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Set", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_18_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword("(", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_18_0_0_2 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getSet().getEStructuralFeature(SOS.set.SetPackage.SET__SORT), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_18_0_0_3 = new SOS.resource.SOS.grammar.SOSKeyword(")", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_18_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_18_0_0_0, SOS_18_0_0_1, SOS_18_0_0_2, SOS_18_0_0_3);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_18_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_18_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_18 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getSet(), SOS_18_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_19_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Model", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_19_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_19_0_0_0);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_19_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_19_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_19 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getModelSet(), SOS_19_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_20_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("{", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_20_0_0_1_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getSetConstructor().getEStructuralFeature(SOS.set.SetPackage.SET_CONSTRUCTOR__MEMBER), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_20_0_0_1_0_0_1_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("|", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_20_0_0_1_0_0_1_0_0_1 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getSetConstructor().getEStructuralFeature(SOS.set.SetPackage.SET_CONSTRUCTOR__SUCH_THAT), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_20_0_0_1_0_0_1_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_20_0_0_1_0_0_1_0_0_0, SOS_20_0_0_1_0_0_1_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_20_0_0_1_0_0_1_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_20_0_0_1_0_0_1_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_20_0_0_1_0_0_1 = new SOS.resource.SOS.grammar.SOSCompound(SOS_20_0_0_1_0_0_1_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_20_0_0_1_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_20_0_0_1_0_0_0, SOS_20_0_0_1_0_0_1);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_20_0_0_1_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_20_0_0_1_0_0);
	public final static SOS.resource.SOS.grammar.SOSCompound SOS_20_0_0_1 = new SOS.resource.SOS.grammar.SOSCompound(SOS_20_0_0_1_0, SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_20_0_0_2 = new SOS.resource.SOS.grammar.SOSKeyword("}", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_20_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_20_0_0_0, SOS_20_0_0_1, SOS_20_0_0_2);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_20_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_20_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_20 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getSetConstructor(), SOS_20_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_21_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("in", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_21_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword("(", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_21_0_0_2 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getForAllIn().getEStructuralFeature(SOS.set.SetPackage.FOR_ALL_IN__LEFT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_21_0_0_3 = new SOS.resource.SOS.grammar.SOSKeyword(",", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_21_0_0_4 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getForAllIn().getEStructuralFeature(SOS.set.SetPackage.FOR_ALL_IN__RIGHT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_21_0_0_5 = new SOS.resource.SOS.grammar.SOSKeyword(")", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_21_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_21_0_0_0, SOS_21_0_0_1, SOS_21_0_0_2, SOS_21_0_0_3, SOS_21_0_0_4, SOS_21_0_0_5);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_21_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_21_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_21 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getForAllIn(), SOS_21_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_22_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("existsIn", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_22_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword("(", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_22_0_0_2 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getExistsIn().getEStructuralFeature(SOS.set.SetPackage.EXISTS_IN__LEFT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_22_0_0_3 = new SOS.resource.SOS.grammar.SOSKeyword(",", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_22_0_0_4 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getExistsIn().getEStructuralFeature(SOS.set.SetPackage.EXISTS_IN__RIGHT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_22_0_0_5 = new SOS.resource.SOS.grammar.SOSKeyword(")", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_22_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_22_0_0_0, SOS_22_0_0_1, SOS_22_0_0_2, SOS_22_0_0_3, SOS_22_0_0_4, SOS_22_0_0_5);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_22_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_22_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_22 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getExistsIn(), SOS_22_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_23_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Union", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_23_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword("(", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_23_0_0_2 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getUnion().getEStructuralFeature(SOS.set.SetPackage.UNION__LEFT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_23_0_0_3 = new SOS.resource.SOS.grammar.SOSKeyword(",", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_23_0_0_4 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getUnion().getEStructuralFeature(SOS.set.SetPackage.UNION__RIGHT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_23_0_0_5 = new SOS.resource.SOS.grammar.SOSKeyword(")", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_23_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_23_0_0_0, SOS_23_0_0_1, SOS_23_0_0_2, SOS_23_0_0_3, SOS_23_0_0_4, SOS_23_0_0_5);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_23_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_23_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_23 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getUnion(), SOS_23_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_24_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Excluding", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_24_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword("(", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_24_0_0_2 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getExcluding().getEStructuralFeature(SOS.set.SetPackage.EXCLUDING__LEFT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_24_0_0_3 = new SOS.resource.SOS.grammar.SOSKeyword(",", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_24_0_0_4 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getExcluding().getEStructuralFeature(SOS.set.SetPackage.EXCLUDING__RIGHT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_24_0_0_5 = new SOS.resource.SOS.grammar.SOSKeyword(")", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_24_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_24_0_0_0, SOS_24_0_0_1, SOS_24_0_0_2, SOS_24_0_0_3, SOS_24_0_0_4, SOS_24_0_0_5);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_24_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_24_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_24 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getExcluding(), SOS_24_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_25_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("Intersect", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_25_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword("(", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_25_0_0_2 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getIntersection().getEStructuralFeature(SOS.set.SetPackage.INTERSECTION__LEFT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_25_0_0_3 = new SOS.resource.SOS.grammar.SOSKeyword(",", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_25_0_0_4 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getIntersection().getEStructuralFeature(SOS.set.SetPackage.INTERSECTION__RIGHT_HAND_SIDE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_25_0_0_5 = new SOS.resource.SOS.grammar.SOSKeyword(")", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_25_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_25_0_0_0, SOS_25_0_0_1, SOS_25_0_0_2, SOS_25_0_0_3, SOS_25_0_0_4, SOS_25_0_0_5);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_25_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_25_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_25 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getIntersection(), SOS_25_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_26_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getModelRelation().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__SOURCE), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_26_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword("->", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_26_0_0_2 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.set.SetPackage.eINSTANCE.getModelRelation().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__REFERENCE_NAME), "TEXT", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_26_0_0_3 = new SOS.resource.SOS.grammar.SOSKeyword("->", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_26_0_0_4 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getModelRelation().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__TARGET), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_26_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_26_0_0_0, SOS_26_0_0_1, SOS_26_0_0_2, SOS_26_0_0_3, SOS_26_0_0_4);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_26_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_26_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_26 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getModelRelation(), SOS_26_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSContainment SOS_27_0_0_0 = new SOS.resource.SOS.grammar.SOSContainment(SOS.set.SetPackage.eINSTANCE.getModelClassAttribute().getEStructuralFeature(SOS.set.SetPackage.MODEL_CLASS_ATTRIBUTE__SELECTOR), SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_27_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword(".", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_27_0_0_2 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.set.SetPackage.eINSTANCE.getModelClassAttribute().getEStructuralFeature(SOS.set.SetPackage.MODEL_CLASS_ATTRIBUTE__ATTRIBUTE_NAME), "TEXT", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_27_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_27_0_0_0, SOS_27_0_0_1, SOS_27_0_0_2);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_27_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_27_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_27 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getModelClassAttribute(), SOS_27_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_28_0_0_0 = new SOS.resource.SOS.grammar.SOSKeyword("class", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_28_0_0_1 = new SOS.resource.SOS.grammar.SOSKeyword("(", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_28_0_0_2 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.set.SetPackage.eINSTANCE.getModelSort().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__PACKAGE_NAME), "QUOTED_34_34", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_28_0_0_3 = new SOS.resource.SOS.grammar.SOSKeyword(",", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSPlaceholder SOS_28_0_0_4 = new SOS.resource.SOS.grammar.SOSPlaceholder(SOS.set.SetPackage.eINSTANCE.getModelSort().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__CLASS_NAME), "QUOTED_34_34", SOS.resource.SOS.grammar.SOSCardinality.ONE, 0);
	public final static SOS.resource.SOS.grammar.SOSKeyword SOS_28_0_0_5 = new SOS.resource.SOS.grammar.SOSKeyword(")", SOS.resource.SOS.grammar.SOSCardinality.ONE);
	public final static SOS.resource.SOS.grammar.SOSSequence SOS_28_0_0 = new SOS.resource.SOS.grammar.SOSSequence(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_28_0_0_0, SOS_28_0_0_1, SOS_28_0_0_2, SOS_28_0_0_3, SOS_28_0_0_4, SOS_28_0_0_5);
	public final static SOS.resource.SOS.grammar.SOSChoice SOS_28_0 = new SOS.resource.SOS.grammar.SOSChoice(SOS.resource.SOS.grammar.SOSCardinality.ONE, SOS_28_0_0);
	public final static SOS.resource.SOS.grammar.SOSRule SOS_28 = new SOS.resource.SOS.grammar.SOSRule(SOS.set.SetPackage.eINSTANCE.getModelSort(), SOS_28_0, SOS.resource.SOS.grammar.SOSCardinality.ONE);
	
	public final static SOS.resource.SOS.grammar.SOSRule[] RULES = new SOS.resource.SOS.grammar.SOSRule[] {
		SOS_0,
		SOS_1,
		SOS_2,
		SOS_3,
		SOS_4,
		SOS_5,
		SOS_6,
		SOS_7,
		SOS_8,
		SOS_9,
		SOS_10,
		SOS_11,
		SOS_12,
		SOS_13,
		SOS_14,
		SOS_15,
		SOS_16,
		SOS_17,
		SOS_18,
		SOS_19,
		SOS_20,
		SOS_21,
		SOS_22,
		SOS_23,
		SOS_24,
		SOS_25,
		SOS_26,
		SOS_27,
		SOS_28,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (SOS.resource.SOS.grammar.SOSRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(SOS.resource.SOS.grammar.SOSSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof SOS.resource.SOS.grammar.SOSKeyword) {
			keywords.add(((SOS.resource.SOS.grammar.SOSKeyword) element).getValue());
		} else if (element instanceof SOS.resource.SOS.grammar.SOSBooleanTerminal) {
			keywords.add(((SOS.resource.SOS.grammar.SOSBooleanTerminal) element).getTrueLiteral());
			keywords.add(((SOS.resource.SOS.grammar.SOSBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof SOS.resource.SOS.grammar.SOSEnumerationTerminal) {
			SOS.resource.SOS.grammar.SOSEnumerationTerminal terminal = (SOS.resource.SOS.grammar.SOSEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (SOS.resource.SOS.grammar.SOSSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
