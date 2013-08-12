/**
 * <copyright>
 * </copyright>
 *
 * $Id: LayerImpl.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans.impl;

import dsltrans.AbstractSource;
import dsltrans.DsltransPackage;
import dsltrans.Layer;
import dsltrans.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dsltrans.impl.LayerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dsltrans.impl.LayerImpl#getPreviousSource <em>Previous Source</em>}</li>
 *   <li>{@link dsltrans.impl.LayerImpl#getOutputFilePathURI <em>Output File Path URI</em>}</li>
 *   <li>{@link dsltrans.impl.LayerImpl#getHasRule <em>Has Rule</em>}</li>
 *   <li>{@link dsltrans.impl.LayerImpl#getGroupName <em>Group Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LayerImpl extends AbstractSourceImpl implements Layer
{
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = "Layer";

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPreviousSource() <em>Previous Source</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreviousSource()
   * @generated
   * @ordered
   */
  protected EList<AbstractSource> previousSource;

  /**
   * The default value of the '{@link #getOutputFilePathURI() <em>Output File Path URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputFilePathURI()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_FILE_PATH_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutputFilePathURI() <em>Output File Path URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputFilePathURI()
   * @generated
   * @ordered
   */
  protected String outputFilePathURI = OUTPUT_FILE_PATH_URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getHasRule() <em>Has Rule</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasRule()
   * @generated
   * @ordered
   */
  protected EList<Rule> hasRule;

  /**
   * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupName()
   * @generated
   * @ordered
   */
  protected static final String GROUP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupName()
   * @generated
   * @ordered
   */
  protected String groupName = GROUP_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LayerImpl()
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
    return DsltransPackage.Literals.LAYER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.LAYER__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractSource> getPreviousSource()
  {
    if (previousSource == null)
    {
      previousSource = new EObjectResolvingEList<AbstractSource>(AbstractSource.class, this, DsltransPackage.LAYER__PREVIOUS_SOURCE);
    }
    return previousSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutputFilePathURI()
  {
    return outputFilePathURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputFilePathURI(String newOutputFilePathURI)
  {
    String oldOutputFilePathURI = outputFilePathURI;
    outputFilePathURI = newOutputFilePathURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.LAYER__OUTPUT_FILE_PATH_URI, oldOutputFilePathURI, outputFilePathURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getHasRule()
  {
    if (hasRule == null)
    {
      hasRule = new EObjectContainmentEList<Rule>(Rule.class, this, DsltransPackage.LAYER__HAS_RULE);
    }
    return hasRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupName()
  {
    return groupName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupName(String newGroupName)
  {
    String oldGroupName = groupName;
    groupName = newGroupName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DsltransPackage.LAYER__GROUP_NAME, oldGroupName, groupName));
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
      case DsltransPackage.LAYER__HAS_RULE:
        return ((InternalEList<?>)getHasRule()).basicRemove(otherEnd, msgs);
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
      case DsltransPackage.LAYER__DESCRIPTION:
        return getDescription();
      case DsltransPackage.LAYER__PREVIOUS_SOURCE:
        return getPreviousSource();
      case DsltransPackage.LAYER__OUTPUT_FILE_PATH_URI:
        return getOutputFilePathURI();
      case DsltransPackage.LAYER__HAS_RULE:
        return getHasRule();
      case DsltransPackage.LAYER__GROUP_NAME:
        return getGroupName();
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
      case DsltransPackage.LAYER__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DsltransPackage.LAYER__PREVIOUS_SOURCE:
        getPreviousSource().clear();
        getPreviousSource().addAll((Collection<? extends AbstractSource>)newValue);
        return;
      case DsltransPackage.LAYER__OUTPUT_FILE_PATH_URI:
        setOutputFilePathURI((String)newValue);
        return;
      case DsltransPackage.LAYER__HAS_RULE:
        getHasRule().clear();
        getHasRule().addAll((Collection<? extends Rule>)newValue);
        return;
      case DsltransPackage.LAYER__GROUP_NAME:
        setGroupName((String)newValue);
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
      case DsltransPackage.LAYER__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DsltransPackage.LAYER__PREVIOUS_SOURCE:
        getPreviousSource().clear();
        return;
      case DsltransPackage.LAYER__OUTPUT_FILE_PATH_URI:
        setOutputFilePathURI(OUTPUT_FILE_PATH_URI_EDEFAULT);
        return;
      case DsltransPackage.LAYER__HAS_RULE:
        getHasRule().clear();
        return;
      case DsltransPackage.LAYER__GROUP_NAME:
        setGroupName(GROUP_NAME_EDEFAULT);
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
      case DsltransPackage.LAYER__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case DsltransPackage.LAYER__PREVIOUS_SOURCE:
        return previousSource != null && !previousSource.isEmpty();
      case DsltransPackage.LAYER__OUTPUT_FILE_PATH_URI:
        return OUTPUT_FILE_PATH_URI_EDEFAULT == null ? outputFilePathURI != null : !OUTPUT_FILE_PATH_URI_EDEFAULT.equals(outputFilePathURI);
      case DsltransPackage.LAYER__HAS_RULE:
        return hasRule != null && !hasRule.isEmpty();
      case DsltransPackage.LAYER__GROUP_NAME:
        return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(", outputFilePathURI: ");
    result.append(outputFilePathURI);
    result.append(", groupName: ");
    result.append(groupName);
    result.append(')');
    return result.toString();
  }

} //LayerImpl
