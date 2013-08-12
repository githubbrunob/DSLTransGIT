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
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Text.Line#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see Text.TextPackage#getLine()
 * @model abstract="true"
 * @generated
 */
public interface Line extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link Text.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see Text.TextPackage#getLine_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContent();

} // Line
