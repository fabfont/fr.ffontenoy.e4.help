package fr.ffontenoy.e4.help.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fr.ffontenoy.e4.help.model.help.HelpFactory;
import fr.ffontenoy.e4.help.model.help.Toc;
import fr.ffontenoy.e4.help.model.help.TocItem;

/**
 * This class is used for parsing the TOC xml file of the online help.
 */
public final class XMLParserForHelp {

  /**
   * Root element name (for "toc").
   */
  private static final String TOC_ELEMENT_NAME = "toc";

  /**
   * Toc item element name (for "topic").
   */
  private static final String TOPIC_ELEMENT_NAME = "topic";

  /**
   * Label attribute name (for "label").
   */
  private static final String LABEL_ATTRIBUTE_NAME = "label";

  /**
   * Href attribute name (for "href").
   */
  private static final String HREF_ATTRIBUTE_NAME = "href";

  /**
   * Utility class ==> private constructor
   */
  private XMLParserForHelp() {
    //Nothing to do
  }

  /**
   * From the path to the toc xml file, this methods extracts attributes and build Toc object.
   *
   * @param pXmlFile The xml file corresponding to the TOC file
   * @return the Toc element filled with attributes of the xml file
   */
  public static Toc getTableOfContents(final String pXmlFile) {

    final Toc lToc = HelpFactory.eINSTANCE.createToc();

    final DocumentBuilderFactory lFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder lBuilder;
    try {
      lBuilder = lFactory.newDocumentBuilder();

      // Load the input XML document, parse it and return an instance of the
      // Document class.
      final Document lDocument = lBuilder.parse(new File(new URL(pXmlFile).getFile()));

      // Get the root element
      final Element lTocElement = lDocument.getDocumentElement();

      if (lTocElement.getNodeName().equals(TOC_ELEMENT_NAME)) {

        final Element lElement = lTocElement;

        final String lTocLabel = lTocElement.getAttributes().getNamedItem(LABEL_ATTRIBUTE_NAME).getNodeValue();
        lToc.setLabel(lTocLabel);

        final NodeList lChildren = lElement.getChildNodes();
        final List<TocItem> lTocItems = lToc.getItems();

        fillTocItems(lChildren, lTocItems);

      }

    } catch (IOException | ParserConfigurationException | SAXException lException) {
      System.err.println("Error occurred while building the table of contents: " + lException.getMessage());
    }
    return lToc;
  }

  /**
   * Create TocItem objects corresponding to the given DOM element. If the a "topic" DOM element contains sub "topic" elements, then its converted
   * TocItem object will contain children TocItem objects corresponding to the DOM element children. That is to say, this method goes through the
   * "topic" elements recursively.
   *
   * @param pNodeList The DOM elements
   * @param pTocItems The list of TocItem to fill
   */
  private static void fillTocItems(final NodeList pNodeList, final List<TocItem> pTocItems) {
    for (int lIndex = 0; lIndex < pNodeList.getLength(); lIndex++) {

      final Node lNode = pNodeList.item(lIndex);

      if (lNode.getNodeType() == Node.ELEMENT_NODE && lNode.getNodeName().equals(TOPIC_ELEMENT_NAME)) {

        final Element lElement = (Element) lNode;

        final TocItem lTocItem = HelpFactory.eINSTANCE.createTocItem();
        final String lTocLabel = lNode.getAttributes().getNamedItem(LABEL_ATTRIBUTE_NAME).getNodeValue();
        lTocItem.setLabel(lTocLabel);

        final String lTocHref = lNode.getAttributes().getNamedItem(HREF_ATTRIBUTE_NAME).getNodeValue();
        lTocItem.setHref(lTocHref);

        pTocItems.add(lTocItem);

        final NodeList lChildren = lElement.getChildNodes();
        final List<TocItem> lTocItems = lTocItem.getSubItems();

        fillTocItems(lChildren, lTocItems);
      }

    }
  }

}
