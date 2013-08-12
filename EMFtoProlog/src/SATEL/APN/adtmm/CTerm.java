/**
 * <copyright>
 * </copyright>
 *
 * $Id: CTerm.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.APN.adtmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTerm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.CTerm#getIter <em>Iter</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.CTerm#getOwnedTerms <em>Owned Terms</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.CTerm#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.adtmm.AdtmmPackage#getCTerm()
 * @model
 * @generated
 */
public interface CTerm extends Term {
	/**
	 * Returns the value of the '<em><b>Iter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iter</em>' attribute.
	 * @see #setIter(int)
	 * @see SATEL.APN.adtmm.AdtmmPackage#getCTerm_Iter()
	 * @model
	 * @generated
	 */
	int getIter();

	/**
	 * Sets the value of the '{@link SATEL.APN.adtmm.CTerm#getIter <em>Iter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iter</em>' attribute.
	 * @see #getIter()
	 * @generated
	 */
	void setIter(int value);

	/**
	 * Returns the value of the '<em><b>Owned Terms</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Terms</em>' containment reference list.
	 * @see SATEL.APN.adtmm.AdtmmPackage#getCTerm_OwnedTerms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getOwnedTerms();

	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(Operation)
	 * @see SATEL.APN.adtmm.AdtmmPackage#getCTerm_Op()
	 * @model required="true"
	 * @generated
	 */
	Operation getOp();

	/**
	 * Sets the value of the '{@link SATEL.APN.adtmm.CTerm#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Operation value);

} // CTerm
