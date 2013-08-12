/**
 * <copyright>
 * </copyright>
 *
 * $Id: ArithmetictermsPackageImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms.impl;

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

import SATEL.AlgebraicExpressions.arithmeticterms.ArithmeticTerm;
import SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsFactory;
import SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage;
import SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv;
import SATEL.AlgebraicExpressions.arithmeticterms.BOPMinus;
import SATEL.AlgebraicExpressions.arithmeticterms.BOPPlus;
import SATEL.AlgebraicExpressions.arithmeticterms.BOPTimes;
import SATEL.AlgebraicExpressions.arithmeticterms.Depth;
import SATEL.AlgebraicExpressions.arithmeticterms.IntegerValue;
import SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable;
import SATEL.AlgebraicExpressions.arithmeticterms.NBEvents;
import SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus;

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
public class ArithmetictermsPackageImpl extends EPackageImpl implements ArithmetictermsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bopPlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bopMinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bopTimesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bopDivEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nbEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uopMinusEClass = null;

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
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArithmetictermsPackageImpl() {
		super(eNS_URI, ArithmetictermsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArithmetictermsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArithmetictermsPackage init() {
		if (isInited) return (ArithmetictermsPackage)EPackage.Registry.INSTANCE.getEPackage(ArithmetictermsPackage.eNS_URI);

		// Obtain or create and register package
		ArithmetictermsPackageImpl theArithmetictermsPackage = (ArithmetictermsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArithmetictermsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArithmetictermsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SATELPackageImpl theSATELPackage = (SATELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI) instanceof SATELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI) : SATELPackage.eINSTANCE);
		HMLFormulaPackageImpl theHMLFormulaPackage = (HMLFormulaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI) instanceof HMLFormulaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI) : HMLFormulaPackage.eINSTANCE);
		AlgebraicExpressionsPackageImpl theAlgebraicExpressionsPackage = (AlgebraicExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgebraicExpressionsPackage.eNS_URI) instanceof AlgebraicExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgebraicExpressionsPackage.eNS_URI) : AlgebraicExpressionsPackage.eINSTANCE);
		BooleantermsPackageImpl theBooleantermsPackage = (BooleantermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleantermsPackage.eNS_URI) instanceof BooleantermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleantermsPackage.eNS_URI) : BooleantermsPackage.eINSTANCE);
		AlgtermsPackageImpl theAlgtermsPackage = (AlgtermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgtermsPackage.eNS_URI) instanceof AlgtermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgtermsPackage.eNS_URI) : AlgtermsPackage.eINSTANCE);
		VariableDeclarationsPackageImpl theVariableDeclarationsPackage = (VariableDeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariableDeclarationsPackage.eNS_URI) instanceof VariableDeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariableDeclarationsPackage.eNS_URI) : VariableDeclarationsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ApnmmPackageImpl theApnmmPackage = (ApnmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApnmmPackage.eNS_URI) instanceof ApnmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApnmmPackage.eNS_URI) : ApnmmPackage.eINSTANCE);
		EnvironmentmmPackageImpl theEnvironmentmmPackage = (EnvironmentmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvironmentmmPackage.eNS_URI) instanceof EnvironmentmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvironmentmmPackage.eNS_URI) : EnvironmentmmPackage.eINSTANCE);
		GuardmmPackageImpl theGuardmmPackage = (GuardmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuardmmPackage.eNS_URI) instanceof GuardmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuardmmPackage.eNS_URI) : GuardmmPackage.eINSTANCE);
		AdtmmPackageImpl theAdtmmPackage = (AdtmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) instanceof AdtmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) : AdtmmPackage.eINSTANCE);
		MultisetmmPackageImpl theMultisetmmPackage = (MultisetmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MultisetmmPackage.eNS_URI) instanceof MultisetmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MultisetmmPackage.eNS_URI) : MultisetmmPackage.eINSTANCE);

		// Create package meta-data objects
		theArithmetictermsPackage.createPackageContents();
		theSATELPackage.createPackageContents();
		theHMLFormulaPackage.createPackageContents();
		theAlgebraicExpressionsPackage.createPackageContents();
		theBooleantermsPackage.createPackageContents();
		theAlgtermsPackage.createPackageContents();
		theVariableDeclarationsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theApnmmPackage.createPackageContents();
		theEnvironmentmmPackage.createPackageContents();
		theGuardmmPackage.createPackageContents();
		theAdtmmPackage.createPackageContents();
		theMultisetmmPackage.createPackageContents();

		// Initialize created meta-data
		theArithmetictermsPackage.initializePackageContents();
		theSATELPackage.initializePackageContents();
		theHMLFormulaPackage.initializePackageContents();
		theAlgebraicExpressionsPackage.initializePackageContents();
		theBooleantermsPackage.initializePackageContents();
		theAlgtermsPackage.initializePackageContents();
		theVariableDeclarationsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theApnmmPackage.initializePackageContents();
		theEnvironmentmmPackage.initializePackageContents();
		theGuardmmPackage.initializePackageContents();
		theAdtmmPackage.initializePackageContents();
		theMultisetmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArithmetictermsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArithmetictermsPackage.eNS_URI, theArithmetictermsPackage);
		return theArithmetictermsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticTerm() {
		return arithmeticTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable() {
		return integerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerVariable_IntegerVariable() {
		return (EReference)integerVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOPPlus() {
		return bopPlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPPlus_ArithmeticTermL() {
		return (EReference)bopPlusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPPlus_ArithmeticTermR() {
		return (EReference)bopPlusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOPMinus() {
		return bopMinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPMinus_ArithmeticTermL() {
		return (EReference)bopMinusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPMinus_ArithmeticTermR() {
		return (EReference)bopMinusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOPTimes() {
		return bopTimesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPTimes_ArithmeticTermR() {
		return (EReference)bopTimesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPTimes_ArithmeticTermL() {
		return (EReference)bopTimesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOPDiv() {
		return bopDivEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPDiv_ArithmeticTermL() {
		return (EReference)bopDivEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBOPDiv_ArithmeticTermR() {
		return (EReference)bopDivEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNBEvents() {
		return nbEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNBEvents_HmlTerm() {
		return (EReference)nbEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepth() {
		return depthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepth_HmlTerm() {
		return (EReference)depthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUOPMinus() {
		return uopMinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUOPMinus_ArithmeticTerm() {
		return (EReference)uopMinusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetictermsFactory getArithmetictermsFactory() {
		return (ArithmetictermsFactory)getEFactoryInstance();
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
		arithmeticTermEClass = createEClass(ARITHMETIC_TERM);

		integerVariableEClass = createEClass(INTEGER_VARIABLE);
		createEReference(integerVariableEClass, INTEGER_VARIABLE__INTEGER_VARIABLE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		bopPlusEClass = createEClass(BOP_PLUS);
		createEReference(bopPlusEClass, BOP_PLUS__ARITHMETIC_TERM_L);
		createEReference(bopPlusEClass, BOP_PLUS__ARITHMETIC_TERM_R);

		bopMinusEClass = createEClass(BOP_MINUS);
		createEReference(bopMinusEClass, BOP_MINUS__ARITHMETIC_TERM_L);
		createEReference(bopMinusEClass, BOP_MINUS__ARITHMETIC_TERM_R);

		bopTimesEClass = createEClass(BOP_TIMES);
		createEReference(bopTimesEClass, BOP_TIMES__ARITHMETIC_TERM_R);
		createEReference(bopTimesEClass, BOP_TIMES__ARITHMETIC_TERM_L);

		bopDivEClass = createEClass(BOP_DIV);
		createEReference(bopDivEClass, BOP_DIV__ARITHMETIC_TERM_L);
		createEReference(bopDivEClass, BOP_DIV__ARITHMETIC_TERM_R);

		nbEventsEClass = createEClass(NB_EVENTS);
		createEReference(nbEventsEClass, NB_EVENTS__HML_TERM);

		depthEClass = createEClass(DEPTH);
		createEReference(depthEClass, DEPTH__HML_TERM);

		uopMinusEClass = createEClass(UOP_MINUS);
		createEReference(uopMinusEClass, UOP_MINUS__ARITHMETIC_TERM);
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
		VariableDeclarationsPackage theVariableDeclarationsPackage = (VariableDeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(VariableDeclarationsPackage.eNS_URI);
		HMLFormulaPackage theHMLFormulaPackage = (HMLFormulaPackage)EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		integerVariableEClass.getESuperTypes().add(this.getArithmeticTerm());
		integerValueEClass.getESuperTypes().add(this.getArithmeticTerm());
		bopPlusEClass.getESuperTypes().add(this.getArithmeticTerm());
		bopMinusEClass.getESuperTypes().add(this.getArithmeticTerm());
		bopTimesEClass.getESuperTypes().add(this.getArithmeticTerm());
		bopDivEClass.getESuperTypes().add(this.getArithmeticTerm());
		nbEventsEClass.getESuperTypes().add(this.getArithmeticTerm());
		depthEClass.getESuperTypes().add(this.getArithmeticTerm());
		uopMinusEClass.getESuperTypes().add(this.getArithmeticTerm());

		// Initialize classes and features; add operations and parameters
		initEClass(arithmeticTermEClass, ArithmeticTerm.class, "ArithmeticTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerVariableEClass, IntegerVariable.class, "IntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerVariable_IntegerVariable(), theVariableDeclarationsPackage.getPrimitiveIntegerVarDec(), null, "integerVariable", null, 1, 1, IntegerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bopPlusEClass, BOPPlus.class, "BOPPlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOPPlus_ArithmeticTermL(), this.getArithmeticTerm(), null, "arithmeticTermL", null, 1, 1, BOPPlus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBOPPlus_ArithmeticTermR(), this.getArithmeticTerm(), null, "arithmeticTermR", null, 1, 1, BOPPlus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bopMinusEClass, BOPMinus.class, "BOPMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOPMinus_ArithmeticTermL(), this.getArithmeticTerm(), null, "arithmeticTermL", null, 1, 1, BOPMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBOPMinus_ArithmeticTermR(), this.getArithmeticTerm(), null, "arithmeticTermR", null, 1, 1, BOPMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bopTimesEClass, BOPTimes.class, "BOPTimes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOPTimes_ArithmeticTermR(), this.getArithmeticTerm(), null, "arithmeticTermR", null, 1, 1, BOPTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBOPTimes_ArithmeticTermL(), this.getArithmeticTerm(), null, "arithmeticTermL", null, 1, 1, BOPTimes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bopDivEClass, BOPDiv.class, "BOPDiv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBOPDiv_ArithmeticTermL(), this.getArithmeticTerm(), null, "arithmeticTermL", null, 1, 1, BOPDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBOPDiv_ArithmeticTermR(), this.getArithmeticTerm(), null, "arithmeticTermR", null, 1, 1, BOPDiv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nbEventsEClass, NBEvents.class, "NBEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNBEvents_HmlTerm(), theHMLFormulaPackage.getHMLTerm(), null, "hmlTerm", null, 1, 1, NBEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(depthEClass, Depth.class, "Depth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepth_HmlTerm(), theHMLFormulaPackage.getHMLTerm(), null, "hmlTerm", null, 1, 1, Depth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(uopMinusEClass, UOPMinus.class, "UOPMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUOPMinus_ArithmeticTerm(), this.getArithmeticTerm(), null, "arithmeticTerm", null, 1, 1, UOPMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //ArithmetictermsPackageImpl
