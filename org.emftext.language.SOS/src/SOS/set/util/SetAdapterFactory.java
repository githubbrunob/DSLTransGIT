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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SOS.set.SetPackage
 * @generated
 */
public class SetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SetPackage.eINSTANCE;
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
	protected SetSwitch<Adapter> modelSwitch =
		new SetSwitch<Adapter>() {
			@Override
			public Adapter caseModelSort(ModelSort object) {
				return createModelSortAdapter();
			}
			@Override
			public Adapter caseSetMembership(SetMembership object) {
				return createSetMembershipAdapter();
			}
			@Override
			public Adapter caseSetTerm(SetTerm object) {
				return createSetTermAdapter();
			}
			@Override
			public Adapter caseModelSet(ModelSet object) {
				return createModelSetAdapter();
			}
			@Override
			public Adapter caseSetOperator(SetOperator object) {
				return createSetOperatorAdapter();
			}
			@Override
			public Adapter caseSetConstructor(SetConstructor object) {
				return createSetConstructorAdapter();
			}
			@Override
			public Adapter caseUnion(Union object) {
				return createUnionAdapter();
			}
			@Override
			public Adapter caseExcluding(Excluding object) {
				return createExcludingAdapter();
			}
			@Override
			public Adapter caseIntersection(Intersection object) {
				return createIntersectionAdapter();
			}
			@Override
			public Adapter caseModelRelation(ModelRelation object) {
				return createModelRelationAdapter();
			}
			@Override
			public Adapter caseModelClassAttribute(ModelClassAttribute object) {
				return createModelClassAttributeAdapter();
			}
			@Override
			public Adapter caseSet(Set object) {
				return createSetAdapter();
			}
			@Override
			public Adapter caseExistsIn(ExistsIn object) {
				return createExistsInAdapter();
			}
			@Override
			public Adapter caseForAllIn(ForAllIn object) {
				return createForAllInAdapter();
			}
			@Override
			public Adapter caseSort(Sort object) {
				return createSortAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
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
	 * Creates a new adapter for an object of class '{@link SOS.set.ModelSort <em>Model Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.ModelSort
	 * @generated
	 */
	public Adapter createModelSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.SetMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.SetMembership
	 * @generated
	 */
	public Adapter createSetMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.SetTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.SetTerm
	 * @generated
	 */
	public Adapter createSetTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.ModelSet <em>Model Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.ModelSet
	 * @generated
	 */
	public Adapter createModelSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.SetOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.SetOperator
	 * @generated
	 */
	public Adapter createSetOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.SetConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.SetConstructor
	 * @generated
	 */
	public Adapter createSetConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.Excluding <em>Excluding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.Excluding
	 * @generated
	 */
	public Adapter createExcludingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.Intersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.Intersection
	 * @generated
	 */
	public Adapter createIntersectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.ModelRelation <em>Model Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.ModelRelation
	 * @generated
	 */
	public Adapter createModelRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.ModelClassAttribute <em>Model Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.ModelClassAttribute
	 * @generated
	 */
	public Adapter createModelClassAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.Set
	 * @generated
	 */
	public Adapter createSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.ExistsIn <em>Exists In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.ExistsIn
	 * @generated
	 */
	public Adapter createExistsInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.set.ForAllIn <em>For All In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.set.ForAllIn
	 * @generated
	 */
	public Adapter createForAllInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.Sort
	 * @generated
	 */
	public Adapter createSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
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

} //SetAdapterFactory
