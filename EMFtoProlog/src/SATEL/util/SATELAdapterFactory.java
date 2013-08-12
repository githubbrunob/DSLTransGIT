/**
 * <copyright>
 * </copyright>
 *
 * $Id: SATELAdapterFactory.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.util;

import SATEL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.SATELPackage
 * @generated
 */
public class SATELAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SATELPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SATELAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SATELPackage.eINSTANCE;
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
	protected SATELSwitch<Adapter> modelSwitch =
		new SATELSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseTestIntentionModule(TestIntentionModule object) {
				return createTestIntentionModuleAdapter();
			}
			@Override
			public Adapter caseTestIntentionInterface(TestIntentionInterface object) {
				return createTestIntentionInterfaceAdapter();
			}
			@Override
			public Adapter caseIntentionDec(IntentionDec object) {
				return createIntentionDecAdapter();
			}
			@Override
			public Adapter caseTestIntentionBody(TestIntentionBody object) {
				return createTestIntentionBodyAdapter();
			}
			@Override
			public Adapter caseAxiomDeclaration(AxiomDeclaration object) {
				return createAxiomDeclarationAdapter();
			}
			@Override
			public Adapter caseAxiom(Axiom object) {
				return createAxiomAdapter();
			}
			@Override
			public Adapter caseInclusion(Inclusion object) {
				return createInclusionAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseDomainQuantifier(DomainQuantifier object) {
				return createDomainQuantifierAdapter();
			}
			@Override
			public Adapter caseUniformityList(UniformityList object) {
				return createUniformityListAdapter();
			}
			@Override
			public Adapter caseSubuniformityList(SubuniformityList object) {
				return createSubuniformityListAdapter();
			}
			@Override
			public Adapter caseConditionBody(ConditionBody object) {
				return createConditionBodyAdapter();
			}
			@Override
			public Adapter caseConditionAtom(ConditionAtom object) {
				return createConditionAtomAdapter();
			}
			@Override
			public Adapter caseNameList(NameList object) {
				return createNameListAdapter();
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
	 * Creates a new adapter for an object of class '{@link SATEL.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.TestIntentionModule <em>Test Intention Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.TestIntentionModule
	 * @generated
	 */
	public Adapter createTestIntentionModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.TestIntentionInterface <em>Test Intention Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.TestIntentionInterface
	 * @generated
	 */
	public Adapter createTestIntentionInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.IntentionDec <em>Intention Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.IntentionDec
	 * @generated
	 */
	public Adapter createIntentionDecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.TestIntentionBody <em>Test Intention Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.TestIntentionBody
	 * @generated
	 */
	public Adapter createTestIntentionBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.AxiomDeclaration <em>Axiom Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.AxiomDeclaration
	 * @generated
	 */
	public Adapter createAxiomDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.Axiom <em>Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.Axiom
	 * @generated
	 */
	public Adapter createAxiomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.Inclusion <em>Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.Inclusion
	 * @generated
	 */
	public Adapter createInclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.DomainQuantifier <em>Domain Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.DomainQuantifier
	 * @generated
	 */
	public Adapter createDomainQuantifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.UniformityList <em>Uniformity List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.UniformityList
	 * @generated
	 */
	public Adapter createUniformityListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.SubuniformityList <em>Subuniformity List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.SubuniformityList
	 * @generated
	 */
	public Adapter createSubuniformityListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.ConditionBody <em>Condition Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.ConditionBody
	 * @generated
	 */
	public Adapter createConditionBodyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link SATEL.NameList <em>Name List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.NameList
	 * @generated
	 */
	public Adapter createNameListAdapter() {
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

} //SATELAdapterFactory
