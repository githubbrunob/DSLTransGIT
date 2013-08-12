/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.grammar;

public class DsltranstextCompound extends dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement {
	
	public DsltranstextCompound(dsltrans.resource.dsltranstext.grammar.DsltranstextChoice choice, dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality) {
		super(cardinality, new dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
