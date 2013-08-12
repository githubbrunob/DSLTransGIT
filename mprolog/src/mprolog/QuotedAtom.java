/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mprolog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quoted Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mprolog.QuotedAtom#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see mprolog.MprologPackage#getQuotedAtom()
 * @model
 * @generated
 */
public interface QuotedAtom extends Term {
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
	 * @see mprolog.MprologPackage#getQuotedAtom_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link mprolog.QuotedAtom#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // QuotedAtom
