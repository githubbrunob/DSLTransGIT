/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Text;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Text.File#getInnerBlock <em>Inner Block</em>}</li>
 *   <li>{@link Text.File#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see Text.TextPackage#getFile()
 * @model
 * @generated
 */
public interface File extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Inner Block</b></em>' containment reference list.
	 * The list contents are of type {@link Text.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Block</em>' containment reference list.
	 * @see Text.TextPackage#getFile_InnerBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getInnerBlock();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see Text.TextPackage#getFile_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link Text.File#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // File
