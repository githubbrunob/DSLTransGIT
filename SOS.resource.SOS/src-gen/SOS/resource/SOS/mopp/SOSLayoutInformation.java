/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

/**
 * A SOSLayoutInformation is used to store layout information that is found while
 * parsing text files. Layout information does include all unused tokens. Usually,
 * these are whitespace characters, line breaks and comments, but depending on the
 * concrete syntax definition it can also include other tokens.
 * SOSLayoutInformations are aggregated in LayoutInformationAdapters. One
 * SOSLayoutInformation contains the layout that was found before a keyword,
 * attribute or reference.
 */
public class SOSLayoutInformation {
	
	private final SOS.resource.SOS.grammar.SOSSyntaxElement syntaxElement;
	private final int startOffset;
	private final String hiddenTokenText;
	private final String visibleTokenText;
	private Object object;
	private boolean wasResolved;
	
	public SOSLayoutInformation(SOS.resource.SOS.grammar.SOSSyntaxElement syntaxElement, Object object, int startOffset, String hiddenTokenText, String visibleTokenText) {
		super();
		this.syntaxElement = syntaxElement;
		this.object = object;
		this.startOffset = startOffset;
		this.hiddenTokenText = hiddenTokenText;
		this.visibleTokenText = visibleTokenText;
	}
	
	public SOS.resource.SOS.grammar.SOSSyntaxElement getSyntaxElement() {
		return syntaxElement;
	}
	
	public int getStartOffset() {
		return startOffset;
	}
	
	public Object getObject(org.eclipse.emf.ecore.EObject container) {
		if (wasResolved) {
			return object;
		}
		// we need to try to resolve proxy objects again, because the proxy might have
		// been resolved before this adapter existed, which means we missed the
		// replaceProxy() notification
		if (object instanceof org.eclipse.emf.ecore.InternalEObject) {
			org.eclipse.emf.ecore.InternalEObject internalObject = (org.eclipse.emf.ecore.InternalEObject) object;
			if (internalObject.eIsProxy()) {
				if (container instanceof org.eclipse.emf.ecore.InternalEObject) {
					org.eclipse.emf.ecore.InternalEObject internalContainer = (org.eclipse.emf.ecore.InternalEObject) container;
					org.eclipse.emf.ecore.EObject resolvedObject = internalContainer.eResolveProxy(internalObject);
					if (resolvedObject != internalObject) {
						object = resolvedObject;
						wasResolved = true;
					}
				}
			}
		} else {
			wasResolved = true;
		}
		return object;
	}
	
	public String getHiddenTokenText() {
		return hiddenTokenText;
	}
	
	public String getVisibleTokenText() {
		return visibleTokenText;
	}
	
	public void replaceProxy(org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.ecore.EObject target) {
		if (this.object == proxy) {
			this.object = target;
		}
	}
	
}
