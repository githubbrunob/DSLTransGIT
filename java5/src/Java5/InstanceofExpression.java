/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instanceof Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.InstanceofExpression#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link Java5.InstanceofExpression#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getInstanceofExpression()
 * @model
 * @generated
 */
public interface InstanceofExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(NamedElementRef)
	 * @see Java5.Java5Package#getInstanceofExpression_RightOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getRightOperand();

	/**
	 * Sets the value of the '{@link Java5.InstanceofExpression#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(NamedElementRef value);

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
	 * @see Java5.Java5Package#getInstanceofExpression_LeftOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftOperand();

	/**
	 * Sets the value of the '{@link Java5.InstanceofExpression#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(Expression value);

} // InstanceofExpression
