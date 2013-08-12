/**
 * <copyright>
 * </copyright>
 *
 * $Id: MatchModelImpl.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans.impl;

import dsltrans.DsltransPackage;
import dsltrans.FilePort;
import dsltrans.MatchAssociation;
import dsltrans.MatchClass;
import dsltrans.MatchModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.MatchModelImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link dsltrans.impl.MatchModelImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link dsltrans.impl.MatchModelImpl#getExplicitSource <em>Explicit Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchModelImpl extends EObjectImpl implements MatchModel
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<MatchClass> class_;

  /**
   * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociation()
   * @generated
   * @ordered
   */
  protected EList<MatchAssociation> association;

  /**
   * The cached value of the '{@link #getExplicitSource() <em>Explicit Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExplicitSource()
   * @generated
   * @ordered
   */
  protected FilePort explicitSource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatchModelImpl()
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
    return DsltransPackage.Literals.MATCH_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatchClass> getClass_()
  {
    if (class_ == null)
    {
      class_ = new EObjectContainmentEList<MatchClass>(MatchClass.class, this, DsltransPackage.MATCH_MODEL__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatchAssociation> getAssociation()
  {
    if (association == null)
    {
      association = new EObjectContainmentEList<MatchAssociation>(MatchAssociation.class, this, DsltransPackage.MATCH_MODEL__ASSOCIATION);
    }
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilePort getExplicitSource()
  {
    if (explicitSource != null && explicitSource.eIsProxy())
    {
      InternalEObject oldExplicitSource = (InternalEObject)explicitSource;
      explicitSource = (FilePort)eResolveProxy(oldExplicitSource);
      if (explicitSource != oldExplicitSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE, oldExplicitSource, explicitSource));
      }
    }
    return explicitSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilePort basicGetExplicitSource()
  {
    return explicitSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplicitSource(FilePort newExplicitSource)
  {
    FilePort oldExplicitSource = explicitSource;
    explicitSource = newExplicitSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE, oldExplicitSource, explicitSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DsltransPackage.MATCH_MODEL__CLASS:
        return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
      case DsltransPackage.MATCH_MODEL__ASSOCIATION:
        return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DsltransPackage.MATCH_MODEL__CLASS:
        return getClass_();
      case DsltransPackage.MATCH_MODEL__ASSOCIATION:
        return getAssociation();
      case DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE:
        if (resolve) return getExplicitSource();
        return basicGetExplicitSource();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DsltransPackage.MATCH_MODEL__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends MatchClass>)newValue);
        return;
      case DsltransPackage.MATCH_MODEL__ASSOCIATION:
        getAssociation().clear();
        getAssociation().addAll((Collection<? extends MatchAssociation>)newValue);
        return;
      case DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE:
        setExplicitSource((FilePort)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DsltransPackage.MATCH_MODEL__CLASS:
        getClass_().clear();
        return;
      case DsltransPackage.MATCH_MODEL__ASSOCIATION:
        getAssociation().clear();
        return;
      case DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE:
        setExplicitSource((FilePort)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DsltransPackage.MATCH_MODEL__CLASS:
        return class_ != null && !class_.isEmpty();
      case DsltransPackage.MATCH_MODEL__ASSOCIATION:
        return association != null && !association.isEmpty();
      case DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE:
        return explicitSource != null;
    }
    return super.eIsSet(featureID);
  }

} //MatchModelImpl
