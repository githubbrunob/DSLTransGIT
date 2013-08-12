package modelOperationalSemantics;

import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import emfInterpreter.EMFLoader;
import emfInterpreter.instance.InstanceAttribute;
import emfInterpreter.instance.InstanceDatabase;
import emfInterpreter.instance.InstanceEntity;
import emfInterpreter.instance.InstanceRelation;

public class XMIModelProcessor {
	private EMFLoader loader;
	private int currentID ;
	private Map<InstanceEntity, String> entityMap;
	private HashMap<String, String> entityParent; 

	public XMIModelProcessor() {
		super();
		currentID = 0;
		entityMap = new HashMap<InstanceEntity, String>();
		entityParent = new HashMap<String, String>();
	}


	public void modelToProlog(String metamodelfile, String rootpackage, String modelfile, String outputfile) throws SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
		loader = new EMFLoader();
		
		loader.loadMetaModel("C:\\Users\\Sunday3s\\EditorsWorkspace\\EMFtoProlog", metamodelfile);
		if(!loader.loadDatabase( rootpackage, modelfile,"C:\\Users\\Sunday3s\\EditorsWorkspace\\EMFtoProlog"))
			return;
		
		InstanceDatabase database = loader.getDatabase();
		PrintWriter output = new PrintWriter( new FileWriter(outputfile));
		writeRelations(database.getLoadedRelations(), output);
		writeEntities(database.getLoadedClasses(), output);
		writeAttributes(database.getLoadedAttributes(), output);
		output.close();
	}


	private void writeRelations(List<InstanceRelation> loadedRelations, PrintWriter output) {
		System.out.println("Writing relations ... ");
		for (InstanceRelation instanceRelation : loadedRelations) {
			String idSrc = getIdOf(instanceRelation.getSource()) ;
			String idTgt = getIdOf(instanceRelation.getTarget()) ;
			entityParent.put(idTgt, idSrc);			
			output.println("relation('"+instanceRelation.getRelation().getName()+"' ,"+idSrc +", "+idTgt+").");
		}
	}


	private void writeAttributes(List<InstanceAttribute> loadedAttributes, PrintWriter output) {
		System.out.println("Writing attributes ... ");
		for (InstanceAttribute instanceAttribute : loadedAttributes) {
			output.println("attribute('" + instanceAttribute.getMetaAttribute().getName()+"', '"
										 + instanceAttribute.getValue() +"'," 
										 + entityMap.get(instanceAttribute.getEntity())+")." );
		}

	}

	private String getIdOf(InstanceEntity entity) {
		String id = entityMap.get(entity) ;
		if (id == null) {
			entityMap.put(entity, id=genNewID());
			System.out.println("Generating id ... ");
		}
		return id;
	}
	
	private String genNewID() {
		return "ident"+currentID++;
	}

	public void writeEntities(List<InstanceEntity> list, PrintWriter output) {
		System.out.println("Writing entities ... ");
		for (InstanceEntity instanceEntity : list) {
			String id = getIdOf(instanceEntity);
			String parentid = entityParent.get(id);
			if (parentid==null) parentid = "no_parent_available";
			output.println("entity('"+
					instanceEntity.getMetaEntity().getNamespace() + "', '"+
					instanceEntity.getMetaEntity().getName() + "', " +
					id+", "+ parentid+").");
		}
	}
	public static void main(String ...strings  ) {
		try {
			new XMIModelProcessor().modelToProlog("metamodel\\SATELAPN.ecore", "SATEL.SATEL", "model\\s.SATEL.xmi", "modelo.pl");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
