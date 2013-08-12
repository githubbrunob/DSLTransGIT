/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTerm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.adtmm.CTerm#getIter <em>Iter</em>}</li>
 *   <li>{@link SOS.adtmm.CTerm#getOwnedTerms <em>Owned Terms</em>}</li>
 *   <li>{@link SOS.adtmm.CTerm#getOp <em>Op</em>}</li>
 *   <li>{@link SOS.adtmm.CTerm#getIterTerm <em>Iter Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.adtmm.AdtmmPackage#getCTerm()
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
	 * @see SOS.adtmm.AdtmmPackage#getCTerm_Iter()
	 * @model
	 * @generated
	 */
	int getIter();

	/**
	 * Sets the value of the '{@link SOS.adtmm.CTerm#getIter <em>Iter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iter</em>' attribute.
	 * @see #getIter()
	 * @generated
	 */
	void setIter(int value);

	/**
	 * Returns the value of the '<em><b>Owned Terms</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.adtmm.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Terms</em>' containment reference list.
	 * @see SOS.adtmm.AdtmmPackage#getCTerm_OwnedTerms()
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
	 * @see SOS.adtmm.AdtmmPackage#getCTerm_Op()
	 * @model required="true"
	 * @generated
	 */
	Operation getOp();

	/**
	 * Sets the value of the '{@link SOS.adtmm.CTerm#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Iter Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iter Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iter Term</em>' containment reference.
	 * @see #setIterTerm(Term)
	 * @see SOS.adtmm.AdtmmPackage#getCTerm_IterTerm()
	 * @model containment="true"
	 * @generated
	 */
	Term getIterTerm();

	/**
	 * Sets the value of the '{@link SOS.adtmm.CTerm#getIterTerm <em>Iter Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iter Term</em>' containment reference.
	 * @see #getIterTerm()
	 * @generated
	 */
	void setIterTerm(Term value);

} // CTerm
