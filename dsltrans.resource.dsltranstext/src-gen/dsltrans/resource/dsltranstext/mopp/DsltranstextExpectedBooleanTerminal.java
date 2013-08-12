/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class DsltranstextExpectedBooleanTerminal extends dsltrans.resource.dsltranstext.mopp.DsltranstextAbstractExpectedElement {
	
	private dsltrans.resource.dsltranstext.grammar.DsltranstextBooleanTerminal booleanTerminal;
	
	public DsltranstextExpectedBooleanTerminal(dsltrans.resource.dsltranstext.grammar.DsltranstextBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public dsltrans.resource.dsltranstext.grammar.DsltranstextBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof DsltranstextExpectedBooleanTerminal) {
			return getFeature().equals(((DsltranstextExpectedBooleanTerminal) o).getFeature());
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
