/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set;

import SOS.adtmm.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.set.SetMembership#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link SOS.set.SetMembership#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.set.SetPackage#getSetMembership()
 * @model abstract="true"
 * @generated
 */
public interface SetMembership extends SetTerm {
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
	 * @see SOS.set.SetPackage#getSetMembership_LeftHandSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getLeftHandSide();

	/**
	 * Sets the value of the '{@link SOS.set.SetMembership#getLeftHandSide <em>Left Hand Side</em>}' containment reference.
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
	 * @see SOS.set.SetPackage#getSetMembership_RightHandSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getRightHandSide();

	/**
	 * Sets the value of the '{@link SOS.set.SetMembership#getRightHandSide <em>Right Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #getRightHandSide()
	 * @generated
	 */
	void setRightHandSide(Term value);

} // SetMembership
