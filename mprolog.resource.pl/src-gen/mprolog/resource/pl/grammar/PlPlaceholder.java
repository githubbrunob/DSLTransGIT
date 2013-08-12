/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class PlPlaceholder extends mprolog.resource.pl.grammar.PlTerminal {
	
	private final String tokenName;
	
	public PlPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, mprolog.resource.pl.grammar.PlCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
