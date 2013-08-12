/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnvironmentmmFactory.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.environmentmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.APN.environmentmm.EnvironmentmmPackage
 * @generated
 */
public interface EnvironmentmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentmmFactory eINSTANCE = SATEL.APN.environmentmm.impl.EnvironmentmmFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnvironmentmmPackage getEnvironmentmmPackage();

} //EnvironmentmmFactory
