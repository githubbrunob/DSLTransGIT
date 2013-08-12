/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

public class SOSChoice extends SOS.resource.SOS.grammar.SOSSyntaxElement {
	
	public SOSChoice(SOS.resource.SOS.grammar.SOSCardinality cardinality, SOS.resource.SOS.grammar.SOSSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return SOS.resource.SOS.util.SOSStringUtil.explode(getChildren(), "|");
	}
	
}
