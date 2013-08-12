/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Text;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Text.Content#getText <em>Text</em>}</li>
 *   <li>{@link Text.Content#getNext <em>Next</em>}</li>
 *   <li>{@link Text.Content#getInnerBlock <em>Inner Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see Text.TextPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends Line {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see Text.TextPackage#getContent_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link Text.Content#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Content)
	 * @see Text.TextPackage#getContent_Next()
	 * @model containment="true"
	 * @generated
	 */
	Content getNext();

	/**
	 * Sets the value of the '{@link Text.Content#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Content value);

	/**
	 * Returns the value of the '<em><b>Inner Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Block</em>' containment reference.
	 * @see #setInnerBlock(Block)
	 * @see Text.TextPackage#getContent_InnerBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getInnerBlock();

	/**
	 * Sets the value of the '{@link Text.Content#getInnerBlock <em>Inner Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Block</em>' containment reference.
	 * @see #getInnerBlock()
	 * @generated
	 */
	void setInnerBlock(Block value);

} // Content
