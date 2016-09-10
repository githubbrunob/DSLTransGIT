package dsltrans.io.eclipse;

import org.eclipse.emf.common.util.URI;

public interface PostProcessor {
	public void process(URI fileURI);
}
