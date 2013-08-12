/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.TypeParameter#getBounds <em>Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.NamedElementRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference list.
	 * @see Java5.Java5Package#getTypeParameter_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElementRef> getBounds();

} // TypeParameter
