/**
 * <copyright>
 * </copyright>
 *
 * $Id: Transition.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.apnmm;

import SATEL.APN.guardmm.Guard;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.Transition#getOwnedGuard <em>Owned Guard</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.Transition#getGateCalls <em>Gate Calls</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.Transition#getMethodCall <em>Method Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.apnmm.ApnmmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Node {
	/**
	 * Returns the value of the '<em><b>Owned Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Guard</em>' containment reference.
	 * @see #setOwnedGuard(Guard)
	 * @see SATEL.APN.apnmm.ApnmmPackage#getTransition_OwnedGuard()
	 * @model containment="true"
	 * @generated
	 */
	Guard getOwnedGuard();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.Transition#getOwnedGuard <em>Owned Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Guard</em>' containment reference.
	 * @see #getOwnedGuard()
	 * @generated
	 */
	void setOwnedGuard(Guard value);

	/**
	 * Returns the value of the '<em><b>Gate Calls</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.apnmm.GateCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate Calls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate Calls</em>' containment reference list.
	 * @see SATEL.APN.apnmm.ApnmmPackage#getTransition_GateCalls()
	 * @model containment="true"
	 * @generated
	 */
	EList<GateCall> getGateCalls();

	/**
	 * Returns the value of the '<em><b>Method Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Call</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Call</em>' containment reference.
	 * @see #setMethodCall(MethodCall)
	 * @see SATEL.APN.apnmm.ApnmmPackage#getTransition_MethodCall()
	 * @model containment="true"
	 * @generated
	 */
	MethodCall getMethodCall();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.Transition#getMethodCall <em>Method Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Call</em>' containment reference.
	 * @see #getMethodCall()
	 * @generated
	 */
	void setMethodCall(MethodCall value);

} // Transition
