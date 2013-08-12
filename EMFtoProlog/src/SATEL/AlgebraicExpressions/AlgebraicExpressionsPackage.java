/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgebraicExpressionsPackage.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions;

import SATEL.SATELPackage;

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
 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface AlgebraicExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AlgebraicExpressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.AlgebraicExpressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AlgebraicExpressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgebraicExpressionsPackage eINSTANCE = SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.impl.AlgebraicEqualityImpl <em>Algebraic Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.impl.AlgebraicEqualityImpl
	 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getAlgebraicEquality()
	 * @generated
	 */
	int ALGEBRAIC_EQUALITY = 0;

	/**
	 * The number of structural features of the '<em>Algebraic Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGEBRAIC_EQUALITY_FEATURE_COUNT = SATELPackage.CONDITION_ATOM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.impl.AlgEqualityImpl <em>Alg Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.impl.AlgEqualityImpl
	 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getAlgEquality()
	 * @generated
	 */
	int ALG_EQUALITY = 1;

	/**
	 * The feature id for the '<em><b>Algebraic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALG_EQUALITY__ALGEBRAIC_TERM_L = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Algebraic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALG_EQUALITY__ALGEBRAIC_TERM_R = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alg Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALG_EQUALITY_FEATURE_COUNT = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.impl.SyncEqualityImpl <em>Sync Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.impl.SyncEqualityImpl
	 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getSyncEquality()
	 * @generated
	 */
	int SYNC_EQUALITY = 2;

	/**
	 * The feature id for the '<em><b>Synchronization Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_EQUALITY__SYNCHRONIZATION_TERM_L = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synchronization Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_EQUALITY__SYNCHRONIZATION_TERM_R = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sync Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_EQUALITY_FEATURE_COUNT = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.impl.HMLEqualityImpl <em>HML Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.impl.HMLEqualityImpl
	 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getHMLEquality()
	 * @generated
	 */
	int HML_EQUALITY = 3;

	/**
	 * The feature id for the '<em><b>Hml Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_EQUALITY__HML_TERM_L = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hml Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_EQUALITY__HML_TERM_R = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HML Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HML_EQUALITY_FEATURE_COUNT = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.impl.BooleanEqualityImpl <em>Boolean Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.impl.BooleanEqualityImpl
	 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getBooleanEquality()
	 * @generated
	 */
	int BOOLEAN_EQUALITY = 4;

	/**
	 * The feature id for the '<em><b>Boolean Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EQUALITY__BOOLEAN_TERM_R = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boolean Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EQUALITY__BOOLEAN_TERM_L = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EQUALITY_FEATURE_COUNT = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.impl.ArithmeticEqualityImpl <em>Arithmetic Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.impl.ArithmeticEqualityImpl
	 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getArithmeticEquality()
	 * @generated
	 */
	int ARITHMETIC_EQUALITY = 5;

	/**
	 * The feature id for the '<em><b>Arithmetic Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EQUALITY__ARITHMETIC_TERM_L = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arithmetic Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EQUALITY__ARITHMETIC_TERM_R = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arithmetic Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EQUALITY_FEATURE_COUNT = ALGEBRAIC_EQUALITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.AlgebraicEquality <em>Algebraic Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algebraic Equality</em>'.
	 * @see SATEL.AlgebraicExpressions.AlgebraicEquality
	 * @generated
	 */
	EClass getAlgebraicEquality();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.AlgEquality <em>Alg Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alg Equality</em>'.
	 * @see SATEL.AlgebraicExpressions.AlgEquality
	 * @generated
	 */
	EClass getAlgEquality();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.AlgEquality#getAlgebraicTermL <em>Algebraic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algebraic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.AlgEquality#getAlgebraicTermL()
	 * @see #getAlgEquality()
	 * @generated
	 */
	EReference getAlgEquality_AlgebraicTermL();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.AlgEquality#getAlgebraicTermR <em>Algebraic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algebraic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.AlgEquality#getAlgebraicTermR()
	 * @see #getAlgEquality()
	 * @generated
	 */
	EReference getAlgEquality_AlgebraicTermR();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.SyncEquality <em>Sync Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync Equality</em>'.
	 * @see SATEL.AlgebraicExpressions.SyncEquality
	 * @generated
	 */
	EClass getSyncEquality();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.SyncEquality#getSynchronizationTermL <em>Synchronization Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synchronization Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.SyncEquality#getSynchronizationTermL()
	 * @see #getSyncEquality()
	 * @generated
	 */
	EReference getSyncEquality_SynchronizationTermL();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.SyncEquality#getSynchronizationTermR <em>Synchronization Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synchronization Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.SyncEquality#getSynchronizationTermR()
	 * @see #getSyncEquality()
	 * @generated
	 */
	EReference getSyncEquality_SynchronizationTermR();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.HMLEquality <em>HML Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HML Equality</em>'.
	 * @see SATEL.AlgebraicExpressions.HMLEquality
	 * @generated
	 */
	EClass getHMLEquality();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.HMLEquality#getHmlTermL <em>Hml Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.HMLEquality#getHmlTermL()
	 * @see #getHMLEquality()
	 * @generated
	 */
	EReference getHMLEquality_HmlTermL();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.HMLEquality#getHmlTermR <em>Hml Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hml Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.HMLEquality#getHmlTermR()
	 * @see #getHMLEquality()
	 * @generated
	 */
	EReference getHMLEquality_HmlTermR();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.BooleanEquality <em>Boolean Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Equality</em>'.
	 * @see SATEL.AlgebraicExpressions.BooleanEquality
	 * @generated
	 */
	EClass getBooleanEquality();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.BooleanEquality#getBooleanTermR <em>Boolean Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.BooleanEquality#getBooleanTermR()
	 * @see #getBooleanEquality()
	 * @generated
	 */
	EReference getBooleanEquality_BooleanTermR();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.BooleanEquality#getBooleanTermL <em>Boolean Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.BooleanEquality#getBooleanTermL()
	 * @see #getBooleanEquality()
	 * @generated
	 */
	EReference getBooleanEquality_BooleanTermL();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.ArithmeticEquality <em>Arithmetic Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Equality</em>'.
	 * @see SATEL.AlgebraicExpressions.ArithmeticEquality
	 * @generated
	 */
	EClass getArithmeticEquality();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.ArithmeticEquality#getArithmeticTermL <em>Arithmetic Term L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term L</em>'.
	 * @see SATEL.AlgebraicExpressions.ArithmeticEquality#getArithmeticTermL()
	 * @see #getArithmeticEquality()
	 * @generated
	 */
	EReference getArithmeticEquality_ArithmeticTermL();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.AlgebraicExpressions.ArithmeticEquality#getArithmeticTermR <em>Arithmetic Term R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Term R</em>'.
	 * @see SATEL.AlgebraicExpressions.ArithmeticEquality#getArithmeticTermR()
	 * @see #getArithmeticEquality()
	 * @generated
	 */
	EReference getArithmeticEquality_ArithmeticTermR();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgebraicExpressionsFactory getAlgebraicExpressionsFactory();

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
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.impl.AlgebraicEqualityImpl <em>Algebraic Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.impl.AlgebraicEqualityImpl
		 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getAlgebraicEquality()
		 * @generated
		 */
		EClass ALGEBRAIC_EQUALITY = eINSTANCE.getAlgebraicEquality();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.impl.AlgEqualityImpl <em>Alg Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.impl.AlgEqualityImpl
		 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getAlgEquality()
		 * @generated
		 */
		EClass ALG_EQUALITY = eINSTANCE.getAlgEquality();

		/**
		 * The meta object literal for the '<em><b>Algebraic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALG_EQUALITY__ALGEBRAIC_TERM_L = eINSTANCE.getAlgEquality_AlgebraicTermL();

		/**
		 * The meta object literal for the '<em><b>Algebraic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALG_EQUALITY__ALGEBRAIC_TERM_R = eINSTANCE.getAlgEquality_AlgebraicTermR();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.impl.SyncEqualityImpl <em>Sync Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.impl.SyncEqualityImpl
		 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getSyncEquality()
		 * @generated
		 */
		EClass SYNC_EQUALITY = eINSTANCE.getSyncEquality();

		/**
		 * The meta object literal for the '<em><b>Synchronization Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNC_EQUALITY__SYNCHRONIZATION_TERM_L = eINSTANCE.getSyncEquality_SynchronizationTermL();

		/**
		 * The meta object literal for the '<em><b>Synchronization Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNC_EQUALITY__SYNCHRONIZATION_TERM_R = eINSTANCE.getSyncEquality_SynchronizationTermR();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.impl.HMLEqualityImpl <em>HML Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.impl.HMLEqualityImpl
		 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getHMLEquality()
		 * @generated
		 */
		EClass HML_EQUALITY = eINSTANCE.getHMLEquality();

		/**
		 * The meta object literal for the '<em><b>Hml Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_EQUALITY__HML_TERM_L = eINSTANCE.getHMLEquality_HmlTermL();

		/**
		 * The meta object literal for the '<em><b>Hml Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HML_EQUALITY__HML_TERM_R = eINSTANCE.getHMLEquality_HmlTermR();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.impl.BooleanEqualityImpl <em>Boolean Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.impl.BooleanEqualityImpl
		 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getBooleanEquality()
		 * @generated
		 */
		EClass BOOLEAN_EQUALITY = eINSTANCE.getBooleanEquality();

		/**
		 * The meta object literal for the '<em><b>Boolean Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EQUALITY__BOOLEAN_TERM_R = eINSTANCE.getBooleanEquality_BooleanTermR();

		/**
		 * The meta object literal for the '<em><b>Boolean Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EQUALITY__BOOLEAN_TERM_L = eINSTANCE.getBooleanEquality_BooleanTermL();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.impl.ArithmeticEqualityImpl <em>Arithmetic Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.impl.ArithmeticEqualityImpl
		 * @see SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsPackageImpl#getArithmeticEquality()
		 * @generated
		 */
		EClass ARITHMETIC_EQUALITY = eINSTANCE.getArithmeticEquality();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EQUALITY__ARITHMETIC_TERM_L = eINSTANCE.getArithmeticEquality_ArithmeticTermL();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Term R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EQUALITY__ARITHMETIC_TERM_R = eINSTANCE.getArithmeticEquality_ArithmeticTermR();

	}

} //AlgebraicExpressionsPackage
