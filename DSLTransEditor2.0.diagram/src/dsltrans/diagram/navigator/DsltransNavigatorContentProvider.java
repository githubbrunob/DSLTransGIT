/*
 * 
 */
package dsltrans.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import dsltrans.diagram.edit.parts.AnyMatchClassAnyMatchClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.AnyMatchClassEditPart;
import dsltrans.diagram.edit.parts.ApplyAssociationEditPart;
import dsltrans.diagram.edit.parts.ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart;
import dsltrans.diagram.edit.parts.ApplyAttributeEditPart;
import dsltrans.diagram.edit.parts.ApplyClassApplyClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.ApplyClassEditPart;
import dsltrans.diagram.edit.parts.ApplyMayBeSameRelationEditPart;
import dsltrans.diagram.edit.parts.ApplyModelApplyModelClassCompartmentEditPart;
import dsltrans.diagram.edit.parts.ApplyModelEditPart;
import dsltrans.diagram.edit.parts.Atom2EditPart;
import dsltrans.diagram.edit.parts.Atom3EditPart;
import dsltrans.diagram.edit.parts.Atom4EditPart;
import dsltrans.diagram.edit.parts.AtomEditPart;
import dsltrans.diagram.edit.parts.AttributeEqualityEditPart;
import dsltrans.diagram.edit.parts.AttributeInequalityEditPart;
import dsltrans.diagram.edit.parts.AttributeRef2EditPart;
import dsltrans.diagram.edit.parts.AttributeRef3EditPart;
import dsltrans.diagram.edit.parts.AttributeRefAttributeRefEditPart;
import dsltrans.diagram.edit.parts.AttributeRefEditPart;
import dsltrans.diagram.edit.parts.ClassRef2EditPart;
import dsltrans.diagram.edit.parts.ClassRef3EditPart;
import dsltrans.diagram.edit.parts.ClassRefClassRefEditPart;
import dsltrans.diagram.edit.parts.ClassRefEditPart;
import dsltrans.diagram.edit.parts.Concat2EditPart;
import dsltrans.diagram.edit.parts.Concat3EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatLeftTermCompartment2EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatLeftTermCompartment3EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatLeftTermCompartmentEditPart;
import dsltrans.diagram.edit.parts.ConcatConcatRightTermCompartment2EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatRightTermCompartment3EditPart;
import dsltrans.diagram.edit.parts.ConcatConcatRightTermCompartmentEditPart;
import dsltrans.diagram.edit.parts.ConcatEditPart;
import dsltrans.diagram.edit.parts.ExistsMatchClassEditPart;
import dsltrans.diagram.edit.parts.ExistsMatchClassExistsMatchClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.FilePortEditPart;
import dsltrans.diagram.edit.parts.FilePortFilePortMetaModelIdCompartmentEditPart;
import dsltrans.diagram.edit.parts.ImportEditPart;
import dsltrans.diagram.edit.parts.IsNullEditPart;
import dsltrans.diagram.edit.parts.LayerPreviousSourceEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeEditPart;
import dsltrans.diagram.edit.parts.MatchAttributeMatchAttributeAttributeValueCompartmentEditPart;
import dsltrans.diagram.edit.parts.MatchMayBeSameRelationEditPart;
import dsltrans.diagram.edit.parts.MatchModelEditPart;
import dsltrans.diagram.edit.parts.MatchModelExplicitSourceEditPart;
import dsltrans.diagram.edit.parts.MatchModelMatchModelClassCompartmentEditPart;
import dsltrans.diagram.edit.parts.MetaModelIdentifierEditPart;
import dsltrans.diagram.edit.parts.NegativeBackwardRestrictionEditPart;
import dsltrans.diagram.edit.parts.NegativeIndirectAssociationEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchAssociationEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassEditPart;
import dsltrans.diagram.edit.parts.NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart;
import dsltrans.diagram.edit.parts.PositiveBackwardRestrictionEditPart;
import dsltrans.diagram.edit.parts.PositiveIndirectAssociationEditPart;
import dsltrans.diagram.edit.parts.PositiveMatchAssociationEditPart;
import dsltrans.diagram.edit.parts.RuleEditPart;
import dsltrans.diagram.edit.parts.RuleRuleApplyCompartmentEditPart;
import dsltrans.diagram.edit.parts.RuleRuleMatchCompartmentEditPart;
import dsltrans.diagram.edit.parts.Sequencer2EditPart;
import dsltrans.diagram.edit.parts.Sequencer3EditPart;
import dsltrans.diagram.edit.parts.SequencerEditPart;
import dsltrans.diagram.edit.parts.SequentialEditPart;
import dsltrans.diagram.edit.parts.SequentialSequentialHasRuleCompartmentEditPart;
import dsltrans.diagram.edit.parts.SequentialSequentialMetaModelIdCompartmentEditPart;
import dsltrans.diagram.edit.parts.TransformationModelEditPart;
import dsltrans.diagram.edit.parts.TypeOf2EditPart;
import dsltrans.diagram.edit.parts.TypeOf3EditPart;
import dsltrans.diagram.edit.parts.TypeOfEditPart;
import dsltrans.diagram.edit.parts.Wildcard2EditPart;
import dsltrans.diagram.edit.parts.Wildcard3EditPart;
import dsltrans.diagram.edit.parts.WildcardEditPart;
import dsltrans.diagram.part.DsltransVisualIDRegistry;
import dsltrans.diagram.part.Messages;

