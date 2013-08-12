/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.ImportDeclaration#isStatic <em>Static</em>}</li>
 *   <li>{@link Java5.ImportDeclaration#getImportedElement <em>Imported Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getImportDeclaration()
 * @model
 * @generated
 */
public interface ImportDeclaration extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see Java5.Java5Package#getImportDeclaration_Static()
	 * @model
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link Java5.ImportDeclaration#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Element</em>' containment reference.
	 * @see #setImportedElement(NamedElementRef)
	 * @see Java5.Java5Package#getImportDeclaration_ImportedElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getImportedElement();

	/**
	 * Sets the value of the '{@link Java5.ImportDeclaration#getImportedElement <em>Imported Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Element</em>' containment reference.
	 * @see #getImportedElement()
	 * @generated
	 */
	void setImportedElement(NamedElementRef value);

} // ImportDeclaration
