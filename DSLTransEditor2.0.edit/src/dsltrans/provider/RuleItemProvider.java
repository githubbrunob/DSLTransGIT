/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dsltrans.provider;


import dsltrans.DsltransFactory;
import dsltrans.DsltransPackage;
import dsltrans.Rule;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsltrans.Rule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addDescriptionPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Description feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDescriptionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Rule_description_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Rule_description_feature", "_UI_Rule_type"),
         DsltransPackage.Literals.RULE__DESCRIPTION,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(DsltransPackage.Literals.RULE__MATCH);
      childrenFeatures.add(DsltransPackage.Literals.RULE__APPLY);
      childrenFeatures.add(DsltransPackage.Literals.RULE__BACKWARDS);
      childrenFeatures.add(DsltransPackage.Literals.RULE__IMPORTS);
      childrenFeatures.add(DsltransPackage.Literals.RULE__ATTRIBUTE_RELATIONS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Rule.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Rule"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((Rule)object).getDescription();
    return label == null || label.length() == 0 ?
      getString("_UI_Rule_type") :
      getString("_UI_Rule_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(Rule.class))
    {
      case DsltransPackage.RULE__DESCRIPTION:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case DsltransPackage.RULE__MATCH:
      case DsltransPackage.RULE__APPLY:
      case DsltransPackage.RULE__BACKWARDS:
      case DsltransPackage.RULE__IMPORTS:
      case DsltransPackage.RULE__ATTRIBUTE_RELATIONS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.RULE__MATCH,
         DsltransFactory.eINSTANCE.createMatchModel()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.RULE__APPLY,
         DsltransFactory.eINSTANCE.createApplyModel()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.RULE__BACKWARDS,
         DsltransFactory.eINSTANCE.createPositiveBackwardRestriction()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.RULE__BACKWARDS,
         DsltransFactory.eINSTANCE.createNegativeBackwardRestriction()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.RULE__IMPORTS,
         DsltransFactory.eINSTANCE.createImport()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.RULE__ATTRIBUTE_RELATIONS,
         DsltransFactory.eINSTANCE.createAttributeEquality()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.RULE__ATTRIBUTE_RELATIONS,
         DsltransFactory.eINSTANCE.createAttributeInequality()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return DsltransEditPlugin.INSTANCE;
  }

}
