/**
 * <copyright>
 * </copyright>
 *
 * $Id: Atom.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.Atom#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getAtom()
 * @model annotation="gmf.node label='value' label.icon='false' tool.description='Create a literal.'"
 * @generated
 */
public interface Atom extends Term, MatchAttributeValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see dsltrans.DsltransPackage#getAtom_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link dsltrans.Atom#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Atom
