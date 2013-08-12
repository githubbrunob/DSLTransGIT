/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleantermsAdapterFactory.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms.util;

import SATEL.AlgebraicExpressions.booleanterms.*;

import SATEL.ConditionAtom;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage
 * @generated
 */
public class BooleantermsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BooleantermsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleantermsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BooleantermsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleantermsSwitch<Adapter> modelSwitch =
		new BooleantermsSwitch<Adapter>() {
			@Override
			public Adapter caseBooleanTerm(BooleanTerm object) {
				return createBooleanTermAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter casePositive(Positive object) {
				return createPositiveAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseBooleanVariable(BooleanVariable object) {
				return createBooleanVariableAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseBOPAnd(BOPAnd object) {
				return createBOPAndAdapter();
			}
			@Override
			public Adapter caseBOPOr(BOPOr object) {
				return createBOPOrAdapter();
			}
			@Override
			public Adapter caseEquals(Equals object) {
				return createEqualsAdapter();
			}
			@Override
			public Adapter caseNotEquals(NotEquals object) {
				return createNotEqualsAdapter();
			}
			@Override
			public Adapter caseGT(GT object) {
				return createGTAdapter();
			}
			@Override
			public Adapter caseLT(LT object) {
				return createLTAdapter();
			}
			@Override
			public Adapter caseGTE(GTE object) {
				return createGTEAdapter();
			}
			@Override
			public Adapter caseLTE(LTE object) {
				return createLTEAdapter();
			}
			@Override
			public Adapter caseConditionAtom(ConditionAtom object) {
				return createConditionAtomAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.BooleanTerm <em>Boolean Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleanTerm
	 * @generated
	 */
	public Adapter createBooleanTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.Positive <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Positive
	 * @generated
	 */
	public Adapter createPositiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleanVariable
	 * @generated
	 */
	public Adapter createBooleanVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.BOPAnd <em>BOP And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BOPAnd
	 * @generated
	 */
	public Adapter createBOPAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.BOPOr <em>BOP Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.BOPOr
	 * @generated
	 */
	public Adapter createBOPOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.Equals
	 * @generated
	 */
	public Adapter createEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.NotEquals <em>Not Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.NotEquals
	 * @generated
	 */
	public Adapter createNotEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.GT <em>GT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.GT
	 * @generated
	 */
	public Adapter createGTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.LT <em>LT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.LT
	 * @generated
	 */
	public Adapter createLTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.GTE <em>GTE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.GTE
	 * @generated
	 */
	public Adapter createGTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.booleanterms.LTE <em>LTE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.booleanterms.LTE
	 * @generated
	 */
	public Adapter createLTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.ConditionAtom <em>Condition Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.ConditionAtom
	 * @generated
	 */
	public Adapter createConditionAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BooleantermsAdapterFactory
