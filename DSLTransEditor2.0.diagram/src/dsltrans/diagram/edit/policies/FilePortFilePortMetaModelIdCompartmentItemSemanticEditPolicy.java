/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsltrans.diagram.edit.commands.MetaModelIdentifierCreateCommand;
import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class FilePortFilePortMetaModelIdCompartmentItemSemanticEditPolicy
		extends DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FilePortFilePortMetaModelIdCompartmentItemSemanticEditPolicy() {
		super(DsltransElementTypes.FilePort_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsltransElementTypes.MetaModelIdentifier_3001 == req
				.getElementType()) {
			return getGEFWrapper(new MetaModelIdentifierCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
