package emfInterpreter.metamodel.tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import testutils.TestUtils;
import transformerProcessor.exceptions.UnsuportedMetamodelException;
import emfInterpreter.EMFLoader;
import emfInterpreter.metamodel.MetaEntity;

public class MetamodelDatabaseTests {

	@Test
	public void testGetRootEntity_Trivial() throws IOException, UnsuportedMetamodelException {
		EMFLoader loader = new EMFLoader();

		String absoluteMetamodelPath = TestUtils.getResourceAbsolutePath(this.getClass().getResource("/FormalMetamodel.ecore"));
		
		loader.loadMetaModel(".", absoluteMetamodelPath);
		
		MetaEntity rootEntity = loader.getMetaModelDatabase().getRootEntity();
		
		Assert.assertEquals("FormalModel", rootEntity.getName());
	}
	
	@Test
	public void testGetRootEntity_Modules() throws IOException, UnsuportedMetamodelException {
		EMFLoader loader = new EMFLoader();

		String absoluteMetamodelPath = TestUtils.getResourceAbsolutePath(this.getClass().getResource("/ComplexRoot.ecore"));
		
		loader.loadMetaModel(".", absoluteMetamodelPath);
		
		MetaEntity rootEntity = loader.getMetaModelDatabase().getRootEntity();
		
		Assert.assertEquals("ImplementationModule", rootEntity.getName());
	}

}
