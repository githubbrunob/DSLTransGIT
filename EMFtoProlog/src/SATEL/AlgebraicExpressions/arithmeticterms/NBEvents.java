/**
 * <copyright>
 * </copyright>
 *
 * $Id: NBEvents.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms;

import SATEL.HMLFormula.HMLTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Events</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.NBEvents#getHmlTerm <em>Hml Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getNBEvents()
 * @model
 * @generated
 */
public interface NBEvents extends ArithmeticTerm {
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
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getNBEvents_HmlTerm()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	HMLTerm getHmlTerm();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.arithmeticterms.NBEvents#getHmlTerm <em>Hml Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hml Term</em>' containment reference.
	 * @see #getHmlTerm()
	 * @generated
	 */
	void setHmlTerm(HMLTerm value);

} // NBEvents
