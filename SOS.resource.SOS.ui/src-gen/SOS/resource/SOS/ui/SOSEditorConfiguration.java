/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.ui;

/**
 * This class provides the configuration for the generated editor. It registers
 * content assistance and syntax highlighting.
 */
public class SOSEditorConfiguration extends org.eclipse.jface.text.source.SourceViewerConfiguration {
	
	private SOS.resource.SOS.ui.SOSColorManager colorManager;
	private SOS.resource.SOS.ISOSResourceProvider resourceProvider;
	private SOS.resource.SOS.ui.ISOSAnnotationModelProvider annotationModelProvider;
	private SOS.resource.SOS.ui.ISOSBracketHandlerProvider bracketHandlerProvider;
	private SOS.resource.SOS.ui.SOSQuickAssistAssistant quickAssistAssistant;
	
	/**
	 * Creates a new editor configuration.
	 * 
	 * @param resourceProvider the provider for the resource (usually this is the
	 * editor)
	 * @param colorManager the color manager to use
	 */
	public SOSEditorConfiguration(SOS.resource.SOS.ISOSResourceProvider resourceProvider, SOS.resource.SOS.ui.ISOSAnnotationModelProvider annotationModelProvider, SOS.resource.SOS.ui.ISOSBracketHandlerProvider bracketHandlerProvider, SOS.resource.SOS.ui.SOSColorManager colorManager) {
		this.resourceProvider = resourceProvider;
		this.annotationModelProvider = annotationModelProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
		this.colorManager = colorManager;
	}
	
	public org.eclipse.jface.text.contentassist.IContentAssistant getContentAssistant(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		
		org.eclipse.jface.text.contentassist.ContentAssistant assistant = new org.eclipse.jface.text.contentassist.ContentAssistant();
		assistant.setContentAssistProcessor(new SOS.resource.SOS.ui.SOSCompletionProcessor(resourceProvider, bracketHandlerProvider), org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant.setProposalPopupOrientation(org.eclipse.jface.text.contentassist.IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(org.eclipse.jface.text.contentassist.IContentAssistant.CONTEXT_INFO_ABOVE);
		
		return assistant;
	}
	
	public String[] getConfiguredContentTypes(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		return new String[] {
			org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE,
		};
	}
	
	protected org.eclipse.jface.text.rules.ITokenScanner getScanner() {
		return new SOS.resource.SOS.ui.SOSTokenScanner(resourceProvider.getResource(), colorManager);
	}
	
	public org.eclipse.jface.text.presentation.IPresentationReconciler getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		
		org.eclipse.jface.text.presentation.PresentationReconciler reconciler = new org.eclipse.jface.text.presentation.PresentationReconciler();
		org.eclipse.jface.text.rules.DefaultDamagerRepairer repairer = new org.eclipse.jface.text.rules.DefaultDamagerRepairer(getScanner());
		reconciler.setDamager(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		
		return reconciler;
	}
	
	public org.eclipse.jface.text.source.IAnnotationHover getAnnotationHover(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		return new org.eclipse.jface.text.source.DefaultAnnotationHover();
	}
	
	public org.eclipse.jface.text.ITextHover getTextHover(org.eclipse.jface.text.source.ISourceViewer sourceViewer, String contentType) {
		return new SOS.resource.SOS.ui.SOSTextHover(resourceProvider);
	}
	
	public org.eclipse.jface.text.hyperlink.IHyperlinkDetector[] getHyperlinkDetectors(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		if (sourceViewer == null) {
			return null;
		}
		return new org.eclipse.jface.text.hyperlink.IHyperlinkDetector[] { new SOS.resource.SOS.ui.SOSHyperlinkDetector(resourceProvider.getResource()) };
	}
	
	public org.eclipse.jface.text.quickassist.IQuickAssistAssistant getQuickAssistAssistant(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		if (quickAssistAssistant == null) {
			quickAssistAssistant = new SOS.resource.SOS.ui.SOSQuickAssistAssistant(resourceProvider, annotationModelProvider);
		}
		return quickAssistAssistant;
	}
	
}
