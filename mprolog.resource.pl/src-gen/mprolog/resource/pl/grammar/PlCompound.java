/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.grammar;

public class PlCompound extends mprolog.resource.pl.grammar.PlSyntaxElement {
	
	public PlCompound(mprolog.resource.pl.grammar.PlChoice choice, mprolog.resource.pl.grammar.PlCardinality cardinality) {
		super(cardinality, new mprolog.resource.pl.grammar.PlSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
