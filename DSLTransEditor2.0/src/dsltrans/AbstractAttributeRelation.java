/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractAttributeRelation.java,v 1.1 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Attribute Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.AbstractAttributeRelation#getSourceAttribute <em>Source Attribute</em>}</li>
 *   <li>{@link dsltrans.AbstractAttributeRelation#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getAbstractAttributeRelation()
 * @model abstract="true"
 *        annotation="gmf.link target='targetAttribute' target.decoration='none' source='sourceAttribute' source.decoration='none' style='solid' width='2'"
 * @generated
 */
public interface AbstractAttributeRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>Source Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Attribute</em>' reference.
   * @see #setSourceAttribute(Attribute)
   * @see dsltrans.DsltransPackage#getAbstractAttributeRelation_SourceAttribute()
   * @model
   * @generated
   */
  Attribute getSourceAttribute();

  /**
   * Sets the value of the '{@link dsltrans.AbstractAttributeRelation#getSourceAttribute <em>Source Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Attribute</em>' reference.
   * @see #getSourceAttribute()
   * @generated
   */
  void setSourceAttribute(Attribute value);

  /**
   * Returns the value of the '<em><b>Target Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Attribute</em>' reference.
   * @see #setTargetAttribute(Attribute)
   * @see dsltrans.DsltransPackage#getAbstractAttributeRelation_TargetAttribute()
   * @model
   * @generated
   */
  Attribute getTargetAttribute();

  /**
   * Sets the value of the '{@link dsltrans.AbstractAttributeRelation#getTargetAttribute <em>Target Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Attribute</em>' reference.
   * @see #getTargetAttribute()
   * @generated
   */
  void setTargetAttribute(Attribute value);

} // AbstractAttributeRelation
