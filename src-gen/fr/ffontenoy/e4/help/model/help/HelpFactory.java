/**
 */
package fr.ffontenoy.e4.help.model.help;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.ffontenoy.e4.help.model.help.HelpPackage
 * @generated
 */
public interface HelpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelpFactory eINSTANCE = fr.ffontenoy.e4.help.model.help.impl.DefaultHelpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Toc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toc</em>'.
	 * @generated
	 */
	Toc createToc();

	/**
	 * Returns a new object of class '<em>Toc Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toc Item</em>'.
	 * @generated
	 */
	TocItem createTocItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HelpPackage getHelpPackage();

} //HelpFactory
