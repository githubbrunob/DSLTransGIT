/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class PlExpectedBooleanTerminal extends mprolog.resource.pl.mopp.PlAbstractExpectedElement {
	
	private mprolog.resource.pl.grammar.PlBooleanTerminal booleanTerminal;
	
	public PlExpectedBooleanTerminal(mprolog.resource.pl.grammar.PlBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public mprolog.resource.pl.grammar.PlBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof PlExpectedBooleanTerminal) {
			return getFeature().equals(((PlExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
