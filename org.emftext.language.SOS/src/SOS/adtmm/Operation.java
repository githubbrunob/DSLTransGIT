/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.adtmm.Operation#getOperationSorts <em>Operation Sorts</em>}</li>
 *   <li>{@link SOS.adtmm.Operation#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.adtmm.AdtmmPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends AbstractOperation {
	/**
	 * Returns the value of the '<em><b>Operation Sorts</b></em>' containment reference list.
	 * The list contents are of type {@link SOS.adtmm.Sort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Sorts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Sorts</em>' containment reference list.
	 * @see SOS.adtmm.AdtmmPackage#getOperation_OperationSorts()
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
	 * @see SOS.adtmm.AdtmmPackage#getOperation_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getResult();

	/**
	 * Sets the value of the '{@link SOS.adtmm.Operation#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Sort value);

} // Operation
