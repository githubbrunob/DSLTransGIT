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
 * A representation of the model object '<em><b>Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.FieldDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link Java5.FieldDeclaration#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getFieldDeclaration()
 * @model
 * @generated
 */
public interface FieldDeclaration extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(NamedElementRef)
	 * @see Java5.Java5Package#getFieldDeclaration_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getType();

	/**
	 * Sets the value of the '{@link Java5.FieldDeclaration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NamedElementRef value);

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.VariableDeclarationFragment}.
	 * It is bidirectional and its opposite is '{@link Java5.VariableDeclarationFragment#getFieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see Java5.Java5Package#getFieldDeclaration_Fragments()
	 * @see Java5.VariableDeclarationFragment#getFieldDeclaration
	 * @model opposite="fieldDeclaration" containment="true"
	 * @generated
	 */
	EList<VariableDeclarationFragment> getFragments();

} // FieldDeclaration
