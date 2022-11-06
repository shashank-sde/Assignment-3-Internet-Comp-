package Xsd_Validator;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class XsdValidator{
	public static void main(String[] args) {
		boolean flag=true;
		try {
			validate("xmldoc1.xml", "xmldoc1.xsd");
		} catch (SAXException e) {
			flag=false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			flag=false;
		}
		System.out.println("XML File is valid against the XSD : "+ flag);
		
	}
	public static void validate(String xmlFile, String validationFile) throws SAXException, IOException {
		SchemaFactory schemaFactory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		((schemaFactory.newSchema(new File(validationFile))).newValidator()).validate(new StreamSource(new File(xmlFile)));
		
	}
}

