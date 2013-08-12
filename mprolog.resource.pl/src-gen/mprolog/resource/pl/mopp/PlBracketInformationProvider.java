/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlBracketInformationProvider {
	
	public class BracketPair implements mprolog.resource.pl.IPlBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<mprolog.resource.pl.IPlBracketPair> getBracketPairs() {
		java.util.Collection<mprolog.resource.pl.IPlBracketPair> result = new java.util.ArrayList<mprolog.resource.pl.IPlBracketPair>();
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("[", "]", true));
		result.add(new BracketPair("'", "'", false));
		return result;
	}
	
}
