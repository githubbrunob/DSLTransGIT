/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class DsltranstextPlaceholder extends dsltrans.resource.dsltranstext.grammar.DsltranstextTerminal {
	
	private final String tokenName;
	
	public DsltranstextPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
