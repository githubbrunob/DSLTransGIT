/*
 * 
 */
package dsltrans.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import dsltrans.diagram.providers.DsltransElementTypes;

/**
 * @generated
 */
public class ImportItemSemanticEditPolicy extends
		DsltransBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ImportItemSemanticEditPolicy() {
		super(DsltransElementTypes.Import_4010);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
