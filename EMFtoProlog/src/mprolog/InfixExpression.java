/**
 * <copyright>
 * </copyright>
 *
 * $Id: InfixExpression.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package mprolog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprolog.InfixExpression#getLeftTerm <em>Left Term</em>}</li>
 *   <li>{@link mprolog.InfixExpression#getRightTerm <em>Right Term</em>}</li>
 *   <li>{@link mprolog.InfixExpression#getOwnedOperator <em>Owned Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprolog.MprologPackage#getInfixExpression()
 * @model
 * @generated
 */
public interface InfixExpression extends Term {
	/**
	 * Returns the value of the '<em><b>Left Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Term</em>' containment reference.
	 * @see #setLeftTerm(Term)
	 * @see mprolog.MprologPackage#getInfixExpression_LeftTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getLeftTerm();

	/**
	 * Sets the value of the '{@link mprolog.InfixExpression#getLeftTerm <em>Left Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Term</em>' containment reference.
	 * @see #getLeftTerm()
	 * @generated
	 */
	void setLeftTerm(Term value);

	/**
	 * Returns the value of the '<em><b>Right Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Term</em>' containment reference.
	 * @see #setRightTerm(Term)
	 * @see mprolog.MprologPackage#getInfixExpression_RightTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getRightTerm();

	/**
	 * Sets the value of the '{@link mprolog.InfixExpression#getRightTerm <em>Right Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Term</em>' containment reference.
	 * @see #getRightTerm()
	 * @generated
	 */
	void setRightTerm(Term value);

	/**
	 * Returns the value of the '<em><b>Owned Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operator</em>' containment reference.
	 * @see #setOwnedOperator(Operator)
	 * @see mprolog.MprologPackage#getInfixExpression_OwnedOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operator getOwnedOperator();

	/**
	 * Sets the value of the '{@link mprolog.InfixExpression#getOwnedOperator <em>Owned Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Operator</em>' containment reference.
	 * @see #getOwnedOperator()
	 * @generated
	 */
	void setOwnedOperator(Operator value);

} // InfixExpression
