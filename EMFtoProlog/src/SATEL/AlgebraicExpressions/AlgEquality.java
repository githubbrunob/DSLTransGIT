/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgEquality.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions;

import SATEL.AlgebraicExpressions.algterms.AlgebraicTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alg Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.AlgEquality#getAlgebraicTermL <em>Algebraic Term L</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.AlgEquality#getAlgebraicTermR <em>Algebraic Term R</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage#getAlgEquality()
 * @model
 * @generated
 */
public interface AlgEquality extends AlgebraicEquality {
	/**
	 * Returns the value of the '<em><b>Algebraic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algebraic Term L</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algebraic Term L</em>' containment reference.
	 * @see #setAlgebraicTermL(AlgebraicTerm)
	 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage#getAlgEquality_AlgebraicTermL()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AlgebraicTerm getAlgebraicTermL();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.AlgEquality#getAlgebraicTermL <em>Algebraic Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algebraic Term L</em>' containment reference.
	 * @see #getAlgebraicTermL()
	 * @generated
	 */
	void setAlgebraicTermL(AlgebraicTerm value);

	/**
	 * Returns the value of the '<em><b>Algebraic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algebraic Term R</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algebraic Term R</em>' containment reference.
	 * @see #setAlgebraicTermR(AlgebraicTerm)
	 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage#getAlgEquality_AlgebraicTermR()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AlgebraicTerm getAlgebraicTermR();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.AlgEquality#getAlgebraicTermR <em>Algebraic Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algebraic Term R</em>' containment reference.
	 * @see #getAlgebraicTermR()
	 * @generated
	 */
	void setAlgebraicTermR(AlgebraicTerm value);

} // AlgEquality
