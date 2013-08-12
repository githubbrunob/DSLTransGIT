/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLEquality.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions;

import SATEL.HMLFormula.HMLTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HML Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.HMLEquality#getHmlTermL <em>Hml Term L</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.HMLEquality#getHmlTermR <em>Hml Term R</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage#getHMLEquality()
 * @model
 * @generated
 */
public interface HMLEquality extends AlgebraicEquality {
	/**
	 * Returns the value of the '<em><b>Hml Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hml Term L</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hml Term L</em>' containment reference.
	 * @see #setHmlTermL(HMLTerm)
	 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage#getHMLEquality_HmlTermL()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	HMLTerm getHmlTermL();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.HMLEquality#getHmlTermL <em>Hml Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hml Term L</em>' containment reference.
	 * @see #getHmlTermL()
	 * @generated
	 */
	void setHmlTermL(HMLTerm value);

	/**
	 * Returns the value of the '<em><b>Hml Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hml Term R</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hml Term R</em>' containment reference.
	 * @see #setHmlTermR(HMLTerm)
	 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage#getHMLEquality_HmlTermR()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	HMLTerm getHmlTermR();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.HMLEquality#getHmlTermR <em>Hml Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hml Term R</em>' containment reference.
	 * @see #getHmlTermR()
	 * @generated
	 */
	void setHmlTermR(HMLTerm value);

} // HMLEquality
