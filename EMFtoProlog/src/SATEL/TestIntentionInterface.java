/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestIntentionInterface.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Intention Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.TestIntentionInterface#getIntention <em>Intention</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getTestIntentionInterface()
 * @model
 * @generated
 */
public interface TestIntentionInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Intention</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.IntentionDec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intention</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intention</em>' containment reference list.
	 * @see SATEL.SATELPackage#getTestIntentionInterface_Intention()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<IntentionDec> getIntention();

} // TestIntentionInterface
