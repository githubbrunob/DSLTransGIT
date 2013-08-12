/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestIntentionBody.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import SATEL.VariableDeclarations.VariableDeclaration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Intention Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.TestIntentionBody#getAxiomDeclaration <em>Axiom Declaration</em>}</li>
 *   <li>{@link SATEL.TestIntentionBody#getVariableDeclaration <em>Variable Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getTestIntentionBody()
 * @model
 * @generated
 */
public interface TestIntentionBody extends EObject {
	/**
	 * Returns the value of the '<em><b>Axiom Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axiom Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axiom Declaration</em>' containment reference.
	 * @see #setAxiomDeclaration(AxiomDeclaration)
	 * @see SATEL.SATELPackage#getTestIntentionBody_AxiomDeclaration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AxiomDeclaration getAxiomDeclaration();

	/**
	 * Sets the value of the '{@link SATEL.TestIntentionBody#getAxiomDeclaration <em>Axiom Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axiom Declaration</em>' containment reference.
	 * @see #getAxiomDeclaration()
	 * @generated
	 */
	void setAxiomDeclaration(AxiomDeclaration value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration</em>' containment reference.
	 * @see #setVariableDeclaration(VariableDeclaration)
	 * @see SATEL.SATELPackage#getTestIntentionBody_VariableDeclaration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	VariableDeclaration getVariableDeclaration();

	/**
	 * Sets the value of the '{@link SATEL.TestIntentionBody#getVariableDeclaration <em>Variable Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration</em>' containment reference.
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	void setVariableDeclaration(VariableDeclaration value);

} // TestIntentionBody
