/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractSource.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.AbstractSource#getMetaModelId <em>Meta Model Id</em>}</li>
 *   <li>{@link dsltrans.AbstractSource#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getAbstractSource()
 * @model abstract="true"
 *        annotation="gmf.node foo='bar'"
 * @generated
 */
public interface AbstractSource extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta Model Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Model Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Model Id</em>' containment reference.
   * @see #setMetaModelId(MetaModelIdentifier)
   * @see dsltrans.DsltransPackage#getAbstractSource_MetaModelId()
   * @model containment="true" required="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  MetaModelIdentifier getMetaModelId();

  /**
   * Sets the value of the '{@link dsltrans.AbstractSource#getMetaModelId <em>Meta Model Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Model Id</em>' containment reference.
   * @see #getMetaModelId()
   * @generated
   */
  void setMetaModelId(MetaModelIdentifier value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dsltrans.DsltransPackage#getAbstractSource_Name()
   * @model default=""
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dsltrans.AbstractSource#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // AbstractSource
