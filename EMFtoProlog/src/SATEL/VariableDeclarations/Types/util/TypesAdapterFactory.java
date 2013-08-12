/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypesAdapterFactory.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.VariableDeclarations.Types.util;

import SATEL.VariableDeclarations.Types.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.VariableDeclarations.Types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
	protected TypesSwitch<Adapter> modelSwitch =
		new TypesSwitch<Adapter>() {
			@Override
			public Adapter caseVarDecType(VarDecType object) {
				return createVarDecTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveHML(PrimitiveHML object) {
				return createPrimitiveHMLAdapter();
			}
			@Override
			public Adapter casePrimitiveStimulation(PrimitiveStimulation object) {
				return createPrimitiveStimulationAdapter();
			}
			@Override
			public Adapter casePrimitiveObservation(PrimitiveObservation object) {
				return createPrimitiveObservationAdapter();
			}
			@Override
			public Adapter casePrimitiveInteger(PrimitiveInteger object) {
				return createPrimitiveIntegerAdapter();
			}
			@Override
			public Adapter casePrimitiveBoolean(PrimitiveBoolean object) {
				return createPrimitiveBooleanAdapter();
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
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.Types.VarDecType <em>Var Dec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.Types.VarDecType
	 * @generated
	 */
	public Adapter createVarDecTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.Types.PrimitiveHML <em>Primitive HML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.Types.PrimitiveHML
	 * @generated
	 */
	public Adapter createPrimitiveHMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.Types.PrimitiveStimulation <em>Primitive Stimulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.Types.PrimitiveStimulation
	 * @generated
	 */
	public Adapter createPrimitiveStimulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.Types.PrimitiveObservation <em>Primitive Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.Types.PrimitiveObservation
	 * @generated
	 */
	public Adapter createPrimitiveObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.Types.PrimitiveInteger <em>Primitive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.Types.PrimitiveInteger
	 * @generated
	 */
	public Adapter createPrimitiveIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.VariableDeclarations.Types.PrimitiveBoolean <em>Primitive Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.VariableDeclarations.Types.PrimitiveBoolean
	 * @generated
	 */
	public Adapter createPrimitiveBooleanAdapter() {
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

} //TypesAdapterFactory
