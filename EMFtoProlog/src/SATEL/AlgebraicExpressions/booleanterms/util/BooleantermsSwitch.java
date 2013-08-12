/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleantermsSwitch.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms.util;

import SATEL.AlgebraicExpressions.booleanterms.*;

import SATEL.ConditionAtom;

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
 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage
 * @generated
 */
public class BooleantermsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BooleantermsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleantermsSwitch() {
		if (modelPackage == null) {
			modelPackage = BooleantermsPackage.eINSTANCE;
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
			case BooleantermsPackage.BOOLEAN_TERM: {
				BooleanTerm booleanTerm = (BooleanTerm)theEObject;
				T result = caseBooleanTerm(booleanTerm);
				if (result == null) result = caseConditionAtom(booleanTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseBooleanTerm(not);
				if (result == null) result = caseConditionAtom(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = caseBooleanTerm(sequence);
				if (result == null) result = caseConditionAtom(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.POSITIVE: {
				Positive positive = (Positive)theEObject;
				T result = casePositive(positive);
				if (result == null) result = caseBooleanTerm(positive);
				if (result == null) result = caseConditionAtom(positive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.TRACE: {
				Trace trace = (Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = caseBooleanTerm(trace);
				if (result == null) result = caseConditionAtom(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.BOOLEAN_VARIABLE: {
				BooleanVariable booleanVariable = (BooleanVariable)theEObject;
				T result = caseBooleanVariable(booleanVariable);
				if (result == null) result = caseBooleanTerm(booleanVariable);
				if (result == null) result = caseConditionAtom(booleanVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseBooleanTerm(booleanValue);
				if (result == null) result = caseConditionAtom(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.BOP_AND: {
				BOPAnd bopAnd = (BOPAnd)theEObject;
				T result = caseBOPAnd(bopAnd);
				if (result == null) result = caseBooleanTerm(bopAnd);
				if (result == null) result = caseConditionAtom(bopAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.BOP_OR: {
				BOPOr bopOr = (BOPOr)theEObject;
				T result = caseBOPOr(bopOr);
				if (result == null) result = caseBooleanTerm(bopOr);
				if (result == null) result = caseConditionAtom(bopOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.EQUALS: {
				Equals equals = (Equals)theEObject;
				T result = caseEquals(equals);
				if (result == null) result = caseBooleanTerm(equals);
				if (result == null) result = caseConditionAtom(equals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.NOT_EQUALS: {
				NotEquals notEquals = (NotEquals)theEObject;
				T result = caseNotEquals(notEquals);
				if (result == null) result = caseBooleanTerm(notEquals);
				if (result == null) result = caseConditionAtom(notEquals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.GT: {
				GT gt = (GT)theEObject;
				T result = caseGT(gt);
				if (result == null) result = caseBooleanTerm(gt);
				if (result == null) result = caseConditionAtom(gt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.LT: {
				LT lt = (LT)theEObject;
				T result = caseLT(lt);
				if (result == null) result = caseBooleanTerm(lt);
				if (result == null) result = caseConditionAtom(lt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.GTE: {
				GTE gte = (GTE)theEObject;
				T result = caseGTE(gte);
				if (result == null) result = caseBooleanTerm(gte);
				if (result == null) result = caseConditionAtom(gte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BooleantermsPackage.LTE: {
				LTE lte = (LTE)theEObject;
				T result = caseLTE(lte);
				if (result == null) result = caseBooleanTerm(lte);
				if (result == null) result = caseConditionAtom(lte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanTerm(BooleanTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositive(Positive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace(Trace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanVariable(BooleanVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOP And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOP And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOPAnd(BOPAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOP Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOP Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOPOr(BOPOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquals(Equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEquals(NotEquals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGT(GT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLT(LT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GTE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GTE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTE(GTE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTE(LTE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionAtom(ConditionAtom object) {
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

} //BooleantermsSwitch
