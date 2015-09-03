/**
 */
package fr.ffontenoy.e4.help.model.help;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toc Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ffontenoy.e4.help.model.help.TocItem#getId <em>Id</em>}</li>
 *   <li>{@link fr.ffontenoy.e4.help.model.help.TocItem#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.ffontenoy.e4.help.model.help.TocItem#getHref <em>Href</em>}</li>
 *   <li>{@link fr.ffontenoy.e4.help.model.help.TocItem#getSubItems <em>Sub Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ffontenoy.e4.help.model.help.HelpPackage#getTocItem()
 * @model
 * @generated
 */
public interface TocItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.ffontenoy.e4.help.model.help.HelpPackage#getTocItem_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.ffontenoy.e4.help.model.help.TocItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see fr.ffontenoy.e4.help.model.help.HelpPackage#getTocItem_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link fr.ffontenoy.e4.help.model.help.TocItem#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see fr.ffontenoy.e4.help.model.help.HelpPackage#getTocItem_Href()
	 * @model
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link fr.ffontenoy.e4.help.model.help.TocItem#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Sub Items</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ffontenoy.e4.help.model.help.TocItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Items</em>' containment reference list.
	 * @see fr.ffontenoy.e4.help.model.help.HelpPackage#getTocItem_SubItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<TocItem> getSubItems();

} // TocItem
