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
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprolog.Head#getOwnedFunctor <em>Owned Functor</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprolog.MprologPackage#getHead()
 * @model
 * @generated
 */
public interface Head extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Functor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Functor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Functor</em>' containment reference.
	 * @see #setOwnedFunctor(Functor)
	 * @see mprolog.MprologPackage#getHead_OwnedFunctor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Functor getOwnedFunctor();

	/**
	 * Sets the value of the '{@link mprolog.Head#getOwnedFunctor <em>Owned Functor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Functor</em>' containment reference.
	 * @see #getOwnedFunctor()
	 * @generated
	 */
	void setOwnedFunctor(Functor value);

} // Head
