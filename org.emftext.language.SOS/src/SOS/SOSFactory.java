/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SOS.SOSPackage
 * @generated
 */
public interface SOSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SOSFactory eINSTANCE = SOS.impl.SOSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Semantics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantics</em>'.
	 * @generated
	 */
	Semantics createSemantics();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Premisse List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Premisse List</em>'.
	 * @generated
	 */
	PremisseList createPremisseList();

	/**
	 * Returns a new object of class '<em>Conclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conclusion</em>'.
	 * @generated
	 */
	Conclusion createConclusion();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Type Judment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Judment</em>'.
	 * @generated
	 */
	TypeJudment createTypeJudment();

	/**
	 * Returns a new object of class '<em>Algebraic Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algebraic Condition</em>'.
	 * @generated
	 */
	AlgebraicCondition createAlgebraicCondition();

	/**
	 * Returns a new object of class '<em>Algebraic Condition List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algebraic Condition List</em>'.
	 * @generated
	 */
	AlgebraicConditionList createAlgebraicConditionList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SOSPackage getSOSPackage();

} //SOSFactory
