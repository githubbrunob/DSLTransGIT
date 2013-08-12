/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableRef.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.algterms;

import SATEL.VariableDeclarations.AlgebraicSortVarDec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.algterms.VariableRef#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.algterms.AlgtermsPackage#getVariableRef()
 * @model
 * @generated
 */
public interface VariableRef extends AlgebraicTerm {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(AlgebraicSortVarDec)
	 * @see SATEL.AlgebraicExpressions.algterms.AlgtermsPackage#getVariableRef_Var()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AlgebraicSortVarDec getVar();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.algterms.VariableRef#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(AlgebraicSortVarDec value);

} // VariableRef
