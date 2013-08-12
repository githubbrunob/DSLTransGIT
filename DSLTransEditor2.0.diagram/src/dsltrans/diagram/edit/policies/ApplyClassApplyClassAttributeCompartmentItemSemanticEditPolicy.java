/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.ApplyAttributeCreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class ApplyClassApplyClassAttributeCompartmentItemSemanticEditPolicy
		extends DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ApplyClassApplyClassAttributeCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.ApplyClass_3011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.ApplyAttribute_3012 == req.getElementType()) {
			return getGEFWrapper(new ApplyAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
