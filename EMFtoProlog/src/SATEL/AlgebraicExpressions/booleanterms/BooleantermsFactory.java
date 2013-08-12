/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleantermsFactory.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage
 * @generated
 */
public interface BooleantermsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BooleantermsFactory eINSTANCE = SATEL.AlgebraicExpressions.booleanterms.impl.BooleantermsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Positive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positive</em>'.
	 * @generated
	 */
	Positive createPositive();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable</em>'.
	 * @generated
	 */
	BooleanVariable createBooleanVariable();

	/**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
	BooleanValue createBooleanValue();

	/**
	 * Returns a new object of class '<em>BOP And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOP And</em>'.
	 * @generated
	 */
	BOPAnd createBOPAnd();

	/**
	 * Returns a new object of class '<em>BOP Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOP Or</em>'.
	 * @generated
	 */
	BOPOr createBOPOr();

	/**
	 * Returns a new object of class '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equals</em>'.
	 * @generated
	 */
	Equals createEquals();

	/**
	 * Returns a new object of class '<em>Not Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Equals</em>'.
	 * @generated
	 */
	NotEquals createNotEquals();

	/**
	 * Returns a new object of class '<em>GT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GT</em>'.
	 * @generated
	 */
	GT createGT();

	/**
	 * Returns a new object of class '<em>LT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LT</em>'.
	 * @generated
	 */
	LT createLT();

	/**
	 * Returns a new object of class '<em>GTE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GTE</em>'.
	 * @generated
	 */
	GTE createGTE();

	/**
	 * Returns a new object of class '<em>LTE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LTE</em>'.
	 * @generated
	 */
	LTE createLTE();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BooleantermsPackage getBooleantermsPackage();

} //BooleantermsFactory
