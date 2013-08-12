/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.ApplyModelCreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class RuleRuleApplyCompartmentItemSemanticEditPolicy extends
		DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RuleRuleApplyCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.Rule_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.ApplyModel_3010 == req.getElementType()) {
			return getGEFWrapper(new ApplyModelCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
