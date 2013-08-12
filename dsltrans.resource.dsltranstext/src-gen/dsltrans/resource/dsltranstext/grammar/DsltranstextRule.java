/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class DsltranstextRule extends dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public DsltranstextRule(org.eclipse.emf.ecore.EClass metaclass, dsltrans.resource.dsltranstext.grammar.DsltranstextChoice choice, dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality) {
		super(cardinality, new dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public dsltrans.resource.dsltranstext.grammar.DsltranstextChoice getDefinition() {
		return (dsltrans.resource.dsltranstext.grammar.DsltranstextChoice) getChildren()[0];
	}
	
}

