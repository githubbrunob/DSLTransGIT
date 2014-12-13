package dsltrans.diagram.providers;

import java.util.Hashtable;

import org.eclipse.gmf.runtime.common.ui.services.action.global.AbstractGlobalActionHandlerProvider;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandler;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandlerContext;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

public class MyEditorGlobalActionHandlerProvider extends
		AbstractGlobalActionHandlerProvider {

	private Hashtable handlerList = new Hashtable();

	public MyEditorGlobalActionHandlerProvider() {
		super();
	}

	public IGlobalActionHandler getGlobalActionHandler(
			final IGlobalActionHandlerContext context) {

		/* Create the handler */

		if (!getHandlerList().containsKey(context.getActivePart())) {

			getHandlerList().put(context.getActivePart(), new MyEditorClipboardSupportGlobalActionHandler());

			context.getActivePart().getSite().getPage()
					.addPartListener(new IPartListener() {
						private IWorkbenchPart localPart = context
								.getActivePart();

						public void partActivated(IWorkbenchPart part) {
						}

						public void partBroughtToTop(IWorkbenchPart part) {
						}

						public void partClosed(IWorkbenchPart part) {
							/* Remove the cache associated with the part */
							if (part != null && part == localPart
									&& getHandlerList().containsKey(part)) {
								getHandlerList().remove(part);
								localPart.getSite().getPage()
										.removePartListener(this);
								localPart = null;
							}
						}

						public void partDeactivated(IWorkbenchPart part) {
						}

						public void partOpened(IWorkbenchPart part) {
						}
					});
		}
		return (MyEditorClipboardSupportGlobalActionHandler) getHandlerList()
				.get(context.getActivePart());
	}

	private Hashtable getHandlerList() {
		return handlerList;
	}
}
