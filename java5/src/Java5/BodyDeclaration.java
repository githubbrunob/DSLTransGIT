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
 * A representation of the model object '<em><b>Body Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.BodyDeclaration#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}</li>
 *   <li>{@link Java5.BodyDeclaration#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link Java5.BodyDeclaration#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}</li>
 *   <li>{@link Java5.BodyDeclaration#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getBodyDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface BodyDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.AbstractTypeDeclaration#getBodyDeclarations <em>Body Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Type Declaration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Type Declaration</em>' container reference.
	 * @see #setAbstractTypeDeclaration(AbstractTypeDeclaration)
	 * @see Java5.Java5Package#getBodyDeclaration_AbstractTypeDeclaration()
	 * @see Java5.AbstractTypeDeclaration#getBodyDeclarations
	 * @model opposite="bodyDeclarations"
	 * @generated
	 */
	AbstractTypeDeclaration getAbstractTypeDeclaration();

	/**
	 * Sets the value of the '{@link Java5.BodyDeclaration#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Type Declaration</em>' container reference.
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	void setAbstractTypeDeclaration(AbstractTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see Java5.Java5Package#getBodyDeclaration_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.AnonymousClassDeclaration#getBodyDeclarations <em>Body Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous Class Declaration Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class Declaration Owner</em>' container reference.
	 * @see #setAnonymousClassDeclarationOwner(AnonymousClassDeclaration)
	 * @see Java5.Java5Package#getBodyDeclaration_AnonymousClassDeclarationOwner()
	 * @see Java5.AnonymousClassDeclaration#getBodyDeclarations
	 * @model opposite="bodyDeclarations"
	 * @generated
	 */
	AnonymousClassDeclaration getAnonymousClassDeclarationOwner();

	/**
	 * Sets the value of the '{@link Java5.BodyDeclaration#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous Class Declaration Owner</em>' container reference.
	 * @see #getAnonymousClassDeclarationOwner()
	 * @generated
	 */
	void setAnonymousClassDeclarationOwner(AnonymousClassDeclaration value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.Modifier}.
	 * It is bidirectional and its opposite is '{@link Java5.Modifier#getBodyDeclaration <em>Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see Java5.Java5Package#getBodyDeclaration_Modifiers()
	 * @see Java5.Modifier#getBodyDeclaration
	 * @model opposite="BodyDeclaration" containment="true"
	 * @generated
	 */
	EList<Modifier> getModifiers();

} // BodyDeclaration
