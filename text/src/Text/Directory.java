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
 * A representation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Text.Directory#getDirectory <em>Directory</em>}</li>
 *   <li>{@link Text.Directory#getFile <em>File</em>}</li>
 *   <li>{@link Text.Directory#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see Text.TextPackage#getDirectory()
 * @model
 * @generated
 */
public interface Directory extends NamedElement {
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
	 * @see Text.TextPackage#getDirectory_Directory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Directory> getDirectory();

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference list.
	 * The list contents are of type {@link Text.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference list.
	 * @see Text.TextPackage#getDirectory_File()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFile();

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
	 * @see Text.TextPackage#getDirectory_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link Text.Directory#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // Directory
