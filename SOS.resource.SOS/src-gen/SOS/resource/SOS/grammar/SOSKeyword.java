/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class SOSKeyword extends SOS.resource.SOS.grammar.SOSSyntaxElement {
	
	private final String value;
	
	public SOSKeyword(String value, SOS.resource.SOS.grammar.SOSCardinality cardinality) {
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
