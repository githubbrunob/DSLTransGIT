/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.ApplyClassCreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class ApplyModelApplyModelClassCompartmentItemSemanticEditPolicy extends
		DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ApplyModelApplyModelClassCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.ApplyModel_3010);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.ApplyClass_3011 == req.getElementType()) {
			return getGEFWrapper(new ApplyClassCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
