/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.AnyMatchClassCreateCommand;
import dsltrans.diagram.edit.commands.ExistsMatchClassCreateCommand;
import dsltrans.diagram.edit.commands.NegativeMatchClassCreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class MatchModelMatchModelClassCompartmentItemSemanticEditPolicy extends
		DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MatchModelMatchModelClassCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.MatchModel_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.AnyMatchClass_3004 == req.getElementType()) {
			return getGEFWrapper(new AnyMatchClassCreateCommand(req));
		}
		if (DsltransElementTypes.ExistsMatchClass_3008 == req.getElementType()) {
			return getGEFWrapper(new ExistsMatchClassCreateCommand(req));
		}
		if (DsltransElementTypes.NegativeMatchClass_3009 == req
				.getElementType()) {
			return getGEFWrapper(new NegativeMatchClassCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
