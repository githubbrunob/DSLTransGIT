/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Java5.Annotation#getType <em>Type</em>}</li>
 *   <li>{@link Java5.Annotation#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see Java5.Java5Package#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(NamedElementRef)
	 * @see Java5.Java5Package#getAnnotation_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedElementRef getType();

	/**
	 * Sets the value of the '{@link Java5.Annotation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NamedElementRef value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link Java5.AnnotationMemberValuePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see Java5.Java5Package#getAnnotation_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotationMemberValuePair> getValues();

} // Annotation
