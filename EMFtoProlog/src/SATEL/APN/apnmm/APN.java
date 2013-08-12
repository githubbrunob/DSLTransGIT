/**
 * <copyright>
 * </copyright>
 *
 * $Id: APN.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.apnmm;

import SATEL.APN.adtmm.Variable;

import SATEL.APN.environmentmm.Environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.APN#getOwnedPlaces <em>Owned Places</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.APN#getOwnedArcs <em>Owned Arcs</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.APN#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.APN#getName <em>Name</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.APN#getMethods <em>Methods</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.APN#getGates <em>Gates</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.APN#getOwnedTransitions <em>Owned Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.apnmm.ApnmmPackage#getAPN()
 * @model
 * @generated
 */
public interface APN extends Environment {
	/**
	 * Returns the value of the '<em><b>Owned Places</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.apnmm.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Places</em>' containment reference list.
	 * @see SATEL.APN.apnmm.ApnmmPackage#getAPN_OwnedPlaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Place> getOwnedPlaces();

	/**
	 * Returns the value of the '<em><b>Owned Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.apnmm.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Arcs</em>' containment reference list.
	 * @see SATEL.APN.apnmm.ApnmmPackage#getAPN_OwnedArcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getOwnedArcs();

	/**
	 * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variables</em>' containment reference list.
	 * @see SATEL.APN.apnmm.ApnmmPackage#getAPN_OwnedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SATEL.APN.apnmm.ApnmmPackage#getAPN_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.APN#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.apnmm.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see SATEL.APN.apnmm.ApnmmPackage#getAPN_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.apnmm.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see SATEL.APN.apnmm.ApnmmPackage#getAPN_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getGates();

	/**
	 * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.apnmm.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transitions</em>' containment reference list.
	 * @see SATEL.APN.apnmm.ApnmmPackage#getAPN_OwnedTransitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getOwnedTransitions();

} // APN
