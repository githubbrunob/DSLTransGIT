/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class PlProposalPostProcessor {
	
	public java.util.List<mprolog.resource.pl.ui.PlCompletionProposal> process(java.util.List<mprolog.resource.pl.ui.PlCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
