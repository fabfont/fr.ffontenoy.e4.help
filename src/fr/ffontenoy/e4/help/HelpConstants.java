package fr.ffontenoy.e4.help;

/**
 * Constants for help
 * 
 * @author Fabrice Fontenoy
 */
public interface HelpConstants {

	  /**
	   * Context key of the URL of the help page.
	   */
	  public static final String HELP_ANCHOR_CONTEXT_ID = "fr.ffontenoy.e4.help.helpURL";

	  /**
	   * Persisted state key for help anchor.
	   */
	  public static final String HELP_ANCHOR_PERSISTED_STATE_KEY = "helpAnchor";
	  
	  /***
	   * Help extension point id
	   */
	  public static final String HELP_EXTENSION_POINT_ID = "fr.ffontenoy.e4.help.helpExtensionPoint";
}
