/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgebraicExpressionsFactoryImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.impl;

import SATEL.AlgebraicExpressions.*;

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
public class AlgebraicExpressionsFactoryImpl extends EFactoryImpl implements AlgebraicExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlgebraicExpressionsFactory init() {
		try {
			AlgebraicExpressionsFactory theAlgebraicExpressionsFactory = (AlgebraicExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL.AlgebraicExpressions"); 
			if (theAlgebraicExpressionsFactory != null) {
				return theAlgebraicExpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlgebraicExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicExpressionsFactoryImpl() {
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
			case AlgebraicExpressionsPackage.ALG_EQUALITY: return createAlgEquality();
			case AlgebraicExpressionsPackage.SYNC_EQUALITY: return createSyncEquality();
			case AlgebraicExpressionsPackage.HML_EQUALITY: return createHMLEquality();
			case AlgebraicExpressionsPackage.BOOLEAN_EQUALITY: return createBooleanEquality();
			case AlgebraicExpressionsPackage.ARITHMETIC_EQUALITY: return createArithmeticEquality();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgEquality createAlgEquality() {
		AlgEqualityImpl algEquality = new AlgEqualityImpl();
		return algEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncEquality createSyncEquality() {
		SyncEqualityImpl syncEquality = new SyncEqualityImpl();
		return syncEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLEquality createHMLEquality() {
		HMLEqualityImpl hmlEquality = new HMLEqualityImpl();
		return hmlEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanEquality createBooleanEquality() {
		BooleanEqualityImpl booleanEquality = new BooleanEqualityImpl();
		return booleanEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticEquality createArithmeticEquality() {
		ArithmeticEqualityImpl arithmeticEquality = new ArithmeticEqualityImpl();
		return arithmeticEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicExpressionsPackage getAlgebraicExpressionsPackage() {
		return (AlgebraicExpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AlgebraicExpressionsPackage getPackage() {
		return AlgebraicExpressionsPackage.eINSTANCE;
	}

} //AlgebraicExpressionsFactoryImpl
