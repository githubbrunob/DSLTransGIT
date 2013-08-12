/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveIntegerVarDec.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.VariableDeclarations;

import SATEL.VariableDeclarations.Types.PrimitiveInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Integer Var Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.VariableDeclarations.PrimitiveIntegerVarDec#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getPrimitiveIntegerVarDec()
 * @model
 * @generated
 */
public interface PrimitiveIntegerVarDec extends VariableDec {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(PrimitiveInteger)
	 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getPrimitiveIntegerVarDec_Type()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PrimitiveInteger getType();

	/**
	 * Sets the value of the '{@link SATEL.VariableDeclarations.PrimitiveIntegerVarDec#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveInteger value);

} // PrimitiveIntegerVarDec
