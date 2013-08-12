/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.TypeLiteral#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getTypeLiteral()
 * @model
 * @generated
 */
public interface TypeLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(NamedElementRef)
	 * @see Java5.Java5Package#getTypeLiteral_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getType();

	/**
	 * Sets the value of the '{@link Java5.TypeLiteral#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NamedElementRef value);

} // TypeLiteral
