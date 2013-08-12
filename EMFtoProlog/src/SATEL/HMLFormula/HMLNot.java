/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLNot.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HML Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.HMLNot#getHmlFormulaContent <em>Hml Formula Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLNot()
 * @model
 * @generated
 */
public interface HMLNot extends HMLFormulaContent {
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
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLNot_HmlFormulaContent()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	HMLFormulaContent getHmlFormulaContent();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.HMLNot#getHmlFormulaContent <em>Hml Formula Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hml Formula Content</em>' containment reference.
	 * @see #getHmlFormulaContent()
	 * @generated
	 */
	void setHmlFormulaContent(HMLFormulaContent value);

} // HMLNot
