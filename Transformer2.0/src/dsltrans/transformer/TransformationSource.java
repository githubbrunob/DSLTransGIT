package dsltrans.transformer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import dsltrans.FilePort;
import dsltrans.MetaModelIdentifier;
import dsltrans.exceptions.TransformationSourceException;
import dsltrans.exceptions.UnsuportedMetamodelException;
import dsltrans.io.ModelLoader;
import dsltrans.metamodel.MetaModelDatabase;

public class TransformationSource extends TransformationUnit {
	private final FilePort _port;
	
	public TransformationSource(String classdir, FilePort p) {
		super(classdir);
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

	public void Load(ModelLoader loader, Map<String, Object> metamodels) throws TransformationSourceException, IOException, UnsuportedMetamodelException, ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		if(isProcessed()) return;
		MetaModelIdentifier mmi = getPort().getMetaModelId();
		
		String mmName = mmi.getMetaModelName();
		String mmPath = mmi.getMetaModelURI();
		
		String inputPath = getPort().getFilePathURI();
		
		if(!metamodels.containsKey(mmName)) {
			String classDir = getClassdir();
			loader.loadMetaModel(classDir, mmPath);
			metamodels.put(mmName,loader.getMetaModelDatabase());
		} else {
			loader.setMetaModelDatabase((MetaModelDatabase) metamodels.get(mmName));
		}
		
		System.out.println("metamodel: "+mmName);
		
		loader.loadDatabase(mmName, inputPath, getClassdir());
		loader.getDatabase().createTransitiveGraph();
		setOutputModelDatabase(loader.getDatabase());
		setMetaDatabase(loader.getMetaModelDatabase());
		this.setProcessed(true);
	}
	
	public String getMetamodelIdentifier()
	{ 
		MetaModelIdentifier mmi = getPort().getMetaModelId();
		return mmi.getMetaModelURI();
	}
}
