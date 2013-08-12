/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.adtmm.ADT#getOwnedSorts <em>Owned Sorts</em>}</li>
 *   <li>{@link SOS.adtmm.ADT#getOwnedOperations <em>Owned Operations</em>}</li>
 *   <li>{@link SOS.adtmm.ADT#getOwnedGenerators <em>Owned Generators</em>}</li>
 *   <li>{@link SOS.adtmm.ADT#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link SOS.adtmm.ADT#getOwnedAxioms <em>Owned Axioms</em>}</li>
 *   <li>{@link SOS.adtmm.ADT#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.adtmm.AdtmmPackage#getADT()
 * @model
 * @generated
 */
public interface ADT extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Sorts</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.adtmm.SortDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sorts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sorts</em>' containment reference list.
	 * @see SOS.adtmm.AdtmmPackage#getADT_OwnedSorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortDeclaration> getOwnedSorts();

	/**
	 * Returns the value of the '<em><b>Owned Operations</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.adtmm.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operations</em>' containment reference list.
	 * @see SOS.adtmm.AdtmmPackage#getADT_OwnedOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperations();

	/**
	 * Returns the value of the '<em><b>Owned Generators</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.adtmm.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Generators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Generators</em>' containment reference list.
	 * @see SOS.adtmm.AdtmmPackage#getADT_OwnedGenerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedGenerators();

	/**
	 * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.adtmm.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variables</em>' containment reference list.
	 * @see SOS.adtmm.AdtmmPackage#getADT_OwnedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

	/**
	 * Returns the value of the '<em><b>Owned Axioms</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.adtmm.CondEquation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Axioms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Axioms</em>' containment reference list.
	 * @see SOS.adtmm.AdtmmPackage#getADT_OwnedAxioms()
	 * @model containment="true"
	 * @generated
	 */
	EList<CondEquation> getOwnedAxioms();

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
	 * @see SOS.adtmm.AdtmmPackage#getADT_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SOS.adtmm.ADT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ADT
