/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLAnd.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HML And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SATEL.HMLFormula.HMLAnd#getHmlFormulaContentL <em>Hml Formula Content L</em>}</li>
 *   <li>{@link SATEL.HMLFormula.HMLAnd#getHmlFormulaContentR <em>Hml Formula Content R</em>}</li>
 * </ul>
 * </p>
 *
 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLAnd()
 * @model
 * @generated
 */
public interface HMLAnd extends HMLFormulaContent {
	/**
	 * Returns the value of the '<em><b>Hml Formula Content L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hml Formula Content L</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hml Formula Content L</em>' containment reference.
	 * @see #setHmlFormulaContentL(HMLFormulaContent)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLAnd_HmlFormulaContentL()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	HMLFormulaContent getHmlFormulaContentL();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.HMLAnd#getHmlFormulaContentL <em>Hml Formula Content L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hml Formula Content L</em>' containment reference.
	 * @see #getHmlFormulaContentL()
	 * @generated
	 */
	void setHmlFormulaContentL(HMLFormulaContent value);

	/**
	 * Returns the value of the '<em><b>Hml Formula Content R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hml Formula Content R</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hml Formula Content R</em>' containment reference.
	 * @see #setHmlFormulaContentR(HMLFormulaContent)
	 * @see SATEL.HMLFormula.HMLFormulaPackage#getHMLAnd_HmlFormulaContentR()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	HMLFormulaContent getHmlFormulaContentR();

	/**
	 * Sets the value of the '{@link SATEL.HMLFormula.HMLAnd#getHmlFormulaContentR <em>Hml Formula Content R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hml Formula Content R</em>' containment reference.
	 * @see #getHmlFormulaContentR()
	 * @generated
	 */
	void setHmlFormulaContentR(HMLFormulaContent value);

} // HMLAnd
