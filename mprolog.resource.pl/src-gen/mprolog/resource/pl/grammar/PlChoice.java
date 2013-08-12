/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.grammar;

public class PlChoice extends mprolog.resource.pl.grammar.PlSyntaxElement {
	
	public PlChoice(mprolog.resource.pl.grammar.PlCardinality cardinality, mprolog.resource.pl.grammar.PlSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return mprolog.resource.pl.util.PlStringUtil.explode(getChildren(), "|");
	}
	
}
