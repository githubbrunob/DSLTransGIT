/**
 * <copyright>
 * </copyright>
 *
 * $Id: Clause.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package mprolog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprolog.Clause#getOwnedHead <em>Owned Head</em>}</li>
 *   <li>{@link mprolog.Clause#getOwnedBody <em>Owned Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprolog.MprologPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Head</em>' containment reference.
	 * @see #setOwnedHead(Head)
	 * @see mprolog.MprologPackage#getClause_OwnedHead()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Head getOwnedHead();

	/**
	 * Sets the value of the '{@link mprolog.Clause#getOwnedHead <em>Owned Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Head</em>' containment reference.
	 * @see #getOwnedHead()
	 * @generated
	 */
	void setOwnedHead(Head value);

	/**
	 * Returns the value of the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Body</em>' containment reference.
	 * @see #setOwnedBody(Body)
	 * @see mprolog.MprologPackage#getClause_OwnedBody()
	 * @model containment="true"
	 * @generated
	 */
	Body getOwnedBody();

	/**
	 * Sets the value of the '{@link mprolog.Clause#getOwnedBody <em>Owned Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Body</em>' containment reference.
	 * @see #getOwnedBody()
	 * @generated
	 */
	void setOwnedBody(Body value);

} // Clause
