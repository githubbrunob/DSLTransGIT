/**
 * <copyright>
 * </copyright>
 *
 * $Id: Body.java,v 1.1 2011/12/28 01:45:32 bfb Exp $
 */
package mprologTermReference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprologTermReference.Body#getOwnedTerm <em>Owned Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprologTermReference.MprologTermReferencePackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject {
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
	 * @see mprologTermReference.MprologTermReferencePackage#getBody_OwnedTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getOwnedTerm();

	/**
	 * Sets the value of the '{@link mprologTermReference.Body#getOwnedTerm <em>Owned Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Term</em>' containment reference.
	 * @see #getOwnedTerm()
	 * @generated
	 */
	void setOwnedTerm(Term value);

} // Body
