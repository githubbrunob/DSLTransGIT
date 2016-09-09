package emfInterpreter;

import org.eclipse.emf.common.util.URI;

public interface EMFPostProcessor {
	public void process(URI fileURI);
}
