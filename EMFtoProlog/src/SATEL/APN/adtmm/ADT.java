/**
 * <copyright>
 * </copyright>
 *
 * $Id: ADT.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.APN.adtmm;

import SATEL.APN.environmentmm.Environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.ADT#getOwnedSorts <em>Owned Sorts</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.ADT#getOwnedOperations <em>Owned Operations</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.ADT#getOwnedGenerators <em>Owned Generators</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.ADT#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.ADT#getOwnedAxioms <em>Owned Axioms</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.ADT#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.adtmm.AdtmmPackage#getADT()
 * @model
 * @generated
 */
public interface ADT extends Environment {
	/**
	 * Returns the value of the '<em><b>Owned Sorts</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.SortDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sorts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sorts</em>' containment reference list.
	 * @see SATEL.APN.adtmm.AdtmmPackage#getADT_OwnedSorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<SortDeclaration> getOwnedSorts();

	/**
	 * Returns the value of the '<em><b>Owned Operations</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operations</em>' containment reference list.
	 * @see SATEL.APN.adtmm.AdtmmPackage#getADT_OwnedOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperations();

	/**
	 * Returns the value of the '<em><b>Owned Generators</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Generators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Generators</em>' containment reference list.
	 * @see SATEL.APN.adtmm.AdtmmPackage#getADT_OwnedGenerators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedGenerators();

	/**
	 * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variables</em>' containment reference list.
	 * @see SATEL.APN.adtmm.AdtmmPackage#getADT_OwnedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

	/**
	 * Returns the value of the '<em><b>Owned Axioms</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.CondEquation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Axioms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Axioms</em>' containment reference list.
	 * @see SATEL.APN.adtmm.AdtmmPackage#getADT_OwnedAxioms()
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
	 * @see SATEL.APN.adtmm.AdtmmPackage#getADT_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SATEL.APN.adtmm.ADT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ADT
