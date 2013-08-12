/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.grammar;

public class DsltranstextSequence extends dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement {
	
	public DsltranstextSequence(dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality, dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return dsltrans.resource.dsltranstext.util.DsltranstextStringUtil.explode(getChildren(), " ");
	}
	
}
