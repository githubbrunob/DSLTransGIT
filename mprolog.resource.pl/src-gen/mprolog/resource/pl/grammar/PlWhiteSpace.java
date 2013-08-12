/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.grammar;

public class PlWhiteSpace extends mprolog.resource.pl.grammar.PlFormattingElement {
	
	private final int amount;
	
	public PlWhiteSpace(int amount, mprolog.resource.pl.grammar.PlCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
