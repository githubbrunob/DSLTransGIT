/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLFormulaPackageImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula.impl;

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

import SATEL.HMLFormula.HMLAnd;
import SATEL.HMLFormula.HMLEvent;
import SATEL.HMLFormula.HMLFormula;
import SATEL.HMLFormula.HMLFormulaContent;
import SATEL.HMLFormula.HMLFormulaFactory;
import SATEL.HMLFormula.HMLFormulaHMLFormulaContent;
import SATEL.HMLFormula.HMLFormulaPackage;
import SATEL.HMLFormula.HMLFormulaPrimitiveHMLVarDec;
import SATEL.HMLFormula.HMLNext;
import SATEL.HMLFormula.HMLNot;
import SATEL.HMLFormula.HMLTerm;
import SATEL.HMLFormula.HMLTop;
import SATEL.HMLFormula.InputEvent;
import SATEL.HMLFormula.OutputEvent;
import SATEL.HMLFormula.Parameter;
import SATEL.HMLFormula.SynchronizationEventInputTerm;
import SATEL.HMLFormula.SynchronizationEventOutputTerm;
import SATEL.HMLFormula.SynchronizationInputTerm;
import SATEL.HMLFormula.SynchronizationOutputTerm;
import SATEL.HMLFormula.SynchronizationTerm;
import SATEL.HMLFormula.WPrimitiveObservationVarDec;
import SATEL.HMLFormula.WPrimitiveStimulationVarDec;

import SATEL.SATELPackage;

import SATEL.VariableDeclarations.Types.TypesPackage;

import SATEL.VariableDeclarations.Types.impl.TypesPackageImpl;

import SATEL.VariableDeclarations.VariableDeclarationsPackage;

import SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl;

