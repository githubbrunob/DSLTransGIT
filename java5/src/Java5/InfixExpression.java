/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.InfixExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link Java5.InfixExpression#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link Java5.InfixExpression#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link Java5.InfixExpression#getExtendedOperands <em>Extended Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getInfixExpression()
 * @model
 * @generated
 */
public interface InfixExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see Java5.Java5Package#getInfixExpression_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link Java5.InfixExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(Expression)
	 * @see Java5.Java5Package#getInfixExpression_RightOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightOperand();

	/**
	 * Sets the value of the '{@link Java5.InfixExpression#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(Expression)
	 * @see Java5.Java5Package#getInfixExpression_LeftOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftOperand();

	/**
	 * Sets the value of the '{@link Java5.InfixExpression#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>Extended Operands</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Operands</em>' containment reference list.
	 * @see Java5.Java5Package#getInfixExpression_ExtendedOperands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExtendedOperands();

} // InfixExpression
