package transformerProcessor;

import com.ugos.jiprolog.engine.JIPEngine;

public class PrologEngineSingleton {
	
	private static JIPEngine prologEngine = null;
	
	protected PrologEngineSingleton() {
		// Cannot be instantiated from the outsite.
	}

	public static JIPEngine getEngineSingleton() {
		if (prologEngine == null) {
			prologEngine = new JIPEngine();
			prologEngine.setDebug(true);
		}
		return prologEngine;
	}
}
