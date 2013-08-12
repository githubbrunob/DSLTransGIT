/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultisetmmAdapterFactory.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.multisetmm.util;

import SATEL.APN.environmentmm.Environment;

import SATEL.APN.multisetmm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.APN.multisetmm.MultisetmmPackage
 * @generated
 */
public class MultisetmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MultisetmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultisetmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MultisetmmPackage.eINSTANCE;
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
	protected MultisetmmSwitch<Adapter> modelSwitch =
		new MultisetmmSwitch<Adapter>() {
			@Override
			public Adapter caseMultiset(Multiset object) {
				return createMultisetAdapter();
			}
			@Override
			public Adapter caseNumOfTerms(NumOfTerms object) {
				return createNumOfTermsAdapter();
			}
			@Override
			public Adapter caseMSElement(MSElement object) {
				return createMSElementAdapter();
			}
			@Override
			public Adapter caseTermReference(TermReference object) {
				return createTermReferenceAdapter();
			}
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
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
	 * Creates a new adapter for an object of class '{@link SATEL.APN.multisetmm.Multiset <em>Multiset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.APN.multisetmm.Multiset
	 * @generated
	 */
	public Adapter createMultisetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.APN.multisetmm.NumOfTerms <em>Num Of Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.APN.multisetmm.NumOfTerms
	 * @generated
	 */
	public Adapter createNumOfTermsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.APN.multisetmm.MSElement <em>MS Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.APN.multisetmm.MSElement
	 * @generated
	 */
	public Adapter createMSElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.APN.multisetmm.TermReference <em>Term Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.APN.multisetmm.TermReference
	 * @generated
	 */
	public Adapter createTermReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SATEL.APN.environmentmm.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SATEL.APN.environmentmm.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
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

} //MultisetmmAdapterFactory
