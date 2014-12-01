/*
 * 
 */
package dsltrans.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import dsltrans.diagram.edit.parts.DsltransEditPartFactory;
import dsltrans.diagram.edit.parts.TransformationModelEditPart;
import dsltrans.diagram.part.DsltransVisualIDRegistry;

/**
 * @generated
 */
public class DsltransEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public DsltransEditPartProvider() {
		super(new DsltransEditPartFactory(),
				DsltransVisualIDRegistry.TYPED_INSTANCE,
				TransformationModelEditPart.MODEL_ID);
	}

}
