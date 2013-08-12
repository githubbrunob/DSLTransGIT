/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class SOSRule extends SOS.resource.SOS.grammar.SOSSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public SOSRule(org.eclipse.emf.ecore.EClass metaclass, SOS.resource.SOS.grammar.SOSChoice choice, SOS.resource.SOS.grammar.SOSCardinality cardinality) {
		super(cardinality, new SOS.resource.SOS.grammar.SOSSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public SOS.resource.SOS.grammar.SOSChoice getDefinition() {
		return (SOS.resource.SOS.grammar.SOSChoice) getChildren()[0];
	}
	
}

