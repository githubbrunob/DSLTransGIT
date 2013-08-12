/**
 * <copyright>
 * </copyright>
 *
 * $Id: ArithmetictermsSwitch.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms.util;

import SATEL.AlgebraicExpressions.arithmeticterms.*;

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
 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage
 * @generated
 */
public class ArithmetictermsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArithmetictermsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetictermsSwitch() {
		if (modelPackage == null) {
			modelPackage = ArithmetictermsPackage.eINSTANCE;
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
			case ArithmetictermsPackage.ARITHMETIC_TERM: {
				ArithmeticTerm arithmeticTerm = (ArithmeticTerm)theEObject;
				T result = caseArithmeticTerm(arithmeticTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmetictermsPackage.INTEGER_VARIABLE: {
				IntegerVariable integerVariable = (IntegerVariable)theEObject;
				T result = caseIntegerVariable(integerVariable);
				if (result == null) result = caseArithmeticTerm(integerVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmetictermsPackage.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				T result = caseIntegerValue(integerValue);
				if (result == null) result = caseArithmeticTerm(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmetictermsPackage.BOP_PLUS: {
				BOPPlus bopPlus = (BOPPlus)theEObject;
				T result = caseBOPPlus(bopPlus);
				if (result == null) result = caseArithmeticTerm(bopPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmetictermsPackage.BOP_MINUS: {
				BOPMinus bopMinus = (BOPMinus)theEObject;
				T result = caseBOPMinus(bopMinus);
				if (result == null) result = caseArithmeticTerm(bopMinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmetictermsPackage.BOP_TIMES: {
				BOPTimes bopTimes = (BOPTimes)theEObject;
				T result = caseBOPTimes(bopTimes);
				if (result == null) result = caseArithmeticTerm(bopTimes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmetictermsPackage.BOP_DIV: {
				BOPDiv bopDiv = (BOPDiv)theEObject;
				T result = caseBOPDiv(bopDiv);
				if (result == null) result = caseArithmeticTerm(bopDiv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmetictermsPackage.NB_EVENTS: {
				NBEvents nbEvents = (NBEvents)theEObject;
				T result = caseNBEvents(nbEvents);
				if (result == null) result = caseArithmeticTerm(nbEvents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmetictermsPackage.DEPTH: {
				Depth depth = (Depth)theEObject;
				T result = caseDepth(depth);
				if (result == null) result = caseArithmeticTerm(depth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArithmetictermsPackage.UOP_MINUS: {
				UOPMinus uopMinus = (UOPMinus)theEObject;
				T result = caseUOPMinus(uopMinus);
				if (result == null) result = caseArithmeticTerm(uopMinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticTerm(ArithmeticTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVariable(IntegerVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOP Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOP Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOPPlus(BOPPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOP Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOP Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOPMinus(BOPMinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOP Times</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOP Times</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOPTimes(BOPTimes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOP Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOP Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOPDiv(BOPDiv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NB Events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NB Events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNBEvents(NBEvents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepth(Depth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UOP Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UOP Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUOPMinus(UOPMinus object) {
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

} //ArithmetictermsSwitch
