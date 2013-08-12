/**
 * <copyright>
 * </copyright>
 *
 * $Id: Operation.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.APN.adtmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.adtmm.Operation#getOperationSorts <em>Operation Sorts</em>}</li>
 *   <li>{@link SATEL.APN.adtmm.Operation#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.adtmm.AdtmmPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends AbstractOperation {
	/**
	 * Returns the value of the '<em><b>Operation Sorts</b></em>' containment reference list.
	 * The list contents are of type {@link SATEL.APN.adtmm.Sort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Sorts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Sorts</em>' containment reference list.
	 * @see SATEL.APN.adtmm.AdtmmPackage#getOperation_OperationSorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sort> getOperationSorts();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Sort)
	 * @see SATEL.APN.adtmm.AdtmmPackage#getOperation_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getResult();

	/**
	 * Sets the value of the '{@link SATEL.APN.adtmm.Operation#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Sort value);

} // Operation
