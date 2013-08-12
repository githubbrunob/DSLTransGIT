/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultisetmmPackageImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.multisetmm.impl;

import SATEL.APN.adtmm.AdtmmPackage;

import SATEL.APN.adtmm.impl.AdtmmPackageImpl;

import SATEL.APN.apnmm.ApnmmPackage;

import SATEL.APN.apnmm.impl.ApnmmPackageImpl;

import SATEL.APN.environmentmm.EnvironmentmmPackage;

import SATEL.APN.environmentmm.impl.EnvironmentmmPackageImpl;

import SATEL.APN.guardmm.GuardmmPackage;

import SATEL.APN.guardmm.impl.GuardmmPackageImpl;

import SATEL.APN.multisetmm.MSElement;
import SATEL.APN.multisetmm.Multiset;
import SATEL.APN.multisetmm.MultisetmmFactory;
import SATEL.APN.multisetmm.MultisetmmPackage;
import SATEL.APN.multisetmm.NumOfTerms;
import SATEL.APN.multisetmm.TermReference;

import SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage;

import SATEL.AlgebraicExpressions.algterms.AlgtermsPackage;

import SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl;

import SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage;

import SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl;

import SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage;

import SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl;

import SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl;

import SATEL.HMLFormula.HMLFormulaPackage;

import SATEL.HMLFormula.impl.HMLFormulaPackageImpl;

import SATEL.SATELPackage;

import SATEL.VariableDeclarations.Types.TypesPackage;

import SATEL.VariableDeclarations.Types.impl.TypesPackageImpl;

import SATEL.VariableDeclarations.VariableDeclarationsPackage;

import SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl;

