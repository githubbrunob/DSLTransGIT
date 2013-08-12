/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanVariable.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms;

import SATEL.VariableDeclarations.PrimitiveBooleanVarDec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.BooleanVariable#getBooleanVariable <em>Boolean Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getBooleanVariable()
 * @model
 * @generated
 */
public interface BooleanVariable extends BooleanTerm {
	/**
	 * Returns the value of the '<em><b>Boolean Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Variable</em>' reference.
	 * @see #setBooleanVariable(PrimitiveBooleanVarDec)
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getBooleanVariable_BooleanVariable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PrimitiveBooleanVarDec getBooleanVariable();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.booleanterms.BooleanVariable#getBooleanVariable <em>Boolean Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Variable</em>' reference.
	 * @see #getBooleanVariable()
	 * @generated
	 */
	void setBooleanVariable(PrimitiveBooleanVarDec value);

} // BooleanVariable
