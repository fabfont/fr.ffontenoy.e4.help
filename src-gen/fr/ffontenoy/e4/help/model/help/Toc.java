/**
 */
package fr.ffontenoy.e4.help.model.help;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.ffontenoy.e4.help.model.help.Toc#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.ffontenoy.e4.help.model.help.Toc#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.ffontenoy.e4.help.model.help.HelpPackage#getToc()
 * @model
 * @generated
 */
public interface Toc extends EObject {
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
	 * @see fr.ffontenoy.e4.help.model.help.HelpPackage#getToc_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link fr.ffontenoy.e4.help.model.help.Toc#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ffontenoy.e4.help.model.help.TocItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see fr.ffontenoy.e4.help.model.help.HelpPackage#getToc_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<TocItem> getItems();

} // Toc
