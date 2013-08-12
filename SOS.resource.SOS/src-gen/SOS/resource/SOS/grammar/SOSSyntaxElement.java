/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class SOSSyntaxElement {
	
	private SOSSyntaxElement[] children;
	private SOSSyntaxElement parent;
	private SOS.resource.SOS.grammar.SOSCardinality cardinality;
	
	public SOSSyntaxElement(SOS.resource.SOS.grammar.SOSCardinality cardinality, SOSSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (SOSSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(SOSSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public SOSSyntaxElement[] getChildren() {
		if (children == null) {
			return new SOSSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public SOS.resource.SOS.grammar.SOSCardinality getCardinality() {
		return cardinality;
	}
	
}
