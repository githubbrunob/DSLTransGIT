/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.RuleCreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class SequentialSequentialHasRuleCompartmentItemSemanticEditPolicy
		extends DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SequentialSequentialHasRuleCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.Sequential_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.Rule_3002 == req.getElementType()) {
			return getGEFWrapper(new RuleCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
