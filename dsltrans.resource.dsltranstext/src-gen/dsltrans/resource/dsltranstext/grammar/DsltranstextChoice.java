/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.grammar;

public class DsltranstextChoice extends dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement {
	
	public DsltranstextChoice(dsltrans.resource.dsltranstext.grammar.DsltranstextCardinality cardinality, dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return dsltrans.resource.dsltranstext.util.DsltranstextStringUtil.explode(getChildren(), "|");
	}
	
}
