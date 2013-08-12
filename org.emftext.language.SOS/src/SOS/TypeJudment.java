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
 * A representation of the model object '<em><b>Type Judment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.TypeJudment#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link SOS.TypeJudment#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link SOS.TypeJudment#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.SOSPackage#getTypeJudment()
 * @model
 * @generated
 */
public interface TypeJudment extends Condition {
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
	 * @see SOS.SOSPackage#getTypeJudment_Environment()
	 * @model containment="true"
	 * @generated
	 */
	Term getEnvironment();

	/**
	 * Sets the value of the '{@link SOS.TypeJudment#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Term value);

	/**
	 * Returns the value of the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hand Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Side</em>' containment reference.
	 * @see #setLeftHandSide(Term)
	 * @see SOS.SOSPackage#getTypeJudment_LeftHandSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getLeftHandSide();

	/**
	 * Sets the value of the '{@link SOS.TypeJudment#getLeftHandSide <em>Left Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Hand Side</em>' containment reference.
	 * @see #getLeftHandSide()
	 * @generated
	 */
	void setLeftHandSide(Term value);

	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #setRightHandSide(Term)
	 * @see SOS.SOSPackage#getTypeJudment_RightHandSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getRightHandSide();

	/**
	 * Sets the value of the '{@link SOS.TypeJudment#getRightHandSide <em>Right Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #getRightHandSide()
	 * @generated
	 */
	void setRightHandSide(Term value);

} // TypeJudment
