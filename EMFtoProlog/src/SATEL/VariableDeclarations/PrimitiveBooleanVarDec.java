/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveBooleanVarDec.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.VariableDeclarations;

import SATEL.VariableDeclarations.Types.PrimitiveBoolean;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Boolean Var Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.VariableDeclarations.PrimitiveBooleanVarDec#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getPrimitiveBooleanVarDec()
 * @model
 * @generated
 */
public interface PrimitiveBooleanVarDec extends VariableDec {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(PrimitiveBoolean)
	 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getPrimitiveBooleanVarDec_Type()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PrimitiveBoolean getType();

	/**
	 * Sets the value of the '{@link SATEL.VariableDeclarations.PrimitiveBooleanVarDec#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveBoolean value);

} // PrimitiveBooleanVarDec
