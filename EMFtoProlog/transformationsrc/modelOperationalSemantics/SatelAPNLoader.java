package modelOperationalSemantics;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import mprolog.Model;
import mprolog.MprologFactory;
import mprolog.MprologPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import visitors.TransformToMPrologVisitor;


public class SatelAPNLoader {
		public static SATEL.Model loadSATELApn(String relativepathfile) {
			// Initialize the model
			SATEL.SATELPackage.eINSTANCE.eClass();
			
			// Register the XMI resource factory for the .website extension

			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("SATEL", new XMIResourceFactoryImpl());

			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();

			// Get the resource
			Resource resource = resSet.getResource(URI.createURI(relativepathfile), true);
			// Get the first model element and cast it to the right type, in my
			// example everything is hierarchical included in this first node
			 SATEL.Model model = (SATEL.Model) resource.getContents().get(0);
			return model;
		}

		
		public static void writeMProlog(Model mprologmodel, String relativepathfile) {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("mprolog", new XMIResourceFactoryImpl());

			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();

			// Create a resource
			Resource resource = resSet.createResource(URI
					.createURI(relativepathfile));
			// Get the first model element and cast it to the right type, in my
			// example everything is hierarchical included in this first node
			resource.getContents().add(mprologmodel);

			// Now save the content.
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public static void main (String ... args) {
			//"model/s.SATEL"
			SATEL.Model satelmodel = SatelAPNLoader.loadSATELApn(args[0]);
			Model mprologmodel = new TransformToMPrologVisitor().accept(satelmodel);
			writeMProlog(mprologmodel, args[1]);
		}
		
	}
