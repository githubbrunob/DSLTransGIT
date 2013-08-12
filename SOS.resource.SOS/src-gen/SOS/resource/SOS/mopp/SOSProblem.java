/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSProblem implements SOS.resource.SOS.ISOSProblem {
	
	private String message;
	private SOS.resource.SOS.SOSEProblemType type;
	private SOS.resource.SOS.SOSEProblemSeverity severity;
	private java.util.Collection<SOS.resource.SOS.ISOSQuickFix> quickFixes;
	
	public SOSProblem(String message, SOS.resource.SOS.SOSEProblemType type, SOS.resource.SOS.SOSEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<SOS.resource.SOS.ISOSQuickFix>emptySet());
	}
	
	public SOSProblem(String message, SOS.resource.SOS.SOSEProblemType type, SOS.resource.SOS.SOSEProblemSeverity severity, SOS.resource.SOS.ISOSQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public SOSProblem(String message, SOS.resource.SOS.SOSEProblemType type, SOS.resource.SOS.SOSEProblemSeverity severity, java.util.Collection<SOS.resource.SOS.ISOSQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<SOS.resource.SOS.ISOSQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public SOS.resource.SOS.SOSEProblemType getType() {
		return type;
	}
	
	public SOS.resource.SOS.SOSEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<SOS.resource.SOS.ISOSQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
