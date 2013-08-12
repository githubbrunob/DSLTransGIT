/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS;

public interface ISOSProblem {
	public String getMessage();
	public SOS.resource.SOS.SOSEProblemSeverity getSeverity();
	public SOS.resource.SOS.SOSEProblemType getType();
	public java.util.Collection<SOS.resource.SOS.ISOSQuickFix> getQuickFixes();
}
