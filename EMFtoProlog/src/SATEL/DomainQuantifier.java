/**
 * <copyright>
 * </copyright>
 *
 * $Id: DomainQuantifier.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Quantifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.DomainQuantifier#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getDomainQuantifier()
 * @model abstract="true"
 * @generated
 */
public interface DomainQuantifier extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(NameList)
	 * @see SATEL.SATELPackage#getDomainQuantifier_List()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NameList getList();

	/**
	 * Sets the value of the '{@link SATEL.DomainQuantifier#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(NameList value);

} // DomainQuantifier
