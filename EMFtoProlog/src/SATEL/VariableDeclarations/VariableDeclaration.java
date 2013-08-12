/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableDeclaration.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.VariableDeclarations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.VariableDeclarations.VariableDeclaration#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.VariableDeclarations.VariableDec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage#getVariableDeclaration_Variable()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableDec> getVariable();

} // VariableDeclaration
