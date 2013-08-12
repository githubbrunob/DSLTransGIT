/**
 * <copyright>
 * </copyright>
 *
 * $Id: Model.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.Model#getTestIntentionModule <em>Test Intention Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Intention Module</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.TestIntentionModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Intention Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Intention Module</em>' containment reference list.
	 * @see SATEL.SATELPackage#getModel_TestIntentionModule()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<TestIntentionModule> getTestIntentionModule();

} // Model
