/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilePort.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dsltrans.FilePort#getFilePathURI <em>File Path URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see dsltrans.DsltransPackage#getFilePort()
 * @model annotation="gmf.node label='filePathURI' tool.small.bundle='Transformer' tool.description='Specify input model.'"
 * @generated
 */
public interface FilePort extends AbstractSource
{
  /**
   * Returns the value of the '<em><b>File Path URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Path URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Path URI</em>' attribute.
   * @see #setFilePathURI(String)
   * @see dsltrans.DsltransPackage#getFilePort_FilePathURI()
   * @model
   * @generated
   */
  String getFilePathURI();

  /**
   * Sets the value of the '{@link dsltrans.FilePort#getFilePathURI <em>File Path URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Path URI</em>' attribute.
   * @see #getFilePathURI()
   * @generated
   */
  void setFilePathURI(String value);

} // FilePort
