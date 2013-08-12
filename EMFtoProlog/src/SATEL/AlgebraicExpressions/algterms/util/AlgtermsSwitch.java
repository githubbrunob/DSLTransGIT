/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgtermsSwitch.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.algterms.util;

import SATEL.AlgebraicExpressions.algterms.*;

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
 * @see SATEL.AlgebraicExpressions.algterms.AlgtermsPackage
 * @generated
 */
public class AlgtermsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlgtermsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgtermsSwitch() {
		if (modelPackage == null) {
			modelPackage = AlgtermsPackage.eINSTANCE;
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
			case AlgtermsPackage.ALGEBRAIC_TERM: {
				AlgebraicTerm algebraicTerm = (AlgebraicTerm)theEObject;
				T result = caseAlgebraicTerm(algebraicTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgtermsPackage.VARIABLE_REF: {
				VariableRef variableRef = (VariableRef)theEObject;
				T result = caseVariableRef(variableRef);
				if (result == null) result = caseAlgebraicTerm(variableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgtermsPackage.ABSTRACT_COMPOSITE_TERM: {
				AbstractCompositeTerm abstractCompositeTerm = (AbstractCompositeTerm)theEObject;
				T result = caseAbstractCompositeTerm(abstractCompositeTerm);
				if (result == null) result = caseAlgebraicTerm(abstractCompositeTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlgtermsPackage.COMPOSITE_TERM: {
				CompositeTerm compositeTerm = (CompositeTerm)theEObject;
				T result = caseCompositeTerm(compositeTerm);
				if (result == null) result = caseAbstractCompositeTerm(compositeTerm);
				if (result == null) result = caseAlgebraicTerm(compositeTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algebraic Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algebraic Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgebraicTerm(AlgebraicTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRef(VariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Composite Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Composite Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCompositeTerm(AbstractCompositeTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeTerm(CompositeTerm object) {
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

} //AlgtermsSwitch
