/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Length Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.ArrayLengthAccess#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getArrayLengthAccess()
 * @model
 * @generated
 */
public interface ArrayLengthAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(Expression)
	 * @see Java5.Java5Package#getArrayLengthAccess_Array()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getArray();

	/**
	 * Sets the value of the '{@link Java5.ArrayLengthAccess#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(Expression value);

} // ArrayLengthAccess
