/**
 * <copyright>
 * </copyright>
 *
 * $Id: Model.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package mprolog;

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
 *   <li>{@link mprolog.Model#getName <em>Name</em>}</li>
 *   <li>{@link mprolog.Model#getOwnedClause <em>Owned Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprolog.MprologPackage#getModel()
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
	 * @see mprolog.MprologPackage#getModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mprolog.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Clause</b></em>' containment reference list.
	 * The list contents are of type {@link mprolog.Clause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Clause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Clause</em>' containment reference list.
	 * @see mprolog.MprologPackage#getModel_OwnedClause()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clause> getOwnedClause();

} // Model
