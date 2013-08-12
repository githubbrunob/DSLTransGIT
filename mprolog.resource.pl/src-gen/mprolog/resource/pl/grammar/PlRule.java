/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class PlRule extends mprolog.resource.pl.grammar.PlSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public PlRule(org.eclipse.emf.ecore.EClass metaclass, mprolog.resource.pl.grammar.PlChoice choice, mprolog.resource.pl.grammar.PlCardinality cardinality) {
		super(cardinality, new mprolog.resource.pl.grammar.PlSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public mprolog.resource.pl.grammar.PlChoice getDefinition() {
		return (mprolog.resource.pl.grammar.PlChoice) getChildren()[0];
	}
	
}

