/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgtermsAdapterFactory.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.algterms.util;

import SATEL.AlgebraicExpressions.algterms.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.AlgebraicExpressions.algterms.AlgtermsPackage
 * @generated
 */
public class AlgtermsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlgtermsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgtermsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AlgtermsPackage.eINSTANCE;
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
	protected AlgtermsSwitch<Adapter> modelSwitch =
		new AlgtermsSwitch<Adapter>() {
			@Override
			public Adapter caseAlgebraicTerm(AlgebraicTerm object) {
				return createAlgebraicTermAdapter();
			}
			@Override
			public Adapter caseVariableRef(VariableRef object) {
				return createVariableRefAdapter();
			}
			@Override
			public Adapter caseAbstractCompositeTerm(AbstractCompositeTerm object) {
				return createAbstractCompositeTermAdapter();
			}
			@Override
			public Adapter caseCompositeTerm(CompositeTerm object) {
				return createCompositeTermAdapter();
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
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.algterms.AlgebraicTerm <em>Algebraic Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.algterms.AlgebraicTerm
	 * @generated
	 */
	public Adapter createAlgebraicTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.algterms.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.algterms.VariableRef
	 * @generated
	 */
	public Adapter createVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm <em>Abstract Composite Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm
	 * @generated
	 */
	public Adapter createAbstractCompositeTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.algterms.CompositeTerm <em>Composite Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.algterms.CompositeTerm
	 * @generated
	 */
	public Adapter createCompositeTermAdapter() {
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

} //AlgtermsAdapterFactory
