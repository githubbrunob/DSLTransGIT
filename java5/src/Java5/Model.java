/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.Model#getName <em>Name</em>}</li>
 *   <li>{@link Java5.Model#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link Java5.Model#getOrphanTypes <em>Orphan Types</em>}</li>
 *   <li>{@link Java5.Model#getUnresolvedItems <em>Unresolved Items</em>}</li>
 *   <li>{@link Java5.Model#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Java5.Java5Package#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Java5.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.PackageDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see Java5.Java5Package#getModel_OwnedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageDeclaration> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Orphan Types</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.OrphanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orphan Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphan Types</em>' containment reference list.
	 * @see Java5.Java5Package#getModel_OrphanTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrphanType> getOrphanTypes();

	/**
	 * Returns the value of the '<em><b>Unresolved Items</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.UnresolvedItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unresolved Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unresolved Items</em>' containment reference list.
	 * @see Java5.Java5Package#getModel_UnresolvedItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnresolvedItem> getUnresolvedItems();

	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' containment reference list.
	 * @see Java5.Java5Package#getModel_CompilationUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompilationUnit> getCompilationUnits();

} // Model
