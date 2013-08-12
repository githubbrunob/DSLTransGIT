/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassRefImpl.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans.impl;

import dsltrans.AbstractClass;
import dsltrans.ClassRef;
import dsltrans.DsltransPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.ClassRefImpl#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassRefImpl extends RefImpl implements ClassRef
{
  /**
   * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassRef()
   * @generated
   * @ordered
   */
  protected AbstractClass classRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassRefImpl()
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
    return DsltransPackage.Literals.CLASS_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractClass getClassRef()
  {
    if (classRef != null && classRef.eIsProxy())
    {
      InternalEObject oldClassRef = (InternalEObject)classRef;
      classRef = (AbstractClass)eResolveProxy(oldClassRef);
      if (classRef != oldClassRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsltransPackage.CLASS_REF__CLASS_REF, oldClassRef, classRef));
      }
    }
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractClass basicGetClassRef()
  {
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassRef(AbstractClass newClassRef)
  {
    AbstractClass oldClassRef = classRef;
    classRef = newClassRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.CLASS_REF__CLASS_REF, oldClassRef, classRef));
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
      case DsltransPackage.CLASS_REF__CLASS_REF:
        if (resolve) return getClassRef();
        return basicGetClassRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DsltransPackage.CLASS_REF__CLASS_REF:
        setClassRef((AbstractClass)newValue);
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
      case DsltransPackage.CLASS_REF__CLASS_REF:
        setClassRef((AbstractClass)null);
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
      case DsltransPackage.CLASS_REF__CLASS_REF:
        return classRef != null;
    }
    return super.eIsSet(featureID);
  }

} //ClassRefImpl
