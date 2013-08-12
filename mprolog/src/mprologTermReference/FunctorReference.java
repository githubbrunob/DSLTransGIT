/**
 * <copyright>
 * </copyright>
 *
 * $Id: FunctorReference.java,v 1.2 2012/02/04 22:47:13 bfb Exp $
 */
package mprologTermReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functor Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprologTermReference.FunctorReference#getIdReference <em>Id Reference</em>}</li>
 *   <li>{@link mprologTermReference.FunctorReference#getOwnedTerm <em>Owned Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprologTermReference.MprologTermReferencePackage#getFunctorReference()
 * @model
 * @generated
 */
public interface FunctorReference extends TermReference {
	/**
	 * Returns the value of the '<em><b>Id Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Reference</em>' reference.
	 * @see #setIdReference(Functor)
	 * @see mprologTermReference.MprologTermReferencePackage#getFunctorReference_IdReference()
	 * @model
	 * @generated
	 */
	Functor getIdReference();

	/**
	 * Sets the value of the '{@link mprologTermReference.FunctorReference#getIdReference <em>Id Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Reference</em>' reference.
	 * @see #getIdReference()
	 * @generated
	 */
	void setIdReference(Functor value);

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
	 * @see mprologTermReference.MprologTermReferencePackage#getFunctorReference_OwnedTerm()
	 * @model containment="true"
	 * @generated
	 */
	Term getOwnedTerm();

	/**
	 * Sets the value of the '{@link mprologTermReference.FunctorReference#getOwnedTerm <em>Owned Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Term</em>' containment reference.
	 * @see #getOwnedTerm()
	 * @generated
	 */
	void setOwnedTerm(Term value);

} // FunctorReference
