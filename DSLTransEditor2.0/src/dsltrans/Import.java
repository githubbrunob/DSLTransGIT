/**
 */
package dsltrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.Import#getTarget <em>Target</em>}</li>
 *   <li>{@link dsltrans.Import#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getImport()
 * @model annotation="gmf.link target='target' source='source' target.decoration='arrow' color='85,64,45' width='2' tool.description='Copy full model elements.'"
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ApplyClass)
	 * @see dsltrans.DsltransPackage#getImport_Target()
	 * @model required="true"
	 * @generated
	 */
	ApplyClass getTarget();

	/**
	 * Sets the value of the '{@link dsltrans.Import#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ApplyClass value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PositiveMatchClass)
	 * @see dsltrans.DsltransPackage#getImport_Source()
	 * @model required="true"
	 * @generated
	 */
	PositiveMatchClass getSource();

	/**
	 * Sets the value of the '{@link dsltrans.Import#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PositiveMatchClass value);

} // Import
