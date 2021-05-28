/**
 */
package UMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UMLRT.Connector#getType <em>Type</em>}</li>
 *   <li>{@link UMLRT.Connector#getCapsulepart <em>Capsulepart</em>}</li>
 *   <li>{@link UMLRT.Connector#getPort <em>Port</em>}</li>
 *   <li>{@link UMLRT.Connector#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see UMLRT.UMLRTPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Protocol)
	 * @see UMLRT.UMLRTPackage#getConnector_Type()
	 * @model required="true"
	 * @generated
	 */
	Protocol getType();

	/**
	 * Sets the value of the '{@link UMLRT.Connector#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Protocol value);

	/**
	 * Returns the value of the '<em><b>Capsulepart</b></em>' reference list.
	 * The list contents are of type {@link UMLRT.CapsulePart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capsulepart</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capsulepart</em>' reference list.
	 * @see UMLRT.UMLRTPackage#getConnector_Capsulepart()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<CapsulePart> getCapsulepart();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link UMLRT.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see UMLRT.UMLRTPackage#getConnector_Port()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UMLRT.UMLRTPackage#getConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UMLRT.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Connector
