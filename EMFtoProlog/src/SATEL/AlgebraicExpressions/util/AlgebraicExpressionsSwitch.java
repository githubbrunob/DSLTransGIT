/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgebraicExpressionsSwitch.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.util;

import SATEL.AlgebraicExpressions.*;

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
 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage
 * @generated
 */
public class AlgebraicExpressionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlgebraicExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicExpressionsSwitch() {
		if (modelPackage == null) {
			modelPackage = AlgebraicExpressionsPackage.eINSTANCE;
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
			case AlgebraicExpressionsPackage.ALGEBRAIC_EQUALITY: {
				AlgebraicEquality algebraicEquality = (AlgebraicEquality)theEObject;
				T result = caseAlgebraicEquality(algebraicEquality);
				if (result == null) result = caseConditionAtom(algebraicEquality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgebraicExpressionsPackage.ALG_EQUALITY: {
				AlgEquality algEquality = (AlgEquality)theEObject;
				T result = caseAlgEquality(algEquality);
				if (result == null) result = caseAlgebraicEquality(algEquality);
				if (result == null) result = caseConditionAtom(algEquality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgebraicExpressionsPackage.SYNC_EQUALITY: {
				SyncEquality syncEquality = (SyncEquality)theEObject;
				T result = caseSyncEquality(syncEquality);
				if (result == null) result = caseAlgebraicEquality(syncEquality);
				if (result == null) result = caseConditionAtom(syncEquality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgebraicExpressionsPackage.HML_EQUALITY: {
				HMLEquality hmlEquality = (HMLEquality)theEObject;
				T result = caseHMLEquality(hmlEquality);
				if (result == null) result = caseAlgebraicEquality(hmlEquality);
				if (result == null) result = caseConditionAtom(hmlEquality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgebraicExpressionsPackage.BOOLEAN_EQUALITY: {
				BooleanEquality booleanEquality = (BooleanEquality)theEObject;
				T result = caseBooleanEquality(booleanEquality);
				if (result == null) result = caseAlgebraicEquality(booleanEquality);
				if (result == null) result = caseConditionAtom(booleanEquality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgebraicExpressionsPackage.ARITHMETIC_EQUALITY: {
				ArithmeticEquality arithmeticEquality = (ArithmeticEquality)theEObject;
				T result = caseArithmeticEquality(arithmeticEquality);
				if (result == null) result = caseAlgebraicEquality(arithmeticEquality);
				if (result == null) result = caseConditionAtom(arithmeticEquality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algebraic Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algebraic Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgebraicEquality(AlgebraicEquality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alg Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alg Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgEquality(AlgEquality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sync Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sync Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyncEquality(SyncEquality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HML Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HML Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMLEquality(HMLEquality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanEquality(BooleanEquality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticEquality(ArithmeticEquality object) {
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

} //AlgebraicExpressionsSwitch
