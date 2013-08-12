/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.grammar;

public class DsltranstextWhiteSpace extends dsltrans.resource.dsltranstext.grammar.DsltranstextFormattingElement {
	
	private final int amount;
	
	public DsltranstextWhiteSpace(int amount, dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality) {
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
