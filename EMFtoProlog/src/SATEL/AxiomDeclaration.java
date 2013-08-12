/**
 * <copyright>
 * </copyright>
 *
 * $Id: AxiomDeclaration.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axiom Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AxiomDeclaration#getAxiom <em>Axiom</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getAxiomDeclaration()
 * @model
 * @generated
 */
public interface AxiomDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Axiom</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.Axiom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axiom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axiom</em>' containment reference list.
	 * @see SATEL.SATELPackage#getAxiomDeclaration_Axiom()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Axiom> getAxiom();

} // AxiomDeclaration
