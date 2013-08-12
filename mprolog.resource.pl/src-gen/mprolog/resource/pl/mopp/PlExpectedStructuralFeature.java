/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class PlExpectedStructuralFeature extends mprolog.resource.pl.mopp.PlAbstractExpectedElement {
	
	private mprolog.resource.pl.grammar.PlPlaceholder placeholder;
	
	public PlExpectedStructuralFeature(mprolog.resource.pl.grammar.PlPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof PlExpectedStructuralFeature) {
			return getFeature().equals(((PlExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
