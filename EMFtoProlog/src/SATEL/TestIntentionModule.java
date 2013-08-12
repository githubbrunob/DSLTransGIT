/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestIntentionModule.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import SATEL.APN.adtmm.ADT;

import SATEL.APN.apnmm.APN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Intention Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.TestIntentionModule#getTestIntentionBody <em>Test Intention Body</em>}</li>
 *   <li>{@link SATEL.TestIntentionModule#getTestIntentionInterface <em>Test Intention Interface</em>}</li>
 *   <li>{@link SATEL.TestIntentionModule#getName <em>Name</em>}</li>
 *   <li>{@link SATEL.TestIntentionModule#getFocus <em>Focus</em>}</li>
 *   <li>{@link SATEL.TestIntentionModule#getAlgebra <em>Algebra</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getTestIntentionModule()
 * @model
 * @generated
 */
public interface TestIntentionModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Intention Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Intention Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Intention Body</em>' containment reference.
	 * @see #setTestIntentionBody(TestIntentionBody)
	 * @see SATEL.SATELPackage#getTestIntentionModule_TestIntentionBody()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TestIntentionBody getTestIntentionBody();

	/**
	 * Sets the value of the '{@link SATEL.TestIntentionModule#getTestIntentionBody <em>Test Intention Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Intention Body</em>' containment reference.
	 * @see #getTestIntentionBody()
	 * @generated
	 */
	void setTestIntentionBody(TestIntentionBody value);

	/**
	 * Returns the value of the '<em><b>Test Intention Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Intention Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Intention Interface</em>' containment reference.
	 * @see #setTestIntentionInterface(TestIntentionInterface)
	 * @see SATEL.SATELPackage#getTestIntentionModule_TestIntentionInterface()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TestIntentionInterface getTestIntentionInterface();

	/**
	 * Sets the value of the '{@link SATEL.TestIntentionModule#getTestIntentionInterface <em>Test Intention Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Intention Interface</em>' containment reference.
	 * @see #getTestIntentionInterface()
	 * @generated
	 */
	void setTestIntentionInterface(TestIntentionInterface value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SATEL.SATELPackage#getTestIntentionModule_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SATEL.TestIntentionModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(APN)
	 * @see SATEL.SATELPackage#getTestIntentionModule_Focus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	APN getFocus();

	/**
	 * Sets the value of the '{@link SATEL.TestIntentionModule#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(APN value);

	/**
	 * Returns the value of the '<em><b>Algebra</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.ADT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algebra</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algebra</em>' containment reference list.
	 * @see SATEL.SATELPackage#getTestIntentionModule_Algebra()
	 * @model containment="true"
	 * @generated
	 */
	EList<ADT> getAlgebra();

} // TestIntentionModule
