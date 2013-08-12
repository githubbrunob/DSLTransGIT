/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConcatImpl.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans.impl;

import dsltrans.Concat;
import dsltrans.DsltransPackage;
import dsltrans.Term;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.ConcatImpl#getLeftTerm <em>Left Term</em>}</li>
 *   <li>{@link dsltrans.impl.ConcatImpl#getRightTerm <em>Right Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcatImpl extends OperatorImpl implements Concat
{
  /**
   * The cached value of the '{@link #getLeftTerm() <em>Left Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftTerm()
   * @generated
   * @ordered
   */
  protected Term leftTerm;

  /**
   * The cached value of the '{@link #getRightTerm() <em>Right Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightTerm()
   * @generated
   * @ordered
   */
  protected Term rightTerm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConcatImpl()
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
    return DsltransPackage.Literals.CONCAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getLeftTerm()
  {
    return leftTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftTerm(Term newLeftTerm, NotificationChain msgs)
  {
    Term oldLeftTerm = leftTerm;
    leftTerm = newLeftTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsltransPackage.CONCAT__LEFT_TERM, oldLeftTerm, newLeftTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftTerm(Term newLeftTerm)
  {
    if (newLeftTerm != leftTerm)
    {
      NotificationChain msgs = null;
      if (leftTerm != null)
        msgs = ((InternalEObject)leftTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsltransPackage.CONCAT__LEFT_TERM, null, msgs);
      if (newLeftTerm != null)
        msgs = ((InternalEObject)newLeftTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsltransPackage.CONCAT__LEFT_TERM, null, msgs);
      msgs = basicSetLeftTerm(newLeftTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.CONCAT__LEFT_TERM, newLeftTerm, newLeftTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getRightTerm()
  {
    return rightTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightTerm(Term newRightTerm, NotificationChain msgs)
  {
    Term oldRightTerm = rightTerm;
    rightTerm = newRightTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsltransPackage.CONCAT__RIGHT_TERM, oldRightTerm, newRightTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightTerm(Term newRightTerm)
  {
    if (newRightTerm != rightTerm)
    {
      NotificationChain msgs = null;
      if (rightTerm != null)
        msgs = ((InternalEObject)rightTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsltransPackage.CONCAT__RIGHT_TERM, null, msgs);
      if (newRightTerm != null)
        msgs = ((InternalEObject)newRightTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsltransPackage.CONCAT__RIGHT_TERM, null, msgs);
      msgs = basicSetRightTerm(newRightTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.CONCAT__RIGHT_TERM, newRightTerm, newRightTerm));
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
      case DsltransPackage.CONCAT__LEFT_TERM:
        return basicSetLeftTerm(null, msgs);
      case DsltransPackage.CONCAT__RIGHT_TERM:
        return basicSetRightTerm(null, msgs);
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
      case DsltransPackage.CONCAT__LEFT_TERM:
        return getLeftTerm();
      case DsltransPackage.CONCAT__RIGHT_TERM:
        return getRightTerm();
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
      case DsltransPackage.CONCAT__LEFT_TERM:
        setLeftTerm((Term)newValue);
        return;
      case DsltransPackage.CONCAT__RIGHT_TERM:
        setRightTerm((Term)newValue);
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
      case DsltransPackage.CONCAT__LEFT_TERM:
        setLeftTerm((Term)null);
        return;
      case DsltransPackage.CONCAT__RIGHT_TERM:
        setRightTerm((Term)null);
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
      case DsltransPackage.CONCAT__LEFT_TERM:
        return leftTerm != null;
      case DsltransPackage.CONCAT__RIGHT_TERM:
        return rightTerm != null;
    }
    return super.eIsSet(featureID);
  }

} //ConcatImpl
