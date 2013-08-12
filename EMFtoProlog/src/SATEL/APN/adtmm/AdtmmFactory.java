/**
 * <copyright>
 * </copyright>
 *
 * $Id: AdtmmFactory.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.APN.adtmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.APN.adtmm.AdtmmPackage
 * @generated
 */
public interface AdtmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdtmmFactory eINSTANCE = SATEL.APN.adtmm.impl.AdtmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ADT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADT</em>'.
	 * @generated
	 */
	ADT createADT();

	/**
	 * Returns a new object of class '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort</em>'.
	 * @generated
	 */
	Sort createSort();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Cond Equation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cond Equation</em>'.
	 * @generated
	 */
	CondEquation createCondEquation();

	/**
	 * Returns a new object of class '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Ref</em>'.
	 * @generated
	 */
	VariableRef createVariableRef();

	/**
	 * Returns a new object of class '<em>CTerm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CTerm</em>'.
	 * @generated
	 */
	CTerm createCTerm();

	/**
	 * Returns a new object of class '<em>Equation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equation</em>'.
	 * @generated
	 */
	Equation createEquation();

	/**
	 * Returns a new object of class '<em>Inequation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inequation</em>'.
	 * @generated
	 */
	Inequation createInequation();

	/**
	 * Returns a new object of class '<em>Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instantiation</em>'.
	 * @generated
	 */
	Instantiation createInstantiation();

	/**
	 * Returns a new object of class '<em>Atomic Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Sort</em>'.
	 * @generated
	 */
	AtomicSort createAtomicSort();

	/**
	 * Returns a new object of class '<em>Sort Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort Declaration</em>'.
	 * @generated
	 */
	SortDeclaration createSortDeclaration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdtmmPackage getAdtmmPackage();

} //AdtmmFactory
