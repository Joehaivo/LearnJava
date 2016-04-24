package haivo.Xml;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by haivo on 2016/4/20.
 */
public class Dom {
    public static void main(String[] args) throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        try {
            Document document = db.parse("books.xml");
            NodeList nodeList = document.getElementsByTagName("book");
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
    }

}
