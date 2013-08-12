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
 * A representation of the model object '<em><b>Model Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SOS.set.ModelRelation#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link SOS.set.ModelRelation#getSource <em>Source</em>}</li>
 *   <li>{@link SOS.set.ModelRelation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see SOS.set.SetPackage#getModelRelation()
 * @model
 * @generated
 */
public interface ModelRelation extends Term {
	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see SOS.set.SetPackage#getModelRelation_ReferenceName()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link SOS.set.ModelRelation#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(VariableRef)
	 * @see SOS.set.SetPackage#getModelRelation_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableRef getSource();

	/**
	 * Sets the value of the '{@link SOS.set.ModelRelation#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(VariableRef value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(VariableRef)
	 * @see SOS.set.SetPackage#getModelRelation_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableRef getTarget();

	/**
	 * Sets the value of the '{@link SOS.set.ModelRelation#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(VariableRef value);

} // ModelRelation
