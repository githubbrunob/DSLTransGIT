/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLNext.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HML Next</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.HMLNext#getHmlFormulaContent <em>Hml Formula Content</em>}</li>
 *   <li>{@link SATEL.HMLFormula.HMLNext#getHmlEvent <em>Hml Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLNext()
 * @model
 * @generated
 */
public interface HMLNext extends HMLFormulaContent {
	/**
	 * Returns the value of the '<em><b>Hml Formula Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hml Formula Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hml Formula Content</em>' containment reference.
	 * @see #setHmlFormulaContent(HMLFormulaContent)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLNext_HmlFormulaContent()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	HMLFormulaContent getHmlFormulaContent();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.HMLNext#getHmlFormulaContent <em>Hml Formula Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hml Formula Content</em>' containment reference.
	 * @see #getHmlFormulaContent()
	 * @generated
	 */
	void setHmlFormulaContent(HMLFormulaContent value);

	/**
	 * Returns the value of the '<em><b>Hml Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hml Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hml Event</em>' containment reference.
	 * @see #setHmlEvent(HMLEvent)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLNext_HmlEvent()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	HMLEvent getHmlEvent();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.HMLNext#getHmlEvent <em>Hml Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hml Event</em>' containment reference.
	 * @see #getHmlEvent()
	 * @generated
	 */
	void setHmlEvent(HMLEvent value);

} // HMLNext
