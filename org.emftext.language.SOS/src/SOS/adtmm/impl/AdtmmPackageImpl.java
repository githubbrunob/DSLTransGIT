/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm.impl;

import SOS.SOSPackage;

import SOS.adtmm.AbstractEquation;
import SOS.adtmm.AbstractGenericOp;
import SOS.adtmm.AbstractOperation;
import SOS.adtmm.AbstractSort;
import SOS.adtmm.AdtmmFactory;
import SOS.adtmm.AdtmmPackage;
import SOS.adtmm.AtomicSort;
import SOS.adtmm.CTerm;
import SOS.adtmm.CondEquation;
import SOS.adtmm.Equation;
import SOS.adtmm.Inequation;
import SOS.adtmm.Operation;
import SOS.adtmm.Sort;
import SOS.adtmm.SortDeclaration;
import SOS.adtmm.Term;
import SOS.adtmm.Variable;
import SOS.adtmm.VariableRef;

import SOS.impl.SOSPackageImpl;

import SOS.set.SetPackage;

import SOS.set.impl.SetPackageImpl;

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
public class AdtmmPackageImpl extends EPackageImpl implements AdtmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass condEquationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEquationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inequationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGenericOpEClass = null;

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
	 * @see SOS.adtmm.AdtmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdtmmPackageImpl() {
		super(eNS_URI, AdtmmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdtmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdtmmPackage init() {
		if (isInited) return (AdtmmPackage)EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI);

		// Obtain or create and register package
		AdtmmPackageImpl theAdtmmPackage = (AdtmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdtmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdtmmPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SOSPackageImpl theSOSPackage = (SOSPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SOSPackage.eNS_URI) instanceof SOSPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SOSPackage.eNS_URI) : SOSPackage.eINSTANCE);
		SetPackageImpl theSetPackage = (SetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI) instanceof SetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SetPackage.eNS_URI) : SetPackage.eINSTANCE);

		// Create package meta-data objects
		theAdtmmPackage.createPackageContents();
		theSOSPackage.createPackageContents();
		theSetPackage.createPackageContents();

		// Initialize created meta-data
		theAdtmmPackage.initializePackageContents();
		theSOSPackage.initializePackageContents();
		theSetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdtmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdtmmPackage.eNS_URI, theAdtmmPackage);
		return theAdtmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADT() {
		return adtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADT_OwnedSorts() {
		return (EReference)adtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADT_OwnedOperations() {
		return (EReference)adtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADT_OwnedGenerators() {
		return (EReference)adtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADT_OwnedVariables() {
		return (EReference)adtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADT_OwnedAxioms() {
		return (EReference)adtEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADT_Name() {
		return (EAttribute)adtEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSort() {
		return sortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OperationSorts() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Result() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_VariableSort() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondEquation() {
		return condEquationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondEquation_OwnedConditions() {
		return (EReference)condEquationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondEquation_OwnedEquation() {
		return (EReference)condEquationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRef() {
		return variableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableRef_Variable() {
		return (EReference)variableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCTerm() {
		return cTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCTerm_Iter() {
		return (EAttribute)cTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTerm_OwnedTerms() {
		return (EReference)cTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTerm_Op() {
		return (EReference)cTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCTerm_IterTerm() {
		return (EReference)cTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEquation() {
		return abstractEquationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEquation_OwnedRightTerm() {
		return (EReference)abstractEquationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEquation_OwnedLeftTerm() {
		return (EReference)abstractEquationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquation() {
		return equationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInequation() {
		return inequationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSort() {
		return abstractSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicSort() {
		return atomicSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicSort_Declaration() {
		return (EReference)atomicSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortDeclaration() {
		return sortDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortDeclaration_Name() {
		return (EAttribute)sortDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractOperation() {
		return abstractOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractOperation_Name() {
		return (EAttribute)abstractOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGenericOp() {
		return abstractGenericOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdtmmFactory getAdtmmFactory() {
		return (AdtmmFactory)getEFactoryInstance();
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
		adtEClass = createEClass(ADT);
		createEReference(adtEClass, ADT__OWNED_SORTS);
		createEReference(adtEClass, ADT__OWNED_OPERATIONS);
		createEReference(adtEClass, ADT__OWNED_GENERATORS);
		createEReference(adtEClass, ADT__OWNED_VARIABLES);
		createEReference(adtEClass, ADT__OWNED_AXIOMS);
		createEAttribute(adtEClass, ADT__NAME);

		sortEClass = createEClass(SORT);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__OPERATION_SORTS);
		createEReference(operationEClass, OPERATION__RESULT);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__VARIABLE_SORT);
		createEAttribute(variableEClass, VARIABLE__NAME);

		condEquationEClass = createEClass(COND_EQUATION);
		createEReference(condEquationEClass, COND_EQUATION__OWNED_CONDITIONS);
		createEReference(condEquationEClass, COND_EQUATION__OWNED_EQUATION);

		termEClass = createEClass(TERM);

		variableRefEClass = createEClass(VARIABLE_REF);
		createEReference(variableRefEClass, VARIABLE_REF__VARIABLE);

		cTermEClass = createEClass(CTERM);
		createEAttribute(cTermEClass, CTERM__ITER);
		createEReference(cTermEClass, CTERM__OWNED_TERMS);
		createEReference(cTermEClass, CTERM__OP);
		createEReference(cTermEClass, CTERM__ITER_TERM);

		abstractEquationEClass = createEClass(ABSTRACT_EQUATION);
		createEReference(abstractEquationEClass, ABSTRACT_EQUATION__OWNED_RIGHT_TERM);
		createEReference(abstractEquationEClass, ABSTRACT_EQUATION__OWNED_LEFT_TERM);

		equationEClass = createEClass(EQUATION);

		inequationEClass = createEClass(INEQUATION);

		abstractSortEClass = createEClass(ABSTRACT_SORT);

		atomicSortEClass = createEClass(ATOMIC_SORT);
		createEReference(atomicSortEClass, ATOMIC_SORT__DECLARATION);

		sortDeclarationEClass = createEClass(SORT_DECLARATION);
		createEAttribute(sortDeclarationEClass, SORT_DECLARATION__NAME);

		abstractOperationEClass = createEClass(ABSTRACT_OPERATION);
		createEAttribute(abstractOperationEClass, ABSTRACT_OPERATION__NAME);

		abstractGenericOpEClass = createEClass(ABSTRACT_GENERIC_OP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationEClass.getESuperTypes().add(this.getAbstractOperation());
		variableRefEClass.getESuperTypes().add(this.getTerm());
		cTermEClass.getESuperTypes().add(this.getTerm());
		equationEClass.getESuperTypes().add(this.getAbstractEquation());
		inequationEClass.getESuperTypes().add(this.getAbstractEquation());
		atomicSortEClass.getESuperTypes().add(this.getSort());
		abstractGenericOpEClass.getESuperTypes().add(this.getAbstractOperation());

		// Initialize classes and features; add operations and parameters
		initEClass(adtEClass, SOS.adtmm.ADT.class, "ADT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getADT_OwnedSorts(), this.getSortDeclaration(), null, "ownedSorts", null, 0, -1, SOS.adtmm.ADT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADT_OwnedOperations(), this.getOperation(), null, "ownedOperations", null, 0, -1, SOS.adtmm.ADT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADT_OwnedGenerators(), this.getOperation(), null, "ownedGenerators", null, 0, -1, SOS.adtmm.ADT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADT_OwnedVariables(), this.getVariable(), null, "ownedVariables", null, 0, -1, SOS.adtmm.ADT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADT_OwnedAxioms(), this.getCondEquation(), null, "ownedAxioms", null, 0, -1, SOS.adtmm.ADT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getADT_Name(), ecorePackage.getEString(), "name", null, 1, 1, SOS.adtmm.ADT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortEClass, Sort.class, "Sort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_OperationSorts(), this.getSort(), null, "operationSorts", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Result(), this.getSort(), null, "result", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_VariableSort(), this.getSort(), null, "variableSort", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(condEquationEClass, CondEquation.class, "CondEquation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondEquation_OwnedConditions(), this.getAbstractEquation(), null, "ownedConditions", null, 0, -1, CondEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondEquation_OwnedEquation(), this.getEquation(), null, "ownedEquation", null, 1, 1, CondEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableRef_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cTermEClass, CTerm.class, "CTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCTerm_Iter(), ecorePackage.getEInt(), "iter", null, 0, 1, CTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTerm_OwnedTerms(), this.getTerm(), null, "ownedTerms", null, 0, -1, CTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTerm_Op(), this.getOperation(), null, "op", null, 1, 1, CTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCTerm_IterTerm(), this.getTerm(), null, "iterTerm", null, 0, 1, CTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEquationEClass, AbstractEquation.class, "AbstractEquation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractEquation_OwnedRightTerm(), this.getTerm(), null, "ownedRightTerm", null, 1, 1, AbstractEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractEquation_OwnedLeftTerm(), this.getTerm(), null, "ownedLeftTerm", null, 1, 1, AbstractEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equationEClass, Equation.class, "Equation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inequationEClass, Inequation.class, "Inequation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractSortEClass, AbstractSort.class, "AbstractSort", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicSortEClass, AtomicSort.class, "AtomicSort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicSort_Declaration(), this.getSortDeclaration(), null, "declaration", null, 1, 1, AtomicSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortDeclarationEClass, SortDeclaration.class, "SortDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSortDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1, SortDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractOperationEClass, AbstractOperation.class, "AbstractOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractOperation_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractGenericOpEClass, AbstractGenericOp.class, "AbstractGenericOp", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AdtmmPackageImpl
