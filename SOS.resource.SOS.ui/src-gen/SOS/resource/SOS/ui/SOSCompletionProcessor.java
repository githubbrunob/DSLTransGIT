/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.ui;

public class SOSCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private SOS.resource.SOS.ISOSResourceProvider resourceProvider;
	private SOS.resource.SOS.ui.ISOSBracketHandlerProvider bracketHandlerProvider;
	
	public SOSCompletionProcessor(SOS.resource.SOS.ISOSResourceProvider resourceProvider, SOS.resource.SOS.ui.ISOSBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		SOS.resource.SOS.ISOSTextResource textResource = resourceProvider.getResource();
		String content = viewer.getDocument().get();
		SOS.resource.SOS.ui.SOSCodeCompletionHelper helper = new SOS.resource.SOS.ui.SOSCodeCompletionHelper();
		SOS.resource.SOS.ui.SOSCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		SOS.resource.SOS.ui.SOSProposalPostProcessor proposalPostProcessor = new SOS.resource.SOS.ui.SOSProposalPostProcessor();
		java.util.List<SOS.resource.SOS.ui.SOSCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<SOS.resource.SOS.ui.SOSCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<SOS.resource.SOS.ui.SOSCompletionProposal> finalProposalList = new java.util.ArrayList<SOS.resource.SOS.ui.SOSCompletionProposal>();
		for (SOS.resource.SOS.ui.SOSCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (SOS.resource.SOS.ui.SOSCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			SOS.resource.SOS.ui.ISOSBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