/**
 * @generated
 */
public class DsltransNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DsltransNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<DsltransNavigatorItem> result = new ArrayList<DsltransNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof DsltransNavigatorGroup) {
			DsltransNavigatorGroup group = (DsltransNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof DsltransNavigatorItem) {
			DsltransNavigatorItem navigatorItem = (DsltransNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (DsltransVisualIDRegistry.getVisualID(view)) {

		case NegativeIndirectAssociationEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_NegativeIndirectAssociation_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_NegativeIndirectAssociation_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AttributeRef2EditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AttributeRef_3021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRefAttributeRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ClassRefEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ClassRef_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRefClassRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExistsMatchClassEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup incominglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ExistsMatchClass_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ExistsMatchClass_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassExistsMatchClassAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(MatchAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveIndirectAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveIndirectAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeIndirectAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeIndirectAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveMatchAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveMatchAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchMayBeSameRelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchMayBeSameRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveBackwardRestrictionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeBackwardRestrictionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry.getType(ImportEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRefClassRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MatchMayBeSameRelationEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_MatchMayBeSameRelation_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_MatchMayBeSameRelation_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AttributeEqualityEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AttributeEquality_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AttributeEquality_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchAttributeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RuleEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(RuleRuleMatchCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(MatchModelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(RuleRuleApplyCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ApplyModelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PositiveIndirectAssociationEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_PositiveIndirectAssociation_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_PositiveIndirectAssociation_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AttributeRefEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AttributeRef_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRefAttributeRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ApplyMayBeSameRelationEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ApplyMayBeSameRelation_4018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ApplyMayBeSameRelation_4018_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AttributeRef3EditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AttributeRef_3025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRefAttributeRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TransformationModelEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			DsltransNavigatorGroup links = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_TransformationModel_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(SequentialEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(FilePortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveIndirectAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeIndirectAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveMatchAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchMayBeSameRelationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyMayBeSameRelationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveBackwardRestrictionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeBackwardRestrictionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeEqualityEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeInequalityEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry.getType(ImportEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(LayerPreviousSourceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchModelExplicitSourceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRefAttributeRefEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRefClassRefEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ClassRefClassRefEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ClassRefClassRef_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ClassRefClassRef_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRefEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRef2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRef3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TypeOfEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_TypeOf_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRefAttributeRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ApplyModelEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyModelApplyModelClassCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ApplyClassEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ApplyAssociationEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ApplyAssociation_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ApplyAssociation_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SequentialEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup incominglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_Sequential_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_Sequential_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(SequentialSequentialMetaModelIdCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(MetaModelIdentifierEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(SequentialSequentialHasRuleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(RuleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(LayerPreviousSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(LayerPreviousSourceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LayerPreviousSourceEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_LayerPreviousSource_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_LayerPreviousSource_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(SequentialEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(FilePortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(SequentialEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AttributeInequalityEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AttributeInequality_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AttributeInequality_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchAttributeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MatchModelEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_MatchModel_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchModelMatchModelClassCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchModelMatchModelClassCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchModelMatchModelClassCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchModelExplicitSourceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PositiveMatchAssociationEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_PositiveMatchAssociation_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_PositiveMatchAssociation_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Concat2EditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(TypeOf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(TypeOf3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Atom3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(AttributeRef2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ClassRef2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Concat2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Atom4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(AttributeRef3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ClassRef3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Concat3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(WildcardEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(SequencerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(Wildcard2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(Sequencer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ApplyAttributeEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup incominglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ApplyAttribute_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ApplyAttribute_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(TypeOfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Atom2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(AttributeRefEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ClassRefEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(ConcatEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(Wildcard3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeApplyAttributeAttributeValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(Sequencer3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeEqualityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeEqualityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeInequalityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeInequalityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRefAttributeRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NegativeMatchAssociationEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_NegativeMatchAssociation_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_NegativeMatchAssociation_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ImportEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_Import_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_Import_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ApplyClassEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup incominglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ApplyClass_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ApplyClass_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyClassApplyClassAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ApplyAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyMayBeSameRelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyMayBeSameRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveBackwardRestrictionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeBackwardRestrictionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry.getType(ImportEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRefClassRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NegativeMatchClassEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup incominglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_NegativeMatchClass_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_NegativeMatchClass_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchClassNegativeMatchClassAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(MatchAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveIndirectAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveIndirectAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeIndirectAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeIndirectAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveMatchAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveMatchAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchMayBeSameRelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchMayBeSameRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRefClassRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PositiveBackwardRestrictionEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_PositiveBackwardRestriction_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_PositiveBackwardRestriction_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TypeOf2EditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_TypeOf_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRefAttributeRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MatchAttributeEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup incominglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_MatchAttribute_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_MatchAttribute_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchAttributeMatchAttributeAttributeValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(AtomEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchAttributeMatchAttributeAttributeValueCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(IsNullEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeEqualityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeEqualityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeInequalityEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeInequalityEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRefAttributeRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConcatEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(TypeOf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(TypeOf3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Atom3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(AttributeRef2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ClassRef2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Concat2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Atom4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(AttributeRef3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ClassRef3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Concat3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(WildcardEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(SequencerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(Wildcard2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(Sequencer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AnyMatchClassEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup incominglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AnyMatchClass_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AnyMatchClass_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassAnyMatchClassAttributeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(MatchAttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveIndirectAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveIndirectAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeIndirectAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeIndirectAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveMatchAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveMatchAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeMatchAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchMayBeSameRelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchMayBeSameRelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(PositiveBackwardRestrictionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(NegativeBackwardRestrictionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry.getType(ImportEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRefClassRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MatchModelExplicitSourceEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_MatchModelExplicitSource_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_MatchModelExplicitSource_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(FilePortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ClassRef3EditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ClassRef_3026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRefClassRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TypeOf3EditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_TypeOf_3019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRefAttributeRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NegativeBackwardRestrictionEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_NegativeBackwardRestriction_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_NegativeBackwardRestriction_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AnyMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ExistsMatchClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Concat3EditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(TypeOf2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(TypeOf3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Atom3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(AttributeRef2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ClassRef2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Concat2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Atom4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(AttributeRef3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(ClassRef3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry.getType(Concat3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(WildcardEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatLeftTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(SequencerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(Wildcard2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ConcatConcatRightTermCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(Sequencer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FilePortEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup incominglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_FilePort_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(FilePortFilePortMetaModelIdCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsltransVisualIDRegistry
							.getType(MetaModelIdentifierEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(LayerPreviousSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchModelExplicitSourceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AttributeRefAttributeRefEditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsltransNavigatorGroup target = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AttributeRefAttributeRef_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsltransNavigatorGroup source = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_AttributeRefAttributeRef_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(MatchAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ApplyAttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry.getType(TypeOfEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRefEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry.getType(TypeOf2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry.getType(TypeOf3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRef2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(AttributeRef3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ClassRef2EditPart.VISUAL_ID: {
			LinkedList<DsltransAbstractNavigatorItem> result = new LinkedList<DsltransAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsltransNavigatorGroup outgoinglinks = new DsltransNavigatorGroup(
					Messages.NavigatorGroupName_ClassRef_3022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsltransVisualIDRegistry
							.getType(ClassRefClassRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return TransformationModelEditPart.MODEL_ID
				.equals(DsltransVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<DsltransNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<DsltransNavigatorItem> result = new ArrayList<DsltransNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new DsltransNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<DsltransNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof DsltransAbstractNavigatorItem) {
			DsltransAbstractNavigatorItem abstractNavigatorItem = (DsltransAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
