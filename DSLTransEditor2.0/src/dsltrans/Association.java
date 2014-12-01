/**
 */
package dsltrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.Association#getAssociationName <em>Association Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getAssociation()
 * @model abstract="true"
 *        annotation="gmf.link label='associationName' width='2'"
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>Association Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Name</em>' attribute.
	 * @see #setAssociationName(String)
	 * @see dsltrans.DsltransPackage#getAssociation_AssociationName()
	 * @model
	 * @generated
	 */
	String getAssociationName();

	/**
	 * Sets the value of the '{@link dsltrans.Association#getAssociationName <em>Association Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Name</em>' attribute.
	 * @see #getAssociationName()
	 * @generated
	 */
	void setAssociationName(String value);

} // Association
