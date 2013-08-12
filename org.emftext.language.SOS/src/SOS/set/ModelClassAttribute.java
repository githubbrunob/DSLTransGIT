/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.set;

import SOS.adtmm.Term;
import SOS.adtmm.VariableRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Class Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.set.ModelClassAttribute#getSelector <em>Selector</em>}</li>
 *   <li>{@link SOS.set.ModelClassAttribute#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.set.SetPackage#getModelClassAttribute()
 * @model
 * @generated
 */
public interface ModelClassAttribute extends Term {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(VariableRef)
	 * @see SOS.set.SetPackage#getModelClassAttribute_Selector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableRef getSelector();

	/**
	 * Sets the value of the '{@link SOS.set.ModelClassAttribute#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(VariableRef value);

	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see SOS.set.SetPackage#getModelClassAttribute_AttributeName()
	 * @model required="true"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link SOS.set.ModelClassAttribute#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

} // ModelClassAttribute
