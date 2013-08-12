/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextBracketInformationProvider {
	
	public class BracketPair implements dsltrans.resource.dsltranstext.IDsltranstextBracketPair {
		
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
	
	public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextBracketPair> getBracketPairs() {
		java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextBracketPair> result = new java.util.ArrayList<dsltrans.resource.dsltranstext.IDsltranstextBracketPair>();
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("'", "'", false));
		return result;
	}
	
}
