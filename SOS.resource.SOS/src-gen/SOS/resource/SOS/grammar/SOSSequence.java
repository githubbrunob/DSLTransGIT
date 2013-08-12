/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

public class SOSSequence extends SOS.resource.SOS.grammar.SOSSyntaxElement {
	
	public SOSSequence(SOS.resource.SOS.grammar.SOSCardinality cardinality, SOS.resource.SOS.grammar.SOSSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return SOS.resource.SOS.util.SOSStringUtil.explode(getChildren(), " ");
	}
	
}
