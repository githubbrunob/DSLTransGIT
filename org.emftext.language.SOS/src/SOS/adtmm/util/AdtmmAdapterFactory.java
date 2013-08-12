/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm.util;

import SOS.adtmm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SOS.adtmm.AdtmmPackage
 * @generated
 */
public class AdtmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdtmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdtmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdtmmPackage.eINSTANCE;
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
	protected AdtmmSwitch<Adapter> modelSwitch =
		new AdtmmSwitch<Adapter>() {
			@Override
			public Adapter caseADT(ADT object) {
				return createADTAdapter();
			}
			@Override
			public Adapter caseSort(Sort object) {
				return createSortAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseCondEquation(CondEquation object) {
				return createCondEquationAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseVariableRef(VariableRef object) {
				return createVariableRefAdapter();
			}
			@Override
			public Adapter caseCTerm(CTerm object) {
				return createCTermAdapter();
			}
			@Override
			public Adapter caseAbstractEquation(AbstractEquation object) {
				return createAbstractEquationAdapter();
			}
			@Override
			public Adapter caseEquation(Equation object) {
				return createEquationAdapter();
			}
			@Override
			public Adapter caseInequation(Inequation object) {
				return createInequationAdapter();
			}
			@Override
			public Adapter caseAbstractSort(AbstractSort object) {
				return createAbstractSortAdapter();
			}
			@Override
			public Adapter caseAtomicSort(AtomicSort object) {
				return createAtomicSortAdapter();
			}
			@Override
			public Adapter caseSortDeclaration(SortDeclaration object) {
				return createSortDeclarationAdapter();
			}
			@Override
			public Adapter caseAbstractOperation(AbstractOperation object) {
				return createAbstractOperationAdapter();
			}
			@Override
			public Adapter caseAbstractGenericOp(AbstractGenericOp object) {
				return createAbstractGenericOpAdapter();
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
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.ADT <em>ADT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.ADT
	 * @generated
	 */
	public Adapter createADTAdapter() {
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
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.CondEquation <em>Cond Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.CondEquation
	 * @generated
	 */
	public Adapter createCondEquationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.VariableRef
	 * @generated
	 */
	public Adapter createVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.CTerm <em>CTerm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.CTerm
	 * @generated
	 */
	public Adapter createCTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.AbstractEquation <em>Abstract Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.AbstractEquation
	 * @generated
	 */
	public Adapter createAbstractEquationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.Equation
	 * @generated
	 */
	public Adapter createEquationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.Inequation <em>Inequation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.Inequation
	 * @generated
	 */
	public Adapter createInequationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.AbstractSort <em>Abstract Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.AbstractSort
	 * @generated
	 */
	public Adapter createAbstractSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.AtomicSort <em>Atomic Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.AtomicSort
	 * @generated
	 */
	public Adapter createAtomicSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.SortDeclaration <em>Sort Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.SortDeclaration
	 * @generated
	 */
	public Adapter createSortDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.AbstractOperation <em>Abstract Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.AbstractOperation
	 * @generated
	 */
	public Adapter createAbstractOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SOS.adtmm.AbstractGenericOp <em>Abstract Generic Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SOS.adtmm.AbstractGenericOp
	 * @generated
	 */
	public Adapter createAbstractGenericOpAdapter() {
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

} //AdtmmAdapterFactory
