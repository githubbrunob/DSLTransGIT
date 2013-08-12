/*
 * 
 */
package dsltrans.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;

import dsltrans.AbstractClass;
import dsltrans.AbstractSource;
import dsltrans.ApplyAssociation;
import dsltrans.ApplyClass;
import dsltrans.ApplyMayBeSameRelation;
import dsltrans.ApplyModel;
import dsltrans.Attribute;
import dsltrans.AttributeEquality;
import dsltrans.AttributeInequality;
import dsltrans.AttributeRef;
import dsltrans.ClassRef;
import dsltrans.FilePort;
import dsltrans.Import;
import dsltrans.Layer;
import dsltrans.MatchClass;
import dsltrans.MatchMayBeSameRelation;
import dsltrans.MatchModel;
import dsltrans.NegativeBackwardRestriction;
import dsltrans.NegativeIndirectAssociation;
import dsltrans.NegativeMatchAssociation;
import dsltrans.PositiveBackwardRestriction;
import dsltrans.PositiveIndirectAssociation;
import dsltrans.PositiveMatchAssociation;
import dsltrans.PositiveMatchClass;
import dsltrans.Rule;
import dsltrans.diagram.edit.helpers.DsltransBaseEditHelper;
import dsltrans.diagram.part.DsltransDiagramEditorPlugin;
import dsltrans.diagram.part.DsltransVisualIDRegistry;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class DsltransBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected DsltransBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						DsltransVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(DsltransBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(DsltransBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(DsltransBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(DsltransBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = DsltransElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = DsltransDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			DsltransDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreatePositiveIndirectAssociation_4001(
				MatchModel container, MatchClass source, MatchClass target) {
			return canExistPositiveIndirectAssociation_4001(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNegativeIndirectAssociation_4002(
				MatchModel container, MatchClass source, MatchClass target) {
			return canExistNegativeIndirectAssociation_4002(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePositiveMatchAssociation_4003(
				MatchModel container, MatchClass source, MatchClass target) {
			return canExistPositiveMatchAssociation_4003(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNegativeMatchAssociation_4004(
				MatchModel container, MatchClass source, MatchClass target) {
			return canExistNegativeMatchAssociation_4004(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMatchMayBeSameRelation_4017(
				MatchModel container, MatchClass source, MatchClass target) {
			return canExistMatchMayBeSameRelation_4017(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateApplyMayBeSameRelation_4018(
				ApplyModel container, ApplyClass source, ApplyClass target) {
			return canExistApplyMayBeSameRelation_4018(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateApplyAssociation_4005(ApplyModel container,
				ApplyClass source, ApplyClass target) {
			return canExistApplyAssociation_4005(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePositiveBackwardRestriction_4006(
				Rule container, PositiveMatchClass source, ApplyClass target) {
			return canExistPositiveBackwardRestriction_4006(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNegativeBackwardRestriction_4007(
				Rule container, PositiveMatchClass source, ApplyClass target) {
			return canExistNegativeBackwardRestriction_4007(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAttributeEquality_4015(Rule container,
				Attribute source, Attribute target) {
			return canExistAttributeEquality_4015(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAttributeInequality_4016(Rule container,
				Attribute source, Attribute target) {
			return canExistAttributeInequality_4016(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateImport_4010(Rule container,
				PositiveMatchClass source, ApplyClass target) {
			return canExistImport_4010(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLayerPreviousSource_4011(Layer source,
				AbstractSource target) {
			if (source != null) {
				if (source.getPreviousSource().contains(target)) {
					return false;
				}
			}

			return canExistLayerPreviousSource_4011(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMatchModelExplicitSource_4012(
				MatchModel source, FilePort target) {
			if (source != null) {
				if (source.getExplicitSource() != null) {
					return false;
				}
			}

			return canExistMatchModelExplicitSource_4012(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAttributeRefAttributeRef_4013(
				AttributeRef source, Attribute target) {
			if (source != null) {
				if (source.getAttributeRef() != null) {
					return false;
				}
			}

			return canExistAttributeRefAttributeRef_4013(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateClassRefClassRef_4014(ClassRef source,
				AbstractClass target) {
			if (source != null) {
				if (source.getClassRef() != null) {
					return false;
				}
			}

			return canExistClassRefClassRef_4014(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistPositiveIndirectAssociation_4001(
				MatchModel container, PositiveIndirectAssociation linkInstance,
				MatchClass source, MatchClass target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNegativeIndirectAssociation_4002(
				MatchModel container, NegativeIndirectAssociation linkInstance,
				MatchClass source, MatchClass target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPositiveMatchAssociation_4003(
				MatchModel container, PositiveMatchAssociation linkInstance,
				MatchClass source, MatchClass target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNegativeMatchAssociation_4004(
				MatchModel container, NegativeMatchAssociation linkInstance,
				MatchClass source, MatchClass target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistMatchMayBeSameRelation_4017(
				MatchModel container, MatchMayBeSameRelation linkInstance,
				MatchClass source, MatchClass target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistApplyMayBeSameRelation_4018(
				ApplyModel container, ApplyMayBeSameRelation linkInstance,
				ApplyClass source, ApplyClass target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistApplyAssociation_4005(ApplyModel container,
				ApplyAssociation linkInstance, ApplyClass source,
				ApplyClass target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPositiveBackwardRestriction_4006(Rule container,
				PositiveBackwardRestriction linkInstance,
				PositiveMatchClass source, ApplyClass target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNegativeBackwardRestriction_4007(Rule container,
				NegativeBackwardRestriction linkInstance,
				PositiveMatchClass source, ApplyClass target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAttributeEquality_4015(Rule container,
				AttributeEquality linkInstance, Attribute source,
				Attribute target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAttributeInequality_4016(Rule container,
				AttributeInequality linkInstance, Attribute source,
				Attribute target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistImport_4010(Rule container, Import linkInstance,
				PositiveMatchClass source, ApplyClass target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistLayerPreviousSource_4011(Layer source,
				AbstractSource target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistMatchModelExplicitSource_4012(MatchModel source,
				FilePort target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAttributeRefAttributeRef_4013(
				AttributeRef source, Attribute target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistClassRefClassRef_4014(ClassRef source,
				AbstractClass target) {
			return true;
		}
	}

}
