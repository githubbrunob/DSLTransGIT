/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableDeclarationsPackageImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.VariableDeclarations.impl;

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

import SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage;

import SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsPackageImpl;

import SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl;

import SATEL.HMLFormula.HMLFormulaPackage;

import SATEL.HMLFormula.impl.HMLFormulaPackageImpl;

import SATEL.SATELPackage;

import SATEL.VariableDeclarations.AlgebraicSortVarDec;
import SATEL.VariableDeclarations.PrimitiveBooleanVarDec;
import SATEL.VariableDeclarations.PrimitiveHMLVarDec;
import SATEL.VariableDeclarations.PrimitiveIntegerVarDec;
import SATEL.VariableDeclarations.PrimitiveObservationVarDec;
import SATEL.VariableDeclarations.PrimitiveStimulationVarDec;

import SATEL.VariableDeclarations.Types.TypesPackage;

import SATEL.VariableDeclarations.Types.impl.TypesPackageImpl;

import SATEL.VariableDeclarations.VariableDec;
import SATEL.VariableDeclarations.VariableDeclaration;
import SATEL.VariableDeclarations.VariableDeclarationsFactory;
import SATEL.VariableDeclarations.VariableDeclarationsPackage;

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
public class VariableDeclarationsPackageImpl extends EPackageImpl implements VariableDeclarationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveHMLVarDecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveStimulationVarDecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveObservationVarDecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveIntegerVarDecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveBooleanVarDecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algebraicSortVarDecEClass = null;

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
	 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VariableDeclarationsPackageImpl() {
		super(eNS_URI, VariableDeclarationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VariableDeclarationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VariableDeclarationsPackage init() {
		if (isInited) return (VariableDeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(VariableDeclarationsPackage.eNS_URI);

		// Obtain or create and register package
		VariableDeclarationsPackageImpl theVariableDeclarationsPackage = (VariableDeclarationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VariableDeclarationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VariableDeclarationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SATELPackageImpl theSATELPackage = (SATELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI) instanceof SATELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI) : SATELPackage.eINSTANCE);
		HMLFormulaPackageImpl theHMLFormulaPackage = (HMLFormulaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI) instanceof HMLFormulaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI) : HMLFormulaPackage.eINSTANCE);
		AlgebraicExpressionsPackageImpl theAlgebraicExpressionsPackage = (AlgebraicExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgebraicExpressionsPackage.eNS_URI) instanceof AlgebraicExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgebraicExpressionsPackage.eNS_URI) : AlgebraicExpressionsPackage.eINSTANCE);
		BooleantermsPackageImpl theBooleantermsPackage = (BooleantermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleantermsPackage.eNS_URI) instanceof BooleantermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleantermsPackage.eNS_URI) : BooleantermsPackage.eINSTANCE);
		ArithmetictermsPackageImpl theArithmetictermsPackage = (ArithmetictermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArithmetictermsPackage.eNS_URI) instanceof ArithmetictermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArithmetictermsPackage.eNS_URI) : ArithmetictermsPackage.eINSTANCE);
		AlgtermsPackageImpl theAlgtermsPackage = (AlgtermsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AlgtermsPackage.eNS_URI) instanceof AlgtermsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AlgtermsPackage.eNS_URI) : AlgtermsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ApnmmPackageImpl theApnmmPackage = (ApnmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApnmmPackage.eNS_URI) instanceof ApnmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApnmmPackage.eNS_URI) : ApnmmPackage.eINSTANCE);
		EnvironmentmmPackageImpl theEnvironmentmmPackage = (EnvironmentmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnvironmentmmPackage.eNS_URI) instanceof EnvironmentmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnvironmentmmPackage.eNS_URI) : EnvironmentmmPackage.eINSTANCE);
		GuardmmPackageImpl theGuardmmPackage = (GuardmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuardmmPackage.eNS_URI) instanceof GuardmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuardmmPackage.eNS_URI) : GuardmmPackage.eINSTANCE);
		AdtmmPackageImpl theAdtmmPackage = (AdtmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) instanceof AdtmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI) : AdtmmPackage.eINSTANCE);
		MultisetmmPackageImpl theMultisetmmPackage = (MultisetmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MultisetmmPackage.eNS_URI) instanceof MultisetmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MultisetmmPackage.eNS_URI) : MultisetmmPackage.eINSTANCE);

		// Create package meta-data objects
		theVariableDeclarationsPackage.createPackageContents();
		theSATELPackage.createPackageContents();
		theHMLFormulaPackage.createPackageContents();
		theAlgebraicExpressionsPackage.createPackageContents();
		theBooleantermsPackage.createPackageContents();
		theArithmetictermsPackage.createPackageContents();
		theAlgtermsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theApnmmPackage.createPackageContents();
		theEnvironmentmmPackage.createPackageContents();
		theGuardmmPackage.createPackageContents();
		theAdtmmPackage.createPackageContents();
		theMultisetmmPackage.createPackageContents();

		// Initialize created meta-data
		theVariableDeclarationsPackage.initializePackageContents();
		theSATELPackage.initializePackageContents();
		theHMLFormulaPackage.initializePackageContents();
		theAlgebraicExpressionsPackage.initializePackageContents();
		theBooleantermsPackage.initializePackageContents();
		theArithmetictermsPackage.initializePackageContents();
		theAlgtermsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theApnmmPackage.initializePackageContents();
		theEnvironmentmmPackage.initializePackageContents();
		theGuardmmPackage.initializePackageContents();
		theAdtmmPackage.initializePackageContents();
		theMultisetmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVariableDeclarationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VariableDeclarationsPackage.eNS_URI, theVariableDeclarationsPackage);
		return theVariableDeclarationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Variable() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDec() {
		return variableDecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDec_Name() {
		return (EAttribute)variableDecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveHMLVarDec() {
		return primitiveHMLVarDecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveHMLVarDec_Type() {
		return (EReference)primitiveHMLVarDecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveStimulationVarDec() {
		return primitiveStimulationVarDecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveStimulationVarDec_Type() {
		return (EReference)primitiveStimulationVarDecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveObservationVarDec() {
		return primitiveObservationVarDecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveObservationVarDec_Type() {
		return (EReference)primitiveObservationVarDecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveIntegerVarDec() {
		return primitiveIntegerVarDecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveIntegerVarDec_Type() {
		return (EReference)primitiveIntegerVarDecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveBooleanVarDec() {
		return primitiveBooleanVarDecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveBooleanVarDec_Type() {
		return (EReference)primitiveBooleanVarDecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgebraicSortVarDec() {
		return algebraicSortVarDecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgebraicSortVarDec_Type() {
		return (EReference)algebraicSortVarDecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationsFactory getVariableDeclarationsFactory() {
		return (VariableDeclarationsFactory)getEFactoryInstance();
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
		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE);

		variableDecEClass = createEClass(VARIABLE_DEC);
		createEAttribute(variableDecEClass, VARIABLE_DEC__NAME);

		primitiveHMLVarDecEClass = createEClass(PRIMITIVE_HML_VAR_DEC);
		createEReference(primitiveHMLVarDecEClass, PRIMITIVE_HML_VAR_DEC__TYPE);

		primitiveStimulationVarDecEClass = createEClass(PRIMITIVE_STIMULATION_VAR_DEC);
		createEReference(primitiveStimulationVarDecEClass, PRIMITIVE_STIMULATION_VAR_DEC__TYPE);

		primitiveObservationVarDecEClass = createEClass(PRIMITIVE_OBSERVATION_VAR_DEC);
		createEReference(primitiveObservationVarDecEClass, PRIMITIVE_OBSERVATION_VAR_DEC__TYPE);

		primitiveIntegerVarDecEClass = createEClass(PRIMITIVE_INTEGER_VAR_DEC);
		createEReference(primitiveIntegerVarDecEClass, PRIMITIVE_INTEGER_VAR_DEC__TYPE);

		primitiveBooleanVarDecEClass = createEClass(PRIMITIVE_BOOLEAN_VAR_DEC);
		createEReference(primitiveBooleanVarDecEClass, PRIMITIVE_BOOLEAN_VAR_DEC__TYPE);

		algebraicSortVarDecEClass = createEClass(ALGEBRAIC_SORT_VAR_DEC);
		createEReference(algebraicSortVarDecEClass, ALGEBRAIC_SORT_VAR_DEC__TYPE);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		AdtmmPackage theAdtmmPackage = (AdtmmPackage)EPackage.Registry.INSTANCE.getEPackage(AdtmmPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTypesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		primitiveHMLVarDecEClass.getESuperTypes().add(this.getVariableDec());
		primitiveStimulationVarDecEClass.getESuperTypes().add(this.getVariableDec());
		primitiveObservationVarDecEClass.getESuperTypes().add(this.getVariableDec());
		primitiveIntegerVarDecEClass.getESuperTypes().add(this.getVariableDec());
		primitiveBooleanVarDecEClass.getESuperTypes().add(this.getVariableDec());
		algebraicSortVarDecEClass.getESuperTypes().add(this.getVariableDec());

		// Initialize classes and features; add operations and parameters
		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDeclaration_Variable(), this.getVariableDec(), null, "variable", null, 0, -1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableDecEClass, VariableDec.class, "VariableDec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableDec_Name(), ecorePackage.getEString(), "name", null, 1, 1, VariableDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveHMLVarDecEClass, PrimitiveHMLVarDec.class, "PrimitiveHMLVarDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveHMLVarDec_Type(), theTypesPackage.getPrimitiveHML(), null, "type", null, 0, 1, PrimitiveHMLVarDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveStimulationVarDecEClass, PrimitiveStimulationVarDec.class, "PrimitiveStimulationVarDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveStimulationVarDec_Type(), theTypesPackage.getPrimitiveStimulation(), null, "type", null, 0, 1, PrimitiveStimulationVarDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveObservationVarDecEClass, PrimitiveObservationVarDec.class, "PrimitiveObservationVarDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveObservationVarDec_Type(), theTypesPackage.getPrimitiveObservation(), null, "type", null, 0, 1, PrimitiveObservationVarDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveIntegerVarDecEClass, PrimitiveIntegerVarDec.class, "PrimitiveIntegerVarDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveIntegerVarDec_Type(), theTypesPackage.getPrimitiveInteger(), null, "type", null, 0, 1, PrimitiveIntegerVarDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveBooleanVarDecEClass, PrimitiveBooleanVarDec.class, "PrimitiveBooleanVarDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveBooleanVarDec_Type(), theTypesPackage.getPrimitiveBoolean(), null, "type", null, 0, 1, PrimitiveBooleanVarDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(algebraicSortVarDecEClass, AlgebraicSortVarDec.class, "AlgebraicSortVarDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgebraicSortVarDec_Type(), theAdtmmPackage.getSortDeclaration(), null, "type", null, 1, 1, AlgebraicSortVarDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //VariableDeclarationsPackageImpl
