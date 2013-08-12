/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.grammar;

public class PlSequence extends mprolog.resource.pl.grammar.PlSyntaxElement {
	
	public PlSequence(mprolog.resource.pl.grammar.PlCardinality cardinality, mprolog.resource.pl.grammar.PlSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return mprolog.resource.pl.util.PlStringUtil.explode(getChildren(), " ");
	}
	
}
