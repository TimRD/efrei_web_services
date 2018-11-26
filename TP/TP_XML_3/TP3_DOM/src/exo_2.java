import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class exo_2
{
    public exo_2(){
        super();
    }

    public void read (String balise, String filename) throws ParserConfigurationException, IOException, SAXException
    {
        DocumentBuilderFactory _factory = DocumentBuilderFactory.newInstance();
        _factory.setIgnoringComments(true);
        DocumentBuilder _builder = _factory.newDocumentBuilder();
        Document doc = _builder.parse(filename);
        NodeList to_read = doc.getDocumentElement().getElementsByTagName(balise);

        for (int i = 0; i < to_read.getLength(); i++)
        {
            NodeList n1 = to_read.item(i).getChildNodes();
            System.out.println(n1.item(0).getNodeValue());
        }
    }

    public void delete (String balise, String filename) throws ParserConfigurationException, IOException, SAXException
    {
        DocumentBuilderFactory _factory = DocumentBuilderFactory.newInstance();
        _factory.setIgnoringComments(true);
        DocumentBuilder _builder = _factory.newDocumentBuilder();
        Document doc = _builder.parse(filename);
        NodeList to_read = doc.getDocumentElement().getElementsByTagName(balise);

        for (int i = 0; i < to_read.getLength(); i++)
        {
            NodeList n1 = to_read.item(i).getChildNodes();
            Node child = to_read.item(i).getFirstChild();
            to_read.item(i).removeChild(child);
        }
    }
}
