/**
 * <copyright>
 * </copyright>
 *
 * $Id: SynchronizationEventOutputTerm.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization Event Output Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.SynchronizationEventOutputTerm#getEvent <em>Event</em>}</li>
 *   <li>{@link SATEL.HMLFormula.SynchronizationEventOutputTerm#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.HMLFormula.HMLFormulaPackage#getSynchronizationEventOutputTerm()
 * @model
 * @generated
 */
public interface SynchronizationEventOutputTerm extends SynchronizationOutputTerm {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(OutputEvent)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getSynchronizationEventOutputTerm_Event()
	 * @model required="true"
	 * @generated
	 */
	OutputEvent getEvent();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.SynchronizationEventOutputTerm#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(OutputEvent value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(Parameter)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getSynchronizationEventOutputTerm_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getParameters();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.SynchronizationEventOutputTerm#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Parameter value);

} // SynchronizationEventOutputTerm
