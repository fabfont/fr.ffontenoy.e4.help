package fr.ffontenoy.e4.help.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.IPartListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import fr.ffontenoy.e4.help.HelpConstants;
import fr.ffontenoy.e4.help.model.help.Toc;
import fr.ffontenoy.e4.help.model.help.TocItem;
import fr.ffontenoy.e4.help.utils.XMLParserForHelp;

/**
 * Help part. This part displays the User manual as an HTML file.
 */
public class HelpPart implements IPartListener {

//	/**
//	 * The window id.
//	 */
//	public static final String WINDOW_ID = "com.astrium.geo.sf.client.core.window.help";
//
//	/**
//	 * The part id.
//	 */
//	public static final String PART_ID = "com.astrium.geo.sf.client.core.part.onlineHelp";
//
//	/**
//	 * Help place holder id.
//	 */
//	private static final String HELP_PARTSTACK_ID = "com.astrium.geo.sf.client.core.partstack.helpPartStack";

	/**
	 * HTML anchor separator.
	 */
	private static final String HTML_ANCHOR_SEPARATOR = "#";

	/**
	 * Toc title class name.
	 */
	private static final String TOC_TITLE_CLASSNAME = "TocTitle";

	/**
	 * Toc item class name.
	 */
	private static final String TOC_ITEM_CLASSNAME = "TocTopic-";

	/**
	 * Indentation factor (used for topic indentations).
	 */
	private static final int TOPIC_INDENTATION_FACTOR = 20;

	/** Help Html file path */
	private static String gHelpFilePath;

	/** Help TOC file path */
	private static String gHelpTocFilePath;

	/** Table of contents object */
	private static Toc gToc = XMLParserForHelp
			.getTableOfContents(gHelpTocFilePath);

	/** Table Of Contents background color */
	private static final Color TOC_BACKGROUND_COLOR = new Color(null, 255, 255,
			255);

	/**
	 * Styling engine.
	 */
	@Inject
	private IStylingEngine mStylingEngine;

	/**
	 * The main application. This is used for retrieving the global context so
	 * as to change the help anchor.
	 */
	@Inject
	private MApplication mApplication;

	/** The web browser */
	private Browser mBrowser;

	/**
	 * Build the part.
	 *
	 * @param pParent
	 *            the parent composite
	 * @param pActivePart
	 *            the active part. The active part. This is used for opening the
	 *            help on the section corresponding to the active part
	 * @param pPartService
	 *            the part service used for registering the online help as a
	 *            part listener for changing page when clicking on a part
	 *
	 */
	@PostConstruct
	public void init(
			final Composite pParent,
			@Optional @Named(IServiceConstants.ACTIVE_PART) final MPart pActivePart,
			final EPartService pPartService) {
		pParent.setData("name", getClass().getSimpleName());

		final SashForm lSashForm = new SashForm(pParent, SWT.HORIZONTAL);

		// Build the table of contents part
		buildTableOfContents(lSashForm);

		// Build the online help part
		buildOnlineHelp(lSashForm);

		// Add a part listener for reacting on part change
		pPartService.addPartListener(this);

		// Set the sash proportion
		lSashForm.setWeights(new int[] { 3, 5 });
	}

	/**
	 * Build the online help part of the sash form.
	 *
	 * @param pSashForm
	 *            the sash form into which the help will be included to.
	 */
	private void buildOnlineHelp(final SashForm pSashForm) {
		mBrowser = new Browser(pSashForm, SWT.MOZILLA);
	}

	/**
	 * Build the table of contents of the online help.
	 *
	 * @param pSashForm
	 *            the sash form into which the help will be included to.
	 */
	private void buildTableOfContents(final SashForm pSashForm) {
		final ScrolledComposite lScrolledComposite = new ScrolledComposite(
				pSashForm, SWT.H_SCROLL | SWT.V_SCROLL);
		lScrolledComposite.setLayout(new GridLayout());
		lScrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		lScrolledComposite.setExpandHorizontal(true);
		lScrolledComposite.setExpandVertical(true);

		final Composite lTocComposite = new Composite(lScrolledComposite,
				SWT.FILL);
		lTocComposite
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		lTocComposite.setLayout(new GridLayout());
		lTocComposite.setBackground(TOC_BACKGROUND_COLOR);

		final Label lLabel = new Label(lTocComposite, SWT.CENTER);
		lLabel.setText(gToc.getLabel());
		lLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		lLabel.setBackground(TOC_BACKGROUND_COLOR);
		mStylingEngine.setClassname(lLabel, TOC_TITLE_CLASSNAME);

		buildTopics(gToc.getItems(), lTocComposite, 0);

		lScrolledComposite.setContent(lTocComposite);
		lScrolledComposite.setMinSize(lTocComposite.computeSize(SWT.DEFAULT,
				SWT.DEFAULT));
	}

