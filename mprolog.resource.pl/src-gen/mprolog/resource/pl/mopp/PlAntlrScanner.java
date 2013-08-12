/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlAntlrScanner implements mprolog.resource.pl.IPlTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public PlAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public mprolog.resource.pl.IPlTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		mprolog.resource.pl.IPlTextToken result = new mprolog.resource.pl.mopp.PlTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}
