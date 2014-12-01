/**
 */
package dsltrans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.Rule#getDescription <em>Description</em>}</li>
 *   <li>{@link dsltrans.Rule#getMatch <em>Match</em>}</li>
 *   <li>{@link dsltrans.Rule#getApply <em>Apply</em>}</li>
 *   <li>{@link dsltrans.Rule#getBackwards <em>Backwards</em>}</li>
 *   <li>{@link dsltrans.Rule#getImports <em>Imports</em>}</li>
 *   <li>{@link dsltrans.Rule#getAttributeRelations <em>Attribute Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getRule()
 * @model annotation="gmf.node label='description' tool.description='Create Rule. Place inside Layer.'"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dsltrans.DsltransPackage#getRule_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dsltrans.Rule#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' containment reference list.
	 * The list contents are of type {@link dsltrans.MatchModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' containment reference list.
	 * @see dsltrans.DsltransPackage#getRule_Match()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	EList<MatchModel> getMatch();

	/**
	 * Returns the value of the '<em><b>Apply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply</em>' containment reference.
	 * @see #setApply(ApplyModel)
	 * @see dsltrans.DsltransPackage#getRule_Apply()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	ApplyModel getApply();

	/**
	 * Sets the value of the '{@link dsltrans.Rule#getApply <em>Apply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply</em>' containment reference.
	 * @see #getApply()
	 * @generated
	 */
	void setApply(ApplyModel value);

	/**
	 * Returns the value of the '<em><b>Backwards</b></em>' containment reference list.
	 * The list contents are of type {@link dsltrans.AbstractTemporalRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backwards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backwards</em>' containment reference list.
	 * @see dsltrans.DsltransPackage#getRule_Backwards()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTemporalRelation> getBackwards();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link dsltrans.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see dsltrans.DsltransPackage#getRule_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Attribute Relations</b></em>' containment reference list.
	 * The list contents are of type {@link dsltrans.AbstractAttributeRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Relations</em>' containment reference list.
	 * @see dsltrans.DsltransPackage#getRule_AttributeRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractAttributeRelation> getAttributeRelations();

} // Rule
