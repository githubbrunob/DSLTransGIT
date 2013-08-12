/**
 * <copyright>
 * </copyright>
 *
 * $Id: GuardmmPackage.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.guardmm;

import SATEL.APN.environmentmm.EnvironmentmmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SATEL.APN.guardmm.GuardmmFactory
 * @model kind="package"
 * @generated
 */
public interface GuardmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "guardmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.APN.guardmm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "guardmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuardmmPackage eINSTANCE = SATEL.APN.guardmm.impl.GuardmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.APN.guardmm.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.guardmm.impl.GuardImpl
	 * @see SATEL.APN.guardmm.impl.GuardmmPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 0;

	/**
	 * The feature id for the '<em><b>Owned Equations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__OWNED_EQUATIONS = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__OWNED_VARIABLES = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link SATEL.APN.guardmm.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see SATEL.APN.guardmm.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.guardmm.Guard#getOwnedEquations <em>Owned Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Equations</em>'.
	 * @see SATEL.APN.guardmm.Guard#getOwnedEquations()
	 * @see #getGuard()
	 * @generated
	 */
	EReference getGuard_OwnedEquations();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.guardmm.Guard#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
	 * @see SATEL.APN.guardmm.Guard#getOwnedVariables()
	 * @see #getGuard()
	 * @generated
	 */
	EReference getGuard_OwnedVariables();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GuardmmFactory getGuardmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SATEL.APN.guardmm.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.guardmm.impl.GuardImpl
		 * @see SATEL.APN.guardmm.impl.GuardmmPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Owned Equations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD__OWNED_EQUATIONS = eINSTANCE.getGuard_OwnedEquations();

		/**
		 * The meta object literal for the '<em><b>Owned Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD__OWNED_VARIABLES = eINSTANCE.getGuard_OwnedVariables();

	}

} //GuardmmPackage
