/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.adtmm.Variable#getVariableSort <em>Variable Sort</em>}</li>
 *   <li>{@link SOS.adtmm.Variable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.adtmm.AdtmmPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Sort</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Sort</em>' containment reference.
	 * @see #setVariableSort(Sort)
	 * @see SOS.adtmm.AdtmmPackage#getVariable_VariableSort()
	 * @model containment="true"
	 * @generated
	 */
	Sort getVariableSort();

	/**
	 * Sets the value of the '{@link SOS.adtmm.Variable#getVariableSort <em>Variable Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Sort</em>' containment reference.
	 * @see #getVariableSort()
	 * @generated
	 */
	void setVariableSort(Sort value);

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
	 * @see SOS.adtmm.AdtmmPackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SOS.adtmm.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Variable
