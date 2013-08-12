/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.MatchAttributeCreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class NegativeMatchClassNegativeMatchClassAttributeCompartmentItemSemanticEditPolicy
		extends DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NegativeMatchClassNegativeMatchClassAttributeCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.NegativeMatchClass_3009);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.MatchAttribute_3005 == req.getElementType()) {
			return getGEFWrapper(new MatchAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
