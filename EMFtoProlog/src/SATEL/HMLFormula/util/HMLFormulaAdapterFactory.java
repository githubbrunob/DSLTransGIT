/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLFormulaAdapterFactory.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.HMLFormula.util;

import SATEL.HMLFormula.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.HMLFormula.HMLFormulaPackage
 * @generated
 */
public class HMLFormulaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HMLFormulaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLFormulaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HMLFormulaPackage.eINSTANCE;
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
	protected HMLFormulaSwitch<Adapter> modelSwitch =
		new HMLFormulaSwitch<Adapter>() {
			@Override
			public Adapter caseHMLTerm(HMLTerm object) {
				return createHMLTermAdapter();
			}
			@Override
			public Adapter caseHMLFormula(HMLFormula object) {
				return createHMLFormulaAdapter();
			}
			@Override
			public Adapter caseHMLFormulaHMLFormulaContent(HMLFormulaHMLFormulaContent object) {
				return createHMLFormulaHMLFormulaContentAdapter();
			}
			@Override
			public Adapter caseHMLFormulaPrimitiveHMLVarDec(HMLFormulaPrimitiveHMLVarDec object) {
				return createHMLFormulaPrimitiveHMLVarDecAdapter();
			}
			@Override
			public Adapter caseHMLFormulaContent(HMLFormulaContent object) {
				return createHMLFormulaContentAdapter();
			}
			@Override
			public Adapter caseHMLNext(HMLNext object) {
				return createHMLNextAdapter();
			}
			@Override
			public Adapter caseHMLNot(HMLNot object) {
				return createHMLNotAdapter();
			}
			@Override
			public Adapter caseHMLAnd(HMLAnd object) {
				return createHMLAndAdapter();
			}
			@Override
			public Adapter caseHMLTop(HMLTop object) {
				return createHMLTopAdapter();
			}
			@Override
			public Adapter caseHMLEvent(HMLEvent object) {
				return createHMLEventAdapter();
			}
			@Override
			public Adapter caseSynchronizationTerm(SynchronizationTerm object) {
				return createSynchronizationTermAdapter();
			}
			@Override
			public Adapter caseSynchronizationInputTerm(SynchronizationInputTerm object) {
				return createSynchronizationInputTermAdapter();
			}
			@Override
			public Adapter caseSynchronizationEventInputTerm(SynchronizationEventInputTerm object) {
				return createSynchronizationEventInputTermAdapter();
			}
			@Override
			public Adapter caseSynchronizationOutputTerm(SynchronizationOutputTerm object) {
				return createSynchronizationOutputTermAdapter();
			}
			@Override
			public Adapter caseSynchronizationEventOutputTerm(SynchronizationEventOutputTerm object) {
				return createSynchronizationEventOutputTermAdapter();
			}
			@Override
			public Adapter caseWPrimitiveObservationVarDec(WPrimitiveObservationVarDec object) {
				return createWPrimitiveObservationVarDecAdapter();
			}
			@Override
			public Adapter caseWPrimitiveStimulationVarDec(WPrimitiveStimulationVarDec object) {
				return createWPrimitiveStimulationVarDecAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseInputEvent(InputEvent object) {
				return createInputEventAdapter();
			}
			@Override
			public Adapter caseOutputEvent(OutputEvent object) {
				return createOutputEventAdapter();
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
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.HMLTerm <em>HML Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.HMLTerm
	 * @generated
	 */
	public Adapter createHMLTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.HMLFormula <em>HML Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.HMLFormula
	 * @generated
	 */
	public Adapter createHMLFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.HMLFormulaHMLFormulaContent <em>HML Formula Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.HMLFormulaHMLFormulaContent
	 * @generated
	 */
	public Adapter createHMLFormulaHMLFormulaContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.HMLFormulaPrimitiveHMLVarDec <em>Primitive HML Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.HMLFormulaPrimitiveHMLVarDec
	 * @generated
	 */
	public Adapter createHMLFormulaPrimitiveHMLVarDecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.HMLFormulaContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.HMLFormulaContent
	 * @generated
	 */
	public Adapter createHMLFormulaContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.HMLNext <em>HML Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.HMLNext
	 * @generated
	 */
	public Adapter createHMLNextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.HMLNot <em>HML Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.HMLNot
	 * @generated
	 */
	public Adapter createHMLNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.HMLAnd <em>HML And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.HMLAnd
	 * @generated
	 */
	public Adapter createHMLAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.HMLTop <em>HML Top</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.HMLTop
	 * @generated
	 */
	public Adapter createHMLTopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.HMLEvent <em>HML Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.HMLEvent
	 * @generated
	 */
	public Adapter createHMLEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.SynchronizationTerm <em>Synchronization Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.SynchronizationTerm
	 * @generated
	 */
	public Adapter createSynchronizationTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.SynchronizationInputTerm <em>Synchronization Input Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.SynchronizationInputTerm
	 * @generated
	 */
	public Adapter createSynchronizationInputTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.SynchronizationEventInputTerm <em>Synchronization Event Input Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.SynchronizationEventInputTerm
	 * @generated
	 */
	public Adapter createSynchronizationEventInputTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.SynchronizationOutputTerm <em>Synchronization Output Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.SynchronizationOutputTerm
	 * @generated
	 */
	public Adapter createSynchronizationOutputTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.SynchronizationEventOutputTerm <em>Synchronization Event Output Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.SynchronizationEventOutputTerm
	 * @generated
	 */
	public Adapter createSynchronizationEventOutputTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.WPrimitiveObservationVarDec <em>WPrimitive Observation Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.WPrimitiveObservationVarDec
	 * @generated
	 */
	public Adapter createWPrimitiveObservationVarDecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.WPrimitiveStimulationVarDec <em>WPrimitive Stimulation Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.WPrimitiveStimulationVarDec
	 * @generated
	 */
	public Adapter createWPrimitiveStimulationVarDecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.InputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.InputEvent
	 * @generated
	 */
	public Adapter createInputEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.HMLFormula.OutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.HMLFormula.OutputEvent
	 * @generated
	 */
	public Adapter createOutputEventAdapter() {
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

} //HMLFormulaAdapterFactory
