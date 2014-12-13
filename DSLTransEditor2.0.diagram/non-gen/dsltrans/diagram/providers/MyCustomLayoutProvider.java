package dsltrans.diagram.providers;

import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.graph.DirectedGraph;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.providers.TopDownProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNode;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNodeOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import dsltrans.diagram.edit.parts.LayerPreviousSourceEditPart;

public class MyCustomLayoutProvider extends TopDownProvider {

	public static String DEFAULT_LAYOUT = "Default";
	
	public boolean provides(IOperation operation) {
        if (operation instanceof ILayoutNodeOperation) {
            Iterator nodes = ((ILayoutNodeOperation) operation)
                .getLayoutNodes().listIterator();
            if (nodes.hasNext()) {
                View node = ((ILayoutNode) nodes.next()).getNode();
                Diagram container = node.getDiagram();
                if (container == null
                    || !(container.getType().equals("Dsltrans"))) //$NON-NLS-1$
                    return false;
            }
        } else {
            return false;
        }
        IAdaptable layoutHint = ((ILayoutNodeOperation) operation)
            .getLayoutHint();
        String layoutType = (String) layoutHint.getAdapter(String.class);
        return LayoutType.DEFAULT.equals(layoutType);
    }

	@Override
	protected void postProcessGraph(DirectedGraph g,
			Hashtable editPartToNodeDict) {
		super.postProcessGraph(g, editPartToNodeDict);
		
		for (Object edgeObj : g.edges) {
			Edge edge = (Edge) edgeObj;
			if (edge.data instanceof LayerPreviousSourceEditPart){
				// switch source and target.
				Node sourceNode = edge.source;
				edge.setSource(edge.target);
				edge.setTarget(sourceNode);
			}
		}
	}
	
	
	
}
