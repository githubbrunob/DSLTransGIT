/**
 * <copyright>
 * </copyright>
 *
 * $Id: Inclusion.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import SATEL.HMLFormula.HMLTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.Inclusion#getHmlTerm <em>Hml Term</em>}</li>
 *   <li>{@link SATEL.Inclusion#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getInclusion()
 * @model
 * @generated
 */
public interface Inclusion extends ConditionAtom {
	/**
	 * Returns the value of the '<em><b>Hml Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hml Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hml Term</em>' containment reference.
	 * @see #setHmlTerm(HMLTerm)
	 * @see SATEL.SATELPackage#getInclusion_HmlTerm()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	HMLTerm getHmlTerm();

	/**
	 * Sets the value of the '{@link SATEL.Inclusion#getHmlTerm <em>Hml Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hml Term</em>' containment reference.
	 * @see #getHmlTerm()
	 * @generated
	 */
	void setHmlTerm(HMLTerm value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(IntentionDec)
	 * @see SATEL.SATELPackage#getInclusion_In()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IntentionDec getIn();

	/**
	 * Sets the value of the '{@link SATEL.Inclusion#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(IntentionDec value);

} // Inclusion
