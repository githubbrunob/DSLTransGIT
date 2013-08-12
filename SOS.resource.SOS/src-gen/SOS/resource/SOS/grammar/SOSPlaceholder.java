/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class SOSPlaceholder extends SOS.resource.SOS.grammar.SOSTerminal {
	
	private final String tokenName;
	
	public SOSPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, SOS.resource.SOS.grammar.SOSCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
