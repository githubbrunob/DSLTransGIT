/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgebraicExpressionsAdapterFactory.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.util;

import SATEL.AlgebraicExpressions.*;

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
 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage
 * @generated
 */
public class AlgebraicExpressionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlgebraicExpressionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicExpressionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AlgebraicExpressionsPackage.eINSTANCE;
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
	protected AlgebraicExpressionsSwitch<Adapter> modelSwitch =
		new AlgebraicExpressionsSwitch<Adapter>() {
			@Override
			public Adapter caseAlgebraicEquality(AlgebraicEquality object) {
				return createAlgebraicEqualityAdapter();
			}
			@Override
			public Adapter caseAlgEquality(AlgEquality object) {
				return createAlgEqualityAdapter();
			}
			@Override
			public Adapter caseSyncEquality(SyncEquality object) {
				return createSyncEqualityAdapter();
			}
			@Override
			public Adapter caseHMLEquality(HMLEquality object) {
				return createHMLEqualityAdapter();
			}
			@Override
			public Adapter caseBooleanEquality(BooleanEquality object) {
				return createBooleanEqualityAdapter();
			}
			@Override
			public Adapter caseArithmeticEquality(ArithmeticEquality object) {
				return createArithmeticEqualityAdapter();
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
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.AlgebraicEquality <em>Algebraic Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.AlgebraicEquality
	 * @generated
	 */
	public Adapter createAlgebraicEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.AlgEquality <em>Alg Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.AlgEquality
	 * @generated
	 */
	public Adapter createAlgEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.SyncEquality <em>Sync Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.SyncEquality
	 * @generated
	 */
	public Adapter createSyncEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.HMLEquality <em>HML Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.HMLEquality
	 * @generated
	 */
	public Adapter createHMLEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.BooleanEquality <em>Boolean Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.BooleanEquality
	 * @generated
	 */
	public Adapter createBooleanEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.ArithmeticEquality <em>Arithmetic Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.ArithmeticEquality
	 * @generated
	 */
	public Adapter createArithmeticEqualityAdapter() {
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

} //AlgebraicExpressionsAdapterFactory
