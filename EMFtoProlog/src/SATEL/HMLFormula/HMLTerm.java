/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLTerm.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HML Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.HMLTerm#getHmlFormula <em>Hml Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLTerm()
 * @model
 * @generated
 */
public interface HMLTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Hml Formula</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.HMLFormula.HMLFormula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hml Formula</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hml Formula</em>' containment reference list.
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLTerm_HmlFormula()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<HMLFormula> getHmlFormula();

} // HMLTerm
