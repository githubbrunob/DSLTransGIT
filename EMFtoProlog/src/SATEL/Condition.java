/**
 * <copyright>
 * </copyright>
 *
 * $Id: Condition.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.Condition#getDomainQuantifier <em>Domain Quantifier</em>}</li>
 *   <li>{@link SATEL.Condition#getConditionBody <em>Condition Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.SATELPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Quantifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Quantifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Quantifier</em>' containment reference.
	 * @see #setDomainQuantifier(DomainQuantifier)
	 * @see SATEL.SATELPackage#getCondition_DomainQuantifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DomainQuantifier getDomainQuantifier();

	/**
	 * Sets the value of the '{@link SATEL.Condition#getDomainQuantifier <em>Domain Quantifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Quantifier</em>' containment reference.
	 * @see #getDomainQuantifier()
	 * @generated
	 */
	void setDomainQuantifier(DomainQuantifier value);

	/**
	 * Returns the value of the '<em><b>Condition Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Body</em>' containment reference.
	 * @see #setConditionBody(ConditionBody)
	 * @see SATEL.SATELPackage#getCondition_ConditionBody()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ConditionBody getConditionBody();

	/**
	 * Sets the value of the '{@link SATEL.Condition#getConditionBody <em>Condition Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Body</em>' containment reference.
	 * @see #getConditionBody()
	 * @generated
	 */
	void setConditionBody(ConditionBody value);

} // Condition
