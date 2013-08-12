/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.MemberRef#getMember <em>Member</em>}</li>
 *   <li>{@link Java5.MemberRef#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getMemberRef()
 * @model
 * @generated
 */
public interface MemberRef extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference.
	 * @see #setMember(NamedElementRef)
	 * @see Java5.Java5Package#getMemberRef_Member()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getMember();

	/**
	 * Sets the value of the '{@link Java5.MemberRef#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(NamedElementRef value);

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
	 * @see Java5.Java5Package#getMemberRef_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	NamedElementRef getQualifier();

	/**
	 * Sets the value of the '{@link Java5.MemberRef#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(NamedElementRef value);

} // MemberRef
