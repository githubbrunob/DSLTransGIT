/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractCompositeTerm.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.algterms;

import SATEL.APN.adtmm.Operation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Composite Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getTerms <em>Terms</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getOp <em>Op</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getIter <em>Iter</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.algterms.AlgtermsPackage#getAbstractCompositeTerm()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCompositeTerm extends AlgebraicTerm {
	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.AlgebraicExpressions.algterms.AlgebraicTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see SATEL.AlgebraicExpressions.algterms.AlgtermsPackage#getAbstractCompositeTerm_Terms()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AlgebraicTerm> getTerms();

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
	 * @see SATEL.AlgebraicExpressions.algterms.AlgtermsPackage#getAbstractCompositeTerm_Op()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getOp();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Iter</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iter</em>' attribute.
	 * @see #setIter(int)
	 * @see SATEL.AlgebraicExpressions.algterms.AlgtermsPackage#getAbstractCompositeTerm_Iter()
	 * @model default="0"
	 * @generated
	 */
	int getIter();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getIter <em>Iter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iter</em>' attribute.
	 * @see #getIter()
	 * @generated
	 */
	void setIter(int value);

} // AbstractCompositeTerm
