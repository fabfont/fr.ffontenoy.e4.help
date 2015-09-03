/**
 */
package fr.ffontenoy.e4.help.model.help;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.ffontenoy.e4.help.model.help.HelpFactory
 * @model kind="package"
 * @generated
 */
public interface HelpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "help";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.ffontenoy.e4.help/model/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "help";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelpPackage eINSTANCE = fr.ffontenoy.e4.help.model.help.impl.DefaultHelpPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.ffontenoy.e4.help.model.help.impl.DefaultTocImpl <em>Toc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ffontenoy.e4.help.model.help.impl.DefaultTocImpl
	 * @see fr.ffontenoy.e4.help.model.help.impl.DefaultHelpPackageImpl#getToc()
	 * @generated
	 */
	int TOC = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Toc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Toc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ffontenoy.e4.help.model.help.impl.DefaultTocItemImpl <em>Toc Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ffontenoy.e4.help.model.help.impl.DefaultTocItemImpl
	 * @see fr.ffontenoy.e4.help.model.help.impl.DefaultHelpPackageImpl#getTocItem()
	 * @generated
	 */
	int TOC_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ITEM__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ITEM__HREF = 2;

	/**
	 * The feature id for the '<em><b>Sub Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ITEM__SUB_ITEMS = 3;

	/**
	 * The number of structural features of the '<em>Toc Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Toc Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ITEM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.ffontenoy.e4.help.model.help.Toc <em>Toc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toc</em>'.
	 * @see fr.ffontenoy.e4.help.model.help.Toc
	 * @generated
	 */
	EClass getToc();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.help.model.help.Toc#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see fr.ffontenoy.e4.help.model.help.Toc#getLabel()
	 * @see #getToc()
	 * @generated
	 */
	EAttribute getToc_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ffontenoy.e4.help.model.help.Toc#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see fr.ffontenoy.e4.help.model.help.Toc#getItems()
	 * @see #getToc()
	 * @generated
	 */
	EReference getToc_Items();

	/**
	 * Returns the meta object for class '{@link fr.ffontenoy.e4.help.model.help.TocItem <em>Toc Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toc Item</em>'.
	 * @see fr.ffontenoy.e4.help.model.help.TocItem
	 * @generated
	 */
	EClass getTocItem();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.help.model.help.TocItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.ffontenoy.e4.help.model.help.TocItem#getId()
	 * @see #getTocItem()
	 * @generated
	 */
	EAttribute getTocItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.help.model.help.TocItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see fr.ffontenoy.e4.help.model.help.TocItem#getLabel()
	 * @see #getTocItem()
	 * @generated
	 */
	EAttribute getTocItem_Label();

	/**
	 * Returns the meta object for the attribute '{@link fr.ffontenoy.e4.help.model.help.TocItem#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see fr.ffontenoy.e4.help.model.help.TocItem#getHref()
	 * @see #getTocItem()
	 * @generated
	 */
	EAttribute getTocItem_Href();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ffontenoy.e4.help.model.help.TocItem#getSubItems <em>Sub Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Items</em>'.
	 * @see fr.ffontenoy.e4.help.model.help.TocItem#getSubItems()
	 * @see #getTocItem()
	 * @generated
	 */
	EReference getTocItem_SubItems();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HelpFactory getHelpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.ffontenoy.e4.help.model.help.impl.DefaultTocImpl <em>Toc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ffontenoy.e4.help.model.help.impl.DefaultTocImpl
		 * @see fr.ffontenoy.e4.help.model.help.impl.DefaultHelpPackageImpl#getToc()
		 * @generated
		 */
		EClass TOC = eINSTANCE.getToc();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOC__LABEL = eINSTANCE.getToc_Label();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOC__ITEMS = eINSTANCE.getToc_Items();

		/**
		 * The meta object literal for the '{@link fr.ffontenoy.e4.help.model.help.impl.DefaultTocItemImpl <em>Toc Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ffontenoy.e4.help.model.help.impl.DefaultTocItemImpl
		 * @see fr.ffontenoy.e4.help.model.help.impl.DefaultHelpPackageImpl#getTocItem()
		 * @generated
		 */
		EClass TOC_ITEM = eINSTANCE.getTocItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOC_ITEM__ID = eINSTANCE.getTocItem_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOC_ITEM__LABEL = eINSTANCE.getTocItem_Label();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOC_ITEM__HREF = eINSTANCE.getTocItem_Href();

		/**
		 * The meta object literal for the '<em><b>Sub Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOC_ITEM__SUB_ITEMS = eINSTANCE.getTocItem_SubItems();

	}

} //HelpPackage
