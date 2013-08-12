/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.Assignment#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link Java5.Assignment#getOperator <em>Operator</em>}</li>
 *   <li>{@link Java5.Assignment#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hand Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Side</em>' containment reference.
	 * @see #setLeftHandSide(Expression)
	 * @see Java5.Java5Package#getAssignment_LeftHandSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftHandSide();

	/**
	 * Sets the value of the '{@link Java5.Assignment#getLeftHandSide <em>Left Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Hand Side</em>' containment reference.
	 * @see #getLeftHandSide()
	 * @generated
	 */
	void setLeftHandSide(Expression value);

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
	 * @see Java5.Java5Package#getAssignment_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link Java5.Assignment#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #setRightHandSide(Expression)
	 * @see Java5.Java5Package#getAssignment_RightHandSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightHandSide();

	/**
	 * Sets the value of the '{@link Java5.Assignment#getRightHandSide <em>Right Hand Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Side</em>' containment reference.
	 * @see #getRightHandSide()
	 * @generated
	 */
	void setRightHandSide(Expression value);

} // Assignment
