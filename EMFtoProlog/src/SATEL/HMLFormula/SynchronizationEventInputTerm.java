/**
 * <copyright>
 * </copyright>
 *
 * $Id: SynchronizationEventInputTerm.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization Event Input Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.SynchronizationEventInputTerm#getEvent <em>Event</em>}</li>
 *   <li>{@link SATEL.HMLFormula.SynchronizationEventInputTerm#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.HMLFormula.HMLFormulaPackage#getSynchronizationEventInputTerm()
 * @model
 * @generated
 */
public interface SynchronizationEventInputTerm extends SynchronizationInputTerm {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(InputEvent)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getSynchronizationEventInputTerm_Event()
	 * @model required="true"
	 * @generated
	 */
	InputEvent getEvent();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.SynchronizationEventInputTerm#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(InputEvent value);

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
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getSynchronizationEventInputTerm_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getParameters();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.SynchronizationEventInputTerm#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Parameter value);

} // SynchronizationEventInputTerm
