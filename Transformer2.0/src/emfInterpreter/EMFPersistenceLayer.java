package emfInterpreter;

import persistence.ModelExporter;
import persistence.PersistenceLayer;

public class EMFPersistenceLayer implements PersistenceLayer {

	@Override
	public ModelExporter buildModelExporter() {
		return new EMFExporter();
	}
	
}
