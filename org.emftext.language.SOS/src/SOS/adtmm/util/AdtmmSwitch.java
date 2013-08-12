/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm.util;

import SOS.adtmm.*;

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
 * @see SOS.adtmm.AdtmmPackage
 * @generated
 */
public class AdtmmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdtmmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdtmmSwitch() {
		if (modelPackage == null) {
			modelPackage = AdtmmPackage.eINSTANCE;
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
			case AdtmmPackage.ADT: {
				ADT adt = (ADT)theEObject;
				T result = caseADT(adt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.SORT: {
				Sort sort = (Sort)theEObject;
				T result = caseSort(sort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseAbstractOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.COND_EQUATION: {
				CondEquation condEquation = (CondEquation)theEObject;
				T result = caseCondEquation(condEquation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.VARIABLE_REF: {
				VariableRef variableRef = (VariableRef)theEObject;
				T result = caseVariableRef(variableRef);
				if (result == null) result = caseTerm(variableRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.CTERM: {
				CTerm cTerm = (CTerm)theEObject;
				T result = caseCTerm(cTerm);
				if (result == null) result = caseTerm(cTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.ABSTRACT_EQUATION: {
				AbstractEquation abstractEquation = (AbstractEquation)theEObject;
				T result = caseAbstractEquation(abstractEquation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.EQUATION: {
				Equation equation = (Equation)theEObject;
				T result = caseEquation(equation);
				if (result == null) result = caseAbstractEquation(equation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.INEQUATION: {
				Inequation inequation = (Inequation)theEObject;
				T result = caseInequation(inequation);
				if (result == null) result = caseAbstractEquation(inequation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.ABSTRACT_SORT: {
				AbstractSort abstractSort = (AbstractSort)theEObject;
				T result = caseAbstractSort(abstractSort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.ATOMIC_SORT: {
				AtomicSort atomicSort = (AtomicSort)theEObject;
				T result = caseAtomicSort(atomicSort);
				if (result == null) result = caseSort(atomicSort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.SORT_DECLARATION: {
				SortDeclaration sortDeclaration = (SortDeclaration)theEObject;
				T result = caseSortDeclaration(sortDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.ABSTRACT_OPERATION: {
				AbstractOperation abstractOperation = (AbstractOperation)theEObject;
				T result = caseAbstractOperation(abstractOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdtmmPackage.ABSTRACT_GENERIC_OP: {
				AbstractGenericOp abstractGenericOp = (AbstractGenericOp)theEObject;
				T result = caseAbstractGenericOp(abstractGenericOp);
				if (result == null) result = caseAbstractOperation(abstractGenericOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADT(ADT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSort(Sort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cond Equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cond Equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondEquation(CondEquation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>CTerm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CTerm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCTerm(CTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEquation(AbstractEquation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquation(Equation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inequation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inequation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInequation(Inequation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSort(AbstractSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicSort(AtomicSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortDeclaration(SortDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOperation(AbstractOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Generic Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Generic Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGenericOp(AbstractGenericOp object) {
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

} //AdtmmSwitch
