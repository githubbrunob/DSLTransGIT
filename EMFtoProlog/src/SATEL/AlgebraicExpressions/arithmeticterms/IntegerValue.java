/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntegerValue.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.arithmeticterms.IntegerValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getIntegerValue()
 * @model
 * @generated
 */
public interface IntegerValue extends ArithmeticTerm {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see SATEL.AlgebraicExpressions.arithmeticterms.ArithmetictermsPackage#getIntegerValue_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.arithmeticterms.IntegerValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerValue
