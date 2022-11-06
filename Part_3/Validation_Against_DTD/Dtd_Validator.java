import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class Dtd_Validator {

	public static void main(String[] args) {
		boolean flag=true;
		try {
			validate("xmldoc2.xml");
		} catch (ParserConfigurationException e) {
			flag=false;
		} catch (FileNotFoundException e) {
			flag=false;
		} catch (SAXException e) {
			flag=false;
		} catch (IOException e) {
			flag=false; 
		}
		System.out.println("XML File is Valid against DTD : " +flag);

	}
	public static void validate(String xmlFile) throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
		DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
		documentBuilderFactory.setValidating(true);
		DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
		documentBuilder.setErrorHandler(new org.xml.sax.ErrorHandler() {

			public void warning(SAXParseException exception) throws SAXException {throw exception;}
			public void error(SAXParseException exception) throws SAXException {throw exception;}
			public void fatalError(SAXParseException exception) throws SAXException {throw exception;}
			
	});
		documentBuilder.parse(new FileInputStream(xmlFile));
}
}
