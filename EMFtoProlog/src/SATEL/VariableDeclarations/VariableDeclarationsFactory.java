/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableDeclarationsFactory.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.VariableDeclarations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.VariableDeclarations.VariableDeclarationsPackage
 * @generated
 */
public interface VariableDeclarationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariableDeclarationsFactory eINSTANCE = SATEL.VariableDeclarations.impl.VariableDeclarationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration</em>'.
	 * @generated
	 */
	VariableDeclaration createVariableDeclaration();

	/**
	 * Returns a new object of class '<em>Primitive HML Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive HML Var Dec</em>'.
	 * @generated
	 */
	PrimitiveHMLVarDec createPrimitiveHMLVarDec();

	/**
	 * Returns a new object of class '<em>Primitive Stimulation Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Stimulation Var Dec</em>'.
	 * @generated
	 */
	PrimitiveStimulationVarDec createPrimitiveStimulationVarDec();

	/**
	 * Returns a new object of class '<em>Primitive Observation Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Observation Var Dec</em>'.
	 * @generated
	 */
	PrimitiveObservationVarDec createPrimitiveObservationVarDec();

	/**
	 * Returns a new object of class '<em>Primitive Integer Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Integer Var Dec</em>'.
	 * @generated
	 */
	PrimitiveIntegerVarDec createPrimitiveIntegerVarDec();

	/**
	 * Returns a new object of class '<em>Primitive Boolean Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Boolean Var Dec</em>'.
	 * @generated
	 */
	PrimitiveBooleanVarDec createPrimitiveBooleanVarDec();

	/**
	 * Returns a new object of class '<em>Algebraic Sort Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algebraic Sort Var Dec</em>'.
	 * @generated
	 */
	AlgebraicSortVarDec createAlgebraicSortVarDec();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VariableDeclarationsPackage getVariableDeclarationsPackage();

} //VariableDeclarationsFactory
