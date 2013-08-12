/**
 * <copyright>
 * </copyright>
 *
 * $Id: MatchModel.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.MatchModel#getClass_ <em>Class</em>}</li>
 *   <li>{@link dsltrans.MatchModel#getAssociation <em>Association</em>}</li>
 *   <li>{@link dsltrans.MatchModel#getExplicitSource <em>Explicit Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getMatchModel()
 * @model annotation="gmf.node foo='bar' tool.description='Match pattern. Place inside Rule.' label.readOnly='true'"
 * @generated
 */
public interface MatchModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference list.
   * The list contents are of type {@link dsltrans.MatchClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference list.
   * @see dsltrans.DsltransPackage#getMatchModel_Class()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<MatchClass> getClass_();

  /**
   * Returns the value of the '<em><b>Association</b></em>' containment reference list.
   * The list contents are of type {@link dsltrans.MatchAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Association</em>' containment reference list.
   * @see dsltrans.DsltransPackage#getMatchModel_Association()
   * @model containment="true"
   * @generated
   */
  EList<MatchAssociation> getAssociation();

  /**
   * Returns the value of the '<em><b>Explicit Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Explicit Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Explicit Source</em>' reference.
   * @see #setExplicitSource(FilePort)
   * @see dsltrans.DsltransPackage#getMatchModel_ExplicitSource()
   * @model annotation="gmf.link foo='bar'"
   * @generated
   */
  FilePort getExplicitSource();

  /**
   * Sets the value of the '{@link dsltrans.MatchModel#getExplicitSource <em>Explicit Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Source</em>' reference.
   * @see #getExplicitSource()
   * @generated
   */
  void setExplicitSource(FilePort value);

} // MatchModel
