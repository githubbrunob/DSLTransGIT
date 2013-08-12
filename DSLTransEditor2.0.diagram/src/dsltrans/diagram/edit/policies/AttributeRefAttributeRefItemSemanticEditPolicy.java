/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class AttributeRefAttributeRefItemSemanticEditPolicy extends
		DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AttributeRefAttributeRefItemSemanticEditPolicy() {
		super(DsltransElementTypes.AttributeRefAttributeRef_4013);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
