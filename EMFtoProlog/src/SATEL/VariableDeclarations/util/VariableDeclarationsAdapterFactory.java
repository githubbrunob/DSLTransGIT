/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableDeclarationsAdapterFactory.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.VariableDeclarations.util;

import SATEL.VariableDeclarations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage
 * @generated
 */
public class VariableDeclarationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VariableDeclarationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VariableDeclarationsPackage.eINSTANCE;
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
	protected VariableDeclarationsSwitch<Adapter> modelSwitch =
		new VariableDeclarationsSwitch<Adapter>() {
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseVariableDec(VariableDec object) {
				return createVariableDecAdapter();
			}
			@Override
			public Adapter casePrimitiveHMLVarDec(PrimitiveHMLVarDec object) {
				return createPrimitiveHMLVarDecAdapter();
			}
			@Override
			public Adapter casePrimitiveStimulationVarDec(PrimitiveStimulationVarDec object) {
				return createPrimitiveStimulationVarDecAdapter();
			}
			@Override
			public Adapter casePrimitiveObservationVarDec(PrimitiveObservationVarDec object) {
				return createPrimitiveObservationVarDecAdapter();
			}
			@Override
			public Adapter casePrimitiveIntegerVarDec(PrimitiveIntegerVarDec object) {
				return createPrimitiveIntegerVarDecAdapter();
			}
			@Override
			public Adapter casePrimitiveBooleanVarDec(PrimitiveBooleanVarDec object) {
				return createPrimitiveBooleanVarDecAdapter();
			}
			@Override
			public Adapter caseAlgebraicSortVarDec(AlgebraicSortVarDec object) {
				return createAlgebraicSortVarDecAdapter();
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
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.VariableDec <em>Variable Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.VariableDec
	 * @generated
	 */
	public Adapter createVariableDecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.PrimitiveHMLVarDec <em>Primitive HML Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.PrimitiveHMLVarDec
	 * @generated
	 */
	public Adapter createPrimitiveHMLVarDecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.PrimitiveStimulationVarDec <em>Primitive Stimulation Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.PrimitiveStimulationVarDec
	 * @generated
	 */
	public Adapter createPrimitiveStimulationVarDecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.PrimitiveObservationVarDec <em>Primitive Observation Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.PrimitiveObservationVarDec
	 * @generated
	 */
	public Adapter createPrimitiveObservationVarDecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.PrimitiveIntegerVarDec <em>Primitive Integer Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.PrimitiveIntegerVarDec
	 * @generated
	 */
	public Adapter createPrimitiveIntegerVarDecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.PrimitiveBooleanVarDec <em>Primitive Boolean Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.PrimitiveBooleanVarDec
	 * @generated
	 */
	public Adapter createPrimitiveBooleanVarDecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.AlgebraicSortVarDec <em>Algebraic Sort Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.AlgebraicSortVarDec
	 * @generated
	 */
	public Adapter createAlgebraicSortVarDecAdapter() {
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

} //VariableDeclarationsAdapterFactory
