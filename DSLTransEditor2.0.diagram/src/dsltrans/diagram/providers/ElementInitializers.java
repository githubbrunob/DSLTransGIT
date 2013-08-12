/*
 * 
 */
package dsltrans.diagram.providers;

import dsltrans.diagram.part.DsltransDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DsltransDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			DsltransDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
