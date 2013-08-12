/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.Atom2CreateCommand;
import dsltrans.diagram.edit.commands.AttributeRefCreateCommand;
import dsltrans.diagram.edit.commands.ClassRefCreateCommand;
import dsltrans.diagram.edit.commands.ConcatCreateCommand;
import dsltrans.diagram.edit.commands.Sequencer3CreateCommand;
import dsltrans.diagram.edit.commands.TypeOfCreateCommand;
import dsltrans.diagram.edit.commands.Wildcard3CreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class ApplyAttributeApplyAttributeAttributeValueCompartmentItemSemanticEditPolicy
		extends DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ApplyAttributeApplyAttributeAttributeValueCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.ApplyAttribute_3012);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.TypeOf_3013 == req.getElementType()) {
			return getGEFWrapper(new TypeOfCreateCommand(req));
		}
		if (DsltransElementTypes.Atom_3014 == req.getElementType()) {
			return getGEFWrapper(new Atom2CreateCommand(req));
		}
		if (DsltransElementTypes.AttributeRef_3015 == req.getElementType()) {
			return getGEFWrapper(new AttributeRefCreateCommand(req));
		}
		if (DsltransElementTypes.ClassRef_3016 == req.getElementType()) {
			return getGEFWrapper(new ClassRefCreateCommand(req));
		}
		if (DsltransElementTypes.Concat_3017 == req.getElementType()) {
			return getGEFWrapper(new ConcatCreateCommand(req));
		}
		if (DsltransElementTypes.Wildcard_3032 == req.getElementType()) {
			return getGEFWrapper(new Wildcard3CreateCommand(req));
		}
		if (DsltransElementTypes.Sequencer_3033 == req.getElementType()) {
			return getGEFWrapper(new Sequencer3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
