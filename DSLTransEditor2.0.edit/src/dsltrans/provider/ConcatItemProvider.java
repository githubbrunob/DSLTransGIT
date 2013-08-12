/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dsltrans.provider;


import dsltrans.Concat;
import dsltrans.DsltransFactory;
import dsltrans.DsltransPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsltrans.Concat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcatItemProvider
  extends OperatorItemProvider
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
  public ConcatItemProvider(AdapterFactory adapterFactory)
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

    }
    return itemPropertyDescriptors;
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
      childrenFeatures.add(DsltransPackage.Literals.CONCAT__LEFT_TERM);
      childrenFeatures.add(DsltransPackage.Literals.CONCAT__RIGHT_TERM);
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
   * This returns Concat.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Concat"));
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
    return getString("_UI_Concat_type");
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

    switch (notification.getFeatureID(Concat.class))
    {
      case DsltransPackage.CONCAT__LEFT_TERM:
      case DsltransPackage.CONCAT__RIGHT_TERM:
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
        (DsltransPackage.Literals.CONCAT__LEFT_TERM,
         DsltransFactory.eINSTANCE.createAtom()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__LEFT_TERM,
         DsltransFactory.eINSTANCE.createAttributeRef()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__LEFT_TERM,
         DsltransFactory.eINSTANCE.createClassRef()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__LEFT_TERM,
         DsltransFactory.eINSTANCE.createConcat()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__LEFT_TERM,
         DsltransFactory.eINSTANCE.createTypeOf()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__LEFT_TERM,
         DsltransFactory.eINSTANCE.createWildcard()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__LEFT_TERM,
         DsltransFactory.eINSTANCE.createSequencer()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__RIGHT_TERM,
         DsltransFactory.eINSTANCE.createAtom()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__RIGHT_TERM,
         DsltransFactory.eINSTANCE.createAttributeRef()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__RIGHT_TERM,
         DsltransFactory.eINSTANCE.createClassRef()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__RIGHT_TERM,
         DsltransFactory.eINSTANCE.createConcat()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__RIGHT_TERM,
         DsltransFactory.eINSTANCE.createTypeOf()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__RIGHT_TERM,
         DsltransFactory.eINSTANCE.createWildcard()));

    newChildDescriptors.add
      (createChildParameter
        (DsltransPackage.Literals.CONCAT__RIGHT_TERM,
         DsltransFactory.eINSTANCE.createSequencer()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
      childFeature == DsltransPackage.Literals.CONCAT__LEFT_TERM ||
      childFeature == DsltransPackage.Literals.CONCAT__RIGHT_TERM;

    if (qualify)
    {
      return getString
        ("_UI_CreateChild_text2",
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}
