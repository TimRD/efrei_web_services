/*
 * Created on 26 nov. 2003
 * 
 * To change the template for this generated file go to Window - Preferences -
 * Java - Code Generation - Code and Comments
 */

import java.io.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;

public class parser {

	public PrintWriter out = null;

	//Rem changer Package par ModelElement
	public void parse(String _fichier)
		throws SAXException, ParserConfigurationException, IOException {

		// Charger le document
		FileInputStream _xml_input_file = new FileInputStream(_fichier);

		parse(_xml_input_file);
	}

	public void parse(InputStream _xml_input_file)
		throws SAXException, ParserConfigurationException, IOException
	{

		//creation du fichier output
		out = new PrintWriter(
				new FileOutputStream("./output2.html"));
		out.println("<html xmlns:fo=\"http://www.w3.org/1999/XSL/Format\"><head />");
		out.println("<body>");
		out.println("<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><h1 align=\"left\">Domaines </h1>");

		//instancier le contrcuteur de parseurs
		DocumentBuilderFactory _factory = DocumentBuilderFactory.newInstance();

		//ignorer les commentaires dans les fichiers XML pars豍
		_factory.setIgnoringComments(true);

		// cree un parseur
		DocumentBuilder _builder = _factory.newDocumentBuilder();

		// Charger le document
		Document doc = _builder.parse(_xml_input_file);

		//root
		Element bib = doc.getDocumentElement();

		//Domain
		NodeList domain = bib.getChildNodes();


		for (int i = 0; i < domain.getLength(); i++)
		{
			Node node = domain.item(i);
			/* Check if the Node is an Element (Tag) and not an Attr or Text Node */
			if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element elt = (Element) node;
				/* get the Element (Tag) "title" */
				Element title = (Element) elt.getElementsByTagName("title").item(0);
				/*Get its unique child which is of type Text */
				Node text = title.getFirstChild();
				/* get the value of the Text node which is the data we are looking for */
				String titre = text.getNodeValue();
				DomaineTemplate1(title, titre);
			}
		}

		out.println("<hr>");
		out.println("<hr>");

		//
		System.out.println(domain.getLength());
		for (int i = 0; i < domain.getLength(); i++)
		{
			Node node = domain.item(i);
			/* Check if the Node is an Element (Tag) and not an Attr or Text Node */
			if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element elt = (Element) node;
				/* get the Element (Tag) "title" */
				Element title = (Element) elt.getElementsByTagName("title").item(0);
				/*Get its unique child which is of type Text */
				Node text = title.getFirstChild();
				/* get the value of the Text node which is the data we are looking for */
				String titre = text.getNodeValue();
				DomaineTemplate2(title, titre);
				NodeList bib_ref_child = elt.getElementsByTagName("bib_ref");
				for (int j = 0; j < bib_ref_child.getLength(); j++)
				{
					Node node2 = bib_ref_child.item(j);

					if (node2.getNodeType() == Node.ELEMENT_NODE)
					{
						Element elt2 = (Element) node2;
						Element year = (Element) elt2.getElementsByTagName("year").item(0);
						Element title2 = (Element) elt2.getElementsByTagName("title").item(0);
						Element author = (Element) elt2.getElementsByTagName("author").item(0);
						Element weblink = (Element) elt2.getElementsByTagName("weblink").item(0);

						try {
							System.out.println("------");
							String year_text = year.getFirstChild().getNodeValue();
							System.out.println(year_text);
							String title2_text = title2.getFirstChild().getNodeValue();
							System.out.println(title2_text);
							String author_text = author.getFirstChild().getNodeValue();
							System.out.println(author_text);
							String weblink_text = weblink.getFirstChild().getNodeValue();
							System.out.println(weblink_text);
							InfoTemplate(title, year_text, title2_text, author_text, weblink_text);
							System.out.println("------");
						}
						catch (NullPointerException e)
						{
							continue;
						}
					}


				}


			}
		}
		out.close();
		out.flush();
	}

	public void DomaineTemplate1(Element domaine, String name) {
		out.println("<h2><a href=\"#"+name+"\">"+name+"</a></h2>");
	}

	public void DomaineTemplate2(Element domaine, String name) {
		out.println("<table width=\"100%\" border=\"1\">");
		out.println("	<tr>");
		out.println("   	<td width=\"100%\" bgcolor=\"#C0C0C0\">");
		out.println(
				"			<h2><a name=\"" + name + "\">" + name + "</a></h2>");
		out.println("		</td>");
		out.println("	</tr>");
		out.println("</table>");
	}

	public void InfoTemplate(Element domaine, String annee, String titre, String auteur, String link)
	{
		out.println("<hr>");
		out.println("Annee  :"+annee+"<br>");
		out.println("<h3>Titre :"+titre+"</h3>");
		out.println("Auteur(s)  :"+auteur+"<br>");
		out.println("Lien : <a href=\""+link+"\">"+link+"</a><br>");
	}
}