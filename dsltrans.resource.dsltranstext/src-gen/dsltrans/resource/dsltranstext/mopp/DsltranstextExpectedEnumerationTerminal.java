/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class DsltranstextExpectedEnumerationTerminal extends dsltrans.resource.dsltranstext.mopp.DsltranstextAbstractExpectedElement {
	
	private dsltrans.resource.dsltranstext.grammar.DsltranstextEnumerationTerminal enumerationTerminal;
	
	public DsltranstextExpectedEnumerationTerminal(dsltrans.resource.dsltranstext.grammar.DsltranstextEnumerationTerminal enumerationTerminal) {
		super(enumerationTerminal.getMetaclass());
		this.enumerationTerminal = enumerationTerminal;
	}
	
	public java.util.Set<String> getTokenNames() {
		// EnumerationTerminals are associated with multiple tokens, one for each literal
		// that was mapped to a string
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>();
		java.util.Map<String, String> mapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : mapping.keySet()) {
			String text = mapping.get(literalName);
			if (text != null && !"".equals(text)) {
				tokenNames.add("'" + text + "'");
			}
		}
		return tokenNames;
	}
	
	public dsltrans.resource.dsltranstext.grammar.DsltranstextEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
}
