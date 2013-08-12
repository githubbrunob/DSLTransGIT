/**
 * <copyright>
 * </copyright>
 *
 * $Id: ApnmmPackage.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.apnmm;

import SATEL.APN.environmentmm.EnvironmentmmPackage;

import SATEL.HMLFormula.HMLFormulaPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see SATEL.APN.apnmm.ApnmmFactory
 * @model kind="package"
 *        annotation="Static_checks 0='an arc must go from a transition to a place, or from a place to a transition' 1='Check that there is at least one place' 2='Check arc sort' 3='Check that the variables in the post conditions and guards are present in the preconditions'"
 * @generated
 */
public interface ApnmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apnmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.APN.apnmm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apnmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApnmmPackage eINSTANCE = SATEL.APN.apnmm.impl.ApnmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.APN.apnmm.impl.APNImpl <em>APN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.apnmm.impl.APNImpl
	 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getAPN()
	 * @generated
	 */
	int APN = 0;

	/**
	 * The feature id for the '<em><b>Owned Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APN__OWNED_PLACES = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APN__OWNED_ARCS = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APN__OWNED_VARIABLES = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APN__NAME = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APN__METHODS = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APN__GATES = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APN__OWNED_TRANSITIONS = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>APN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APN_FEATURE_COUNT = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link SATEL.APN.apnmm.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.apnmm.impl.NodeImpl
	 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.APN.apnmm.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.apnmm.impl.ArcImpl
	 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TO = 1;

	/**
	 * The feature id for the '<em><b>Owned Arc Multiset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__OWNED_ARC_MULTISET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = 3;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link SATEL.APN.apnmm.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.apnmm.impl.PlaceImpl
	 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Place Multiset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OWNED_PLACE_MULTISET = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__SORT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.APN.apnmm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.apnmm.impl.TransitionImpl
	 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Owned Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNED_GUARD = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gate Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GATE_CALLS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__METHOD_CALL = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SATEL.APN.apnmm.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.apnmm.impl.MethodImpl
	 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = HMLFormulaPackage.INPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = HMLFormulaPackage.INPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.APN.apnmm.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.apnmm.impl.GateImpl
	 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = HMLFormulaPackage.OUTPUT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = HMLFormulaPackage.OUTPUT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.APN.apnmm.impl.GateCallImpl <em>Gate Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.apnmm.impl.GateCallImpl
	 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getGateCall()
	 * @generated
	 */
	int GATE_CALL = 7;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_CALL__GATE = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_CALL__PARAMS = 1;

	/**
	 * The number of structural features of the '<em>Gate Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_CALL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.APN.apnmm.impl.MethodCallImpl <em>Method Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.apnmm.impl.MethodCallImpl
	 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getMethodCall()
	 * @generated
	 */
	int METHOD_CALL = 8;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__PARAMS = 1;

	/**
	 * The number of structural features of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link SATEL.APN.apnmm.APN <em>APN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APN</em>'.
	 * @see SATEL.APN.apnmm.APN
	 * @generated
	 */
	EClass getAPN();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.apnmm.APN#getOwnedPlaces <em>Owned Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Places</em>'.
	 * @see SATEL.APN.apnmm.APN#getOwnedPlaces()
	 * @see #getAPN()
	 * @generated
	 */
	EReference getAPN_OwnedPlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.apnmm.APN#getOwnedArcs <em>Owned Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Arcs</em>'.
	 * @see SATEL.APN.apnmm.APN#getOwnedArcs()
	 * @see #getAPN()
	 * @generated
	 */
	EReference getAPN_OwnedArcs();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.apnmm.APN#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
	 * @see SATEL.APN.apnmm.APN#getOwnedVariables()
	 * @see #getAPN()
	 * @generated
	 */
	EReference getAPN_OwnedVariables();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.apnmm.APN#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.APN.apnmm.APN#getName()
	 * @see #getAPN()
	 * @generated
	 */
	EAttribute getAPN_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.apnmm.APN#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see SATEL.APN.apnmm.APN#getMethods()
	 * @see #getAPN()
	 * @generated
	 */
	EReference getAPN_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.apnmm.APN#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see SATEL.APN.apnmm.APN#getGates()
	 * @see #getAPN()
	 * @generated
	 */
	EReference getAPN_Gates();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.apnmm.APN#getOwnedTransitions <em>Owned Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transitions</em>'.
	 * @see SATEL.APN.apnmm.APN#getOwnedTransitions()
	 * @see #getAPN()
	 * @generated
	 */
	EReference getAPN_OwnedTransitions();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.apnmm.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see SATEL.APN.apnmm.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.apnmm.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.APN.apnmm.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.apnmm.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see SATEL.APN.apnmm.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link SATEL.APN.apnmm.Arc#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see SATEL.APN.apnmm.Arc#getFrom()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_From();

	/**
	 * Returns the meta object for the reference '{@link SATEL.APN.apnmm.Arc#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see SATEL.APN.apnmm.Arc#getTo()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_To();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.apnmm.Arc#getOwnedArcMultiset <em>Owned Arc Multiset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Arc Multiset</em>'.
	 * @see SATEL.APN.apnmm.Arc#getOwnedArcMultiset()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_OwnedArcMultiset();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.apnmm.Arc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.APN.apnmm.Arc#getName()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Name();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.apnmm.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see SATEL.APN.apnmm.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.apnmm.Place#getOwnedPlaceMultiset <em>Owned Place Multiset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Place Multiset</em>'.
	 * @see SATEL.APN.apnmm.Place#getOwnedPlaceMultiset()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_OwnedPlaceMultiset();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.apnmm.Place#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort</em>'.
	 * @see SATEL.APN.apnmm.Place#getSort()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Sort();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.apnmm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see SATEL.APN.apnmm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.apnmm.Transition#getOwnedGuard <em>Owned Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Guard</em>'.
	 * @see SATEL.APN.apnmm.Transition#getOwnedGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OwnedGuard();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.apnmm.Transition#getGateCalls <em>Gate Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gate Calls</em>'.
	 * @see SATEL.APN.apnmm.Transition#getGateCalls()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_GateCalls();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.apnmm.Transition#getMethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Call</em>'.
	 * @see SATEL.APN.apnmm.Transition#getMethodCall()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_MethodCall();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.apnmm.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see SATEL.APN.apnmm.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.apnmm.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.APN.apnmm.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.apnmm.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see SATEL.APN.apnmm.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.apnmm.Gate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.APN.apnmm.Gate#getName()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Name();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.apnmm.GateCall <em>Gate Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate Call</em>'.
	 * @see SATEL.APN.apnmm.GateCall
	 * @generated
	 */
	EClass getGateCall();

	/**
	 * Returns the meta object for the reference '{@link SATEL.APN.apnmm.GateCall#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gate</em>'.
	 * @see SATEL.APN.apnmm.GateCall#getGate()
	 * @see #getGateCall()
	 * @generated
	 */
	EReference getGateCall_Gate();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.apnmm.GateCall#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see SATEL.APN.apnmm.GateCall#getParams()
	 * @see #getGateCall()
	 * @generated
	 */
	EReference getGateCall_Params();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.apnmm.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call</em>'.
	 * @see SATEL.APN.apnmm.MethodCall
	 * @generated
	 */
	EClass getMethodCall();

	/**
	 * Returns the meta object for the reference '{@link SATEL.APN.apnmm.MethodCall#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see SATEL.APN.apnmm.MethodCall#getMethod()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.apnmm.MethodCall#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see SATEL.APN.apnmm.MethodCall#getParams()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_Params();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApnmmFactory getApnmmFactory();

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
		 * The meta object literal for the '{@link SATEL.APN.apnmm.impl.APNImpl <em>APN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.apnmm.impl.APNImpl
		 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getAPN()
		 * @generated
		 */
		EClass APN = eINSTANCE.getAPN();

		/**
		 * The meta object literal for the '<em><b>Owned Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APN__OWNED_PLACES = eINSTANCE.getAPN_OwnedPlaces();

		/**
		 * The meta object literal for the '<em><b>Owned Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APN__OWNED_ARCS = eINSTANCE.getAPN_OwnedArcs();

		/**
		 * The meta object literal for the '<em><b>Owned Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APN__OWNED_VARIABLES = eINSTANCE.getAPN_OwnedVariables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APN__NAME = eINSTANCE.getAPN_Name();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APN__METHODS = eINSTANCE.getAPN_Methods();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APN__GATES = eINSTANCE.getAPN_Gates();

		/**
		 * The meta object literal for the '<em><b>Owned Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APN__OWNED_TRANSITIONS = eINSTANCE.getAPN_OwnedTransitions();

		/**
		 * The meta object literal for the '{@link SATEL.APN.apnmm.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.apnmm.impl.NodeImpl
		 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link SATEL.APN.apnmm.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.apnmm.impl.ArcImpl
		 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__FROM = eINSTANCE.getArc_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TO = eINSTANCE.getArc_To();

		/**
		 * The meta object literal for the '<em><b>Owned Arc Multiset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__OWNED_ARC_MULTISET = eINSTANCE.getArc_OwnedArcMultiset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__NAME = eINSTANCE.getArc_Name();

		/**
		 * The meta object literal for the '{@link SATEL.APN.apnmm.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.apnmm.impl.PlaceImpl
		 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Owned Place Multiset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__OWNED_PLACE_MULTISET = eINSTANCE.getPlace_OwnedPlaceMultiset();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__SORT = eINSTANCE.getPlace_Sort();

		/**
		 * The meta object literal for the '{@link SATEL.APN.apnmm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.apnmm.impl.TransitionImpl
		 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Owned Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OWNED_GUARD = eINSTANCE.getTransition_OwnedGuard();

		/**
		 * The meta object literal for the '<em><b>Gate Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GATE_CALLS = eINSTANCE.getTransition_GateCalls();

		/**
		 * The meta object literal for the '<em><b>Method Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__METHOD_CALL = eINSTANCE.getTransition_MethodCall();

		/**
		 * The meta object literal for the '{@link SATEL.APN.apnmm.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.apnmm.impl.MethodImpl
		 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '{@link SATEL.APN.apnmm.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.apnmm.impl.GateImpl
		 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__NAME = eINSTANCE.getGate_Name();

		/**
		 * The meta object literal for the '{@link SATEL.APN.apnmm.impl.GateCallImpl <em>Gate Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.apnmm.impl.GateCallImpl
		 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getGateCall()
		 * @generated
		 */
		EClass GATE_CALL = eINSTANCE.getGateCall();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE_CALL__GATE = eINSTANCE.getGateCall_Gate();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE_CALL__PARAMS = eINSTANCE.getGateCall_Params();

		/**
		 * The meta object literal for the '{@link SATEL.APN.apnmm.impl.MethodCallImpl <em>Method Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.apnmm.impl.MethodCallImpl
		 * @see SATEL.APN.apnmm.impl.ApnmmPackageImpl#getMethodCall()
		 * @generated
		 */
		EClass METHOD_CALL = eINSTANCE.getMethodCall();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__METHOD = eINSTANCE.getMethodCall_Method();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__PARAMS = eINSTANCE.getMethodCall_Params();

	}

} //ApnmmPackage
