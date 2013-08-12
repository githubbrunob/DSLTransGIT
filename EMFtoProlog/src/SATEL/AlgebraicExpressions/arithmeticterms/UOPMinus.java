/**
 * <copyright>
 * </copyright>
 *
 * $Id: UOPMinus.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UOP Minus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus#getArithmeticTerm <em>Arithmetic Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getUOPMinus()
 * @model
 * @generated
 */
public interface UOPMinus extends ArithmeticTerm {
	/**
	 * Returns the value of the '<em><b>Arithmetic Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arithmetic Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arithmetic Term</em>' containment reference.
	 * @see #setArithmeticTerm(ArithmeticTerm)
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getUOPMinus_ArithmeticTerm()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ArithmeticTerm getArithmeticTerm();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus#getArithmeticTerm <em>Arithmetic Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arithmetic Term</em>' containment reference.
	 * @see #getArithmeticTerm()
	 * @generated
	 */
	void setArithmeticTerm(ArithmeticTerm value);

} // UOPMinus
