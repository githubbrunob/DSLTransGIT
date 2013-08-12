/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextProblem implements dsltrans.resource.dsltranstext.IDsltranstextProblem {
	
	private String message;
	private dsltrans.resource.dsltranstext.DsltranstextEProblemType type;
	private dsltrans.resource.dsltranstext.DsltranstextEProblemSeverity severity;
	private java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextQuickFix> quickFixes;
	
	public DsltranstextProblem(String message, dsltrans.resource.dsltranstext.DsltranstextEProblemType type, dsltrans.resource.dsltranstext.DsltranstextEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<dsltrans.resource.dsltranstext.IDsltranstextQuickFix>emptySet());
	}
	
	public DsltranstextProblem(String message, dsltrans.resource.dsltranstext.DsltranstextEProblemType type, dsltrans.resource.dsltranstext.DsltranstextEProblemSeverity severity, dsltrans.resource.dsltranstext.IDsltranstextQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public DsltranstextProblem(String message, dsltrans.resource.dsltranstext.DsltranstextEProblemType type, dsltrans.resource.dsltranstext.DsltranstextEProblemSeverity severity, java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<dsltrans.resource.dsltranstext.IDsltranstextQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public dsltrans.resource.dsltranstext.DsltranstextEProblemType getType() {
		return type;
	}
	
	public dsltrans.resource.dsltranstext.DsltranstextEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
