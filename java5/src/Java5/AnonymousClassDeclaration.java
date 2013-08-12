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
 * A representation of the model object '<em><b>Anonymous Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.AnonymousClassDeclaration#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link Java5.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getAnonymousClassDeclaration()
 * @model
 * @generated
 */
public interface AnonymousClassDeclaration extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Body Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.BodyDeclaration}.
	 * It is bidirectional and its opposite is '{@link Java5.BodyDeclaration#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declarations</em>' containment reference list.
	 * @see Java5.Java5Package#getAnonymousClassDeclaration_BodyDeclarations()
	 * @see Java5.BodyDeclaration#getAnonymousClassDeclarationOwner
	 * @model opposite="anonymousClassDeclarationOwner" containment="true"
	 * @generated
	 */
	EList<BodyDeclaration> getBodyDeclarations();

	/**
	 * Returns the value of the '<em><b>Class Instance Creation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.ClassInstanceCreation#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Instance Creation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Instance Creation</em>' container reference.
	 * @see #setClassInstanceCreation(ClassInstanceCreation)
	 * @see Java5.Java5Package#getAnonymousClassDeclaration_ClassInstanceCreation()
	 * @see Java5.ClassInstanceCreation#getAnonymousClassDeclaration
	 * @model opposite="anonymousClassDeclaration"
	 * @generated
	 */
	ClassInstanceCreation getClassInstanceCreation();

	/**
	 * Sets the value of the '{@link Java5.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Instance Creation</em>' container reference.
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	void setClassInstanceCreation(ClassInstanceCreation value);

} // AnonymousClassDeclaration
