/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class DsltranstextKeyword extends dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement {
	
	private final String value;
	
	public DsltranstextKeyword(String value, dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
