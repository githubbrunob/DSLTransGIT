/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.MatchModelCreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class RuleRuleMatchCompartmentItemSemanticEditPolicy extends
		DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RuleRuleMatchCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.Rule_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.MatchModel_3003 == req.getElementType()) {
			return getGEFWrapper(new MatchModelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
