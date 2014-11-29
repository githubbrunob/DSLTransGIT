/**
 */
package dsltrans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.ClassRef#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getClassRef()
 * @model annotation="gmf.node foo='bar' label.placement='none'"
 * @generated
 */
public interface ClassRef extends Ref {
	/**
	 * Returns the value of the '<em><b>Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Ref</em>' reference.
	 * @see #setClassRef(AbstractClass)
	 * @see dsltrans.DsltransPackage#getClassRef_ClassRef()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' width='2'"
	 * @generated
	 */
	AbstractClass getClassRef();

	/**
	 * Sets the value of the '{@link dsltrans.ClassRef#getClassRef <em>Class Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' reference.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(AbstractClass value);

} // ClassRef
