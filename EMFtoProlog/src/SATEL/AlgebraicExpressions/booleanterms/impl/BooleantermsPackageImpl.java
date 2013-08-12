/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleantermsPackageImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms.impl;

import SATEL.APN.adtmm.AdtmmPackage;

import SATEL.APN.adtmm.impl.AdtmmPackageImpl;

import SATEL.APN.apnmm.ApnmmPackage;

import SATEL.APN.apnmm.impl.ApnmmPackageImpl;

import SATEL.APN.environmentmm.EnvironmentmmPackage;

import SATEL.APN.environmentmm.impl.EnvironmentmmPackageImpl;

import SATEL.APN.guardmm.GuardmmPackage;

import SATEL.APN.guardmm.impl.GuardmmPackageImpl;

import SATEL.APN.multisetmm.MultisetmmPackage;

import SATEL.APN.multisetmm.impl.MultisetmmPackageImpl;

import SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage;

import SATEL.AlgebraicExpressions.algterms.AlgtermsPackage;

import SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl;

import SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage;

import SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsPackageImpl;

import SATEL.AlgebraicExpressions.booleanterms.BOPAnd;
import SATEL.AlgebraicExpressions.booleanterms.BOPOr;
import SATEL.AlgebraicExpressions.booleanterms.BooleanTerm;
import SATEL.AlgebraicExpressions.booleanterms.BooleanValue;
import SATEL.AlgebraicExpressions.booleanterms.BooleanVariable;
import SATEL.AlgebraicExpressions.booleanterms.BooleantermsFactory;
import SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage;
import SATEL.AlgebraicExpressions.booleanterms.Equals;
import SATEL.AlgebraicExpressions.booleanterms.Not;
import SATEL.AlgebraicExpressions.booleanterms.NotEquals;
import SATEL.AlgebraicExpressions.booleanterms.Positive;
import SATEL.AlgebraicExpressions.booleanterms.Sequence;
import SATEL.AlgebraicExpressions.booleanterms.Trace;

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
public class BooleantermsPackageImpl extends EPackageImpl implements BooleantermsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bopAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bopOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqualsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lteEClass = null;

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
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BooleantermsPackageImpl() {
		super(eNS_URI, BooleantermsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BooleantermsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BooleantermsPackage init() {
		if (isInited) return (BooleantermsPackage)EPackage.Registry.INSTANCE.getEPackage(BooleantermsPackage.eNS_URI);

		// Obtain or create and register package
		BooleantermsPackageImpl theBooleantermsPackage = (BooleantermsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BooleantermsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BooleantermsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SATELPackageImpl theSATELPackage = (SATELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI) instanceof SATELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI) : SATELPackage.eINSTANCE);
		HMLFormulaPackageImpl theHMLFormulaPackage = (HMLFormulaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI) instanceof HMLFormulaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI) : HMLFormulaPackage.eINSTANCE);
		AlgebraicExpressionsPackageImpl theAlgebraicExpressionsPackage = (AlgebraicExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgebraicExpressionsPackage.eNS_URI) instanceof AlgebraicExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgebraicExpressionsPackage.eNS_URI) : AlgebraicExpressionsPackage.eINSTANCE);
		ArithmetictermsPackageImpl theArithmetictermsPackage = (ArithmetictermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArithmetictermsPackage.eNS_URI) instanceof ArithmetictermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArithmetictermsPackage.eNS_URI) : ArithmetictermsPackage.eINSTANCE);
		AlgtermsPackageImpl theAlgtermsPackage = (AlgtermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgtermsPackage.eNS_URI) instanceof AlgtermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgtermsPackage.eNS_URI) : AlgtermsPackage.eINSTANCE);
		VariableDeclarationsPackageImpl theVariableDeclarationsPackage = (VariableDeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariableDeclarationsPackage.eNS_URI) instanceof VariableDeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariableDeclarationsPackage.eNS_URI) : VariableDeclarationsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ApnmmPackageImpl theApnmmPackage = (ApnmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApnmmPackage.eNS_URI) instanceof ApnmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApnmmPackage.eNS_URI) : ApnmmPackage.eINSTANCE);
		EnvironmentmmPackageImpl theEnvironmentmmPackage = (EnvironmentmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvironmentmmPackage.eNS_URI) instanceof EnvironmentmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvironmentmmPackage.eNS_URI) : EnvironmentmmPackage.eINSTANCE);
		GuardmmPackageImpl theGuardmmPackage = (GuardmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuardmmPackage.eNS_URI) instanceof GuardmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuardmmPackage.eNS_URI) : GuardmmPackage.eINSTANCE);
		AdtmmPackageImpl theAdtmmPackage = (AdtmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) instanceof AdtmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) : AdtmmPackage.eINSTANCE);
		MultisetmmPackageImpl theMultisetmmPackage = (MultisetmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MultisetmmPackage.eNS_URI) instanceof MultisetmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MultisetmmPackage.eNS_URI) : MultisetmmPackage.eINSTANCE);

		// Create package meta-data objects
		theBooleantermsPackage.createPackageContents();
		theSATELPackage.createPackageContents();
		theHMLFormulaPackage.createPackageContents();
		theAlgebraicExpressionsPackage.createPackageContents();
		theArithmetictermsPackage.createPackageContents();
		theAlgtermsPackage.createPackageContents();
		theVariableDeclarationsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theApnmmPackage.createPackageContents();
		theEnvironmentmmPackage.createPackageContents();
		theGuardmmPackage.createPackageContents();
		theAdtmmPackage.createPackageContents();
		theMultisetmmPackage.createPackageContents();

		// Initialize created meta-data
		theBooleantermsPackage.initializePackageContents();
		theSATELPackage.initializePackageContents();
		theHMLFormulaPackage.initializePackageContents();
		theAlgebraicExpressionsPackage.initializePackageContents();
		theArithmetictermsPackage.initializePackageContents();
		theAlgtermsPackage.initializePackageContents();
		theVariableDeclarationsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theApnmmPackage.initializePackageContents();
		theEnvironmentmmPackage.initializePackageContents();
		theGuardmmPackage.initializePackageContents();
		theAdtmmPackage.initializePackageContents();
		theMultisetmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBooleantermsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BooleantermsPackage.eNS_URI, theBooleantermsPackage);
		return theBooleantermsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanTerm() {
		return booleanTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_BooleanTerm() {
		return (EReference)notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_HmlTerm() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositive() {
		return positiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositive_HmlTerm() {
		return (EReference)positiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_HmlTerm() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable() {
		return booleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanVariable_BooleanVariable() {
		return (EReference)booleanVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOPAnd() {
		return bopAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPAnd_BooleanTermL() {
		return (EReference)bopAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPAnd_BooleanTermR() {
		return (EReference)bopAndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOPOr() {
		return bopOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPOr_BooleanTermL() {
		return (EReference)bopOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPOr_BooleanTermR() {
		return (EReference)bopOrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquals() {
		return equalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquals_ArithmeticTermR() {
		return (EReference)equalsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquals_ArithmeticTermL() {
		return (EReference)equalsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotEquals() {
		return notEqualsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotEquals_ArithmeticTermR() {
		return (EReference)notEqualsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotEquals_ArithmeticTermL() {
		return (EReference)notEqualsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGT() {
		return gtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGT_ArithmeticTermR() {
		return (EReference)gtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGT_ArithmeticTermL() {
		return (EReference)gtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLT() {
		return ltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLT_ArithmeticTermR() {
		return (EReference)ltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLT_ArithmeticTermL() {
		return (EReference)ltEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGTE() {
		return gteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGTE_ArithmeticTermR() {
		return (EReference)gteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGTE_ArithmeticTermL() {
		return (EReference)gteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLTE() {
		return lteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLTE_ArithmeticTermR() {
		return (EReference)lteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLTE_ArithmeticTermL() {
		return (EReference)lteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleantermsFactory getBooleantermsFactory() {
		return (BooleantermsFactory)getEFactoryInstance();
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
		booleanTermEClass = createEClass(BOOLEAN_TERM);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__BOOLEAN_TERM);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__HML_TERM);

		positiveEClass = createEClass(POSITIVE);
		createEReference(positiveEClass, POSITIVE__HML_TERM);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__HML_TERM);

		booleanVariableEClass = createEClass(BOOLEAN_VARIABLE);
		createEReference(booleanVariableEClass, BOOLEAN_VARIABLE__BOOLEAN_VARIABLE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		bopAndEClass = createEClass(BOP_AND);
		createEReference(bopAndEClass, BOP_AND__BOOLEAN_TERM_L);
		createEReference(bopAndEClass, BOP_AND__BOOLEAN_TERM_R);

		bopOrEClass = createEClass(BOP_OR);
		createEReference(bopOrEClass, BOP_OR__BOOLEAN_TERM_L);
		createEReference(bopOrEClass, BOP_OR__BOOLEAN_TERM_R);

		equalsEClass = createEClass(EQUALS);
		createEReference(equalsEClass, EQUALS__ARITHMETIC_TERM_R);
		createEReference(equalsEClass, EQUALS__ARITHMETIC_TERM_L);

		notEqualsEClass = createEClass(NOT_EQUALS);
		createEReference(notEqualsEClass, NOT_EQUALS__ARITHMETIC_TERM_R);
		createEReference(notEqualsEClass, NOT_EQUALS__ARITHMETIC_TERM_L);

		gtEClass = createEClass(GT);
		createEReference(gtEClass, GT__ARITHMETIC_TERM_R);
		createEReference(gtEClass, GT__ARITHMETIC_TERM_L);

		ltEClass = createEClass(LT);
		createEReference(ltEClass, LT__ARITHMETIC_TERM_R);
		createEReference(ltEClass, LT__ARITHMETIC_TERM_L);

		gteEClass = createEClass(GTE);
		createEReference(gteEClass, GTE__ARITHMETIC_TERM_R);
		createEReference(gteEClass, GTE__ARITHMETIC_TERM_L);

		lteEClass = createEClass(LTE);
		createEReference(lteEClass, LTE__ARITHMETIC_TERM_R);
		createEReference(lteEClass, LTE__ARITHMETIC_TERM_L);
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
		SATELPackage theSATELPackage = (SATELPackage)EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI);
		HMLFormulaPackage theHMLFormulaPackage = (HMLFormulaPackage)EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI);
		VariableDeclarationsPackage theVariableDeclarationsPackage = (VariableDeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(VariableDeclarationsPackage.eNS_URI);
		ArithmetictermsPackage theArithmetictermsPackage = (ArithmetictermsPackage)EPackage.Registry.INSTANCE.getEPackage(ArithmetictermsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		booleanTermEClass.getESuperTypes().add(theSATELPackage.getConditionAtom());
		notEClass.getESuperTypes().add(this.getBooleanTerm());
		sequenceEClass.getESuperTypes().add(this.getBooleanTerm());
		positiveEClass.getESuperTypes().add(this.getBooleanTerm());
		traceEClass.getESuperTypes().add(this.getBooleanTerm());
		booleanVariableEClass.getESuperTypes().add(this.getBooleanTerm());
		booleanValueEClass.getESuperTypes().add(this.getBooleanTerm());
		bopAndEClass.getESuperTypes().add(this.getBooleanTerm());
		bopOrEClass.getESuperTypes().add(this.getBooleanTerm());
		equalsEClass.getESuperTypes().add(this.getBooleanTerm());
		notEqualsEClass.getESuperTypes().add(this.getBooleanTerm());
		gtEClass.getESuperTypes().add(this.getBooleanTerm());
		ltEClass.getESuperTypes().add(this.getBooleanTerm());
		gteEClass.getESuperTypes().add(this.getBooleanTerm());
		lteEClass.getESuperTypes().add(this.getBooleanTerm());

		// Initialize classes and features; add operations and parameters
		initEClass(booleanTermEClass, BooleanTerm.class, "BooleanTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_BooleanTerm(), this.getBooleanTerm(), null, "booleanTerm", null, 1, 1, Not.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_HmlTerm(), theHMLFormulaPackage.getHMLTerm(), null, "hmlTerm", null, 1, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(positiveEClass, Positive.class, "Positive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositive_HmlTerm(), theHMLFormulaPackage.getHMLTerm(), null, "hmlTerm", null, 1, 1, Positive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_HmlTerm(), theHMLFormulaPackage.getHMLTerm(), null, "hmlTerm", null, 1, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booleanVariableEClass, BooleanVariable.class, "BooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanVariable_BooleanVariable(), theVariableDeclarationsPackage.getPrimitiveBooleanVarDec(), null, "booleanVariable", null, 1, 1, BooleanVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bopAndEClass, BOPAnd.class, "BOPAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOPAnd_BooleanTermL(), this.getBooleanTerm(), null, "booleanTermL", null, 1, 1, BOPAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBOPAnd_BooleanTermR(), this.getBooleanTerm(), null, "booleanTermR", null, 1, 1, BOPAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bopOrEClass, BOPOr.class, "BOPOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOPOr_BooleanTermL(), this.getBooleanTerm(), null, "booleanTermL", null, 1, 1, BOPOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBOPOr_BooleanTermR(), this.getBooleanTerm(), null, "booleanTermR", null, 1, 1, BOPOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(equalsEClass, Equals.class, "Equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquals_ArithmeticTermR(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermR", null, 1, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEquals_ArithmeticTermL(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermL", null, 1, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(notEqualsEClass, NotEquals.class, "NotEquals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotEquals_ArithmeticTermR(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermR", null, 1, 1, NotEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNotEquals_ArithmeticTermL(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermL", null, 1, 1, NotEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gtEClass, SATEL.AlgebraicExpressions.booleanterms.GT.class, "GT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGT_ArithmeticTermR(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermR", null, 1, 1, SATEL.AlgebraicExpressions.booleanterms.GT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGT_ArithmeticTermL(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermL", null, 1, 1, SATEL.AlgebraicExpressions.booleanterms.GT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ltEClass, SATEL.AlgebraicExpressions.booleanterms.LT.class, "LT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLT_ArithmeticTermR(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermR", null, 1, 1, SATEL.AlgebraicExpressions.booleanterms.LT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLT_ArithmeticTermL(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermL", null, 1, 1, SATEL.AlgebraicExpressions.booleanterms.LT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gteEClass, SATEL.AlgebraicExpressions.booleanterms.GTE.class, "GTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGTE_ArithmeticTermR(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermR", null, 1, 1, SATEL.AlgebraicExpressions.booleanterms.GTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGTE_ArithmeticTermL(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermL", null, 1, 1, SATEL.AlgebraicExpressions.booleanterms.GTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lteEClass, SATEL.AlgebraicExpressions.booleanterms.LTE.class, "LTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLTE_ArithmeticTermR(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermR", null, 1, 1, SATEL.AlgebraicExpressions.booleanterms.LTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLTE_ArithmeticTermL(), theArithmetictermsPackage.getArithmeticTerm(), null, "arithmeticTermL", null, 1, 1, SATEL.AlgebraicExpressions.booleanterms.LTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //BooleantermsPackageImpl
