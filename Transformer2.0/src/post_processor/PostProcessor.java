package post_processor;

import org.eclipse.emf.common.util.URI;

public interface PostProcessor {
	public void process(URI fileURI);
}
