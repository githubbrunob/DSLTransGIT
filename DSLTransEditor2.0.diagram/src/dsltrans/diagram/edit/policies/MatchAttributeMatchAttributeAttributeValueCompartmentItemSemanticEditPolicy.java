/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.AtomCreateCommand;
import dsltrans.diagram.edit.commands.IsNullCreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class MatchAttributeMatchAttributeAttributeValueCompartmentItemSemanticEditPolicy
		extends DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatchAttributeMatchAttributeAttributeValueCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.MatchAttribute_3005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.Atom_3006 == req.getElementType()) {
			return getGEFWrapper(new AtomCreateCommand(req));
		}
		if (DsltransElementTypes.IsNull_3007 == req.getElementType()) {
			return getGEFWrapper(new IsNullCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
