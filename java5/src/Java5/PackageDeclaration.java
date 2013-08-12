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
 * A representation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.PackageDeclaration#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link Java5.PackageDeclaration#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link Java5.PackageDeclaration#getOwnedPackages <em>Owned Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getPackageDeclaration()
 * @model
 * @generated
 */
public interface PackageDeclaration extends NamedElement {
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
	 * @see Java5.Java5Package#getPackageDeclaration_QualifiedName()
	 * @model derived="true"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link Java5.PackageDeclaration#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.AbstractTypeDeclaration}.
	 * It is bidirectional and its opposite is '{@link Java5.AbstractTypeDeclaration#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see Java5.Java5Package#getPackageDeclaration_OwnedElements()
	 * @see Java5.AbstractTypeDeclaration#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Owned Packages</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.PackageDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Packages</em>' containment reference list.
	 * @see Java5.Java5Package#getPackageDeclaration_OwnedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageDeclaration> getOwnedPackages();

} // PackageDeclaration
