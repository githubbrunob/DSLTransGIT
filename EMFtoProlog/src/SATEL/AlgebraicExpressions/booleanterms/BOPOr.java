/**
 * <copyright>
 * </copyright>
 *
 * $Id: BOPOr.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOP Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.BOPOr#getBooleanTermL <em>Boolean Term L</em>}</li>
 *   <li>{@link SATEL.AlgebraicExpressions.booleanterms.BOPOr#getBooleanTermR <em>Boolean Term R</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getBOPOr()
 * @model
 * @generated
 */
public interface BOPOr extends BooleanTerm {
	/**
	 * Returns the value of the '<em><b>Boolean Term L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Term L</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Term L</em>' containment reference.
	 * @see #setBooleanTermL(BooleanTerm)
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getBOPOr_BooleanTermL()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanTerm getBooleanTermL();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.booleanterms.BOPOr#getBooleanTermL <em>Boolean Term L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Term L</em>' containment reference.
	 * @see #getBooleanTermL()
	 * @generated
	 */
	void setBooleanTermL(BooleanTerm value);

	/**
	 * Returns the value of the '<em><b>Boolean Term R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Term R</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Term R</em>' containment reference.
	 * @see #setBooleanTermR(BooleanTerm)
	 * @see SATEL.AlgebraicExpressions.booleanterms.BooleantermsPackage#getBOPOr_BooleanTermR()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanTerm getBooleanTermR();

	/**
	 * Sets the value of the '{@link SATEL.AlgebraicExpressions.booleanterms.BOPOr#getBooleanTermR <em>Boolean Term R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Term R</em>' containment reference.
	 * @see #getBooleanTermR()
	 * @generated
	 */
	void setBooleanTermR(BooleanTerm value);

} // BOPOr
