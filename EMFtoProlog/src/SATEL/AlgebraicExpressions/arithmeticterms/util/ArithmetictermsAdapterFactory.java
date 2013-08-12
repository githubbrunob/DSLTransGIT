/**
 * <copyright>
 * </copyright>
 *
 * $Id: ArithmetictermsAdapterFactory.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms.util;

import SATEL.AlgebraicExpressions.arithmeticterms.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage
 * @generated
 */
public class ArithmetictermsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArithmetictermsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetictermsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArithmetictermsPackage.eINSTANCE;
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
	protected ArithmetictermsSwitch<Adapter> modelSwitch =
		new ArithmetictermsSwitch<Adapter>() {
			@Override
			public Adapter caseArithmeticTerm(ArithmeticTerm object) {
				return createArithmeticTermAdapter();
			}
			@Override
			public Adapter caseIntegerVariable(IntegerVariable object) {
				return createIntegerVariableAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
			}
			@Override
			public Adapter caseBOPPlus(BOPPlus object) {
				return createBOPPlusAdapter();
			}
			@Override
			public Adapter caseBOPMinus(BOPMinus object) {
				return createBOPMinusAdapter();
			}
			@Override
			public Adapter caseBOPTimes(BOPTimes object) {
				return createBOPTimesAdapter();
			}
			@Override
			public Adapter caseBOPDiv(BOPDiv object) {
				return createBOPDivAdapter();
			}
			@Override
			public Adapter caseNBEvents(NBEvents object) {
				return createNBEventsAdapter();
			}
			@Override
			public Adapter caseDepth(Depth object) {
				return createDepthAdapter();
			}
			@Override
			public Adapter caseUOPMinus(UOPMinus object) {
				return createUOPMinusAdapter();
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
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.arithmeticterms.ArithmeticTerm <em>Arithmetic Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmeticTerm
	 * @generated
	 */
	public Adapter createArithmeticTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.IntegerVariable
	 * @generated
	 */
	public Adapter createIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.arithmeticterms.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPPlus <em>BOP Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPPlus
	 * @generated
	 */
	public Adapter createBOPPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPMinus <em>BOP Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPMinus
	 * @generated
	 */
	public Adapter createBOPMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPTimes <em>BOP Times</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPTimes
	 * @generated
	 */
	public Adapter createBOPTimesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv <em>BOP Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.BOPDiv
	 * @generated
	 */
	public Adapter createBOPDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.arithmeticterms.NBEvents <em>NB Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.NBEvents
	 * @generated
	 */
	public Adapter createNBEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.arithmeticterms.Depth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.Depth
	 * @generated
	 */
	public Adapter createDepthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus <em>UOP Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.UOPMinus
	 * @generated
	 */
	public Adapter createUOPMinusAdapter() {
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

} //ArithmetictermsAdapterFactory
