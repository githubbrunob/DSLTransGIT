/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableDeclarationsSwitch.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.VariableDeclarations.util;

import SATEL.VariableDeclarations.*;

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
 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage
 * @generated
 */
public class VariableDeclarationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VariableDeclarationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationsSwitch() {
		if (modelPackage == null) {
			modelPackage = VariableDeclarationsPackage.eINSTANCE;
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
			case VariableDeclarationsPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariableDeclarationsPackage.VARIABLE_DEC: {
				VariableDec variableDec = (VariableDec)theEObject;
				T result = caseVariableDec(variableDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariableDeclarationsPackage.PRIMITIVE_HML_VAR_DEC: {
				PrimitiveHMLVarDec primitiveHMLVarDec = (PrimitiveHMLVarDec)theEObject;
				T result = casePrimitiveHMLVarDec(primitiveHMLVarDec);
				if (result == null) result = caseVariableDec(primitiveHMLVarDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC: {
				PrimitiveStimulationVarDec primitiveStimulationVarDec = (PrimitiveStimulationVarDec)theEObject;
				T result = casePrimitiveStimulationVarDec(primitiveStimulationVarDec);
				if (result == null) result = caseVariableDec(primitiveStimulationVarDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariableDeclarationsPackage.PRIMITIVE_OBSERVATION_VAR_DEC: {
				PrimitiveObservationVarDec primitiveObservationVarDec = (PrimitiveObservationVarDec)theEObject;
				T result = casePrimitiveObservationVarDec(primitiveObservationVarDec);
				if (result == null) result = caseVariableDec(primitiveObservationVarDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariableDeclarationsPackage.PRIMITIVE_INTEGER_VAR_DEC: {
				PrimitiveIntegerVarDec primitiveIntegerVarDec = (PrimitiveIntegerVarDec)theEObject;
				T result = casePrimitiveIntegerVarDec(primitiveIntegerVarDec);
				if (result == null) result = caseVariableDec(primitiveIntegerVarDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariableDeclarationsPackage.PRIMITIVE_BOOLEAN_VAR_DEC: {
				PrimitiveBooleanVarDec primitiveBooleanVarDec = (PrimitiveBooleanVarDec)theEObject;
				T result = casePrimitiveBooleanVarDec(primitiveBooleanVarDec);
				if (result == null) result = caseVariableDec(primitiveBooleanVarDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariableDeclarationsPackage.ALGEBRAIC_SORT_VAR_DEC: {
				AlgebraicSortVarDec algebraicSortVarDec = (AlgebraicSortVarDec)theEObject;
				T result = caseAlgebraicSortVarDec(algebraicSortVarDec);
				if (result == null) result = caseVariableDec(algebraicSortVarDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Dec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Dec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDec(VariableDec object) {
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
	public T casePrimitiveHMLVarDec(PrimitiveHMLVarDec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Stimulation Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Stimulation Var Dec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveStimulationVarDec(PrimitiveStimulationVarDec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Observation Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Observation Var Dec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveObservationVarDec(PrimitiveObservationVarDec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Integer Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Integer Var Dec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveIntegerVarDec(PrimitiveIntegerVarDec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Boolean Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Boolean Var Dec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveBooleanVarDec(PrimitiveBooleanVarDec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algebraic Sort Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algebraic Sort Var Dec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgebraicSortVarDec(AlgebraicSortVarDec object) {
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

} //VariableDeclarationsSwitch
