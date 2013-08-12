/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package dsltrans.resource.dsltranstext.mopp;

public class DsltranstextSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private DsltranstextSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public DsltranstextSyntaxElementDecorator(dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement decoratedElement, DsltranstextSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public dsltrans.resource.dsltranstext.grammar.DsltranstextSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public DsltranstextSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
