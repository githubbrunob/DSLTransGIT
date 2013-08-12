/**
 * <copyright>
 * </copyright>
 *
 * $Id: GTE.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms;

import SATEL.AlgebraicExpressions.arithmeticterms.ArithmeticTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GTE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.GTE#getArithmeticTermR <em>Arithmetic Term R</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.GTE#getArithmeticTermL <em>Arithmetic Term L</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getGTE()
 * @model
 * @generated
 */
public interface GTE extends BooleanTerm {
	/**
	 * Returns the value of the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arithmetic Term R</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arithmetic Term R</em>' containment reference.
	 * @see #setArithmeticTermR(ArithmeticTerm)
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getGTE_ArithmeticTermR()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ArithmeticTerm getArithmeticTermR();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.booleanterms.GTE#getArithmeticTermR <em>Arithmetic Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arithmetic Term R</em>' containment reference.
	 * @see #getArithmeticTermR()
	 * @generated
	 */
	void setArithmeticTermR(ArithmeticTerm value);

	/**
	 * Returns the value of the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arithmetic Term L</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arithmetic Term L</em>' containment reference.
	 * @see #setArithmeticTermL(ArithmeticTerm)
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getGTE_ArithmeticTermL()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ArithmeticTerm getArithmeticTermL();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.booleanterms.GTE#getArithmeticTermL <em>Arithmetic Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arithmetic Term L</em>' containment reference.
	 * @see #getArithmeticTermL()
	 * @generated
	 */
	void setArithmeticTermL(ArithmeticTerm value);

} // GTE
