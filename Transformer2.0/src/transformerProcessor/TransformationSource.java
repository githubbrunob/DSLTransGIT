package transformerProcessor;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import dsltrans.FilePort;
import dsltrans.MetaModelIdentifier;
import transformerProcessor.exceptions.TransformationSourceException;
import emfInterpreter.EMFLoader;
import emfInterpreter.metamodel.MetaModelDatabase;

public class TransformationSource extends TransformationUnit {
	private final FilePort _port;
	
	public TransformationSource(String classdir, FilePort p) {
		super(classdir);
		_port = p;
		setMetaDatabase(null);
		setDatabase(null);
	}

	public FilePort getPort() {
		return _port;
	}

	@Override
	public void Check() {
		setValid(false); // let's assume that it is not valid..
		if(getMetaDatabase() == null)
			return;
		if(getDatabase() == null)
			return;
		// TODO check if loaded model is compatible with loaded meta model
		
		setValid(true); // if passed all above conditions then it is valid
	}

	public void Load(Map<String, Object> factorys, Map<String, Object> metamodels) throws TransformationSourceException, IOException {
		if(isProcessed()) return;
		MetaModelIdentifier mmi = getPort().getMetaModelId();
		
		String mmName = mmi.getMetaModelName();
		String mmPath = mmi.getMetaModelURI();
		
		String inputPath = getPort().getFilePathURI();
		
		EMFLoader loader = new EMFLoader();
		if(!metamodels.containsKey(mmName)) {
			loader.loadMetaModel(getClassdir(), mmPath);
			metamodels.put(mmName,loader.getMetaModelDatabase());
		} else {
			loader.setMetaModelDatabase((MetaModelDatabase) metamodels.get(mmName));
		}
		
		try {
			System.out.println("metamodel: "+mmName);
			loader.getDatabase().setFactorys(factorys);
			
			loader.loadDatabase(mmName, inputPath,getClassdir());
			loader.getDatabase().createTransitiveGraph();
			setDatabase(loader.getDatabase());
			setMetaDatabase(loader.getMetaModelDatabase());
			this.setProcessed(true);
		} catch (SecurityException e) {
			throw new TransformationSourceException("SecurityException at:", this, e);
		} catch (IllegalArgumentException e) {
			throw new TransformationSourceException("IllegalArgumentException at:", this, e);			
		} catch (ClassNotFoundException e) {
			throw new TransformationSourceException("ClassNotFoundException at:", this, e);
		} catch (NoSuchFieldException e) {
			throw new TransformationSourceException("NoSuchFieldException at:", this, e);
		} catch (IllegalAccessException e) {
			throw new TransformationSourceException("IllegalAccessException at:", this, e);
		} catch (NoSuchMethodException e) {
			throw new TransformationSourceException("NoSuchMethodException at:", this, e);
		} catch (InvocationTargetException e) {
			throw new TransformationSourceException("InvocationTargetException at:", this, e);
		}
	}
	
	public String getMetamodelIdentifier()
	{ 
		MetaModelIdentifier mmi = getPort().getMetaModelId();
		return mmi.getMetaModelURI();
	}
}
