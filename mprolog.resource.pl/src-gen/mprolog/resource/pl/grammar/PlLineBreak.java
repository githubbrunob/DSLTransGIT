/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.grammar;

public class PlLineBreak extends mprolog.resource.pl.grammar.PlFormattingElement {
	
	private final int tabs;
	
	public PlLineBreak(mprolog.resource.pl.grammar.PlCardinality cardinality, int tabs) {
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
