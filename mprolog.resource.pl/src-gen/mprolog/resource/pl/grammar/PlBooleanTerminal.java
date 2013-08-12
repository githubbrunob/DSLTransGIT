/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class PlBooleanTerminal extends mprolog.resource.pl.grammar.PlTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public PlBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, mprolog.resource.pl.grammar.PlCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
