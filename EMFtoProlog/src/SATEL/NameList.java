/**
 * <copyright>
 * </copyright>
 *
 * $Id: NameList.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import SATEL.VariableDeclarations.VariableDec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.NameList#getNameRef <em>Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getNameList()
 * @model
 * @generated
 */
public interface NameList extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Ref</b></em>' reference list.
	 * The list contents are of type {@link SATEL.VariableDeclarations.VariableDec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Ref</em>' reference list.
	 * @see SATEL.SATELPackage#getNameList_NameRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<VariableDec> getNameRef();

} // NameList
