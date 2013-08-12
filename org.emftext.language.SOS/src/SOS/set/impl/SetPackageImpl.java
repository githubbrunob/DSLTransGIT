/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set.impl;

import SOS.SOSPackage;

import SOS.adtmm.AdtmmPackage;

import SOS.adtmm.impl.AdtmmPackageImpl;

import SOS.impl.SOSPackageImpl;

import SOS.set.Excluding;
import SOS.set.ExistsIn;
import SOS.set.ForAllIn;
import SOS.set.Intersection;
import SOS.set.ModelClassAttribute;
import SOS.set.ModelRelation;
import SOS.set.ModelSet;
import SOS.set.ModelSort;
import SOS.set.Set;
import SOS.set.SetConstructor;
import SOS.set.SetFactory;
import SOS.set.SetMembership;
import SOS.set.SetOperator;
import SOS.set.SetPackage;
import SOS.set.SetTerm;
import SOS.set.Union;

import org.eclipse.emf.ecore.EAttribute;
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
public class SetPackageImpl extends EPackageImpl implements SetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intersectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelClassAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existsInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forAllInEClass = null;

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
	 * @see SOS.set.SetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SetPackageImpl() {
		super(eNS_URI, SetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SetPackage init() {
		if (isInited) return (SetPackage)EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI);

		// Obtain or create and register package
		SetPackageImpl theSetPackage = (SetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SetPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SOSPackageImpl theSOSPackage = (SOSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SOSPackage.eNS_URI) instanceof SOSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SOSPackage.eNS_URI) : SOSPackage.eINSTANCE);
		AdtmmPackageImpl theAdtmmPackage = (AdtmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) instanceof AdtmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) : AdtmmPackage.eINSTANCE);

		// Create package meta-data objects
		theSetPackage.createPackageContents();
		theSOSPackage.createPackageContents();
		theAdtmmPackage.createPackageContents();

		// Initialize created meta-data
		theSetPackage.initializePackageContents();
		theSOSPackage.initializePackageContents();
		theAdtmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SetPackage.eNS_URI, theSetPackage);
		return theSetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelSort() {
		return modelSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelSort_ClassName() {
		return (EAttribute)modelSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelSort_PackageName() {
		return (EAttribute)modelSortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetMembership() {
		return setMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetMembership_LeftHandSide() {
		return (EReference)setMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetMembership_RightHandSide() {
		return (EReference)setMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTerm() {
		return setTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelSet() {
		return modelSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetOperator() {
		return setOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetOperator_LeftHandSide() {
		return (EReference)setOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetOperator_RightHandSide() {
		return (EReference)setOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetConstructor() {
		return setConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetConstructor_SuchThat() {
		return (EReference)setConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetConstructor_Member() {
		return (EReference)setConstructorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnion() {
		return unionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcluding() {
		return excludingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntersection() {
		return intersectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelRelation() {
		return modelRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelRelation_ReferenceName() {
		return (EAttribute)modelRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRelation_Source() {
		return (EReference)modelRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRelation_Target() {
		return (EReference)modelRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelClassAttribute() {
		return modelClassAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelClassAttribute_Selector() {
		return (EReference)modelClassAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelClassAttribute_AttributeName() {
		return (EAttribute)modelClassAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSet_Sort() {
		return (EReference)setEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistsIn() {
		return existsInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForAllIn() {
		return forAllInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetFactory getSetFactory() {
		return (SetFactory)getEFactoryInstance();
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
		modelSortEClass = createEClass(MODEL_SORT);
		createEAttribute(modelSortEClass, MODEL_SORT__CLASS_NAME);
		createEAttribute(modelSortEClass, MODEL_SORT__PACKAGE_NAME);

		setMembershipEClass = createEClass(SET_MEMBERSHIP);
		createEReference(setMembershipEClass, SET_MEMBERSHIP__LEFT_HAND_SIDE);
		createEReference(setMembershipEClass, SET_MEMBERSHIP__RIGHT_HAND_SIDE);

		setTermEClass = createEClass(SET_TERM);

		modelSetEClass = createEClass(MODEL_SET);

		setOperatorEClass = createEClass(SET_OPERATOR);
		createEReference(setOperatorEClass, SET_OPERATOR__LEFT_HAND_SIDE);
		createEReference(setOperatorEClass, SET_OPERATOR__RIGHT_HAND_SIDE);

		setConstructorEClass = createEClass(SET_CONSTRUCTOR);
		createEReference(setConstructorEClass, SET_CONSTRUCTOR__SUCH_THAT);
		createEReference(setConstructorEClass, SET_CONSTRUCTOR__MEMBER);

		unionEClass = createEClass(UNION);

		excludingEClass = createEClass(EXCLUDING);

		intersectionEClass = createEClass(INTERSECTION);

		modelRelationEClass = createEClass(MODEL_RELATION);
		createEAttribute(modelRelationEClass, MODEL_RELATION__REFERENCE_NAME);
		createEReference(modelRelationEClass, MODEL_RELATION__SOURCE);
		createEReference(modelRelationEClass, MODEL_RELATION__TARGET);

		modelClassAttributeEClass = createEClass(MODEL_CLASS_ATTRIBUTE);
		createEReference(modelClassAttributeEClass, MODEL_CLASS_ATTRIBUTE__SELECTOR);
		createEAttribute(modelClassAttributeEClass, MODEL_CLASS_ATTRIBUTE__ATTRIBUTE_NAME);

		setEClass = createEClass(SET);
		createEReference(setEClass, SET__SORT);

		existsInEClass = createEClass(EXISTS_IN);

		forAllInEClass = createEClass(FOR_ALL_IN);
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
		SOSPackage theSOSPackage = (SOSPackage)EPackage.Registry.INSTANCE.getEPackage(SOSPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelSortEClass.getESuperTypes().add(theAdtmmPackage.getSort());
		setMembershipEClass.getESuperTypes().add(this.getSetTerm());
		setTermEClass.getESuperTypes().add(theAdtmmPackage.getTerm());
		modelSetEClass.getESuperTypes().add(this.getSetTerm());
		setOperatorEClass.getESuperTypes().add(this.getSetTerm());
		setConstructorEClass.getESuperTypes().add(this.getSetTerm());
		unionEClass.getESuperTypes().add(this.getSetOperator());
		excludingEClass.getESuperTypes().add(this.getSetOperator());
		intersectionEClass.getESuperTypes().add(this.getSetOperator());
		modelRelationEClass.getESuperTypes().add(theAdtmmPackage.getTerm());
		modelClassAttributeEClass.getESuperTypes().add(theAdtmmPackage.getTerm());
		setEClass.getESuperTypes().add(theAdtmmPackage.getSort());
		existsInEClass.getESuperTypes().add(this.getSetMembership());
		forAllInEClass.getESuperTypes().add(this.getSetMembership());

		// Initialize classes and features; add operations and parameters
		initEClass(modelSortEClass, ModelSort.class, "ModelSort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelSort_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, ModelSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelSort_PackageName(), ecorePackage.getEString(), "packageName", null, 1, 1, ModelSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setMembershipEClass, SetMembership.class, "SetMembership", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetMembership_LeftHandSide(), theAdtmmPackage.getTerm(), null, "leftHandSide", null, 1, 1, SetMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetMembership_RightHandSide(), theAdtmmPackage.getTerm(), null, "rightHandSide", null, 1, 1, SetMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setTermEClass, SetTerm.class, "SetTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelSetEClass, ModelSet.class, "ModelSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setOperatorEClass, SetOperator.class, "SetOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetOperator_LeftHandSide(), theAdtmmPackage.getTerm(), null, "leftHandSide", null, 1, 1, SetOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetOperator_RightHandSide(), theAdtmmPackage.getTerm(), null, "rightHandSide", null, 1, 1, SetOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setConstructorEClass, SetConstructor.class, "SetConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetConstructor_SuchThat(), theSOSPackage.getAlgebraicConditionList(), null, "suchThat", null, 0, 1, SetConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetConstructor_Member(), theAdtmmPackage.getTerm(), null, "member", null, 0, 1, SetConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionEClass, Union.class, "Union", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(excludingEClass, Excluding.class, "Excluding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intersectionEClass, Intersection.class, "Intersection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelRelationEClass, ModelRelation.class, "ModelRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelRelation_ReferenceName(), ecorePackage.getEString(), "referenceName", null, 1, 1, ModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRelation_Source(), theAdtmmPackage.getVariableRef(), null, "source", null, 1, 1, ModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRelation_Target(), theAdtmmPackage.getVariableRef(), null, "target", null, 1, 1, ModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelClassAttributeEClass, ModelClassAttribute.class, "ModelClassAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelClassAttribute_Selector(), theAdtmmPackage.getVariableRef(), null, "selector", null, 1, 1, ModelClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelClassAttribute_AttributeName(), ecorePackage.getEString(), "attributeName", null, 1, 1, ModelClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSet_Sort(), theAdtmmPackage.getSort(), null, "sort", null, 1, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existsInEClass, ExistsIn.class, "ExistsIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forAllInEClass, ForAllIn.class, "ForAllIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //SetPackageImpl
