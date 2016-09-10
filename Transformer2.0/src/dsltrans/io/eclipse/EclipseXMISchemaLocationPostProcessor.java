package dsltrans.io.eclipse;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;


public class EclipseXMISchemaLocationPostProcessor implements PostProcessor{
	
	protected String metaModelFileName;
	protected URI rootNsUri;
	
	public EclipseXMISchemaLocationPostProcessor(URI metamodelURI, URI rootNsUri) {
		System.out.println("Initializing XMISchemaLocationPostProcessor to " + metamodelURI.toString());
		this.metaModelFileName = extractFileName(metamodelURI);
		this.rootNsUri = rootNsUri;
	}
	
	private String extractFileName(URI metamodelURI) {
		// Extracts the filename by creating a file from the URI and then obtaining it's name.
		// This was to most easy and platform independent way I found to do this.
		return (new File(metamodelURI.toString())).getName();
	}

	@Override
	public void process(URI fileURI) {
		try {
			System.out.println("Post processing " + fileURI);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(fileURI.toString());
			System.out.println("File openned.");
			Node rootPackageElement = doc.getFirstChild();
			System.out.println("Root element: " + rootPackageElement);
			NamedNodeMap rootPackageAttributes = rootPackageElement.getAttributes();
			Attr xsiSchemaLocation = (Attr) rootPackageAttributes.getNamedItem("xsi:schemaLocation");
			if (xsiSchemaLocation!=null) {
				System.out.println("SchemaLocation already defined: " + xsiSchemaLocation);
				return;
			}
			xsiSchemaLocation = doc.createAttribute("xsi:schemaLocation");
			xsiSchemaLocation.setValue(this.rootNsUri + " " + this.metaModelFileName);
			
			Attr xmlnsXSI = (Attr) rootPackageAttributes.getNamedItem("xmlns:xsi");
			if (xmlnsXSI==null) {
				System.out.println("Setting XMLNS XSI...");
				xmlnsXSI = doc.createAttribute("xmlns:xsi");
				xmlnsXSI.setValue("http://www.w3.org/2001/XMLSchema-instance");
			}
			
			rootPackageAttributes.setNamedItem(xmlnsXSI);
			rootPackageAttributes.setNamedItem(xsiSchemaLocation);
			
			System.out.println("xsi:schemaLocation Added.");
			System.out.println("Writting result...");
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(fileURI.toString());
			transformer.setOutputProperty("indent", "yes");
			transformer.transform(source, result);
			
			EclipsePostProcessorUtils.refreshOutputFile(fileURI);
			
			System.out.println("Done.");
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
	}

}
