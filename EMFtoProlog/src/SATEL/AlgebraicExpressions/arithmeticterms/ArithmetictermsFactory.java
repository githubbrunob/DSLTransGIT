/**
 * <copyright>
 * </copyright>
 *
 * $Id: ArithmetictermsFactory.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage
 * @generated
 */
public interface ArithmetictermsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArithmetictermsFactory eINSTANCE = SATEL.AlgebraicExpressions.arithmeticterms.impl.ArithmetictermsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable</em>'.
	 * @generated
	 */
	IntegerVariable createIntegerVariable();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>BOP Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOP Plus</em>'.
	 * @generated
	 */
	BOPPlus createBOPPlus();

	/**
	 * Returns a new object of class '<em>BOP Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOP Minus</em>'.
	 * @generated
	 */
	BOPMinus createBOPMinus();

	/**
	 * Returns a new object of class '<em>BOP Times</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOP Times</em>'.
	 * @generated
	 */
	BOPTimes createBOPTimes();

	/**
	 * Returns a new object of class '<em>BOP Div</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BOP Div</em>'.
	 * @generated
	 */
	BOPDiv createBOPDiv();

	/**
	 * Returns a new object of class '<em>NB Events</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NB Events</em>'.
	 * @generated
	 */
	NBEvents createNBEvents();

	/**
	 * Returns a new object of class '<em>Depth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Depth</em>'.
	 * @generated
	 */
	Depth createDepth();

	/**
	 * Returns a new object of class '<em>UOP Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UOP Minus</em>'.
	 * @generated
	 */
	UOPMinus createUOPMinus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArithmetictermsPackage getArithmetictermsPackage();

} //ArithmetictermsFactory
