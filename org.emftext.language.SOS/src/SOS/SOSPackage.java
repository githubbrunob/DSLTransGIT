/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SOS.SOSFactory
 * @model kind="package"
 * @generated
 */
public interface SOSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SOS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/language/SOS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SOS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SOSPackage eINSTANCE = SOS.impl.SOSPackageImpl.init();

	/**
	 * The meta object id for the '{@link SOS.impl.SemanticsImpl <em>Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.impl.SemanticsImpl
	 * @see SOS.impl.SOSPackageImpl#getSemantics()
	 * @generated
	 */
	int SEMANTICS = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS__RULES = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS__SIGNATURE = 1;

	/**
	 * The number of structural features of the '<em>Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SOS.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.impl.RuleImpl
	 * @see SOS.impl.SOSPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Assumes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ASSUMES = 0;

	/**
	 * The feature id for the '<em><b>Concludes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONCLUDES = 1;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OWNED_VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link SOS.impl.PremisseListImpl <em>Premisse List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.impl.PremisseListImpl
	 * @see SOS.impl.SOSPackageImpl#getPremisseList()
	 * @generated
	 */
	int PREMISSE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISSE_LIST__HAS = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISSE_LIST__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Premisse List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISSE_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SOS.impl.ConclusionImpl <em>Conclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.impl.ConclusionImpl
	 * @see SOS.impl.SOSPackageImpl#getConclusion()
	 * @generated
	 */
	int CONCLUSION = 3;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__HAS = 0;

	/**
	 * The number of structural features of the '<em>Conclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SOS.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.impl.ConditionImpl
	 * @see SOS.impl.SOSPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SOS.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.impl.TransitionImpl
	 * @see SOS.impl.SOSPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LABEL = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PRE_STATE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__POS_STATE = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ENVIRONMENT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link SOS.impl.TypeJudmentImpl <em>Type Judment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.impl.TypeJudmentImpl
	 * @see SOS.impl.SOSPackageImpl#getTypeJudment()
	 * @generated
	 */
	int TYPE_JUDMENT = 6;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_JUDMENT__ENVIRONMENT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_JUDMENT__LEFT_HAND_SIDE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_JUDMENT__RIGHT_HAND_SIDE = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Judment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_JUDMENT_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SOS.impl.AlgebraicConditionImpl <em>Algebraic Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.impl.AlgebraicConditionImpl
	 * @see SOS.impl.SOSPackageImpl#getAlgebraicCondition()
	 * @generated
	 */
	int ALGEBRAIC_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Owned Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGEBRAIC_CONDITION__OWNED_CONDITIONS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Algebraic Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGEBRAIC_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SOS.impl.AlgebraicConditionListImpl <em>Algebraic Condition List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SOS.impl.AlgebraicConditionListImpl
	 * @see SOS.impl.SOSPackageImpl#getAlgebraicConditionList()
	 * @generated
	 */
	int ALGEBRAIC_CONDITION_LIST = 8;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGEBRAIC_CONDITION_LIST__HAS = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGEBRAIC_CONDITION_LIST__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Algebraic Condition List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGEBRAIC_CONDITION_LIST_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link SOS.Semantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantics</em>'.
	 * @see SOS.Semantics
	 * @generated
	 */
	EClass getSemantics();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.Semantics#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see SOS.Semantics#getRules()
	 * @see #getSemantics()
	 * @generated
	 */
	EReference getSemantics_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.Semantics#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature</em>'.
	 * @see SOS.Semantics#getSignature()
	 * @see #getSemantics()
	 * @generated
	 */
	EReference getSemantics_Signature();

	/**
	 * Returns the meta object for class '{@link SOS.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see SOS.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.Rule#getAssumes <em>Assumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assumes</em>'.
	 * @see SOS.Rule#getAssumes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Assumes();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.Rule#getConcludes <em>Concludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concludes</em>'.
	 * @see SOS.Rule#getConcludes()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Concludes();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.Rule#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
	 * @see SOS.Rule#getOwnedVariables()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_OwnedVariables();

	/**
	 * Returns the meta object for class '{@link SOS.PremisseList <em>Premisse List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premisse List</em>'.
	 * @see SOS.PremisseList
	 * @generated
	 */
	EClass getPremisseList();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.PremisseList#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has</em>'.
	 * @see SOS.PremisseList#getHas()
	 * @see #getPremisseList()
	 * @generated
	 */
	EReference getPremisseList_Has();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.PremisseList#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see SOS.PremisseList#getNext()
	 * @see #getPremisseList()
	 * @generated
	 */
	EReference getPremisseList_Next();

	/**
	 * Returns the meta object for class '{@link SOS.Conclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conclusion</em>'.
	 * @see SOS.Conclusion
	 * @generated
	 */
	EClass getConclusion();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.Conclusion#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has</em>'.
	 * @see SOS.Conclusion#getHas()
	 * @see #getConclusion()
	 * @generated
	 */
	EReference getConclusion_Has();

	/**
	 * Returns the meta object for class '{@link SOS.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see SOS.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link SOS.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see SOS.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see SOS.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Label();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.Transition#getPreState <em>Pre State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre State</em>'.
	 * @see SOS.Transition#getPreState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_PreState();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.Transition#getPosState <em>Pos State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pos State</em>'.
	 * @see SOS.Transition#getPosState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_PosState();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.Transition#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see SOS.Transition#getEnvironment()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Environment();

	/**
	 * Returns the meta object for class '{@link SOS.TypeJudment <em>Type Judment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Judment</em>'.
	 * @see SOS.TypeJudment
	 * @generated
	 */
	EClass getTypeJudment();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.TypeJudment#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see SOS.TypeJudment#getEnvironment()
	 * @see #getTypeJudment()
	 * @generated
	 */
	EReference getTypeJudment_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.TypeJudment#getLeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Hand Side</em>'.
	 * @see SOS.TypeJudment#getLeftHandSide()
	 * @see #getTypeJudment()
	 * @generated
	 */
	EReference getTypeJudment_LeftHandSide();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.TypeJudment#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hand Side</em>'.
	 * @see SOS.TypeJudment#getRightHandSide()
	 * @see #getTypeJudment()
	 * @generated
	 */
	EReference getTypeJudment_RightHandSide();

	/**
	 * Returns the meta object for class '{@link SOS.AlgebraicCondition <em>Algebraic Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algebraic Condition</em>'.
	 * @see SOS.AlgebraicCondition
	 * @generated
	 */
	EClass getAlgebraicCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link SOS.AlgebraicCondition#getOwnedConditions <em>Owned Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Conditions</em>'.
	 * @see SOS.AlgebraicCondition#getOwnedConditions()
	 * @see #getAlgebraicCondition()
	 * @generated
	 */
	EReference getAlgebraicCondition_OwnedConditions();

	/**
	 * Returns the meta object for class '{@link SOS.AlgebraicConditionList <em>Algebraic Condition List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algebraic Condition List</em>'.
	 * @see SOS.AlgebraicConditionList
	 * @generated
	 */
	EClass getAlgebraicConditionList();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.AlgebraicConditionList#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has</em>'.
	 * @see SOS.AlgebraicConditionList#getHas()
	 * @see #getAlgebraicConditionList()
	 * @generated
	 */
	EReference getAlgebraicConditionList_Has();

	/**
	 * Returns the meta object for the containment reference '{@link SOS.AlgebraicConditionList#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see SOS.AlgebraicConditionList#getNext()
	 * @see #getAlgebraicConditionList()
	 * @generated
	 */
	EReference getAlgebraicConditionList_Next();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SOSFactory getSOSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SOS.impl.SemanticsImpl <em>Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.impl.SemanticsImpl
		 * @see SOS.impl.SOSPackageImpl#getSemantics()
		 * @generated
		 */
		EClass SEMANTICS = eINSTANCE.getSemantics();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTICS__RULES = eINSTANCE.getSemantics_Rules();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTICS__SIGNATURE = eINSTANCE.getSemantics_Signature();

		/**
		 * The meta object literal for the '{@link SOS.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.impl.RuleImpl
		 * @see SOS.impl.SOSPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Assumes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ASSUMES = eINSTANCE.getRule_Assumes();

		/**
		 * The meta object literal for the '<em><b>Concludes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONCLUDES = eINSTANCE.getRule_Concludes();

		/**
		 * The meta object literal for the '<em><b>Owned Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__OWNED_VARIABLES = eINSTANCE.getRule_OwnedVariables();

		/**
		 * The meta object literal for the '{@link SOS.impl.PremisseListImpl <em>Premisse List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.impl.PremisseListImpl
		 * @see SOS.impl.SOSPackageImpl#getPremisseList()
		 * @generated
		 */
		EClass PREMISSE_LIST = eINSTANCE.getPremisseList();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREMISSE_LIST__HAS = eINSTANCE.getPremisseList_Has();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREMISSE_LIST__NEXT = eINSTANCE.getPremisseList_Next();

		/**
		 * The meta object literal for the '{@link SOS.impl.ConclusionImpl <em>Conclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.impl.ConclusionImpl
		 * @see SOS.impl.SOSPackageImpl#getConclusion()
		 * @generated
		 */
		EClass CONCLUSION = eINSTANCE.getConclusion();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCLUSION__HAS = eINSTANCE.getConclusion_Has();

		/**
		 * The meta object literal for the '{@link SOS.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.impl.ConditionImpl
		 * @see SOS.impl.SOSPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link SOS.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.impl.TransitionImpl
		 * @see SOS.impl.SOSPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>Pre State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__PRE_STATE = eINSTANCE.getTransition_PreState();

		/**
		 * The meta object literal for the '<em><b>Pos State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__POS_STATE = eINSTANCE.getTransition_PosState();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ENVIRONMENT = eINSTANCE.getTransition_Environment();

		/**
		 * The meta object literal for the '{@link SOS.impl.TypeJudmentImpl <em>Type Judment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.impl.TypeJudmentImpl
		 * @see SOS.impl.SOSPackageImpl#getTypeJudment()
		 * @generated
		 */
		EClass TYPE_JUDMENT = eINSTANCE.getTypeJudment();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_JUDMENT__ENVIRONMENT = eINSTANCE.getTypeJudment_Environment();

		/**
		 * The meta object literal for the '<em><b>Left Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_JUDMENT__LEFT_HAND_SIDE = eINSTANCE.getTypeJudment_LeftHandSide();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_JUDMENT__RIGHT_HAND_SIDE = eINSTANCE.getTypeJudment_RightHandSide();

		/**
		 * The meta object literal for the '{@link SOS.impl.AlgebraicConditionImpl <em>Algebraic Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.impl.AlgebraicConditionImpl
		 * @see SOS.impl.SOSPackageImpl#getAlgebraicCondition()
		 * @generated
		 */
		EClass ALGEBRAIC_CONDITION = eINSTANCE.getAlgebraicCondition();

		/**
		 * The meta object literal for the '<em><b>Owned Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGEBRAIC_CONDITION__OWNED_CONDITIONS = eINSTANCE.getAlgebraicCondition_OwnedConditions();

		/**
		 * The meta object literal for the '{@link SOS.impl.AlgebraicConditionListImpl <em>Algebraic Condition List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SOS.impl.AlgebraicConditionListImpl
		 * @see SOS.impl.SOSPackageImpl#getAlgebraicConditionList()
		 * @generated
		 */
		EClass ALGEBRAIC_CONDITION_LIST = eINSTANCE.getAlgebraicConditionList();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGEBRAIC_CONDITION_LIST__HAS = eINSTANCE.getAlgebraicConditionList_Has();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGEBRAIC_CONDITION_LIST__NEXT = eINSTANCE.getAlgebraicConditionList_Next();

	}

} //SOSPackage
