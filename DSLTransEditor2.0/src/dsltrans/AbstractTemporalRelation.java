/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractTemporalRelation.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Temporal Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.AbstractTemporalRelation#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link dsltrans.AbstractTemporalRelation#getSourceClass <em>Source Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getAbstractTemporalRelation()
 * @model abstract="true"
 *        annotation="gmf.link target='targetClass' source='sourceClass' style='dot' width='2'"
 * @generated
 */
public interface AbstractTemporalRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>Target Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Class</em>' reference.
   * @see #setTargetClass(ApplyClass)
   * @see dsltrans.DsltransPackage#getAbstractTemporalRelation_TargetClass()
   * @model required="true"
   * @generated
   */
  ApplyClass getTargetClass();

  /**
   * Sets the value of the '{@link dsltrans.AbstractTemporalRelation#getTargetClass <em>Target Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Class</em>' reference.
   * @see #getTargetClass()
   * @generated
   */
  void setTargetClass(ApplyClass value);

  /**
   * Returns the value of the '<em><b>Source Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Class</em>' reference.
   * @see #setSourceClass(PositiveMatchClass)
   * @see dsltrans.DsltransPackage#getAbstractTemporalRelation_SourceClass()
   * @model required="true"
   * @generated
   */
  PositiveMatchClass getSourceClass();

  /**
   * Sets the value of the '{@link dsltrans.AbstractTemporalRelation#getSourceClass <em>Source Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Class</em>' reference.
   * @see #getSourceClass()
   * @generated
   */
  void setSourceClass(PositiveMatchClass value);

} // AbstractTemporalRelation
