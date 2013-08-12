/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class SOSExpectedBooleanTerminal extends SOS.resource.SOS.mopp.SOSAbstractExpectedElement {
	
	private SOS.resource.SOS.grammar.SOSBooleanTerminal booleanTerminal;
	
	public SOSExpectedBooleanTerminal(SOS.resource.SOS.grammar.SOSBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public SOS.resource.SOS.grammar.SOSBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof SOSExpectedBooleanTerminal) {
			return getFeature().equals(((SOSExpectedBooleanTerminal) o).getFeature());
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
