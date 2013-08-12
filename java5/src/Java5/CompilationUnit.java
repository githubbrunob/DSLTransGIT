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
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.CompilationUnit#getImports <em>Imports</em>}</li>
 *   <li>{@link Java5.CompilationUnit#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link Java5.CompilationUnit#getPackage <em>Package</em>}</li>
 *   <li>{@link Java5.CompilationUnit#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link Java5.ImportDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see Java5.Java5Package#getCompilationUnit_Imports()
	 * @model
	 * @generated
	 */
	EList<ImportDeclaration> getImports();

	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' attribute.
	 * @see #setOriginalFilePath(String)
	 * @see Java5.Java5Package#getCompilationUnit_OriginalFilePath()
	 * @model
	 * @generated
	 */
	String getOriginalFilePath();

	/**
	 * Sets the value of the '{@link Java5.CompilationUnit#getOriginalFilePath <em>Original File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original File Path</em>' attribute.
	 * @see #getOriginalFilePath()
	 * @generated
	 */
	void setOriginalFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(PackageDeclaration)
	 * @see Java5.Java5Package#getCompilationUnit_Package()
	 * @model
	 * @generated
	 */
	PackageDeclaration getPackage();

	/**
	 * Sets the value of the '{@link Java5.CompilationUnit#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(PackageDeclaration value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link Java5.AbstractTypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see Java5.Java5Package#getCompilationUnit_Types()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getTypes();

} // CompilationUnit
