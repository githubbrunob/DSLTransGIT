/**
 * <copyright>
 * </copyright>
 *
 * $Id: MetaModelIdentifier.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Model Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.MetaModelIdentifier#getMetaModelURI <em>Meta Model URI</em>}</li>
 *   <li>{@link dsltrans.MetaModelIdentifier#getMetaModelName <em>Meta Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getMetaModelIdentifier()
 * @model annotation="gmf.node label='metaModelName' tool.description='Describe a metamodel.'"
 * @generated
 */
public interface MetaModelIdentifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta Model URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Model URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Model URI</em>' attribute.
   * @see #setMetaModelURI(String)
   * @see dsltrans.DsltransPackage#getMetaModelIdentifier_MetaModelURI()
   * @model
   * @generated
   */
  String getMetaModelURI();

  /**
   * Sets the value of the '{@link dsltrans.MetaModelIdentifier#getMetaModelURI <em>Meta Model URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Model URI</em>' attribute.
   * @see #getMetaModelURI()
   * @generated
   */
  void setMetaModelURI(String value);

  /**
   * Returns the value of the '<em><b>Meta Model Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Model Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Model Name</em>' attribute.
   * @see #setMetaModelName(String)
   * @see dsltrans.DsltransPackage#getMetaModelIdentifier_MetaModelName()
   * @model
   * @generated
   */
  String getMetaModelName();

  /**
   * Sets the value of the '{@link dsltrans.MetaModelIdentifier#getMetaModelName <em>Meta Model Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Model Name</em>' attribute.
   * @see #getMetaModelName()
   * @generated
   */
  void setMetaModelName(String value);

} // MetaModelIdentifier
