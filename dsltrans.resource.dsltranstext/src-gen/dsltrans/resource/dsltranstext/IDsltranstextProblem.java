/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext;

public interface IDsltranstextProblem {
	public String getMessage();
	public dsltrans.resource.dsltranstext.DsltranstextEProblemSeverity getSeverity();
	public dsltrans.resource.dsltranstext.DsltranstextEProblemType getType();
	public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextQuickFix> getQuickFixes();
}
