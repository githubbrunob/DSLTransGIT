/**
 * <copyright>
 * </copyright>
 *
 * $Id: MethodCall.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.apnmm;

import SATEL.APN.adtmm.Term;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.apnmm.MethodCall#getMethod <em>Method</em>}</li>
 *   <li>{@link SATEL.APN.apnmm.MethodCall#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.apnmm.ApnmmPackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(Method)
	 * @see SATEL.APN.apnmm.ApnmmPackage#getMethodCall_Method()
	 * @model required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link SATEL.APN.apnmm.MethodCall#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see SATEL.APN.apnmm.ApnmmPackage#getMethodCall_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getParams();

} // MethodCall
