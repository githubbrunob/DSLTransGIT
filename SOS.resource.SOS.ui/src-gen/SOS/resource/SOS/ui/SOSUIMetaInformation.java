/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.ui;

public class SOSUIMetaInformation extends SOS.resource.SOS.mopp.SOSMetaInformation {
	
	public SOS.resource.SOS.ISOSHoverTextProvider getHoverTextProvider() {
		return new SOS.resource.SOS.ui.SOSHoverTextProvider();
	}
	
	public SOS.resource.SOS.ui.SOSImageProvider getImageProvider() {
		return SOS.resource.SOS.ui.SOSImageProvider.INSTANCE;
	}
	
	public SOS.resource.SOS.ui.SOSColorManager createColorManager() {
		return new SOS.resource.SOS.ui.SOSColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(SOS.resource.SOS.ISOSTextResource,
	 * SOS.resource.SOS.ui.SOSColorManager) instead.
	 */
	public SOS.resource.SOS.ui.SOSTokenScanner createTokenScanner(SOS.resource.SOS.ui.SOSColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public SOS.resource.SOS.ui.SOSTokenScanner createTokenScanner(SOS.resource.SOS.ISOSTextResource resource, SOS.resource.SOS.ui.SOSColorManager colorManager) {
		return new SOS.resource.SOS.ui.SOSTokenScanner(resource, colorManager);
	}
	
	public SOS.resource.SOS.ui.SOSCodeCompletionHelper createCodeCompletionHelper() {
		return new SOS.resource.SOS.ui.SOSCodeCompletionHelper();
	}
	
}
