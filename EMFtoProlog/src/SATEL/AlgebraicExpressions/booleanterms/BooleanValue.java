/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleanValue.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.BooleanValue#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends BooleanTerm {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getBooleanValue_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.booleanterms.BooleanValue#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanValue
