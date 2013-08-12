/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.StringLiteral#getEscapedValue <em>Escaped Value</em>}</li>
 *   <li>{@link Java5.StringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Escaped Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escaped Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escaped Value</em>' attribute.
	 * @see #setEscapedValue(String)
	 * @see Java5.Java5Package#getStringLiteral_EscapedValue()
	 * @model
	 * @generated
	 */
	String getEscapedValue();

	/**
	 * Sets the value of the '{@link Java5.StringLiteral#getEscapedValue <em>Escaped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escaped Value</em>' attribute.
	 * @see #getEscapedValue()
	 * @generated
	 */
	void setEscapedValue(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see Java5.Java5Package#getStringLiteral_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link Java5.StringLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringLiteral
