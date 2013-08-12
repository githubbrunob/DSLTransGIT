/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Field Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.SuperFieldAccess#getField <em>Field</em>}</li>
 *   <li>{@link Java5.SuperFieldAccess#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getSuperFieldAccess()
 * @model
 * @generated
 */
public interface SuperFieldAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference.
	 * @see #setField(NamedElementRef)
	 * @see Java5.Java5Package#getSuperFieldAccess_Field()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getField();

	/**
	 * Sets the value of the '{@link Java5.SuperFieldAccess#getField <em>Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' containment reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(NamedElementRef value);

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
	 * @see Java5.Java5Package#getSuperFieldAccess_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	NamedElementRef getQualifier();

	/**
	 * Sets the value of the '{@link Java5.SuperFieldAccess#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(NamedElementRef value);

} // SuperFieldAccess
