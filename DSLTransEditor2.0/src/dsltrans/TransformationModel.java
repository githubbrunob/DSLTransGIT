/**
 */
package dsltrans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.TransformationModel#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getTransformationModel()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface TransformationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link dsltrans.AbstractSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see dsltrans.DsltransPackage#getTransformationModel_Source()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractSource> getSource();

} // TransformationModel