import SATEL.impl.SATELPackageImpl;

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
public class MultisetmmPackageImpl extends EPackageImpl implements MultisetmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multisetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numOfTermsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass msElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termReferenceEClass = null;

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
	 * @see SATEL.APN.multisetmm.MultisetmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MultisetmmPackageImpl() {
		super(eNS_URI, MultisetmmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MultisetmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MultisetmmPackage init() {
		if (isInited) return (MultisetmmPackage)EPackage.Registry.INSTANCE.getEPackage(MultisetmmPackage.eNS_URI);

		// Obtain or create and register package
		MultisetmmPackageImpl theMultisetmmPackage = (MultisetmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MultisetmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MultisetmmPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SATELPackageImpl theSATELPackage = (SATELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI) instanceof SATELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI) : SATELPackage.eINSTANCE);
		HMLFormulaPackageImpl theHMLFormulaPackage = (HMLFormulaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI) instanceof HMLFormulaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI) : HMLFormulaPackage.eINSTANCE);
		AlgebraicExpressionsPackageImpl theAlgebraicExpressionsPackage = (AlgebraicExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgebraicExpressionsPackage.eNS_URI) instanceof AlgebraicExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgebraicExpressionsPackage.eNS_URI) : AlgebraicExpressionsPackage.eINSTANCE);
		BooleantermsPackageImpl theBooleantermsPackage = (BooleantermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleantermsPackage.eNS_URI) instanceof BooleantermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleantermsPackage.eNS_URI) : BooleantermsPackage.eINSTANCE);
		ArithmetictermsPackageImpl theArithmetictermsPackage = (ArithmetictermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArithmetictermsPackage.eNS_URI) instanceof ArithmetictermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArithmetictermsPackage.eNS_URI) : ArithmetictermsPackage.eINSTANCE);
		AlgtermsPackageImpl theAlgtermsPackage = (AlgtermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgtermsPackage.eNS_URI) instanceof AlgtermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgtermsPackage.eNS_URI) : AlgtermsPackage.eINSTANCE);
		VariableDeclarationsPackageImpl theVariableDeclarationsPackage = (VariableDeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariableDeclarationsPackage.eNS_URI) instanceof VariableDeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariableDeclarationsPackage.eNS_URI) : VariableDeclarationsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ApnmmPackageImpl theApnmmPackage = (ApnmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApnmmPackage.eNS_URI) instanceof ApnmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApnmmPackage.eNS_URI) : ApnmmPackage.eINSTANCE);
		EnvironmentmmPackageImpl theEnvironmentmmPackage = (EnvironmentmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvironmentmmPackage.eNS_URI) instanceof EnvironmentmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvironmentmmPackage.eNS_URI) : EnvironmentmmPackage.eINSTANCE);
		GuardmmPackageImpl theGuardmmPackage = (GuardmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuardmmPackage.eNS_URI) instanceof GuardmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuardmmPackage.eNS_URI) : GuardmmPackage.eINSTANCE);
		AdtmmPackageImpl theAdtmmPackage = (AdtmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) instanceof AdtmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) : AdtmmPackage.eINSTANCE);

		// Create package meta-data objects
		theMultisetmmPackage.createPackageContents();
		theSATELPackage.createPackageContents();
		theHMLFormulaPackage.createPackageContents();
		theAlgebraicExpressionsPackage.createPackageContents();
		theBooleantermsPackage.createPackageContents();
		theArithmetictermsPackage.createPackageContents();
		theAlgtermsPackage.createPackageContents();
		theVariableDeclarationsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theApnmmPackage.createPackageContents();
		theEnvironmentmmPackage.createPackageContents();
		theGuardmmPackage.createPackageContents();
		theAdtmmPackage.createPackageContents();

		// Initialize created meta-data
		theMultisetmmPackage.initializePackageContents();
		theSATELPackage.initializePackageContents();
		theHMLFormulaPackage.initializePackageContents();
		theAlgebraicExpressionsPackage.initializePackageContents();
		theBooleantermsPackage.initializePackageContents();
		theArithmetictermsPackage.initializePackageContents();
		theAlgtermsPackage.initializePackageContents();
		theVariableDeclarationsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theApnmmPackage.initializePackageContents();
		theEnvironmentmmPackage.initializePackageContents();
		theGuardmmPackage.initializePackageContents();
		theAdtmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMultisetmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MultisetmmPackage.eNS_URI, theMultisetmmPackage);
		return theMultisetmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiset() {
		return multisetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiset_MsSort() {
		return (EReference)multisetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiset_OwnedNumOfTerms() {
		return (EReference)multisetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiset_OwnedVariables() {
		return (EReference)multisetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumOfTerms() {
		return numOfTermsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumOfTerms_Card() {
		return (EAttribute)numOfTermsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumOfTerms_OwnedElement() {
		return (EReference)numOfTermsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSElement() {
		return msElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermReference() {
		return termReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermReference_TermReferenced() {
		return (EReference)termReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultisetmmFactory getMultisetmmFactory() {
		return (MultisetmmFactory)getEFactoryInstance();
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
		multisetEClass = createEClass(MULTISET);
		createEReference(multisetEClass, MULTISET__MS_SORT);
		createEReference(multisetEClass, MULTISET__OWNED_NUM_OF_TERMS);
		createEReference(multisetEClass, MULTISET__OWNED_VARIABLES);

		numOfTermsEClass = createEClass(NUM_OF_TERMS);
		createEAttribute(numOfTermsEClass, NUM_OF_TERMS__CARD);
		createEReference(numOfTermsEClass, NUM_OF_TERMS__OWNED_ELEMENT);

		msElementEClass = createEClass(MS_ELEMENT);

		termReferenceEClass = createEClass(TERM_REFERENCE);
		createEReference(termReferenceEClass, TERM_REFERENCE__TERM_REFERENCED);
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
		EnvironmentmmPackage theEnvironmentmmPackage = (EnvironmentmmPackage)EPackage.Registry.INSTANCE.getEPackage(EnvironmentmmPackage.eNS_URI);
		AdtmmPackage theAdtmmPackage = (AdtmmPackage)EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		multisetEClass.getESuperTypes().add(theEnvironmentmmPackage.getEnvironment());
		termReferenceEClass.getESuperTypes().add(this.getMSElement());

		// Initialize classes and features; add operations and parameters
		initEClass(multisetEClass, Multiset.class, "Multiset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiset_MsSort(), theAdtmmPackage.getSort(), null, "msSort", null, 0, 1, Multiset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiset_OwnedNumOfTerms(), this.getNumOfTerms(), null, "ownedNumOfTerms", null, 0, -1, Multiset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiset_OwnedVariables(), theAdtmmPackage.getVariable(), null, "ownedVariables", null, 0, -1, Multiset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numOfTermsEClass, NumOfTerms.class, "NumOfTerms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumOfTerms_Card(), ecorePackage.getEInt(), "card", "1", 1, 1, NumOfTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumOfTerms_OwnedElement(), this.getMSElement(), null, "ownedElement", null, 1, 1, NumOfTerms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(msElementEClass, MSElement.class, "MSElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termReferenceEClass, TermReference.class, "TermReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermReference_TermReferenced(), theAdtmmPackage.getTerm(), null, "termReferenced", null, 1, 1, TermReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //MultisetmmPackageImpl
