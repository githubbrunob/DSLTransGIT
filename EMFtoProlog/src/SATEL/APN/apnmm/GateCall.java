/**
 * <copyright>
 * </copyright>
 *
 * $Id: GateCall.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.apnmm;

import SATEL.APN.adtmm.Term;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.GateCall#getGate <em>Gate</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.GateCall#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.apnmm.ApnmmPackage#getGateCall()
 * @model
 * @generated
 */
public interface GateCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate</em>' reference.
	 * @see #setGate(Gate)
	 * @see SATEL.APN.apnmm.ApnmmPackage#getGateCall_Gate()
	 * @model required="true"
	 * @generated
	 */
	Gate getGate();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.GateCall#getGate <em>Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate</em>' reference.
	 * @see #getGate()
	 * @generated
	 */
	void setGate(Gate value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see SATEL.APN.apnmm.ApnmmPackage#getGateCall_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getParams();

} // GateCall
