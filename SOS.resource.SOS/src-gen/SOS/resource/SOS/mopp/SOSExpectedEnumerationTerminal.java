/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class SOSExpectedEnumerationTerminal extends SOS.resource.SOS.mopp.SOSAbstractExpectedElement {
	
	private SOS.resource.SOS.grammar.SOSEnumerationTerminal enumerationTerminal;
	
	public SOSExpectedEnumerationTerminal(SOS.resource.SOS.grammar.SOSEnumerationTerminal enumerationTerminal) {
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
	
	public SOS.resource.SOS.grammar.SOSEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
}
