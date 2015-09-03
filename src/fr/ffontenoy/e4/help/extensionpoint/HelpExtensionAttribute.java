/**
 * Eclipse Public License - v 1.0
 * 
 * THE ACCOMPANYING PROGRAM IS PROVIDED UNDER THE TERMS OF THIS ECLIPSE PUBLIC LICENSE ("AGREEMENT"). 
 * ANY USE, REPRODUCTION OR DISTRIBUTION OF THE PROGRAM CONSTITUTES RECIPIENT'S ACCEPTANCE OF THIS AGREEMENT.
 * 
 * This code has been written by Fabrice Fontenoy and is available from the following git repository:
 * https://github.com/fabfont/fr.ffontenoy.e4.stickyview.git
 */
package fr.ffontenoy.e4.help.extensionpoint;

/**
 * Enum of possible attributes for the help extension point
 * 
 * @author Fabrice Fontenoy
 */
public enum HelpExtensionAttribute {

	/**
	 * Path to the Html file
	 */
	HTML_FILE("htmlFile"),

	/**
	 * Path to the Toc file
	 */
	TOC_FILE("tocFile");

	/** attibute name */
	private final String mName;

	/**
	 * Constructor
	 * 
	 * @param pName
	 *            the enum name
	 */
	private HelpExtensionAttribute(String pName) {
		mName = pName;
	}

	/**
	 * @return the attribute name
	 */
	public String getName() {
		return mName;
	}

}
