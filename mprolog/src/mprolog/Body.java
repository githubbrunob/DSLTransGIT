/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mprolog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprolog.Body#getOwnedTerm <em>Owned Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprolog.MprologPackage#getBody()
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
	 * @see mprolog.MprologPackage#getBody_OwnedTerm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getOwnedTerm();

	/**
	 * Sets the value of the '{@link mprolog.Body#getOwnedTerm <em>Owned Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Term</em>' containment reference.
	 * @see #getOwnedTerm()
	 * @generated
	 */
	void setOwnedTerm(Term value);

} // Body
