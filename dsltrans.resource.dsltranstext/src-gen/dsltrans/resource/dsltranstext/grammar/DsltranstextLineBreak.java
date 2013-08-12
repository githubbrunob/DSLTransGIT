/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.grammar;

public class DsltranstextLineBreak extends dsltrans.resource.dsltranstext.grammar.DsltranstextFormattingElement {
	
	private final int tabs;
	
	public DsltranstextLineBreak(dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality, int tabs) {
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
