/**
 */
package dsltrans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.Layer#getDescription <em>Description</em>}</li>
 *   <li>{@link dsltrans.Layer#getPreviousSource <em>Previous Source</em>}</li>
 *   <li>{@link dsltrans.Layer#getOutputFilePathURI <em>Output File Path URI</em>}</li>
 *   <li>{@link dsltrans.Layer#getHasRule <em>Has Rule</em>}</li>
 *   <li>{@link dsltrans.Layer#getGroupName <em>Group Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getLayer()
 * @model abstract="true"
 *        annotation="gmf.node foo='bar'"
 * @generated
 */
public interface Layer extends AbstractSource {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"Layer"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dsltrans.DsltransPackage#getLayer_Description()
	 * @model default="Layer"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dsltrans.Layer#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Previous Source</b></em>' reference list.
	 * The list contents are of type {@link dsltrans.AbstractSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Source</em>' reference list.
	 * @see dsltrans.DsltransPackage#getLayer_PreviousSource()
	 * @model annotation="gmf.link source.decoration='arrow' width='2' tool.description='Controls the flow of the transformation. Connects Layers/FilePorts.'"
	 * @generated
	 */
	EList<AbstractSource> getPreviousSource();

	/**
	 * Returns the value of the '<em><b>Output File Path URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File Path URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File Path URI</em>' attribute.
	 * @see #setOutputFilePathURI(String)
	 * @see dsltrans.DsltransPackage#getLayer_OutputFilePathURI()
	 * @model
	 * @generated
	 */
	String getOutputFilePathURI();

	/**
	 * Sets the value of the '{@link dsltrans.Layer#getOutputFilePathURI <em>Output File Path URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output File Path URI</em>' attribute.
	 * @see #getOutputFilePathURI()
	 * @generated
	 */
	void setOutputFilePathURI(String value);

	/**
	 * Returns the value of the '<em><b>Has Rule</b></em>' containment reference list.
	 * The list contents are of type {@link dsltrans.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Rule</em>' containment reference list.
	 * @see dsltrans.DsltransPackage#getLayer_HasRule()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	EList<Rule> getHasRule();

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see dsltrans.DsltransPackage#getLayer_GroupName()
	 * @model
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link dsltrans.Layer#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

} // Layer
