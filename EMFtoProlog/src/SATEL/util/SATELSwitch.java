/**
 * <copyright>
 * </copyright>
 *
 * $Id: SATELSwitch.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.util;

import SATEL.*;

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
 * @see SATEL.SATELPackage
 * @generated
 */
public class SATELSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SATELPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SATELSwitch() {
		if (modelPackage == null) {
			modelPackage = SATELPackage.eINSTANCE;
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
			case SATELPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.TEST_INTENTION_MODULE: {
				TestIntentionModule testIntentionModule = (TestIntentionModule)theEObject;
				T result = caseTestIntentionModule(testIntentionModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.TEST_INTENTION_INTERFACE: {
				TestIntentionInterface testIntentionInterface = (TestIntentionInterface)theEObject;
				T result = caseTestIntentionInterface(testIntentionInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.INTENTION_DEC: {
				IntentionDec intentionDec = (IntentionDec)theEObject;
				T result = caseIntentionDec(intentionDec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.TEST_INTENTION_BODY: {
				TestIntentionBody testIntentionBody = (TestIntentionBody)theEObject;
				T result = caseTestIntentionBody(testIntentionBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.AXIOM_DECLARATION: {
				AxiomDeclaration axiomDeclaration = (AxiomDeclaration)theEObject;
				T result = caseAxiomDeclaration(axiomDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.AXIOM: {
				Axiom axiom = (Axiom)theEObject;
				T result = caseAxiom(axiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.INCLUSION: {
				Inclusion inclusion = (Inclusion)theEObject;
				T result = caseInclusion(inclusion);
				if (result == null) result = caseConditionAtom(inclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.DOMAIN_QUANTIFIER: {
				DomainQuantifier domainQuantifier = (DomainQuantifier)theEObject;
				T result = caseDomainQuantifier(domainQuantifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.UNIFORMITY_LIST: {
				UniformityList uniformityList = (UniformityList)theEObject;
				T result = caseUniformityList(uniformityList);
				if (result == null) result = caseDomainQuantifier(uniformityList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.SUBUNIFORMITY_LIST: {
				SubuniformityList subuniformityList = (SubuniformityList)theEObject;
				T result = caseSubuniformityList(subuniformityList);
				if (result == null) result = caseDomainQuantifier(subuniformityList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.CONDITION_BODY: {
				ConditionBody conditionBody = (ConditionBody)theEObject;
				T result = caseConditionBody(conditionBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.CONDITION_ATOM: {
				ConditionAtom conditionAtom = (ConditionAtom)theEObject;
				T result = caseConditionAtom(conditionAtom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SATELPackage.NAME_LIST: {
				NameList nameList = (NameList)theEObject;
				T result = caseNameList(nameList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Intention Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Intention Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestIntentionModule(TestIntentionModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Intention Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Intention Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestIntentionInterface(TestIntentionInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intention Dec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intention Dec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentionDec(IntentionDec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Intention Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Intention Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestIntentionBody(TestIntentionBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axiom Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axiom Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxiomDeclaration(AxiomDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxiom(Axiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclusion(Inclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Quantifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Quantifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainQuantifier(DomainQuantifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniformity List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniformity List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniformityList(UniformityList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subuniformity List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subuniformity List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubuniformityList(SubuniformityList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionBody(ConditionBody object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Name List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameList(NameList object) {
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

} //SATELSwitch
