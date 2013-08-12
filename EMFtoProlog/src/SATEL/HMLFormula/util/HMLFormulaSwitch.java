/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLFormulaSwitch.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.HMLFormula.util;

import SATEL.HMLFormula.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see SATEL.HMLFormula.HMLFormulaPackage
 * @generated
 */
public class HMLFormulaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HMLFormulaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLFormulaSwitch() {
		if (modelPackage == null) {
			modelPackage = HMLFormulaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HMLFormulaPackage.HML_TERM: {
				HMLTerm hmlTerm = (HMLTerm)theEObject;
				T result = caseHMLTerm(hmlTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.HML_FORMULA: {
				HMLFormula hmlFormula = (HMLFormula)theEObject;
				T result = caseHMLFormula(hmlFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT: {
				HMLFormulaHMLFormulaContent hmlFormulaHMLFormulaContent = (HMLFormulaHMLFormulaContent)theEObject;
				T result = caseHMLFormulaHMLFormulaContent(hmlFormulaHMLFormulaContent);
				if (result == null) result = caseHMLFormula(hmlFormulaHMLFormulaContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.HML_FORMULA_PRIMITIVE_HML_VAR_DEC: {
				HMLFormulaPrimitiveHMLVarDec hmlFormulaPrimitiveHMLVarDec = (HMLFormulaPrimitiveHMLVarDec)theEObject;
				T result = caseHMLFormulaPrimitiveHMLVarDec(hmlFormulaPrimitiveHMLVarDec);
				if (result == null) result = caseHMLFormula(hmlFormulaPrimitiveHMLVarDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.HML_FORMULA_CONTENT: {
				HMLFormulaContent hmlFormulaContent = (HMLFormulaContent)theEObject;
				T result = caseHMLFormulaContent(hmlFormulaContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.HML_NEXT: {
				HMLNext hmlNext = (HMLNext)theEObject;
				T result = caseHMLNext(hmlNext);
				if (result == null) result = caseHMLFormulaContent(hmlNext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.HML_NOT: {
				HMLNot hmlNot = (HMLNot)theEObject;
				T result = caseHMLNot(hmlNot);
				if (result == null) result = caseHMLFormulaContent(hmlNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.HML_AND: {
				HMLAnd hmlAnd = (HMLAnd)theEObject;
				T result = caseHMLAnd(hmlAnd);
				if (result == null) result = caseHMLFormulaContent(hmlAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.HML_TOP: {
				HMLTop hmlTop = (HMLTop)theEObject;
				T result = caseHMLTop(hmlTop);
				if (result == null) result = caseHMLFormulaContent(hmlTop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.HML_EVENT: {
				HMLEvent hmlEvent = (HMLEvent)theEObject;
				T result = caseHMLEvent(hmlEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.SYNCHRONIZATION_TERM: {
				SynchronizationTerm synchronizationTerm = (SynchronizationTerm)theEObject;
				T result = caseSynchronizationTerm(synchronizationTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.SYNCHRONIZATION_INPUT_TERM: {
				SynchronizationInputTerm synchronizationInputTerm = (SynchronizationInputTerm)theEObject;
				T result = caseSynchronizationInputTerm(synchronizationInputTerm);
				if (result == null) result = caseSynchronizationTerm(synchronizationInputTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_INPUT_TERM: {
				SynchronizationEventInputTerm synchronizationEventInputTerm = (SynchronizationEventInputTerm)theEObject;
				T result = caseSynchronizationEventInputTerm(synchronizationEventInputTerm);
				if (result == null) result = caseSynchronizationInputTerm(synchronizationEventInputTerm);
				if (result == null) result = caseSynchronizationTerm(synchronizationEventInputTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.SYNCHRONIZATION_OUTPUT_TERM: {
				SynchronizationOutputTerm synchronizationOutputTerm = (SynchronizationOutputTerm)theEObject;
				T result = caseSynchronizationOutputTerm(synchronizationOutputTerm);
				if (result == null) result = caseSynchronizationTerm(synchronizationOutputTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM: {
				SynchronizationEventOutputTerm synchronizationEventOutputTerm = (SynchronizationEventOutputTerm)theEObject;
				T result = caseSynchronizationEventOutputTerm(synchronizationEventOutputTerm);
				if (result == null) result = caseSynchronizationOutputTerm(synchronizationEventOutputTerm);
				if (result == null) result = caseSynchronizationTerm(synchronizationEventOutputTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.WPRIMITIVE_OBSERVATION_VAR_DEC: {
				WPrimitiveObservationVarDec wPrimitiveObservationVarDec = (WPrimitiveObservationVarDec)theEObject;
				T result = caseWPrimitiveObservationVarDec(wPrimitiveObservationVarDec);
				if (result == null) result = caseSynchronizationOutputTerm(wPrimitiveObservationVarDec);
				if (result == null) result = caseSynchronizationTerm(wPrimitiveObservationVarDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.WPRIMITIVE_STIMULATION_VAR_DEC: {
				WPrimitiveStimulationVarDec wPrimitiveStimulationVarDec = (WPrimitiveStimulationVarDec)theEObject;
				T result = caseWPrimitiveStimulationVarDec(wPrimitiveStimulationVarDec);
				if (result == null) result = caseSynchronizationInputTerm(wPrimitiveStimulationVarDec);
				if (result == null) result = caseSynchronizationTerm(wPrimitiveStimulationVarDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.INPUT_EVENT: {
				InputEvent inputEvent = (InputEvent)theEObject;
				T result = caseInputEvent(inputEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HMLFormulaPackage.OUTPUT_EVENT: {
				OutputEvent outputEvent = (OutputEvent)theEObject;
				T result = caseOutputEvent(outputEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HML Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HML Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLTerm(HMLTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HML Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HML Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLFormula(HMLFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HML Formula Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HML Formula Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLFormulaHMLFormulaContent(HMLFormulaHMLFormulaContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive HML Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive HML Var Dec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLFormulaPrimitiveHMLVarDec(HMLFormulaPrimitiveHMLVarDec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLFormulaContent(HMLFormulaContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HML Next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HML Next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLNext(HMLNext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HML Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HML Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLNot(HMLNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HML And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HML And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLAnd(HMLAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HML Top</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HML Top</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLTop(HMLTop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HML Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HML Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLEvent(HMLEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationTerm(SynchronizationTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Input Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Input Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationInputTerm(SynchronizationInputTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Event Input Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Event Input Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationEventInputTerm(SynchronizationEventInputTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Output Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Output Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationOutputTerm(SynchronizationOutputTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Event Output Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Event Output Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationEventOutputTerm(SynchronizationEventOutputTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WPrimitive Observation Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WPrimitive Observation Var Dec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWPrimitiveObservationVarDec(WPrimitiveObservationVarDec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WPrimitive Stimulation Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WPrimitive Stimulation Var Dec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWPrimitiveStimulationVarDec(WPrimitiveStimulationVarDec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputEvent(InputEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputEvent(OutputEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HMLFormulaSwitch
