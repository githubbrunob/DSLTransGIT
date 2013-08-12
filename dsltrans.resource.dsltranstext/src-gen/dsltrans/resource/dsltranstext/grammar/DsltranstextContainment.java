/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.grammar;

public class DsltranstextContainment extends dsltrans.resource.dsltranstext.grammar.DsltranstextTerminal {
	
	public DsltranstextContainment(org.eclipse.emf.ecore.EStructuralFeature feature, dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
