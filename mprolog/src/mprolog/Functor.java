/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mprolog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprolog.Functor#getText <em>Text</em>}</li>
 *   <li>{@link mprolog.Functor#getOwnedTerm <em>Owned Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprolog.MprologPackage#getFunctor()
 * @model
 * @generated
 */
public interface Functor extends Term {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see mprolog.MprologPackage#getFunctor_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link mprolog.Functor#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Owned Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Term</em>' containment reference.
	 * @see #setOwnedTerm(Term)
	 * @see mprolog.MprologPackage#getFunctor_OwnedTerm()
	 * @model containment="true"
	 * @generated
	 */
	Term getOwnedTerm();

	/**
	 * Sets the value of the '{@link mprolog.Functor#getOwnedTerm <em>Owned Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Term</em>' containment reference.
	 * @see #getOwnedTerm()
	 * @generated
	 */
	void setOwnedTerm(Term value);

} // Functor
