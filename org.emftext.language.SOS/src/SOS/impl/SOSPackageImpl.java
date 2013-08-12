/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.impl;

import SOS.AlgebraicCondition;
import SOS.AlgebraicConditionList;
import SOS.Conclusion;
import SOS.Condition;
import SOS.PremisseList;
import SOS.Rule;
import SOS.SOSFactory;
import SOS.SOSPackage;
import SOS.Semantics;
import SOS.Transition;
import SOS.TypeJudment;

import SOS.adtmm.AdtmmPackage;

import SOS.adtmm.impl.AdtmmPackageImpl;

import SOS.set.SetPackage;

import SOS.set.impl.SetPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SOSPackageImpl extends EPackageImpl implements SOSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premisseListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeJudmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algebraicConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algebraicConditionListEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see SOS.SOSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SOSPackageImpl() {
		super(eNS_URI, SOSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SOSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SOSPackage init() {
		if (isInited) return (SOSPackage)EPackage.Registry.INSTANCE.getEPackage(SOSPackage.eNS_URI);

		// Obtain or create and register package
		SOSPackageImpl theSOSPackage = (SOSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SOSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SOSPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AdtmmPackageImpl theAdtmmPackage = (AdtmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) instanceof AdtmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) : AdtmmPackage.eINSTANCE);
		SetPackageImpl theSetPackage = (SetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI) instanceof SetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI) : SetPackage.eINSTANCE);

		// Create package meta-data objects
		theSOSPackage.createPackageContents();
		theAdtmmPackage.createPackageContents();
		theSetPackage.createPackageContents();

		// Initialize created meta-data
		theSOSPackage.initializePackageContents();
		theAdtmmPackage.initializePackageContents();
		theSetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSOSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SOSPackage.eNS_URI, theSOSPackage);
		return theSOSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemantics() {
		return semanticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemantics_Rules() {
		return (EReference)semanticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemantics_Signature() {
		return (EReference)semanticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Assumes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Concludes() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_OwnedVariables() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremisseList() {
		return premisseListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremisseList_Has() {
		return (EReference)premisseListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremisseList_Next() {
		return (EReference)premisseListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConclusion() {
		return conclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConclusion_Has() {
		return (EReference)conclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Label() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_PreState() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_PosState() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Environment() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeJudment() {
		return typeJudmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeJudment_Environment() {
		return (EReference)typeJudmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeJudment_LeftHandSide() {
		return (EReference)typeJudmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeJudment_RightHandSide() {
		return (EReference)typeJudmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgebraicCondition() {
		return algebraicConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgebraicCondition_OwnedConditions() {
		return (EReference)algebraicConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgebraicConditionList() {
		return algebraicConditionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgebraicConditionList_Has() {
		return (EReference)algebraicConditionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgebraicConditionList_Next() {
		return (EReference)algebraicConditionListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOSFactory getSOSFactory() {
		return (SOSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		semanticsEClass = createEClass(SEMANTICS);
		createEReference(semanticsEClass, SEMANTICS__RULES);
		createEReference(semanticsEClass, SEMANTICS__SIGNATURE);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__ASSUMES);
		createEReference(ruleEClass, RULE__CONCLUDES);
		createEReference(ruleEClass, RULE__OWNED_VARIABLES);

		premisseListEClass = createEClass(PREMISSE_LIST);
		createEReference(premisseListEClass, PREMISSE_LIST__HAS);
		createEReference(premisseListEClass, PREMISSE_LIST__NEXT);

		conclusionEClass = createEClass(CONCLUSION);
		createEReference(conclusionEClass, CONCLUSION__HAS);

		conditionEClass = createEClass(CONDITION);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__LABEL);
		createEReference(transitionEClass, TRANSITION__PRE_STATE);
		createEReference(transitionEClass, TRANSITION__POS_STATE);
		createEReference(transitionEClass, TRANSITION__ENVIRONMENT);

		typeJudmentEClass = createEClass(TYPE_JUDMENT);
		createEReference(typeJudmentEClass, TYPE_JUDMENT__ENVIRONMENT);
		createEReference(typeJudmentEClass, TYPE_JUDMENT__LEFT_HAND_SIDE);
		createEReference(typeJudmentEClass, TYPE_JUDMENT__RIGHT_HAND_SIDE);

		algebraicConditionEClass = createEClass(ALGEBRAIC_CONDITION);
		createEReference(algebraicConditionEClass, ALGEBRAIC_CONDITION__OWNED_CONDITIONS);

		algebraicConditionListEClass = createEClass(ALGEBRAIC_CONDITION_LIST);
		createEReference(algebraicConditionListEClass, ALGEBRAIC_CONDITION_LIST__HAS);
		createEReference(algebraicConditionListEClass, ALGEBRAIC_CONDITION_LIST__NEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AdtmmPackage theAdtmmPackage = (AdtmmPackage)EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI);
		SetPackage theSetPackage = (SetPackage)EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAdtmmPackage);
		getESubpackages().add(theSetPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transitionEClass.getESuperTypes().add(this.getCondition());
		typeJudmentEClass.getESuperTypes().add(this.getCondition());
		algebraicConditionEClass.getESuperTypes().add(this.getCondition());

		// Initialize classes and features; add operations and parameters
		initEClass(semanticsEClass, Semantics.class, "Semantics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemantics_Rules(), this.getRule(), null, "rules", null, 0, -1, Semantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemantics_Signature(), theAdtmmPackage.getADT(), null, "signature", null, 0, -1, Semantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Assumes(), this.getPremisseList(), null, "assumes", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Concludes(), this.getConclusion(), null, "concludes", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_OwnedVariables(), theAdtmmPackage.getVariable(), null, "ownedVariables", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(premisseListEClass, PremisseList.class, "PremisseList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPremisseList_Has(), this.getCondition(), null, "has", null, 1, 1, PremisseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPremisseList_Next(), this.getPremisseList(), null, "next", null, 0, 1, PremisseList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conclusionEClass, Conclusion.class, "Conclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConclusion_Has(), this.getCondition(), null, "has", null, 1, 1, Conclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Label(), theAdtmmPackage.getTerm(), null, "label", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_PreState(), theAdtmmPackage.getTerm(), null, "preState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_PosState(), theAdtmmPackage.getTerm(), null, "posState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Environment(), theAdtmmPackage.getTerm(), null, "environment", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeJudmentEClass, TypeJudment.class, "TypeJudment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeJudment_Environment(), theAdtmmPackage.getTerm(), null, "environment", null, 0, 1, TypeJudment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeJudment_LeftHandSide(), theAdtmmPackage.getTerm(), null, "leftHandSide", null, 1, 1, TypeJudment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeJudment_RightHandSide(), theAdtmmPackage.getTerm(), null, "rightHandSide", null, 1, 1, TypeJudment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(algebraicConditionEClass, AlgebraicCondition.class, "AlgebraicCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgebraicCondition_OwnedConditions(), theAdtmmPackage.getAbstractEquation(), null, "ownedConditions", null, 1, -1, AlgebraicCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(algebraicConditionListEClass, AlgebraicConditionList.class, "AlgebraicConditionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgebraicConditionList_Has(), this.getAlgebraicCondition(), null, "has", null, 1, 1, AlgebraicConditionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgebraicConditionList_Next(), this.getAlgebraicConditionList(), null, "next", null, 0, 1, AlgebraicConditionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SOSPackageImpl
