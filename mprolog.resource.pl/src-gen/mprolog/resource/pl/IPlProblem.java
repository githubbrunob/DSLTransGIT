/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl;

public interface IPlProblem {
	public String getMessage();
	public mprolog.resource.pl.PlEProblemSeverity getSeverity();
	public mprolog.resource.pl.PlEProblemType getType();
	public java.util.Collection<mprolog.resource.pl.IPlQuickFix> getQuickFixes();
}
