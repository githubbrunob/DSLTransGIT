/**
 * <copyright>
 * </copyright>
 *
 * $Id: SortDeclaration.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.APN.adtmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.SortDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.adtmm.AdtmmPackage#getSortDeclaration()
 * @model
 * @generated
 */
public interface SortDeclaration extends EObject {
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
	 * @see SATEL.APN.adtmm.AdtmmPackage#getSortDeclaration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SATEL.APN.adtmm.SortDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SortDeclaration
