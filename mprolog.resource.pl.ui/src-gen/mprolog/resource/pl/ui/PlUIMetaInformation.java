/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.ui;

public class PlUIMetaInformation extends mprolog.resource.pl.mopp.PlMetaInformation {
	
	public mprolog.resource.pl.IPlHoverTextProvider getHoverTextProvider() {
		return new mprolog.resource.pl.ui.PlHoverTextProvider();
	}
	
	public mprolog.resource.pl.ui.PlImageProvider getImageProvider() {
		return mprolog.resource.pl.ui.PlImageProvider.INSTANCE;
	}
	
	public mprolog.resource.pl.ui.PlColorManager createColorManager() {
		return new mprolog.resource.pl.ui.PlColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(mprolog.resource.pl.IPlTextResource,
	 * mprolog.resource.pl.ui.PlColorManager) instead.
	 */
	public mprolog.resource.pl.ui.PlTokenScanner createTokenScanner(mprolog.resource.pl.ui.PlColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public mprolog.resource.pl.ui.PlTokenScanner createTokenScanner(mprolog.resource.pl.IPlTextResource resource, mprolog.resource.pl.ui.PlColorManager colorManager) {
		return new mprolog.resource.pl.ui.PlTokenScanner(resource, colorManager);
	}
	
	public mprolog.resource.pl.ui.PlCodeCompletionHelper createCodeCompletionHelper() {
		return new mprolog.resource.pl.ui.PlCodeCompletionHelper();
	}
	
}
