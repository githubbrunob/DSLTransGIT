package dsltrans.transformer;

import java.util.List;

import dsltrans.AbstractSource;
import dsltrans.FilePort;
import dsltrans.Layer;
import dsltrans.MetaModelIdentifier;
import dsltrans.TransformationModel;
import dsltrans.io.PersistenceLayer;
import dsltrans.model.InstanceDatabaseManager;
import dsltrans.transformer.exceptions.MissingFeatureException;

public class TransformerProcessor {
	
	private final TransformationController _controller;
	
	public TransformerProcessor(PersistenceLayer persistenceL, InstanceDatabaseManager databaseManager){
		_controller = new TransformationController(persistenceL, databaseManager);
	}
	
	public void setFileURI(String Name, String URI) {
		for(TransformationSource ts: this.getController().getSources()) {
			if(ts.getPort().getName().equals(Name)) {
				ts.getPort().setFilePathURI(URI);
				return;
			}
		}
		for(TransformationLayer tl: this.getController().getUnits()) {
			if(tl.getLayer().getName().equals(Name)) {
				tl.getLayer().setOutputFilePathURI(URI);
				return;
			}
		}		
	}
	
	public void setMetaModelURI(String Name, String URI) {
		for(TransformationSource ts: this.getController().getSources()) {
			if(ts.getPort().getName().equals(Name)) {
				MetaModelIdentifier mmi = ts.getPort().getMetaModelId();
				mmi.setMetaModelURI(URI);
				return;
			}
		}
		for(TransformationLayer tl: this.getController().getUnits()) {
			if(tl.getLayer().getName().equals(Name)) {
				MetaModelIdentifier mmi = tl.getLayer().getMetaModelId();
				mmi.setMetaModelURI(URI);
				return;
			}
		}		
	}
	
	public void LoadModel(TransformationModel tm) throws MissingFeatureException {
		System.out.println("Loading TransformationModel");
		process(tm);
	}
	
	private void process(TransformationModel tm) throws MissingFeatureException {
		List<AbstractSource> sourceList = tm.getSource();
		for(AbstractSource source:sourceList) {
			process(source);
		}
	}
	
	private void process(AbstractSource source) throws MissingFeatureException {
		if(source instanceof Layer){
			getController().add((Layer) source);
		} else if(source instanceof FilePort){
			getController().add((FilePort) source);			
		} else{
			throw new MissingFeatureException("Unknown kind of source: " + source);
		}
	}
	
	public void Execute() throws Throwable {
		this.getController().Execute();
	}

	public TransformationController getController() {
		return _controller;
	}
}
