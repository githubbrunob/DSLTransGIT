/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class DsltranstextProposalPostProcessor {
	
	public java.util.List<dsltrans.resource.dsltranstext.ui.DsltranstextCompletionProposal> process(java.util.List<dsltrans.resource.dsltranstext.ui.DsltranstextCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
