/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.grammar;

public class PlContainment extends mprolog.resource.pl.grammar.PlTerminal {
	
	public PlContainment(org.eclipse.emf.ecore.EStructuralFeature feature, mprolog.resource.pl.grammar.PlCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
