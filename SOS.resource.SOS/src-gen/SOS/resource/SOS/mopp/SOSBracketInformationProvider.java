/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSBracketInformationProvider {
	
	public class BracketPair implements SOS.resource.SOS.ISOSBracketPair {
		
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
	
	public java.util.Collection<SOS.resource.SOS.ISOSBracketPair> getBracketPairs() {
		java.util.Collection<SOS.resource.SOS.ISOSBracketPair> result = new java.util.ArrayList<SOS.resource.SOS.ISOSBracketPair>();
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("\"", "\"", false));
		return result;
	}
	
}
