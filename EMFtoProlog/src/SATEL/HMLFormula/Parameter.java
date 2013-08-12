/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parameter.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;

import SATEL.AlgebraicExpressions.algterms.AlgebraicTerm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link SATEL.HMLFormula.Parameter#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.HMLFormula.HMLFormulaPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(AlgebraicTerm)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getParameter_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AlgebraicTerm getValue();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.Parameter#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AlgebraicTerm value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Parameter)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getParameter_Next()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getNext();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.Parameter#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Parameter value);

} // Parameter
