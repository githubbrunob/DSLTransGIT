/**
 * <copyright>
 * </copyright>
 *
 * $Id: WPrimitiveObservationVarDec.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;

import SATEL.VariableDeclarations.PrimitiveObservationVarDec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WPrimitive Observation Var Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.WPrimitiveObservationVarDec#getPrimitiveObservation <em>Primitive Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.HMLFormula.HMLFormulaPackage#getWPrimitiveObservationVarDec()
 * @model
 * @generated
 */
public interface WPrimitiveObservationVarDec extends SynchronizationOutputTerm {
	/**
	 * Returns the value of the '<em><b>Primitive Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Observation</em>' reference.
	 * @see #setPrimitiveObservation(PrimitiveObservationVarDec)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getWPrimitiveObservationVarDec_PrimitiveObservation()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveObservationVarDec getPrimitiveObservation();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.WPrimitiveObservationVarDec#getPrimitiveObservation <em>Primitive Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Observation</em>' reference.
	 * @see #getPrimitiveObservation()
	 * @generated
	 */
	void setPrimitiveObservation(PrimitiveObservationVarDec value);

} // WPrimitiveObservationVarDec
