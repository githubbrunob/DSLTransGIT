/**
 * <copyright>
 * </copyright>
 *
 * $Id: TermReference.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.multisetmm;

import SATEL.APN.adtmm.Term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.multisetmm.TermReference#getTermReferenced <em>Term Referenced</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.multisetmm.MultisetmmPackage#getTermReference()
 * @model
 * @generated
 */
public interface TermReference extends MSElement {
	/**
	 * Returns the value of the '<em><b>Term Referenced</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Referenced</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Referenced</em>' containment reference.
	 * @see #setTermReferenced(Term)
	 * @see SATEL.APN.multisetmm.MultisetmmPackage#getTermReference_TermReferenced()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Term getTermReferenced();

	/**
	 * Sets the value of the '{@link SATEL.APN.multisetmm.TermReference#getTermReferenced <em>Term Referenced</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Referenced</em>' containment reference.
	 * @see #getTermReferenced()
	 * @generated
	 */
	void setTermReferenced(Term value);

} // TermReference
