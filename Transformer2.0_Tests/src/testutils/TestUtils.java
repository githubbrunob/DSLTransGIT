package testutils;

import java.net.URL;

public class TestUtils {

	public static String getResourceAbsolutePath(URL resourcePath) {
		
		String absoluteMetamodelFilePath = resourcePath.getFile().substring(1);
		
		return absoluteMetamodelFilePath;
	}

}
