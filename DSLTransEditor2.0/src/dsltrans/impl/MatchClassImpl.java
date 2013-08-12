/**
 * <copyright>
 * </copyright>
 *
 * $Id: MatchClassImpl.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans.impl;

import dsltrans.DsltransPackage;
import dsltrans.MatchAttribute;
import dsltrans.MatchClass;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.MatchClassImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MatchClassImpl extends AbstractClassImpl implements MatchClass
{
  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EList<MatchAttribute> attribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatchClassImpl()
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
    return DsltransPackage.Literals.MATCH_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatchAttribute> getAttribute()
  {
    if (attribute == null)
    {
      attribute = new EObjectContainmentEList<MatchAttribute>(MatchAttribute.class, this, DsltransPackage.MATCH_CLASS__ATTRIBUTE);
    }
    return attribute;
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
      case DsltransPackage.MATCH_CLASS__ATTRIBUTE:
        return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
      case DsltransPackage.MATCH_CLASS__ATTRIBUTE:
        return getAttribute();
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
      case DsltransPackage.MATCH_CLASS__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends MatchAttribute>)newValue);
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
      case DsltransPackage.MATCH_CLASS__ATTRIBUTE:
        getAttribute().clear();
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
      case DsltransPackage.MATCH_CLASS__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MatchClassImpl
