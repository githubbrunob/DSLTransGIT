/**
 * <copyright>
 * </copyright>
 *
 * $Id: MatchClass.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.MatchClass#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getMatchClass()
 * @model abstract="true"
 *        annotation="gmf.node foo='bar'"
 * @generated
 */
public interface MatchClass extends AbstractClass
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link dsltrans.MatchAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see dsltrans.DsltransPackage#getMatchClass_Attribute()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<MatchAttribute> getAttribute();

} // MatchClass
