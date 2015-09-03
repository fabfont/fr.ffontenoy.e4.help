/**
 */
package fr.ffontenoy.e4.help.model.help.impl;

import fr.ffontenoy.e4.help.model.help.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultHelpFactoryImpl extends EFactoryImpl implements HelpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HelpFactory init() {
		try {
			HelpFactory theHelpFactory = (HelpFactory)EPackage.Registry.INSTANCE.getEFactory(HelpPackage.eNS_URI);
			if (theHelpFactory != null) {
				return theHelpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DefaultHelpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultHelpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HelpPackage.TOC: return createToc();
			case HelpPackage.TOC_ITEM: return createTocItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toc createToc() {
		DefaultTocImpl toc = new DefaultTocImpl();
		return toc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TocItem createTocItem() {
		DefaultTocItemImpl tocItem = new DefaultTocItemImpl();
		return tocItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpPackage getHelpPackage() {
		return (HelpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HelpPackage getPackage() {
		return HelpPackage.eINSTANCE;
	}

} //DefaultHelpFactoryImpl
