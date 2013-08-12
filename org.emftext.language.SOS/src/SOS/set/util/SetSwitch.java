/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set.util;

import SOS.adtmm.Sort;
import SOS.adtmm.Term;

import SOS.set.*;

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
 * @see SOS.set.SetPackage
 * @generated
 */
public class SetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetSwitch() {
		if (modelPackage == null) {
			modelPackage = SetPackage.eINSTANCE;
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
			case SetPackage.MODEL_SORT: {
				ModelSort modelSort = (ModelSort)theEObject;
				T result = caseModelSort(modelSort);
				if (result == null) result = caseSort(modelSort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.SET_MEMBERSHIP: {
				SetMembership setMembership = (SetMembership)theEObject;
				T result = caseSetMembership(setMembership);
				if (result == null) result = caseSetTerm(setMembership);
				if (result == null) result = caseTerm(setMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.SET_TERM: {
				SetTerm setTerm = (SetTerm)theEObject;
				T result = caseSetTerm(setTerm);
				if (result == null) result = caseTerm(setTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.MODEL_SET: {
				ModelSet modelSet = (ModelSet)theEObject;
				T result = caseModelSet(modelSet);
				if (result == null) result = caseSetTerm(modelSet);
				if (result == null) result = caseTerm(modelSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.SET_OPERATOR: {
				SetOperator setOperator = (SetOperator)theEObject;
				T result = caseSetOperator(setOperator);
				if (result == null) result = caseSetTerm(setOperator);
				if (result == null) result = caseTerm(setOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.SET_CONSTRUCTOR: {
				SetConstructor setConstructor = (SetConstructor)theEObject;
				T result = caseSetConstructor(setConstructor);
				if (result == null) result = caseSetTerm(setConstructor);
				if (result == null) result = caseTerm(setConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = caseSetOperator(union);
				if (result == null) result = caseSetTerm(union);
				if (result == null) result = caseTerm(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.EXCLUDING: {
				Excluding excluding = (Excluding)theEObject;
				T result = caseExcluding(excluding);
				if (result == null) result = caseSetOperator(excluding);
				if (result == null) result = caseSetTerm(excluding);
				if (result == null) result = caseTerm(excluding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.INTERSECTION: {
				Intersection intersection = (Intersection)theEObject;
				T result = caseIntersection(intersection);
				if (result == null) result = caseSetOperator(intersection);
				if (result == null) result = caseSetTerm(intersection);
				if (result == null) result = caseTerm(intersection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.MODEL_RELATION: {
				ModelRelation modelRelation = (ModelRelation)theEObject;
				T result = caseModelRelation(modelRelation);
				if (result == null) result = caseTerm(modelRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.MODEL_CLASS_ATTRIBUTE: {
				ModelClassAttribute modelClassAttribute = (ModelClassAttribute)theEObject;
				T result = caseModelClassAttribute(modelClassAttribute);
				if (result == null) result = caseTerm(modelClassAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.SET: {
				Set set = (Set)theEObject;
				T result = caseSet(set);
				if (result == null) result = caseSort(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.EXISTS_IN: {
				ExistsIn existsIn = (ExistsIn)theEObject;
				T result = caseExistsIn(existsIn);
				if (result == null) result = caseSetMembership(existsIn);
				if (result == null) result = caseSetTerm(existsIn);
				if (result == null) result = caseTerm(existsIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetPackage.FOR_ALL_IN: {
				ForAllIn forAllIn = (ForAllIn)theEObject;
				T result = caseForAllIn(forAllIn);
				if (result == null) result = caseSetMembership(forAllIn);
				if (result == null) result = caseSetTerm(forAllIn);
				if (result == null) result = caseTerm(forAllIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelSort(ModelSort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetMembership(SetMembership object) {
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
	public T caseSetTerm(SetTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelSet(ModelSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetOperator(SetOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetConstructor(SetConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excluding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excluding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcluding(Excluding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intersection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intersection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntersection(Intersection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelRelation(ModelRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Class Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelClassAttribute(ModelClassAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exists In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exists In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistsIn(ExistsIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For All In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For All In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForAllIn(ForAllIn object) {
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

} //SetSwitch
