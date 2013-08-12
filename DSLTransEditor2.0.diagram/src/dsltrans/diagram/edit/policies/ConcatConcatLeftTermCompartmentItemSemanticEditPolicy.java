/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.Atom3CreateCommand;
import dsltrans.diagram.edit.commands.AttributeRef2CreateCommand;
import dsltrans.diagram.edit.commands.ClassRef2CreateCommand;
import dsltrans.diagram.edit.commands.Concat2CreateCommand;
import dsltrans.diagram.edit.commands.SequencerCreateCommand;
import dsltrans.diagram.edit.commands.TypeOf2CreateCommand;
import dsltrans.diagram.edit.commands.WildcardCreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class ConcatConcatLeftTermCompartmentItemSemanticEditPolicy extends
		DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConcatConcatLeftTermCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.Concat_3017);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.TypeOf_3018 == req.getElementType()) {
			return getGEFWrapper(new TypeOf2CreateCommand(req));
		}
		if (DsltransElementTypes.Atom_3020 == req.getElementType()) {
			return getGEFWrapper(new Atom3CreateCommand(req));
		}
		if (DsltransElementTypes.AttributeRef_3021 == req.getElementType()) {
			return getGEFWrapper(new AttributeRef2CreateCommand(req));
		}
		if (DsltransElementTypes.ClassRef_3022 == req.getElementType()) {
			return getGEFWrapper(new ClassRef2CreateCommand(req));
		}
		if (DsltransElementTypes.Concat_3023 == req.getElementType()) {
			return getGEFWrapper(new Concat2CreateCommand(req));
		}
		if (DsltransElementTypes.Wildcard_3028 == req.getElementType()) {
			return getGEFWrapper(new WildcardCreateCommand(req));
		}
		if (DsltransElementTypes.Sequencer_3029 == req.getElementType()) {
			return getGEFWrapper(new SequencerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
