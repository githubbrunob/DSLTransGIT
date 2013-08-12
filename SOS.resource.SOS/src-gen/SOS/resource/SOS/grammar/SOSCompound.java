/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

public class SOSCompound extends SOS.resource.SOS.grammar.SOSSyntaxElement {
	
	public SOSCompound(SOS.resource.SOS.grammar.SOSChoice choice, SOS.resource.SOS.grammar.SOSCardinality cardinality) {
		super(cardinality, new SOS.resource.SOS.grammar.SOSSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
