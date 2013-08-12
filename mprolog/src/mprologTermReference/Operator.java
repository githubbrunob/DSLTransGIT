/**
 * <copyright>
 * </copyright>
 *
 * $Id: Operator.java,v 1.1 2011/12/28 01:45:32 bfb Exp $
 */
package mprologTermReference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprologTermReference.Operator#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprologTermReference.MprologTermReferencePackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see mprologTermReference.MprologTermReferencePackage#getOperator_Symbol()
	 * @model required="true"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link mprologTermReference.Operator#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // Operator
