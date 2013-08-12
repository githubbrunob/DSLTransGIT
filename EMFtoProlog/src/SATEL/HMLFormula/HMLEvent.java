/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLEvent.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HML Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.HMLEvent#getInputTerm <em>Input Term</em>}</li>
 *   <li>{@link SATEL.HMLFormula.HMLEvent#getOutputTerm <em>Output Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLEvent()
 * @model
 * @generated
 */
public interface HMLEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Term</em>' containment reference.
	 * @see #setInputTerm(SynchronizationInputTerm)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLEvent_InputTerm()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	SynchronizationInputTerm getInputTerm();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.HMLEvent#getInputTerm <em>Input Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Term</em>' containment reference.
	 * @see #getInputTerm()
	 * @generated
	 */
	void setInputTerm(SynchronizationInputTerm value);

	/**
	 * Returns the value of the '<em><b>Output Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Term</em>' containment reference.
	 * @see #setOutputTerm(SynchronizationOutputTerm)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLEvent_OutputTerm()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SynchronizationOutputTerm getOutputTerm();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.HMLEvent#getOutputTerm <em>Output Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Term</em>' containment reference.
	 * @see #getOutputTerm()
	 * @generated
	 */
	void setOutputTerm(SynchronizationOutputTerm value);

} // HMLEvent
