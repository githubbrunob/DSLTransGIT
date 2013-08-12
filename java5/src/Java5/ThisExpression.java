/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>This Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.ThisExpression#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getThisExpression()
 * @model
 * @generated
 */
public interface ThisExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(NamedElementRef)
	 * @see Java5.Java5Package#getThisExpression_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	NamedElementRef getQualifier();

	/**
	 * Sets the value of the '{@link Java5.ThisExpression#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(NamedElementRef value);

} // ThisExpression
