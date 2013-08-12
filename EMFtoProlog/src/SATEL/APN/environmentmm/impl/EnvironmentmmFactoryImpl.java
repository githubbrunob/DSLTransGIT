/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnvironmentmmFactoryImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.APN.environmentmm.impl;

import SATEL.APN.environmentmm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentmmFactoryImpl extends EFactoryImpl implements EnvironmentmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnvironmentmmFactory init() {
		try {
			EnvironmentmmFactory theEnvironmentmmFactory = (EnvironmentmmFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL.APN.environmentmm"); 
			if (theEnvironmentmmFactory != null) {
				return theEnvironmentmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnvironmentmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentmmPackage getEnvironmentmmPackage() {
		return (EnvironmentmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnvironmentmmPackage getPackage() {
		return EnvironmentmmPackage.eINSTANCE;
	}

} //EnvironmentmmFactoryImpl
