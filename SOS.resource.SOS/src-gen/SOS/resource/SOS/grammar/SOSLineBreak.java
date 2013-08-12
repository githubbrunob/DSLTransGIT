/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

public class SOSLineBreak extends SOS.resource.SOS.grammar.SOSFormattingElement {
	
	private final int tabs;
	
	public SOSLineBreak(SOS.resource.SOS.grammar.SOSCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
