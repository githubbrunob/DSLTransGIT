/*
 * 
 */
package dsltrans.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import dsltrans.diagram.part.DsltransVisualIDRegistry;

/**
 * @generated
 */
public class DsltransNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7021;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7020;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof DsltransNavigatorItem) {
			DsltransNavigatorItem item = (DsltransNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return DsltransVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
