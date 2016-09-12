package dsltrans.transformer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import dsltrans.FilePort;
import dsltrans.MetaModelIdentifier;
import dsltrans.io.ModelLoader;
import dsltrans.metamodel.MetaModelDatabase;
import dsltrans.transformer.exceptions.InvalidLayerRequirement;
import dsltrans.transformer.exceptions.TransformationSourceException;
import dsltrans.transformer.exceptions.UnsuportedMetamodelException;

public class TransformationSource extends TransformationUnit {
	private final FilePort _port;
	
	public TransformationSource(FilePort p) {
		super();
		_port = p;
		setMetaDatabase(null);
		setOutputModelDatabase(null);
	}

	public FilePort getPort() {
		return _port;
	}

	@Override
	public void Check() {
		setValid(false); // let's assume that it is not valid..
		if(getMetaDatabase() == null)
			return;
		if(getOutputModelDatabase() == null)
			return;
		
		setValid(true); // if passed all above conditions then it is valid
	}

	public void Load(ModelLoader loader, Map<String, Object> metamodels) throws TransformationSourceException, IOException, UnsuportedMetamodelException, ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InvalidLayerRequirement {
		if(isProcessed()) return;
		MetaModelIdentifier mmi = getPort().getMetaModelId();
		
		String mmName = mmi.getMetaModelName();
		String mmPath = mmi.getMetaModelURI();
		
		String inputPath = getPort().getFilePathURI();
		
		if(!metamodels.containsKey(mmName)) {
			loader.loadMetaModel(mmPath);
			metamodels.put(mmName,loader.getMetaModelDatabase());
		} else {
			loader.setMetaModelDatabase((MetaModelDatabase) metamodels.get(mmName));
		}
		
		System.out.println("metamodel: "+mmName);
		
		loader.loadInstances(mmName, inputPath);
		loader.getInstanceDatabase().createTransitiveGraph();
		setOutputModelDatabase(loader.getInstanceDatabase());
		setMetaDatabase(loader.getMetaModelDatabase());
		this.setProcessed(true);
	}
	
	public String getMetamodelIdentifier()
	{ 
		MetaModelIdentifier mmi = getPort().getMetaModelId();
		return mmi.getMetaModelURI();
	}
}
