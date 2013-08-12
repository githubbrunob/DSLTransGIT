/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class DsltranstextSyntaxElement {
	
	private DsltranstextSyntaxElement[] children;
	private DsltranstextSyntaxElement parent;
	private dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality;
	
	public DsltranstextSyntaxElement(dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality, DsltranstextSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (DsltranstextSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(DsltranstextSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public DsltranstextSyntaxElement[] getChildren() {
		if (children == null) {
			return new DsltranstextSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality getCardinality() {
		return cardinality;
	}
	
}
