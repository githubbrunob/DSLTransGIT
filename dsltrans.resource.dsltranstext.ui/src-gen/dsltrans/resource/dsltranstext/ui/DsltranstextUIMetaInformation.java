/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.ui;

public class DsltranstextUIMetaInformation extends dsltrans.resource.dsltranstext.mopp.DsltranstextMetaInformation {
	
	public dsltrans.resource.dsltranstext.IDsltranstextHoverTextProvider getHoverTextProvider() {
		return new dsltrans.resource.dsltranstext.ui.DsltranstextHoverTextProvider();
	}
	
	public dsltrans.resource.dsltranstext.ui.DsltranstextImageProvider getImageProvider() {
		return dsltrans.resource.dsltranstext.ui.DsltranstextImageProvider.INSTANCE;
	}
	
	public dsltrans.resource.dsltranstext.ui.DsltranstextColorManager createColorManager() {
		return new dsltrans.resource.dsltranstext.ui.DsltranstextColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(dsltrans.resource.dsltranstext.IDsltranstextTextResource,
	 * dsltrans.resource.dsltranstext.ui.DsltranstextColorManager) instead.
	 */
	public dsltrans.resource.dsltranstext.ui.DsltranstextTokenScanner createTokenScanner(dsltrans.resource.dsltranstext.ui.DsltranstextColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public dsltrans.resource.dsltranstext.ui.DsltranstextTokenScanner createTokenScanner(dsltrans.resource.dsltranstext.IDsltranstextTextResource resource, dsltrans.resource.dsltranstext.ui.DsltranstextColorManager colorManager) {
		return new dsltrans.resource.dsltranstext.ui.DsltranstextTokenScanner(resource, colorManager);
	}
	
	public dsltrans.resource.dsltranstext.ui.DsltranstextCodeCompletionHelper createCodeCompletionHelper() {
		return new dsltrans.resource.dsltranstext.ui.DsltranstextCodeCompletionHelper();
	}
	
}
