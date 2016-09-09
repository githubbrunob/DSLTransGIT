package transformerProcessor;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dsltrans.AbstractSource;
import dsltrans.DsltransPackage;
import dsltrans.FilePort;
import dsltrans.Layer;
import dsltrans.MetaModelIdentifier;
import dsltrans.TransformationModel;

public class TransformerProcessor {
	
	private final TransformationController _controller;
	
	public TransformerProcessor(String classdir){
		_controller = new TransformationController(classdir);
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
	
	public boolean LoadModel(URI uri){
		//debug
		System.out.println("LOADING TransformationModel");
		System.out.println(uri.toString());

		boolean resultstatus = false;
		try {
			ResourceSet resourceSet = new ResourceSetImpl();
				
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());
				
			resourceSet.getPackageRegistry().put(DsltransPackage.eNS_URI, DsltransPackage.eINSTANCE);				
			
			Resource resource = resourceSet.getResource(uri,true);
			
			List<EObject> list = resource.getContents();
			if(list.size()>0) {
				EObject obj = list.get(0);
				if(obj instanceof TransformationModel) {
					TransformationModel tm = (TransformationModel) obj;
					process(tm);
				}				
			}
			resultstatus = true;
		} catch (SecurityException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return resultstatus;
	}

	public boolean LoadModel(String url) {
		return LoadModel(URI.createFileURI(url));
	}
	
	private void process(TransformationModel tm) {
		List<AbstractSource> sourceList = tm.getSource();
		for(AbstractSource source:sourceList) {
			process(source);
		}
	}
	
	private void process(AbstractSource source) {
		if(source instanceof Layer)
			getController().add((Layer) source);
		if(source instanceof FilePort)
			getController().add((FilePort) source);
	}
	
	public void Execute() throws Throwable {
		this.getController().Execute();
	}

	public TransformationController getController() {
		return _controller;
	}
}