	/**
	 * Method called when the part gets the focus.
	 */
	@Focus
	public void focus() {
		mBrowser.forceFocus();
	}

//	/**
//	 * Method called when the part is destroyed. Used for trigerring the
//	 * "visible" attribute of the help part stack to false.
//	 *
//	 * @param pModelService
//	 *            The model service used for getting the help part stack.
//	 * @param pApplication
//	 *            the MApplication instance used for searching the help part
//	 *            stack (search root).
//	 */
//	@PreDestroy
//	public void destroy(final EModelService pModelService,
//			final MApplication pApplication) {
//		final MPartStack lPartStack = (MPartStack) pModelService.find(
//				HELP_PARTSTACK_ID, pApplication);
//		lPartStack.setVisible(false);
//	}

	/**
	 * Method called when the help anchor is changed. That changes the browser
	 * url.
	 *
	 * @param pHelpAnchor
	 *            The new anchor
	 */
	@Inject
	@Optional
	public void updateHelpUrl(
			@Named(HelpConstants.HELP_ANCHOR_CONTEXT_ID) final String pHelpAnchor) {
		if (mBrowser != null && !mBrowser.isDisposed()) {
			final StringBuilder lHelpPath = new StringBuilder(gHelpFilePath);
			if (!pHelpAnchor.isEmpty()) {
				lHelpPath.append(HTML_ANCHOR_SEPARATOR).append(pHelpAnchor);
			}
			mBrowser.setUrl(lHelpPath.toString());
		}

	}

	/**
	 * Method called when a part is activated.
	 *
	 * @param pPart
	 *            the part which is activated.
	 */
	@Override
	public void partActivated(final MPart pPart) {
		// Modify the browser URL only if the browser has been initialized
		if (mBrowser != null
				&& !mBrowser.isDisposed()
				&& mBrowser.getUrl() != null
				&& !mBrowser.getUrl().isEmpty()
				&& pPart.getPersistedState().containsKey(
						HelpConstants.HELP_ANCHOR_PERSISTED_STATE_KEY)) {
			mApplication.getContext().set(
					HelpConstants.HELP_ANCHOR_CONTEXT_ID,
					pPart.getPersistedState().get(
							HelpConstants.HELP_ANCHOR_PERSISTED_STATE_KEY));
		}
	}

	/**
	 * Method called when a part is brought to top.
	 *
	 * @param pPart
	 *            the part which is brought to top.
	 */
	@Override
	public void partBroughtToTop(final MPart pPart) {
		// Nothing to do
	}

	/**
	 * Method called when a part is deactivated.
	 *
	 * @param pPart
	 *            the part which is deactivated.
	 */
	@Override
	public void partDeactivated(final MPart pPart) {
		// Nothing to do
	}

	/**
	 * Method called when a part is hidden.
	 *
	 * @param pPart
	 *            the part which is hidden.
	 */
	@Override
	public void partHidden(final MPart pPart) {
		// Nothing to do
	}

	/**
	 * Method called when a part is visible.
	 *
	 * @param pPart
	 *            the part which is visible.
	 */
	@Override
	public void partVisible(final MPart pPart) {
		// Nothing to do
	}

	/**
	 * Build the help table of contents items from a list of TocItem instances.
	 *
	 * @param pItems
	 *            the TocItem instances
	 * @param pParent
	 *            the parent composite
	 * @param pDepth
	 *            The toc item depth. Used for indentation.
	 */
	private void buildTopics(final EList<TocItem> pItems,
			final Composite pParent, final int pDepth) {
		for (final TocItem lTocItem : pItems) {
			final Label lLabel = new Label(pParent, SWT.LEFT);
			lLabel.setText(lTocItem.getLabel());
			final GridData lGridData = new GridData(SWT.FILL, SWT.FILL, true,
					false);
			lGridData.horizontalIndent = pDepth * TOPIC_INDENTATION_FACTOR;
			lLabel.setLayoutData(lGridData);
			lLabel.setBackground(TOC_BACKGROUND_COLOR);
			mStylingEngine.setClassname(lLabel, TOC_ITEM_CLASSNAME + pDepth);

			final String lHref = lTocItem.getHref();
			final String lAnchor = lHref.substring(lHref
					.indexOf(HTML_ANCHOR_SEPARATOR) + 1);

			lLabel.addMouseListener(new MouseAdapter() {

				/**
				 * Sent when a mouse button is pressed.
				 *
				 * @param pE
				 *            an event containing information about the mouse
				 *            button press
				 */
				@Override
				public void mouseDown(final MouseEvent arg0) {
					mApplication.getContext().set(
							HelpConstants.HELP_ANCHOR_CONTEXT_ID, lAnchor);
				}
			});

			// Build sub topics
			buildTopics(lTocItem.getSubItems(), pParent, pDepth + 1);
		}
	}

	/**
	 * Set the help html file
	 * @param pHelpFilePath the help html file
	 */
	public static void setHelpFilePath(String pHelpFilePath) {
		HelpPart.gHelpFilePath = pHelpFilePath;
	}

	/**
	 * Set the Toc model object
	 * @param pToc the Toc modle object
	 */
	public static void setToc(Toc pToc) {
		HelpPart.gToc = pToc;
	}
}
