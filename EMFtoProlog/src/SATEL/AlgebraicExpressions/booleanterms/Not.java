/**
 * <copyright>
 * </copyright>
 *
 * $Id: Not.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.Not#getBooleanTerm <em>Boolean Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends BooleanTerm {
	/**
	 * Returns the value of the '<em><b>Boolean Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Term</em>' containment reference.
	 * @see #setBooleanTerm(BooleanTerm)
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getNot_BooleanTerm()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanTerm getBooleanTerm();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.booleanterms.Not#getBooleanTerm <em>Boolean Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Term</em>' containment reference.
	 * @see #getBooleanTerm()
	 * @generated
	 */
	void setBooleanTerm(BooleanTerm value);

} // Not
