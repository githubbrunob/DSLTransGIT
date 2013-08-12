/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLFormulaFactory.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.HMLFormula.HMLFormulaPackage
 * @generated
 */
public interface HMLFormulaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HMLFormulaFactory eINSTANCE = SATEL.HMLFormula.impl.HMLFormulaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HML Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HML Term</em>'.
	 * @generated
	 */
	HMLTerm createHMLTerm();

	/**
	 * Returns a new object of class '<em>HML Formula Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HML Formula Content</em>'.
	 * @generated
	 */
	HMLFormulaHMLFormulaContent createHMLFormulaHMLFormulaContent();

	/**
	 * Returns a new object of class '<em>Primitive HML Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive HML Var Dec</em>'.
	 * @generated
	 */
	HMLFormulaPrimitiveHMLVarDec createHMLFormulaPrimitiveHMLVarDec();

	/**
	 * Returns a new object of class '<em>HML Next</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HML Next</em>'.
	 * @generated
	 */
	HMLNext createHMLNext();

	/**
	 * Returns a new object of class '<em>HML Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HML Not</em>'.
	 * @generated
	 */
	HMLNot createHMLNot();

	/**
	 * Returns a new object of class '<em>HML And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HML And</em>'.
	 * @generated
	 */
	HMLAnd createHMLAnd();

	/**
	 * Returns a new object of class '<em>HML Top</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HML Top</em>'.
	 * @generated
	 */
	HMLTop createHMLTop();

	/**
	 * Returns a new object of class '<em>HML Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HML Event</em>'.
	 * @generated
	 */
	HMLEvent createHMLEvent();

	/**
	 * Returns a new object of class '<em>Synchronization Event Input Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization Event Input Term</em>'.
	 * @generated
	 */
	SynchronizationEventInputTerm createSynchronizationEventInputTerm();

	/**
	 * Returns a new object of class '<em>Synchronization Event Output Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization Event Output Term</em>'.
	 * @generated
	 */
	SynchronizationEventOutputTerm createSynchronizationEventOutputTerm();

	/**
	 * Returns a new object of class '<em>WPrimitive Observation Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WPrimitive Observation Var Dec</em>'.
	 * @generated
	 */
	WPrimitiveObservationVarDec createWPrimitiveObservationVarDec();

	/**
	 * Returns a new object of class '<em>WPrimitive Stimulation Var Dec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WPrimitive Stimulation Var Dec</em>'.
	 * @generated
	 */
	WPrimitiveStimulationVarDec createWPrimitiveStimulationVarDec();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HMLFormulaPackage getHMLFormulaPackage();

} //HMLFormulaFactory
