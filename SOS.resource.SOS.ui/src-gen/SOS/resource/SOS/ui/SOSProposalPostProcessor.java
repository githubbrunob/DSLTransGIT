/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class SOSProposalPostProcessor {
	
	public java.util.List<SOS.resource.SOS.ui.SOSCompletionProposal> process(java.util.List<SOS.resource.SOS.ui.SOSCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
