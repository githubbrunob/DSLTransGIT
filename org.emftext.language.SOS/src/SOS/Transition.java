/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS;

import SOS.adtmm.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link SOS.Transition#getPreState <em>Pre State</em>}</li>
 *   <li>{@link SOS.Transition#getPosState <em>Pos State</em>}</li>
 *   <li>{@link SOS.Transition#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.SOSPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Condition {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Term)
	 * @see SOS.SOSPackage#getTransition_Label()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getLabel();

	/**
	 * Sets the value of the '{@link SOS.Transition#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Term value);

	/**
	 * Returns the value of the '<em><b>Pre State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre State</em>' containment reference.
	 * @see #setPreState(Term)
	 * @see SOS.SOSPackage#getTransition_PreState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getPreState();

	/**
	 * Sets the value of the '{@link SOS.Transition#getPreState <em>Pre State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre State</em>' containment reference.
	 * @see #getPreState()
	 * @generated
	 */
	void setPreState(Term value);

	/**
	 * Returns the value of the '<em><b>Pos State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos State</em>' containment reference.
	 * @see #setPosState(Term)
	 * @see SOS.SOSPackage#getTransition_PosState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getPosState();

	/**
	 * Sets the value of the '{@link SOS.Transition#getPosState <em>Pos State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos State</em>' containment reference.
	 * @see #getPosState()
	 * @generated
	 */
	void setPosState(Term value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Term)
	 * @see SOS.SOSPackage#getTransition_Environment()
	 * @model containment="true"
	 * @generated
	 */
	Term getEnvironment();

	/**
	 * Sets the value of the '{@link SOS.Transition#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Term value);

} // Transition
