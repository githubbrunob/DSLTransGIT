/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveHMLVarDec.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.VariableDeclarations;

import SATEL.VariableDeclarations.Types.PrimitiveHML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive HML Var Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.VariableDeclarations.PrimitiveHMLVarDec#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getPrimitiveHMLVarDec()
 * @model
 * @generated
 */
public interface PrimitiveHMLVarDec extends VariableDec {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(PrimitiveHML)
	 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getPrimitiveHMLVarDec_Type()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PrimitiveHML getType();

	/**
	 * Sets the value of the '{@link SATEL.VariableDeclarations.PrimitiveHMLVarDec#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveHML value);

} // PrimitiveHMLVarDec
