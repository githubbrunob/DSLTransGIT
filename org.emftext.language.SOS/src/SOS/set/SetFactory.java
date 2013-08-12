/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SOS.set.SetPackage
 * @generated
 */
public interface SetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SetFactory eINSTANCE = SOS.set.impl.SetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Sort</em>'.
	 * @generated
	 */
	ModelSort createModelSort();

	/**
	 * Returns a new object of class '<em>Model Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Set</em>'.
	 * @generated
	 */
	ModelSet createModelSet();

	/**
	 * Returns a new object of class '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor</em>'.
	 * @generated
	 */
	SetConstructor createSetConstructor();

	/**
	 * Returns a new object of class '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union</em>'.
	 * @generated
	 */
	Union createUnion();

	/**
	 * Returns a new object of class '<em>Excluding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excluding</em>'.
	 * @generated
	 */
	Excluding createExcluding();

	/**
	 * Returns a new object of class '<em>Intersection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intersection</em>'.
	 * @generated
	 */
	Intersection createIntersection();

	/**
	 * Returns a new object of class '<em>Model Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Relation</em>'.
	 * @generated
	 */
	ModelRelation createModelRelation();

	/**
	 * Returns a new object of class '<em>Model Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Class Attribute</em>'.
	 * @generated
	 */
	ModelClassAttribute createModelClassAttribute();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	Set createSet();

	/**
	 * Returns a new object of class '<em>Exists In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exists In</em>'.
	 * @generated
	 */
	ExistsIn createExistsIn();

	/**
	 * Returns a new object of class '<em>For All In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For All In</em>'.
	 * @generated
	 */
	ForAllIn createForAllIn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SetPackage getSetPackage();

} //SetFactory
