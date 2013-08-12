/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgebraicExpressionsFactory.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.AlgebraicExpressions.AlgebraicExpressionsPackage
 * @generated
 */
public interface AlgebraicExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgebraicExpressionsFactory eINSTANCE = SATEL.AlgebraicExpressions.impl.AlgebraicExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Alg Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alg Equality</em>'.
	 * @generated
	 */
	AlgEquality createAlgEquality();

	/**
	 * Returns a new object of class '<em>Sync Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sync Equality</em>'.
	 * @generated
	 */
	SyncEquality createSyncEquality();

	/**
	 * Returns a new object of class '<em>HML Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HML Equality</em>'.
	 * @generated
	 */
	HMLEquality createHMLEquality();

	/**
	 * Returns a new object of class '<em>Boolean Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Equality</em>'.
	 * @generated
	 */
	BooleanEquality createBooleanEquality();

	/**
	 * Returns a new object of class '<em>Arithmetic Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Equality</em>'.
	 * @generated
	 */
	ArithmeticEquality createArithmeticEquality();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AlgebraicExpressionsPackage getAlgebraicExpressionsPackage();

} //AlgebraicExpressionsFactory
