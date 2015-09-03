package fr.ffontenoy.e4.help.processors;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.di.annotations.Execute;

import fr.ffontenoy.e4.help.HelpActivator;
import fr.ffontenoy.e4.help.HelpConstants;
import fr.ffontenoy.e4.help.extensionpoint.HelpExtensionAttribute;
import fr.ffontenoy.e4.help.parts.HelpPart;
import fr.ffontenoy.e4.help.utils.XMLParserForHelp;

/**
 * Help Processor
 * 
 * @author Fabrice Fontenoy
 *
 */
public class HelpProcessor {

	@Execute
	public void process(IExtensionRegistry pExtensionRegistry) {
		IConfigurationElement[] lConfigurationElements = pExtensionRegistry
				.getConfigurationElementsFor(HelpConstants.HELP_EXTENSION_POINT_ID);

		switch (lConfigurationElements.length) {
		case 0:
			System.out.println("No extension of '"
					+ HelpConstants.HELP_EXTENSION_POINT_ID
					+ "' has been found");
			break;
		case 1:
			IConfigurationElement lConfigurationElement = lConfigurationElements[0];
			String lHtmlFile = lConfigurationElement
					.getAttribute(HelpExtensionAttribute.HTML_FILE.getName());
			String lTocFile = lConfigurationElement
					.getAttribute(HelpExtensionAttribute.TOC_FILE.getName());
			String lBundleId = lConfigurationElement.getContributor().getName();

			HelpPart.setHelpFilePath(HelpActivator.getURL(lHtmlFile, lBundleId)
					.toString());
			HelpPart.setToc(XMLParserForHelp.getTableOfContents(HelpActivator
					.getURL(lTocFile, lBundleId).toString()));
			break;
		default:
			System.err.println("Only one extension of '"
					+ HelpConstants.HELP_EXTENSION_POINT_ID
					+ "' can be defined");
			break;
		}
	}
}
