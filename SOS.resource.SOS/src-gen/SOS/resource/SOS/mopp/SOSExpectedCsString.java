/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class SOSExpectedCsString extends SOS.resource.SOS.mopp.SOSAbstractExpectedElement {
	
	private SOS.resource.SOS.grammar.SOSKeyword keyword;
	
	public SOSExpectedCsString(SOS.resource.SOS.grammar.SOSKeyword keyword) {
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
		if (o instanceof SOSExpectedCsString) {
			return getValue().equals(((SOSExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
