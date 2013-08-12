package post_processor;

import java.io.IOException;
import java.util.Hashtable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SequenceExpansionProcessor implements PostProcessor {
	
	public static final String SEQUENCER_STRING = "#seq";
	
	private Hashtable<String, Integer> counters;
	
	
	
	public SequenceExpansionProcessor() {
		super();
		
		counters = new Hashtable<String, Integer>();
		
	}



	@Override
	public void process(URI fileURI) {
		try {
			System.out.println("Post processing " + fileURI);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(fileURI.toString());
			System.out.println("File openned.");
			
			XPathFactory factory = XPathFactory.newInstance();
		    XPath xpath = factory.newXPath();
		    XPathExpression expr 
		     = xpath.compile("//*");

		    Object res = expr.evaluate(doc, XPathConstants.NODESET);
		    NodeList nodes = (NodeList) res;
		    for (int i = 0; i < nodes.getLength(); i++) {
		        Node n = nodes.item(i);
		        processNode(n);
		    }
			
		    System.out.println("Sequences expanded.");
			System.out.println("Writting result...");
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(fileURI.toString());
			transformer.setOutputProperty("indent", "yes");
			transformer.transform(source, result);
			
			PostProcessorUtils.refreshOutputFile(fileURI);
			
			System.out.println("Done.");
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
	}



	private void processNode(Node n) {
		NamedNodeMap nodeAttributes = n.getAttributes();
		if (nodeAttributes == null) {
			return;
		}
		
		for (int i = 0; i < nodeAttributes.getLength(); i++) {
			Node attribute = nodeAttributes.item(i);
			processAttribute(attribute);
		}
	}



	private void processAttribute(Node attribute) {
		assert attribute != null;
		if ( !(attribute instanceof Attr)) {
			return;
		}
		Attr nodeAttr = (Attr) attribute;
		processAttributeValue(attribute.getNodeValue(), nodeAttr);
	}



	private void processAttributeValue(String nodeValue, Attr nodeAttr) {
		if (nodeValue.indexOf(SEQUENCER_STRING) == -1) {
			return;
		}
		
		if (!counters.containsKey(nodeValue)) {
			counters.put(nodeValue, 0);
		}
		
		
		String newAttrValue = replaceAllOcurrences(nodeValue, SEQUENCER_STRING, (""+counters.get(nodeValue)));
		System.out.println("String found: " + nodeValue + " -> " + newAttrValue);
		
		// Set the new attribute's value.
		nodeAttr.setNodeValue(newAttrValue);
		
		
		// Increment the used counter.
		counters.put(nodeValue, counters.get(nodeValue) + 1);
	}



	private String replaceAllOcurrences(String mainString,
			String subStringToReplace, String newStringToInject) {
		String regexp = "(?:" + subStringToReplace + ")";
		return mainString.replaceAll(regexp, newStringToInject);
	}
	

}
