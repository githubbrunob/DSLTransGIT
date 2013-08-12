/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypesFactory.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.VariableDeclarations.Types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.VariableDeclarations.Types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = SATEL.VariableDeclarations.Types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Primitive HML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive HML</em>'.
	 * @generated
	 */
	PrimitiveHML createPrimitiveHML();

	/**
	 * Returns a new object of class '<em>Primitive Stimulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Stimulation</em>'.
	 * @generated
	 */
	PrimitiveStimulation createPrimitiveStimulation();

	/**
	 * Returns a new object of class '<em>Primitive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Observation</em>'.
	 * @generated
	 */
	PrimitiveObservation createPrimitiveObservation();

	/**
	 * Returns a new object of class '<em>Primitive Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Integer</em>'.
	 * @generated
	 */
	PrimitiveInteger createPrimitiveInteger();

	/**
	 * Returns a new object of class '<em>Primitive Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Boolean</em>'.
	 * @generated
	 */
	PrimitiveBoolean createPrimitiveBoolean();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory
