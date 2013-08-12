/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Text;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Text.Block#getInnerBlock <em>Inner Block</em>}</li>
 *   <li>{@link Text.Block#getInnerLine <em>Inner Line</em>}</li>
 *   <li>{@link Text.Block#getPreLine <em>Pre Line</em>}</li>
 *   <li>{@link Text.Block#getPostLine <em>Post Line</em>}</li>
 *   <li>{@link Text.Block#isTabbed <em>Tabbed</em>}</li>
 *   <li>{@link Text.Block#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see Text.TextPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Inner Block</b></em>' containment reference list.
	 * The list contents are of type {@link Text.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Block</em>' containment reference list.
	 * @see Text.TextPackage#getBlock_InnerBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<Block> getInnerBlock();

	/**
	 * Returns the value of the '<em><b>Inner Line</b></em>' containment reference list.
	 * The list contents are of type {@link Text.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Line</em>' containment reference list.
	 * @see Text.TextPackage#getBlock_InnerLine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getInnerLine();

	/**
	 * Returns the value of the '<em><b>Pre Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Line</em>' containment reference.
	 * @see #setPreLine(Line)
	 * @see Text.TextPackage#getBlock_PreLine()
	 * @model containment="true"
	 * @generated
	 */
	Line getPreLine();

	/**
	 * Sets the value of the '{@link Text.Block#getPreLine <em>Pre Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Line</em>' containment reference.
	 * @see #getPreLine()
	 * @generated
	 */
	void setPreLine(Line value);

	/**
	 * Returns the value of the '<em><b>Post Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Line</em>' containment reference.
	 * @see #setPostLine(Line)
	 * @see Text.TextPackage#getBlock_PostLine()
	 * @model containment="true"
	 * @generated
	 */
	Line getPostLine();

	/**
	 * Sets the value of the '{@link Text.Block#getPostLine <em>Post Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Line</em>' containment reference.
	 * @see #getPostLine()
	 * @generated
	 */
	void setPostLine(Line value);

	/**
	 * Returns the value of the '<em><b>Tabbed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabbed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabbed</em>' attribute.
	 * @see #setTabbed(boolean)
	 * @see Text.TextPackage#getBlock_Tabbed()
	 * @model default="false"
	 * @generated
	 */
	boolean isTabbed();

	/**
	 * Sets the value of the '{@link Text.Block#isTabbed <em>Tabbed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabbed</em>' attribute.
	 * @see #isTabbed()
	 * @generated
	 */
	void setTabbed(boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link Text.Content}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see Text.TextPackage#getBlock_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContent();

} // Block
