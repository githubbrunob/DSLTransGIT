/**
 * <copyright>
 * </copyright>
 *
 * $Id: NumOfTerms.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.multisetmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Num Of Terms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.APN.multisetmm.NumOfTerms#getCard <em>Card</em>}</li>
 *   <li>{@link SATEL.APN.multisetmm.NumOfTerms#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.APN.multisetmm.MultisetmmPackage#getNumOfTerms()
 * @model
 * @generated
 */
public interface NumOfTerms extends EObject {
	/**
	 * Returns the value of the '<em><b>Card</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' attribute.
	 * @see #setCard(int)
	 * @see SATEL.APN.multisetmm.MultisetmmPackage#getNumOfTerms_Card()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getCard();

	/**
	 * Sets the value of the '{@link SATEL.APN.multisetmm.NumOfTerms#getCard <em>Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' attribute.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(int value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference.
	 * @see #setOwnedElement(MSElement)
	 * @see SATEL.APN.multisetmm.MultisetmmPackage#getNumOfTerms_OwnedElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MSElement getOwnedElement();

	/**
	 * Sets the value of the '{@link SATEL.APN.multisetmm.NumOfTerms#getOwnedElement <em>Owned Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Element</em>' containment reference.
	 * @see #getOwnedElement()
	 * @generated
	 */
	void setOwnedElement(MSElement value);

} // NumOfTerms
