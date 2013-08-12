/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set;

import SOS.AlgebraicConditionList;

import SOS.adtmm.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.set.SetConstructor#getSuchThat <em>Such That</em>}</li>
 *   <li>{@link SOS.set.SetConstructor#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.set.SetPackage#getSetConstructor()
 * @model
 * @generated
 */
public interface SetConstructor extends SetTerm {
	/**
	 * Returns the value of the '<em><b>Such That</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Such That</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Such That</em>' containment reference.
	 * @see #setSuchThat(AlgebraicConditionList)
	 * @see SOS.set.SetPackage#getSetConstructor_SuchThat()
	 * @model containment="true"
	 * @generated
	 */
	AlgebraicConditionList getSuchThat();

	/**
	 * Sets the value of the '{@link SOS.set.SetConstructor#getSuchThat <em>Such That</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Such That</em>' containment reference.
	 * @see #getSuchThat()
	 * @generated
	 */
	void setSuchThat(AlgebraicConditionList value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference.
	 * @see #setMember(Term)
	 * @see SOS.set.SetPackage#getSetConstructor_Member()
	 * @model containment="true"
	 * @generated
	 */
	Term getMember();

	/**
	 * Sets the value of the '{@link SOS.set.SetConstructor#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(Term value);

} // SetConstructor
