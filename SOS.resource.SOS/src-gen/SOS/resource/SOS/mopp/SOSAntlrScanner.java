/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSAntlrScanner implements SOS.resource.SOS.ISOSTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public SOSAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public SOS.resource.SOS.ISOSTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		SOS.resource.SOS.ISOSTextToken result = new SOS.resource.SOS.mopp.SOSTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}
