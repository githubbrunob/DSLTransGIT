/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Text;

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
 *   <li>{@link Text.Model#getDirectory <em>Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see Text.TextPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Directory</b></em>' containment reference list.
	 * The list contents are of type {@link Text.Directory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' containment reference list.
	 * @see Text.TextPackage#getModel_Directory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Directory> getDirectory();

} // Model
