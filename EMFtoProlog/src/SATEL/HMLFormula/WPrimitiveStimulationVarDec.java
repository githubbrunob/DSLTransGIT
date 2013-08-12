/**
 * <copyright>
 * </copyright>
 *
 * $Id: WPrimitiveStimulationVarDec.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;

import SATEL.VariableDeclarations.PrimitiveStimulationVarDec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WPrimitive Stimulation Var Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.WPrimitiveStimulationVarDec#getPrimitiveStimulation <em>Primitive Stimulation</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.HMLFormula.HMLFormulaPackage#getWPrimitiveStimulationVarDec()
 * @model
 * @generated
 */
public interface WPrimitiveStimulationVarDec extends SynchronizationInputTerm {
	/**
	 * Returns the value of the '<em><b>Primitive Stimulation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Stimulation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Stimulation</em>' reference.
	 * @see #setPrimitiveStimulation(PrimitiveStimulationVarDec)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getWPrimitiveStimulationVarDec_PrimitiveStimulation()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveStimulationVarDec getPrimitiveStimulation();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.WPrimitiveStimulationVarDec#getPrimitiveStimulation <em>Primitive Stimulation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Stimulation</em>' reference.
	 * @see #getPrimitiveStimulation()
	 * @generated
	 */
	void setPrimitiveStimulation(PrimitiveStimulationVarDec value);

} // WPrimitiveStimulationVarDec
