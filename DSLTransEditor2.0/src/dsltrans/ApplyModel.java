/**
 */
package dsltrans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.ApplyModel#getClass_ <em>Class</em>}</li>
 *   <li>{@link dsltrans.ApplyModel#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getApplyModel()
 * @model annotation="gmf.node color='255,255,163' tool.description='Apply pattern. Place inside Rule.' label.placement='none'"
 * @generated
 */
public interface ApplyModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link dsltrans.ApplyClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see dsltrans.DsltransPackage#getApplyModel_Class()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	EList<ApplyClass> getClass_();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link dsltrans.ApplyAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see dsltrans.DsltransPackage#getApplyModel_Association()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplyAssociation> getAssociation();

} // ApplyModel