import SATEL.impl.SATELPackageImpl;

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
public class HMLFormulaPackageImpl extends EPackageImpl implements HMLFormulaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmlTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmlFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmlFormulaHMLFormulaContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmlFormulaPrimitiveHMLVarDecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmlFormulaContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmlNextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmlNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmlAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmlTopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmlEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationInputTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEventInputTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationOutputTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEventOutputTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wPrimitiveObservationVarDecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wPrimitiveStimulationVarDecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEventEClass = null;

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
	 * @see SATEL.HMLFormula.HMLFormulaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HMLFormulaPackageImpl() {
		super(eNS_URI, HMLFormulaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HMLFormulaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HMLFormulaPackage init() {
		if (isInited) return (HMLFormulaPackage)EPackage.Registry.INSTANCE.getEPackage(HMLFormulaPackage.eNS_URI);

		// Obtain or create and register package
		HMLFormulaPackageImpl theHMLFormulaPackage = (HMLFormulaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HMLFormulaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HMLFormulaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SATELPackageImpl theSATELPackage = (SATELPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI) instanceof SATELPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SATELPackage.eNS_URI) : SATELPackage.eINSTANCE);
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
		MultisetmmPackageImpl theMultisetmmPackage = (MultisetmmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MultisetmmPackage.eNS_URI) instanceof MultisetmmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MultisetmmPackage.eNS_URI) : MultisetmmPackage.eINSTANCE);

		// Create package meta-data objects
		theHMLFormulaPackage.createPackageContents();
		theSATELPackage.createPackageContents();
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
		theMultisetmmPackage.createPackageContents();

		// Initialize created meta-data
		theHMLFormulaPackage.initializePackageContents();
		theSATELPackage.initializePackageContents();
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
		theMultisetmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHMLFormulaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HMLFormulaPackage.eNS_URI, theHMLFormulaPackage);
		return theHMLFormulaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMLTerm() {
		return hmlTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMLTerm_HmlFormula() {
		return (EReference)hmlTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMLFormula() {
		return hmlFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMLFormulaHMLFormulaContent() {
		return hmlFormulaHMLFormulaContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMLFormulaHMLFormulaContent_HmlFormulaContent() {
		return (EReference)hmlFormulaHMLFormulaContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMLFormulaPrimitiveHMLVarDec() {
		return hmlFormulaPrimitiveHMLVarDecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMLFormulaPrimitiveHMLVarDec_PrimitiveHMLVarDec() {
		return (EReference)hmlFormulaPrimitiveHMLVarDecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMLFormulaContent() {
		return hmlFormulaContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMLNext() {
		return hmlNextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMLNext_HmlFormulaContent() {
		return (EReference)hmlNextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMLNext_HmlEvent() {
		return (EReference)hmlNextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMLNot() {
		return hmlNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMLNot_HmlFormulaContent() {
		return (EReference)hmlNotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMLAnd() {
		return hmlAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMLAnd_HmlFormulaContentL() {
		return (EReference)hmlAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMLAnd_HmlFormulaContentR() {
		return (EReference)hmlAndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMLTop() {
		return hmlTopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMLEvent() {
		return hmlEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMLEvent_InputTerm() {
		return (EReference)hmlEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMLEvent_OutputTerm() {
		return (EReference)hmlEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationTerm() {
		return synchronizationTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationInputTerm() {
		return synchronizationInputTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationEventInputTerm() {
		return synchronizationEventInputTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationEventInputTerm_Event() {
		return (EReference)synchronizationEventInputTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationEventInputTerm_Parameters() {
		return (EReference)synchronizationEventInputTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationOutputTerm() {
		return synchronizationOutputTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationEventOutputTerm() {
		return synchronizationEventOutputTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationEventOutputTerm_Event() {
		return (EReference)synchronizationEventOutputTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationEventOutputTerm_Parameters() {
		return (EReference)synchronizationEventOutputTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWPrimitiveObservationVarDec() {
		return wPrimitiveObservationVarDecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWPrimitiveObservationVarDec_PrimitiveObservation() {
		return (EReference)wPrimitiveObservationVarDecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWPrimitiveStimulationVarDec() {
		return wPrimitiveStimulationVarDecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWPrimitiveStimulationVarDec_PrimitiveStimulation() {
		return (EReference)wPrimitiveStimulationVarDecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Value() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Next() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputEvent() {
		return inputEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputEvent() {
		return outputEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLFormulaFactory getHMLFormulaFactory() {
		return (HMLFormulaFactory)getEFactoryInstance();
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
		hmlTermEClass = createEClass(HML_TERM);
		createEReference(hmlTermEClass, HML_TERM__HML_FORMULA);

		hmlFormulaEClass = createEClass(HML_FORMULA);

		hmlFormulaHMLFormulaContentEClass = createEClass(HML_FORMULA_HML_FORMULA_CONTENT);
		createEReference(hmlFormulaHMLFormulaContentEClass, HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT);

		hmlFormulaPrimitiveHMLVarDecEClass = createEClass(HML_FORMULA_PRIMITIVE_HML_VAR_DEC);
		createEReference(hmlFormulaPrimitiveHMLVarDecEClass, HML_FORMULA_PRIMITIVE_HML_VAR_DEC__PRIMITIVE_HML_VAR_DEC);

		hmlFormulaContentEClass = createEClass(HML_FORMULA_CONTENT);

		hmlNextEClass = createEClass(HML_NEXT);
		createEReference(hmlNextEClass, HML_NEXT__HML_FORMULA_CONTENT);
		createEReference(hmlNextEClass, HML_NEXT__HML_EVENT);

		hmlNotEClass = createEClass(HML_NOT);
		createEReference(hmlNotEClass, HML_NOT__HML_FORMULA_CONTENT);

		hmlAndEClass = createEClass(HML_AND);
		createEReference(hmlAndEClass, HML_AND__HML_FORMULA_CONTENT_L);
		createEReference(hmlAndEClass, HML_AND__HML_FORMULA_CONTENT_R);

		hmlTopEClass = createEClass(HML_TOP);

		hmlEventEClass = createEClass(HML_EVENT);
		createEReference(hmlEventEClass, HML_EVENT__INPUT_TERM);
		createEReference(hmlEventEClass, HML_EVENT__OUTPUT_TERM);

		synchronizationTermEClass = createEClass(SYNCHRONIZATION_TERM);

		synchronizationInputTermEClass = createEClass(SYNCHRONIZATION_INPUT_TERM);

		synchronizationEventInputTermEClass = createEClass(SYNCHRONIZATION_EVENT_INPUT_TERM);
		createEReference(synchronizationEventInputTermEClass, SYNCHRONIZATION_EVENT_INPUT_TERM__EVENT);
		createEReference(synchronizationEventInputTermEClass, SYNCHRONIZATION_EVENT_INPUT_TERM__PARAMETERS);

		synchronizationOutputTermEClass = createEClass(SYNCHRONIZATION_OUTPUT_TERM);

		synchronizationEventOutputTermEClass = createEClass(SYNCHRONIZATION_EVENT_OUTPUT_TERM);
		createEReference(synchronizationEventOutputTermEClass, SYNCHRONIZATION_EVENT_OUTPUT_TERM__EVENT);
		createEReference(synchronizationEventOutputTermEClass, SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS);

		wPrimitiveObservationVarDecEClass = createEClass(WPRIMITIVE_OBSERVATION_VAR_DEC);
		createEReference(wPrimitiveObservationVarDecEClass, WPRIMITIVE_OBSERVATION_VAR_DEC__PRIMITIVE_OBSERVATION);

		wPrimitiveStimulationVarDecEClass = createEClass(WPRIMITIVE_STIMULATION_VAR_DEC);
		createEReference(wPrimitiveStimulationVarDecEClass, WPRIMITIVE_STIMULATION_VAR_DEC__PRIMITIVE_STIMULATION);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__VALUE);
		createEReference(parameterEClass, PARAMETER__NEXT);

		inputEventEClass = createEClass(INPUT_EVENT);

		outputEventEClass = createEClass(OUTPUT_EVENT);
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
		AlgtermsPackage theAlgtermsPackage = (AlgtermsPackage)EPackage.Registry.INSTANCE.getEPackage(AlgtermsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hmlFormulaHMLFormulaContentEClass.getESuperTypes().add(this.getHMLFormula());
		hmlFormulaPrimitiveHMLVarDecEClass.getESuperTypes().add(this.getHMLFormula());
		hmlNextEClass.getESuperTypes().add(this.getHMLFormulaContent());
		hmlNotEClass.getESuperTypes().add(this.getHMLFormulaContent());
		hmlAndEClass.getESuperTypes().add(this.getHMLFormulaContent());
		hmlTopEClass.getESuperTypes().add(this.getHMLFormulaContent());
		synchronizationInputTermEClass.getESuperTypes().add(this.getSynchronizationTerm());
		synchronizationEventInputTermEClass.getESuperTypes().add(this.getSynchronizationInputTerm());
		synchronizationOutputTermEClass.getESuperTypes().add(this.getSynchronizationTerm());
		synchronizationEventOutputTermEClass.getESuperTypes().add(this.getSynchronizationOutputTerm());
		wPrimitiveObservationVarDecEClass.getESuperTypes().add(this.getSynchronizationOutputTerm());
		wPrimitiveStimulationVarDecEClass.getESuperTypes().add(this.getSynchronizationInputTerm());

		// Initialize classes and features; add operations and parameters
		initEClass(hmlTermEClass, HMLTerm.class, "HMLTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMLTerm_HmlFormula(), this.getHMLFormula(), null, "hmlFormula", null, 1, -1, HMLTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hmlFormulaEClass, HMLFormula.class, "HMLFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hmlFormulaHMLFormulaContentEClass, HMLFormulaHMLFormulaContent.class, "HMLFormulaHMLFormulaContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMLFormulaHMLFormulaContent_HmlFormulaContent(), this.getHMLFormulaContent(), null, "hmlFormulaContent", null, 1, 1, HMLFormulaHMLFormulaContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hmlFormulaPrimitiveHMLVarDecEClass, HMLFormulaPrimitiveHMLVarDec.class, "HMLFormulaPrimitiveHMLVarDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMLFormulaPrimitiveHMLVarDec_PrimitiveHMLVarDec(), theVariableDeclarationsPackage.getPrimitiveHMLVarDec(), null, "primitiveHMLVarDec", null, 1, 1, HMLFormulaPrimitiveHMLVarDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hmlFormulaContentEClass, HMLFormulaContent.class, "HMLFormulaContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hmlNextEClass, HMLNext.class, "HMLNext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMLNext_HmlFormulaContent(), this.getHMLFormulaContent(), null, "hmlFormulaContent", null, 1, 1, HMLNext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHMLNext_HmlEvent(), this.getHMLEvent(), null, "hmlEvent", null, 1, 1, HMLNext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hmlNotEClass, HMLNot.class, "HMLNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMLNot_HmlFormulaContent(), this.getHMLFormulaContent(), null, "hmlFormulaContent", null, 1, 1, HMLNot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hmlAndEClass, HMLAnd.class, "HMLAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMLAnd_HmlFormulaContentL(), this.getHMLFormulaContent(), null, "hmlFormulaContentL", null, 1, 1, HMLAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHMLAnd_HmlFormulaContentR(), this.getHMLFormulaContent(), null, "hmlFormulaContentR", null, 1, 1, HMLAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hmlTopEClass, HMLTop.class, "HMLTop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hmlEventEClass, HMLEvent.class, "HMLEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHMLEvent_InputTerm(), this.getSynchronizationInputTerm(), null, "inputTerm", null, 1, 1, HMLEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHMLEvent_OutputTerm(), this.getSynchronizationOutputTerm(), null, "outputTerm", null, 0, 1, HMLEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(synchronizationTermEClass, SynchronizationTerm.class, "SynchronizationTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronizationInputTermEClass, SynchronizationInputTerm.class, "SynchronizationInputTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronizationEventInputTermEClass, SynchronizationEventInputTerm.class, "SynchronizationEventInputTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizationEventInputTerm_Event(), this.getInputEvent(), null, "event", null, 1, 1, SynchronizationEventInputTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronizationEventInputTerm_Parameters(), this.getParameter(), null, "parameters", null, 0, 1, SynchronizationEventInputTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizationOutputTermEClass, SynchronizationOutputTerm.class, "SynchronizationOutputTerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronizationEventOutputTermEClass, SynchronizationEventOutputTerm.class, "SynchronizationEventOutputTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizationEventOutputTerm_Event(), this.getOutputEvent(), null, "event", null, 1, 1, SynchronizationEventOutputTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronizationEventOutputTerm_Parameters(), this.getParameter(), null, "parameters", null, 0, 1, SynchronizationEventOutputTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wPrimitiveObservationVarDecEClass, WPrimitiveObservationVarDec.class, "WPrimitiveObservationVarDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWPrimitiveObservationVarDec_PrimitiveObservation(), theVariableDeclarationsPackage.getPrimitiveObservationVarDec(), null, "primitiveObservation", null, 1, 1, WPrimitiveObservationVarDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wPrimitiveStimulationVarDecEClass, WPrimitiveStimulationVarDec.class, "WPrimitiveStimulationVarDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWPrimitiveStimulationVarDec_PrimitiveStimulation(), theVariableDeclarationsPackage.getPrimitiveStimulationVarDec(), null, "primitiveStimulation", null, 1, 1, WPrimitiveStimulationVarDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Value(), theAlgtermsPackage.getAlgebraicTerm(), null, "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Next(), this.getParameter(), null, "next", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEventEClass, InputEvent.class, "InputEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputEventEClass, OutputEvent.class, "OutputEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //HMLFormulaPackageImpl
