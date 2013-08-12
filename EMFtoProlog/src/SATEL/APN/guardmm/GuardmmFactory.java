/**
 * <copyright>
 * </copyright>
 *
 * $Id: GuardmmFactory.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.guardmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.APN.guardmm.GuardmmPackage
 * @generated
 */
public interface GuardmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuardmmFactory eINSTANCE = SATEL.APN.guardmm.impl.GuardmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard</em>'.
	 * @generated
	 */
	Guard createGuard();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GuardmmPackage getGuardmmPackage();

} //GuardmmFactory
