/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.Atom4CreateCommand;
import dsltrans.diagram.edit.commands.AttributeRef3CreateCommand;
import dsltrans.diagram.edit.commands.ClassRef3CreateCommand;
import dsltrans.diagram.edit.commands.Concat3CreateCommand;
import dsltrans.diagram.edit.commands.Sequencer2CreateCommand;
import dsltrans.diagram.edit.commands.TypeOf3CreateCommand;
import dsltrans.diagram.edit.commands.Wildcard2CreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class ConcatConcatRightTermCompartmentItemSemanticEditPolicy extends
		DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConcatConcatRightTermCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.Concat_3017);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.TypeOf_3019 == req.getElementType()) {
			return getGEFWrapper(new TypeOf3CreateCommand(req));
		}
		if (DsltransElementTypes.Atom_3024 == req.getElementType()) {
			return getGEFWrapper(new Atom4CreateCommand(req));
		}
		if (DsltransElementTypes.AttributeRef_3025 == req.getElementType()) {
			return getGEFWrapper(new AttributeRef3CreateCommand(req));
		}
		if (DsltransElementTypes.ClassRef_3026 == req.getElementType()) {
			return getGEFWrapper(new ClassRef3CreateCommand(req));
		}
		if (DsltransElementTypes.Concat_3027 == req.getElementType()) {
			return getGEFWrapper(new Concat3CreateCommand(req));
		}
		if (DsltransElementTypes.Wildcard_3030 == req.getElementType()) {
			return getGEFWrapper(new Wildcard2CreateCommand(req));
		}
		if (DsltransElementTypes.Sequencer_3031 == req.getElementType()) {
			return getGEFWrapper(new Sequencer2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
