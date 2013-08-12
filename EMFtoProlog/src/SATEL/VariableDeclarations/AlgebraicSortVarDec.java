/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgebraicSortVarDec.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.VariableDeclarations;

import SATEL.APN.adtmm.SortDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algebraic Sort Var Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.VariableDeclarations.AlgebraicSortVarDec#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getAlgebraicSortVarDec()
 * @model
 * @generated
 */
public interface AlgebraicSortVarDec extends VariableDec {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SortDeclaration)
	 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getAlgebraicSortVarDec_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SortDeclaration getType();

	/**
	 * Sets the value of the '{@link SATEL.VariableDeclarations.AlgebraicSortVarDec#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SortDeclaration value);

} // AlgebraicSortVarDec
