/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class DsltranstextExpectedCsString extends dsltrans.resource.dsltranstext.mopp.DsltranstextAbstractExpectedElement {
	
	private dsltrans.resource.dsltranstext.grammar.DsltranstextKeyword keyword;
	
	public DsltranstextExpectedCsString(dsltrans.resource.dsltranstext.grammar.DsltranstextKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof DsltranstextExpectedCsString) {
			return getValue().equals(((DsltranstextExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
