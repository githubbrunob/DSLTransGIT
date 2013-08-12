/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlProblem implements mprolog.resource.pl.IPlProblem {
	
	private String message;
	private mprolog.resource.pl.PlEProblemType type;
	private mprolog.resource.pl.PlEProblemSeverity severity;
	private java.util.Collection<mprolog.resource.pl.IPlQuickFix> quickFixes;
	
	public PlProblem(String message, mprolog.resource.pl.PlEProblemType type, mprolog.resource.pl.PlEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<mprolog.resource.pl.IPlQuickFix>emptySet());
	}
	
	public PlProblem(String message, mprolog.resource.pl.PlEProblemType type, mprolog.resource.pl.PlEProblemSeverity severity, mprolog.resource.pl.IPlQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public PlProblem(String message, mprolog.resource.pl.PlEProblemType type, mprolog.resource.pl.PlEProblemSeverity severity, java.util.Collection<mprolog.resource.pl.IPlQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<mprolog.resource.pl.IPlQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public mprolog.resource.pl.PlEProblemType getType() {
		return type;
	}
	
	public mprolog.resource.pl.PlEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<mprolog.resource.pl.IPlQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
