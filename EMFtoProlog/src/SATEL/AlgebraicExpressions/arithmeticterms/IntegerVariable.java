/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntegerVariable.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms;

import SATEL.VariableDeclarations.PrimitiveIntegerVarDec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable#getIntegerVariable <em>Integer Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getIntegerVariable()
 * @model
 * @generated
 */
public interface IntegerVariable extends ArithmeticTerm {
	/**
	 * Returns the value of the '<em><b>Integer Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Variable</em>' reference.
	 * @see #setIntegerVariable(PrimitiveIntegerVarDec)
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getIntegerVariable_IntegerVariable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PrimitiveIntegerVarDec getIntegerVariable();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable#getIntegerVariable <em>Integer Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Variable</em>' reference.
	 * @see #getIntegerVariable()
	 * @generated
	 */
	void setIntegerVariable(PrimitiveIntegerVarDec value);

} // IntegerVariable
