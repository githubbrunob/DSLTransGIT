/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableDec.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.VariableDeclarations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.VariableDeclarations.VariableDec#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getVariableDec()
 * @model abstract="true"
 * @generated
 */
public interface VariableDec extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getVariableDec_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SATEL.VariableDeclarations.VariableDec#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VariableDec
