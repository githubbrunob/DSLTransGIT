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
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprolog.Term#getNextTerm <em>Next Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprolog.MprologPackage#getTerm()
 * @model abstract="true"
 * @generated
 */
public interface Term extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Term</em>' containment reference.
	 * @see #setNextTerm(Term)
	 * @see mprolog.MprologPackage#getTerm_NextTerm()
	 * @model containment="true"
	 * @generated
	 */
	Term getNextTerm();

	/**
	 * Sets the value of the '{@link mprolog.Term#getNextTerm <em>Next Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Term</em>' containment reference.
	 * @see #getNextTerm()
	 * @generated
	 */
	void setNextTerm(Term value);

} // Term
