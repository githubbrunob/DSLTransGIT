/**
 * <copyright>
 * </copyright>
 *
 * $Id: TermImpl.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans.impl;

import dsltrans.DsltransPackage;
import dsltrans.Term;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TermImpl extends EObjectImpl implements Term
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DsltransPackage.Literals.TERM;
  }

} //TermImpl
