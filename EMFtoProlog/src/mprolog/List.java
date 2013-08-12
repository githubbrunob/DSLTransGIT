/**
 * <copyright>
 * </copyright>
 *
 * $Id: List.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package mprolog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprolog.List#getOwnedHeadTerms <em>Owned Head Terms</em>}</li>
 *   <li>{@link mprolog.List#getOwnedTailTerms <em>Owned Tail Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprolog.MprologPackage#getList()
 * @model
 * @generated
 */
public interface List extends Term {
	/**
	 * Returns the value of the '<em><b>Owned Head Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Head Terms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Head Terms</em>' containment reference.
	 * @see #setOwnedHeadTerms(Term)
	 * @see mprolog.MprologPackage#getList_OwnedHeadTerms()
	 * @model containment="true"
	 * @generated
	 */
	Term getOwnedHeadTerms();

	/**
	 * Sets the value of the '{@link mprolog.List#getOwnedHeadTerms <em>Owned Head Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Head Terms</em>' containment reference.
	 * @see #getOwnedHeadTerms()
	 * @generated
	 */
	void setOwnedHeadTerms(Term value);

	/**
	 * Returns the value of the '<em><b>Owned Tail Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tail Terms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tail Terms</em>' containment reference.
	 * @see #setOwnedTailTerms(Term)
	 * @see mprolog.MprologPackage#getList_OwnedTailTerms()
	 * @model containment="true"
	 * @generated
	 */
	Term getOwnedTailTerms();

	/**
	 * Sets the value of the '{@link mprolog.List#getOwnedTailTerms <em>Owned Tail Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Tail Terms</em>' containment reference.
	 * @see #getOwnedTailTerms()
	 * @generated
	 */
	void setOwnedTailTerms(Term value);

} // List
