/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLFormulaPackage.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;

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
 * @see SATEL.HMLFormula.HMLFormulaFactory
 * @model kind="package"
 * @generated
 */
public interface HMLFormulaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HMLFormula";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.HMLFormula";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HMLFormula";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HMLFormulaPackage eINSTANCE = SATEL.HMLFormula.impl.HMLFormulaPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.HMLTermImpl <em>HML Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.HMLTermImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLTerm()
	 * @generated
	 */
	int HML_TERM = 0;

	/**
	 * The feature id for the '<em><b>Hml Formula</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_TERM__HML_FORMULA = 0;

	/**
	 * The number of structural features of the '<em>HML Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_TERM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.HMLFormulaImpl <em>HML Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.HMLFormulaImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLFormula()
	 * @generated
	 */
	int HML_FORMULA = 1;

	/**
	 * The number of structural features of the '<em>HML Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_FORMULA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.HMLFormulaHMLFormulaContentImpl <em>HML Formula Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.HMLFormulaHMLFormulaContentImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLFormulaHMLFormulaContent()
	 * @generated
	 */
	int HML_FORMULA_HML_FORMULA_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Hml Formula Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT = HML_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HML Formula Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_FORMULA_HML_FORMULA_CONTENT_FEATURE_COUNT = HML_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.HMLFormulaPrimitiveHMLVarDecImpl <em>Primitive HML Var Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.HMLFormulaPrimitiveHMLVarDecImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLFormulaPrimitiveHMLVarDec()
	 * @generated
	 */
	int HML_FORMULA_PRIMITIVE_HML_VAR_DEC = 3;

	/**
	 * The feature id for the '<em><b>Primitive HML Var Dec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_FORMULA_PRIMITIVE_HML_VAR_DEC__PRIMITIVE_HML_VAR_DEC = HML_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive HML Var Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_FORMULA_PRIMITIVE_HML_VAR_DEC_FEATURE_COUNT = HML_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.HMLFormulaContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.HMLFormulaContentImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLFormulaContent()
	 * @generated
	 */
	int HML_FORMULA_CONTENT = 4;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_FORMULA_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.HMLNextImpl <em>HML Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.HMLNextImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLNext()
	 * @generated
	 */
	int HML_NEXT = 5;

	/**
	 * The feature id for the '<em><b>Hml Formula Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_NEXT__HML_FORMULA_CONTENT = HML_FORMULA_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hml Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_NEXT__HML_EVENT = HML_FORMULA_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HML Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_NEXT_FEATURE_COUNT = HML_FORMULA_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.HMLNotImpl <em>HML Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.HMLNotImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLNot()
	 * @generated
	 */
	int HML_NOT = 6;

	/**
	 * The feature id for the '<em><b>Hml Formula Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_NOT__HML_FORMULA_CONTENT = HML_FORMULA_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HML Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_NOT_FEATURE_COUNT = HML_FORMULA_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.HMLAndImpl <em>HML And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.HMLAndImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLAnd()
	 * @generated
	 */
	int HML_AND = 7;

	/**
	 * The feature id for the '<em><b>Hml Formula Content L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_AND__HML_FORMULA_CONTENT_L = HML_FORMULA_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hml Formula Content R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_AND__HML_FORMULA_CONTENT_R = HML_FORMULA_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HML And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_AND_FEATURE_COUNT = HML_FORMULA_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.HMLTopImpl <em>HML Top</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.HMLTopImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLTop()
	 * @generated
	 */
	int HML_TOP = 8;

	/**
	 * The number of structural features of the '<em>HML Top</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_TOP_FEATURE_COUNT = HML_FORMULA_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.HMLEventImpl <em>HML Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.HMLEventImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLEvent()
	 * @generated
	 */
	int HML_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Input Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_EVENT__INPUT_TERM = 0;

	/**
	 * The feature id for the '<em><b>Output Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_EVENT__OUTPUT_TERM = 1;

	/**
	 * The number of structural features of the '<em>HML Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_EVENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.SynchronizationTermImpl <em>Synchronization Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.SynchronizationTermImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getSynchronizationTerm()
	 * @generated
	 */
	int SYNCHRONIZATION_TERM = 10;

	/**
	 * The number of structural features of the '<em>Synchronization Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_TERM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.SynchronizationInputTermImpl <em>Synchronization Input Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.SynchronizationInputTermImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getSynchronizationInputTerm()
	 * @generated
	 */
	int SYNCHRONIZATION_INPUT_TERM = 11;

	/**
	 * The number of structural features of the '<em>Synchronization Input Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_INPUT_TERM_FEATURE_COUNT = SYNCHRONIZATION_TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.SynchronizationEventInputTermImpl <em>Synchronization Event Input Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.SynchronizationEventInputTermImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getSynchronizationEventInputTerm()
	 * @generated
	 */
	int SYNCHRONIZATION_EVENT_INPUT_TERM = 12;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT_INPUT_TERM__EVENT = SYNCHRONIZATION_INPUT_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT_INPUT_TERM__PARAMETERS = SYNCHRONIZATION_INPUT_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronization Event Input Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT_INPUT_TERM_FEATURE_COUNT = SYNCHRONIZATION_INPUT_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.SynchronizationOutputTermImpl <em>Synchronization Output Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.SynchronizationOutputTermImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getSynchronizationOutputTerm()
	 * @generated
	 */
	int SYNCHRONIZATION_OUTPUT_TERM = 13;

	/**
	 * The number of structural features of the '<em>Synchronization Output Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_OUTPUT_TERM_FEATURE_COUNT = SYNCHRONIZATION_TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.SynchronizationEventOutputTermImpl <em>Synchronization Event Output Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.SynchronizationEventOutputTermImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getSynchronizationEventOutputTerm()
	 * @generated
	 */
	int SYNCHRONIZATION_EVENT_OUTPUT_TERM = 14;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT_OUTPUT_TERM__EVENT = SYNCHRONIZATION_OUTPUT_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS = SYNCHRONIZATION_OUTPUT_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronization Event Output Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_EVENT_OUTPUT_TERM_FEATURE_COUNT = SYNCHRONIZATION_OUTPUT_TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.WPrimitiveObservationVarDecImpl <em>WPrimitive Observation Var Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.WPrimitiveObservationVarDecImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getWPrimitiveObservationVarDec()
	 * @generated
	 */
	int WPRIMITIVE_OBSERVATION_VAR_DEC = 15;

	/**
	 * The feature id for the '<em><b>Primitive Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPRIMITIVE_OBSERVATION_VAR_DEC__PRIMITIVE_OBSERVATION = SYNCHRONIZATION_OUTPUT_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WPrimitive Observation Var Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPRIMITIVE_OBSERVATION_VAR_DEC_FEATURE_COUNT = SYNCHRONIZATION_OUTPUT_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.WPrimitiveStimulationVarDecImpl <em>WPrimitive Stimulation Var Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.WPrimitiveStimulationVarDecImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getWPrimitiveStimulationVarDec()
	 * @generated
	 */
	int WPRIMITIVE_STIMULATION_VAR_DEC = 16;

	/**
	 * The feature id for the '<em><b>Primitive Stimulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPRIMITIVE_STIMULATION_VAR_DEC__PRIMITIVE_STIMULATION = SYNCHRONIZATION_INPUT_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>WPrimitive Stimulation Var Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPRIMITIVE_STIMULATION_VAR_DEC_FEATURE_COUNT = SYNCHRONIZATION_INPUT_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.ParameterImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.InputEventImpl <em>Input Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.InputEventImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getInputEvent()
	 * @generated
	 */
	int INPUT_EVENT = 18;

	/**
	 * The number of structural features of the '<em>Input Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_EVENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.HMLFormula.impl.OutputEventImpl <em>Output Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.HMLFormula.impl.OutputEventImpl
	 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getOutputEvent()
	 * @generated
	 */
	int OUTPUT_EVENT = 19;

	/**
	 * The number of structural features of the '<em>Output Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_EVENT_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.HMLTerm <em>HML Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HML Term</em>'.
	 * @see SATEL.HMLFormula.HMLTerm
	 * @generated
	 */
	EClass getHMLTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.HMLFormula.HMLTerm#getHmlFormula <em>Hml Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hml Formula</em>'.
	 * @see SATEL.HMLFormula.HMLTerm#getHmlFormula()
	 * @see #getHMLTerm()
	 * @generated
	 */
	EReference getHMLTerm_HmlFormula();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.HMLFormula <em>HML Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HML Formula</em>'.
	 * @see SATEL.HMLFormula.HMLFormula
	 * @generated
	 */
	EClass getHMLFormula();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.HMLFormulaHMLFormulaContent <em>HML Formula Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HML Formula Content</em>'.
	 * @see SATEL.HMLFormula.HMLFormulaHMLFormulaContent
	 * @generated
	 */
	EClass getHMLFormulaHMLFormulaContent();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.HMLFormulaHMLFormulaContent#getHmlFormulaContent <em>Hml Formula Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Formula Content</em>'.
	 * @see SATEL.HMLFormula.HMLFormulaHMLFormulaContent#getHmlFormulaContent()
	 * @see #getHMLFormulaHMLFormulaContent()
	 * @generated
	 */
	EReference getHMLFormulaHMLFormulaContent_HmlFormulaContent();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.HMLFormulaPrimitiveHMLVarDec <em>Primitive HML Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive HML Var Dec</em>'.
	 * @see SATEL.HMLFormula.HMLFormulaPrimitiveHMLVarDec
	 * @generated
	 */
	EClass getHMLFormulaPrimitiveHMLVarDec();

	/**
	 * Returns the meta object for the reference '{@link SATEL.HMLFormula.HMLFormulaPrimitiveHMLVarDec#getPrimitiveHMLVarDec <em>Primitive HML Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive HML Var Dec</em>'.
	 * @see SATEL.HMLFormula.HMLFormulaPrimitiveHMLVarDec#getPrimitiveHMLVarDec()
	 * @see #getHMLFormulaPrimitiveHMLVarDec()
	 * @generated
	 */
	EReference getHMLFormulaPrimitiveHMLVarDec_PrimitiveHMLVarDec();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.HMLFormulaContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see SATEL.HMLFormula.HMLFormulaContent
	 * @generated
	 */
	EClass getHMLFormulaContent();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.HMLNext <em>HML Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HML Next</em>'.
	 * @see SATEL.HMLFormula.HMLNext
	 * @generated
	 */
	EClass getHMLNext();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.HMLNext#getHmlFormulaContent <em>Hml Formula Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Formula Content</em>'.
	 * @see SATEL.HMLFormula.HMLNext#getHmlFormulaContent()
	 * @see #getHMLNext()
	 * @generated
	 */
	EReference getHMLNext_HmlFormulaContent();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.HMLNext#getHmlEvent <em>Hml Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Event</em>'.
	 * @see SATEL.HMLFormula.HMLNext#getHmlEvent()
	 * @see #getHMLNext()
	 * @generated
	 */
	EReference getHMLNext_HmlEvent();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.HMLNot <em>HML Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HML Not</em>'.
	 * @see SATEL.HMLFormula.HMLNot
	 * @generated
	 */
	EClass getHMLNot();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.HMLNot#getHmlFormulaContent <em>Hml Formula Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Formula Content</em>'.
	 * @see SATEL.HMLFormula.HMLNot#getHmlFormulaContent()
	 * @see #getHMLNot()
	 * @generated
	 */
	EReference getHMLNot_HmlFormulaContent();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.HMLAnd <em>HML And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HML And</em>'.
	 * @see SATEL.HMLFormula.HMLAnd
	 * @generated
	 */
	EClass getHMLAnd();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.HMLAnd#getHmlFormulaContentL <em>Hml Formula Content L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Formula Content L</em>'.
	 * @see SATEL.HMLFormula.HMLAnd#getHmlFormulaContentL()
	 * @see #getHMLAnd()
	 * @generated
	 */
	EReference getHMLAnd_HmlFormulaContentL();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.HMLAnd#getHmlFormulaContentR <em>Hml Formula Content R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Formula Content R</em>'.
	 * @see SATEL.HMLFormula.HMLAnd#getHmlFormulaContentR()
	 * @see #getHMLAnd()
	 * @generated
	 */
	EReference getHMLAnd_HmlFormulaContentR();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.HMLTop <em>HML Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HML Top</em>'.
	 * @see SATEL.HMLFormula.HMLTop
	 * @generated
	 */
	EClass getHMLTop();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.HMLEvent <em>HML Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HML Event</em>'.
	 * @see SATEL.HMLFormula.HMLEvent
	 * @generated
	 */
	EClass getHMLEvent();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.HMLEvent#getInputTerm <em>Input Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Term</em>'.
	 * @see SATEL.HMLFormula.HMLEvent#getInputTerm()
	 * @see #getHMLEvent()
	 * @generated
	 */
	EReference getHMLEvent_InputTerm();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.HMLEvent#getOutputTerm <em>Output Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Term</em>'.
	 * @see SATEL.HMLFormula.HMLEvent#getOutputTerm()
	 * @see #getHMLEvent()
	 * @generated
	 */
	EReference getHMLEvent_OutputTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.SynchronizationTerm <em>Synchronization Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Term</em>'.
	 * @see SATEL.HMLFormula.SynchronizationTerm
	 * @generated
	 */
	EClass getSynchronizationTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.SynchronizationInputTerm <em>Synchronization Input Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Input Term</em>'.
	 * @see SATEL.HMLFormula.SynchronizationInputTerm
	 * @generated
	 */
	EClass getSynchronizationInputTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.SynchronizationEventInputTerm <em>Synchronization Event Input Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Event Input Term</em>'.
	 * @see SATEL.HMLFormula.SynchronizationEventInputTerm
	 * @generated
	 */
	EClass getSynchronizationEventInputTerm();

	/**
	 * Returns the meta object for the reference '{@link SATEL.HMLFormula.SynchronizationEventInputTerm#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see SATEL.HMLFormula.SynchronizationEventInputTerm#getEvent()
	 * @see #getSynchronizationEventInputTerm()
	 * @generated
	 */
	EReference getSynchronizationEventInputTerm_Event();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.SynchronizationEventInputTerm#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see SATEL.HMLFormula.SynchronizationEventInputTerm#getParameters()
	 * @see #getSynchronizationEventInputTerm()
	 * @generated
	 */
	EReference getSynchronizationEventInputTerm_Parameters();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.SynchronizationOutputTerm <em>Synchronization Output Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Output Term</em>'.
	 * @see SATEL.HMLFormula.SynchronizationOutputTerm
	 * @generated
	 */
	EClass getSynchronizationOutputTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.SynchronizationEventOutputTerm <em>Synchronization Event Output Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Event Output Term</em>'.
	 * @see SATEL.HMLFormula.SynchronizationEventOutputTerm
	 * @generated
	 */
	EClass getSynchronizationEventOutputTerm();

	/**
	 * Returns the meta object for the reference '{@link SATEL.HMLFormula.SynchronizationEventOutputTerm#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see SATEL.HMLFormula.SynchronizationEventOutputTerm#getEvent()
	 * @see #getSynchronizationEventOutputTerm()
	 * @generated
	 */
	EReference getSynchronizationEventOutputTerm_Event();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.SynchronizationEventOutputTerm#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see SATEL.HMLFormula.SynchronizationEventOutputTerm#getParameters()
	 * @see #getSynchronizationEventOutputTerm()
	 * @generated
	 */
	EReference getSynchronizationEventOutputTerm_Parameters();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.WPrimitiveObservationVarDec <em>WPrimitive Observation Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WPrimitive Observation Var Dec</em>'.
	 * @see SATEL.HMLFormula.WPrimitiveObservationVarDec
	 * @generated
	 */
	EClass getWPrimitiveObservationVarDec();

	/**
	 * Returns the meta object for the reference '{@link SATEL.HMLFormula.WPrimitiveObservationVarDec#getPrimitiveObservation <em>Primitive Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Observation</em>'.
	 * @see SATEL.HMLFormula.WPrimitiveObservationVarDec#getPrimitiveObservation()
	 * @see #getWPrimitiveObservationVarDec()
	 * @generated
	 */
	EReference getWPrimitiveObservationVarDec_PrimitiveObservation();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.WPrimitiveStimulationVarDec <em>WPrimitive Stimulation Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WPrimitive Stimulation Var Dec</em>'.
	 * @see SATEL.HMLFormula.WPrimitiveStimulationVarDec
	 * @generated
	 */
	EClass getWPrimitiveStimulationVarDec();

	/**
	 * Returns the meta object for the reference '{@link SATEL.HMLFormula.WPrimitiveStimulationVarDec#getPrimitiveStimulation <em>Primitive Stimulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Stimulation</em>'.
	 * @see SATEL.HMLFormula.WPrimitiveStimulationVarDec#getPrimitiveStimulation()
	 * @see #getWPrimitiveStimulationVarDec()
	 * @generated
	 */
	EReference getWPrimitiveStimulationVarDec_PrimitiveStimulation();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see SATEL.HMLFormula.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see SATEL.HMLFormula.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Value();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.HMLFormula.Parameter#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see SATEL.HMLFormula.Parameter#getNext()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Next();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.InputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Event</em>'.
	 * @see SATEL.HMLFormula.InputEvent
	 * @generated
	 */
	EClass getInputEvent();

	/**
	 * Returns the meta object for class '{@link SATEL.HMLFormula.OutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Event</em>'.
	 * @see SATEL.HMLFormula.OutputEvent
	 * @generated
	 */
	EClass getOutputEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HMLFormulaFactory getHMLFormulaFactory();

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
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.HMLTermImpl <em>HML Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.HMLTermImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLTerm()
		 * @generated
		 */
		EClass HML_TERM = eINSTANCE.getHMLTerm();

		/**
		 * The meta object literal for the '<em><b>Hml Formula</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_TERM__HML_FORMULA = eINSTANCE.getHMLTerm_HmlFormula();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.HMLFormulaImpl <em>HML Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.HMLFormulaImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLFormula()
		 * @generated
		 */
		EClass HML_FORMULA = eINSTANCE.getHMLFormula();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.HMLFormulaHMLFormulaContentImpl <em>HML Formula Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.HMLFormulaHMLFormulaContentImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLFormulaHMLFormulaContent()
		 * @generated
		 */
		EClass HML_FORMULA_HML_FORMULA_CONTENT = eINSTANCE.getHMLFormulaHMLFormulaContent();

		/**
		 * The meta object literal for the '<em><b>Hml Formula Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_FORMULA_HML_FORMULA_CONTENT__HML_FORMULA_CONTENT = eINSTANCE.getHMLFormulaHMLFormulaContent_HmlFormulaContent();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.HMLFormulaPrimitiveHMLVarDecImpl <em>Primitive HML Var Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.HMLFormulaPrimitiveHMLVarDecImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLFormulaPrimitiveHMLVarDec()
		 * @generated
		 */
		EClass HML_FORMULA_PRIMITIVE_HML_VAR_DEC = eINSTANCE.getHMLFormulaPrimitiveHMLVarDec();

		/**
		 * The meta object literal for the '<em><b>Primitive HML Var Dec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_FORMULA_PRIMITIVE_HML_VAR_DEC__PRIMITIVE_HML_VAR_DEC = eINSTANCE.getHMLFormulaPrimitiveHMLVarDec_PrimitiveHMLVarDec();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.HMLFormulaContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.HMLFormulaContentImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLFormulaContent()
		 * @generated
		 */
		EClass HML_FORMULA_CONTENT = eINSTANCE.getHMLFormulaContent();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.HMLNextImpl <em>HML Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.HMLNextImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLNext()
		 * @generated
		 */
		EClass HML_NEXT = eINSTANCE.getHMLNext();

		/**
		 * The meta object literal for the '<em><b>Hml Formula Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_NEXT__HML_FORMULA_CONTENT = eINSTANCE.getHMLNext_HmlFormulaContent();

		/**
		 * The meta object literal for the '<em><b>Hml Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_NEXT__HML_EVENT = eINSTANCE.getHMLNext_HmlEvent();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.HMLNotImpl <em>HML Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.HMLNotImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLNot()
		 * @generated
		 */
		EClass HML_NOT = eINSTANCE.getHMLNot();

		/**
		 * The meta object literal for the '<em><b>Hml Formula Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_NOT__HML_FORMULA_CONTENT = eINSTANCE.getHMLNot_HmlFormulaContent();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.HMLAndImpl <em>HML And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.HMLAndImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLAnd()
		 * @generated
		 */
		EClass HML_AND = eINSTANCE.getHMLAnd();

		/**
		 * The meta object literal for the '<em><b>Hml Formula Content L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_AND__HML_FORMULA_CONTENT_L = eINSTANCE.getHMLAnd_HmlFormulaContentL();

		/**
		 * The meta object literal for the '<em><b>Hml Formula Content R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_AND__HML_FORMULA_CONTENT_R = eINSTANCE.getHMLAnd_HmlFormulaContentR();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.HMLTopImpl <em>HML Top</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.HMLTopImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLTop()
		 * @generated
		 */
		EClass HML_TOP = eINSTANCE.getHMLTop();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.HMLEventImpl <em>HML Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.HMLEventImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getHMLEvent()
		 * @generated
		 */
		EClass HML_EVENT = eINSTANCE.getHMLEvent();

		/**
		 * The meta object literal for the '<em><b>Input Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_EVENT__INPUT_TERM = eINSTANCE.getHMLEvent_InputTerm();

		/**
		 * The meta object literal for the '<em><b>Output Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_EVENT__OUTPUT_TERM = eINSTANCE.getHMLEvent_OutputTerm();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.SynchronizationTermImpl <em>Synchronization Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.SynchronizationTermImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getSynchronizationTerm()
		 * @generated
		 */
		EClass SYNCHRONIZATION_TERM = eINSTANCE.getSynchronizationTerm();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.SynchronizationInputTermImpl <em>Synchronization Input Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.SynchronizationInputTermImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getSynchronizationInputTerm()
		 * @generated
		 */
		EClass SYNCHRONIZATION_INPUT_TERM = eINSTANCE.getSynchronizationInputTerm();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.SynchronizationEventInputTermImpl <em>Synchronization Event Input Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.SynchronizationEventInputTermImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getSynchronizationEventInputTerm()
		 * @generated
		 */
		EClass SYNCHRONIZATION_EVENT_INPUT_TERM = eINSTANCE.getSynchronizationEventInputTerm();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_EVENT_INPUT_TERM__EVENT = eINSTANCE.getSynchronizationEventInputTerm_Event();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_EVENT_INPUT_TERM__PARAMETERS = eINSTANCE.getSynchronizationEventInputTerm_Parameters();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.SynchronizationOutputTermImpl <em>Synchronization Output Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.SynchronizationOutputTermImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getSynchronizationOutputTerm()
		 * @generated
		 */
		EClass SYNCHRONIZATION_OUTPUT_TERM = eINSTANCE.getSynchronizationOutputTerm();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.SynchronizationEventOutputTermImpl <em>Synchronization Event Output Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.SynchronizationEventOutputTermImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getSynchronizationEventOutputTerm()
		 * @generated
		 */
		EClass SYNCHRONIZATION_EVENT_OUTPUT_TERM = eINSTANCE.getSynchronizationEventOutputTerm();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_EVENT_OUTPUT_TERM__EVENT = eINSTANCE.getSynchronizationEventOutputTerm_Event();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION_EVENT_OUTPUT_TERM__PARAMETERS = eINSTANCE.getSynchronizationEventOutputTerm_Parameters();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.WPrimitiveObservationVarDecImpl <em>WPrimitive Observation Var Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.WPrimitiveObservationVarDecImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getWPrimitiveObservationVarDec()
		 * @generated
		 */
		EClass WPRIMITIVE_OBSERVATION_VAR_DEC = eINSTANCE.getWPrimitiveObservationVarDec();

		/**
		 * The meta object literal for the '<em><b>Primitive Observation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPRIMITIVE_OBSERVATION_VAR_DEC__PRIMITIVE_OBSERVATION = eINSTANCE.getWPrimitiveObservationVarDec_PrimitiveObservation();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.WPrimitiveStimulationVarDecImpl <em>WPrimitive Stimulation Var Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.WPrimitiveStimulationVarDecImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getWPrimitiveStimulationVarDec()
		 * @generated
		 */
		EClass WPRIMITIVE_STIMULATION_VAR_DEC = eINSTANCE.getWPrimitiveStimulationVarDec();

		/**
		 * The meta object literal for the '<em><b>Primitive Stimulation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPRIMITIVE_STIMULATION_VAR_DEC__PRIMITIVE_STIMULATION = eINSTANCE.getWPrimitiveStimulationVarDec_PrimitiveStimulation();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.ParameterImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__NEXT = eINSTANCE.getParameter_Next();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.InputEventImpl <em>Input Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.InputEventImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getInputEvent()
		 * @generated
		 */
		EClass INPUT_EVENT = eINSTANCE.getInputEvent();

		/**
		 * The meta object literal for the '{@link SATEL.HMLFormula.impl.OutputEventImpl <em>Output Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.HMLFormula.impl.OutputEventImpl
		 * @see SATEL.HMLFormula.impl.HMLFormulaPackageImpl#getOutputEvent()
		 * @generated
		 */
		EClass OUTPUT_EVENT = eINSTANCE.getOutputEvent();

	}

} //HMLFormulaPackage
