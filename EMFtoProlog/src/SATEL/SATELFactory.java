/**
 * <copyright>
 * </copyright>
 *
 * $Id: SATELFactory.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.SATELPackage
 * @generated
 */
public interface SATELFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SATELFactory eINSTANCE = SATEL.impl.SATELFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Test Intention Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Intention Module</em>'.
	 * @generated
	 */
	TestIntentionModule createTestIntentionModule();

	/**
	 * Returns a new object of class '<em>Test Intention Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Intention Interface</em>'.
	 * @generated
	 */
	TestIntentionInterface createTestIntentionInterface();

	/**
	 * Returns a new object of class '<em>Intention Dec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intention Dec</em>'.
	 * @generated
	 */
	IntentionDec createIntentionDec();

	/**
	 * Returns a new object of class '<em>Test Intention Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Intention Body</em>'.
	 * @generated
	 */
	TestIntentionBody createTestIntentionBody();

	/**
	 * Returns a new object of class '<em>Axiom Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axiom Declaration</em>'.
	 * @generated
	 */
	AxiomDeclaration createAxiomDeclaration();

	/**
	 * Returns a new object of class '<em>Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axiom</em>'.
	 * @generated
	 */
	Axiom createAxiom();

	/**
	 * Returns a new object of class '<em>Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inclusion</em>'.
	 * @generated
	 */
	Inclusion createInclusion();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Uniformity List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniformity List</em>'.
	 * @generated
	 */
	UniformityList createUniformityList();

	/**
	 * Returns a new object of class '<em>Subuniformity List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subuniformity List</em>'.
	 * @generated
	 */
	SubuniformityList createSubuniformityList();

	/**
	 * Returns a new object of class '<em>Condition Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Body</em>'.
	 * @generated
	 */
	ConditionBody createConditionBody();

	/**
	 * Returns a new object of class '<em>Name List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name List</em>'.
	 * @generated
	 */
	NameList createNameList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SATELPackage getSATELPackage();

} //SATELFactory
