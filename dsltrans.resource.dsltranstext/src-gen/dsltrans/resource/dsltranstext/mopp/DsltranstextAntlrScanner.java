/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextAntlrScanner implements dsltrans.resource.dsltranstext.IDsltranstextTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public DsltranstextAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public dsltrans.resource.dsltranstext.IDsltranstextTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		dsltrans.resource.dsltranstext.IDsltranstextTextToken result = new dsltrans.resource.dsltranstext.mopp.DsltranstextTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}
