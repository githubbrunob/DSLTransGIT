/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.ui;

public class DsltranstextCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private dsltrans.resource.dsltranstext.IDsltranstextResourceProvider resourceProvider;
	private dsltrans.resource.dsltranstext.ui.IDsltranstextBracketHandlerProvider bracketHandlerProvider;
	
	public DsltranstextCompletionProcessor(dsltrans.resource.dsltranstext.IDsltranstextResourceProvider resourceProvider, dsltrans.resource.dsltranstext.ui.IDsltranstextBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		dsltrans.resource.dsltranstext.IDsltranstextTextResource textResource = resourceProvider.getResource();
		String content = viewer.getDocument().get();
		dsltrans.resource.dsltranstext.ui.DsltranstextCodeCompletionHelper helper = new dsltrans.resource.dsltranstext.ui.DsltranstextCodeCompletionHelper();
		dsltrans.resource.dsltranstext.ui.DsltranstextCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		dsltrans.resource.dsltranstext.ui.DsltranstextProposalPostProcessor proposalPostProcessor = new dsltrans.resource.dsltranstext.ui.DsltranstextProposalPostProcessor();
		java.util.List<dsltrans.resource.dsltranstext.ui.DsltranstextCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<dsltrans.resource.dsltranstext.ui.DsltranstextCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<dsltrans.resource.dsltranstext.ui.DsltranstextCompletionProposal> finalProposalList = new java.util.ArrayList<dsltrans.resource.dsltranstext.ui.DsltranstextCompletionProposal>();
		for (dsltrans.resource.dsltranstext.ui.DsltranstextCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (dsltrans.resource.dsltranstext.ui.DsltranstextCompletionProposal proposal : finalProposalList) {
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
			dsltrans.resource.dsltranstext.ui.IDsltranstextBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
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
