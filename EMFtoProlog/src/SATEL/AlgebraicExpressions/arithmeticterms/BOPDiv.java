/**
 * <copyright>
 * </copyright>
 *
 * $Id: BOPDiv.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOP Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv#getArithmeticTermL <em>Arithmetic Term L</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv#getArithmeticTermR <em>Arithmetic Term R</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getBOPDiv()
 * @model
 * @generated
 */
public interface BOPDiv extends ArithmeticTerm {
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
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getBOPDiv_ArithmeticTermL()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ArithmeticTerm getArithmeticTermL();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv#getArithmeticTermL <em>Arithmetic Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arithmetic Term L</em>' containment reference.
	 * @see #getArithmeticTermL()
	 * @generated
	 */
	void setArithmeticTermL(ArithmeticTerm value);

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
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getBOPDiv_ArithmeticTermR()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ArithmeticTerm getArithmeticTermR();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv#getArithmeticTermR <em>Arithmetic Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arithmetic Term R</em>' containment reference.
	 * @see #getArithmeticTermR()
	 * @generated
	 */
	void setArithmeticTermR(ArithmeticTerm value);

} // BOPDiv
