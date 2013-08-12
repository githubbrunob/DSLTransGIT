/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

public class SOSWhiteSpace extends SOS.resource.SOS.grammar.SOSFormattingElement {
	
	private final int amount;
	
	public SOSWhiteSpace(int amount, SOS.resource.SOS.grammar.SOSCardinality cardinality) {
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
