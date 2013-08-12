/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

public class SOSContainment extends SOS.resource.SOS.grammar.SOSTerminal {
	
	public SOSContainment(org.eclipse.emf.ecore.EStructuralFeature feature, SOS.resource.SOS.grammar.SOSCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
