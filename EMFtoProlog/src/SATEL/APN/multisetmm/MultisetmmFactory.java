/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultisetmmFactory.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.multisetmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.APN.multisetmm.MultisetmmPackage
 * @generated
 */
public interface MultisetmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultisetmmFactory eINSTANCE = SATEL.APN.multisetmm.impl.MultisetmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Multiset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiset</em>'.
	 * @generated
	 */
	Multiset createMultiset();

	/**
	 * Returns a new object of class '<em>Num Of Terms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Num Of Terms</em>'.
	 * @generated
	 */
	NumOfTerms createNumOfTerms();

	/**
	 * Returns a new object of class '<em>Term Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Reference</em>'.
	 * @generated
	 */
	TermReference createTermReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MultisetmmPackage getMultisetmmPackage();

} //MultisetmmFactory
