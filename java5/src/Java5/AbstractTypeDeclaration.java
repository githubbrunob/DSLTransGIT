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
 * A representation of the model object '<em><b>Abstract Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.AbstractTypeDeclaration#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link Java5.AbstractTypeDeclaration#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link Java5.AbstractTypeDeclaration#getImports <em>Imports</em>}</li>
 *   <li>{@link Java5.AbstractTypeDeclaration#getPackage <em>Package</em>}</li>
 *   <li>{@link Java5.AbstractTypeDeclaration#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getAbstractTypeDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTypeDeclaration extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see Java5.Java5Package#getAbstractTypeDeclaration_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link Java5.AbstractTypeDeclaration#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Body Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.BodyDeclaration}.
	 * It is bidirectional and its opposite is '{@link Java5.BodyDeclaration#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declarations</em>' containment reference list.
	 * @see Java5.Java5Package#getAbstractTypeDeclaration_BodyDeclarations()
	 * @see Java5.BodyDeclaration#getAbstractTypeDeclaration
	 * @model opposite="abstractTypeDeclaration" containment="true"
	 * @generated
	 */
	EList<BodyDeclaration> getBodyDeclarations();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.ImportDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see Java5.Java5Package#getAbstractTypeDeclaration_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportDeclaration> getImports();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Java5.PackageDeclaration#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(PackageDeclaration)
	 * @see Java5.Java5Package#getAbstractTypeDeclaration_Package()
	 * @see Java5.PackageDeclaration#getOwnedElements
	 * @model opposite="ownedElements"
	 * @generated
	 */
	PackageDeclaration getPackage();

	/**
	 * Sets the value of the '{@link Java5.AbstractTypeDeclaration#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(PackageDeclaration value);

	/**
	 * Returns the value of the '<em><b>Super Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.NamedElementRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Interfaces</em>' containment reference list.
	 * @see Java5.Java5Package#getAbstractTypeDeclaration_SuperInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElementRef> getSuperInterfaces();

} // AbstractTypeDeclaration
