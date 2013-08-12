/**
 * <copyright>
 * </copyright>
 *
 * $Id: Gate.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.apnmm;

import SATEL.HMLFormula.OutputEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.Gate#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.apnmm.ApnmmPackage#getGate()
 * @model
 * @generated
 */
public interface Gate extends OutputEvent {
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
	 * @see SATEL.APN.apnmm.ApnmmPackage#getGate_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.Gate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Gate
