/**
 */
package UMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UMLRT.Model#getCapsules <em>Capsules</em>}</li>
 *   <li>{@link UMLRT.Model#getName <em>Name</em>}</li>
 *   <li>{@link UMLRT.Model#getTop <em>Top</em>}</li>
 *   <li>{@link UMLRT.Model#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link UMLRT.Model#getInputMessage <em>Input Message</em>}</li>
 *   <li>{@link UMLRT.Model#getActiveCapsule <em>Active Capsule</em>}</li>
 * </ul>
 *
 * @see UMLRT.UMLRTPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Capsules</b></em>' containment reference list.
	 * The list contents are of type {@link UMLRT.Capsule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capsules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capsules</em>' containment reference list.
	 * @see UMLRT.UMLRTPackage#getModel_Capsules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capsule> getCapsules();

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
	 * @see UMLRT.UMLRTPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UMLRT.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' reference.
	 * @see #setTop(Capsule)
	 * @see UMLRT.UMLRTPackage#getModel_Top()
	 * @model required="true"
	 * @generated
	 */
	Capsule getTop();

	/**
	 * Sets the value of the '{@link UMLRT.Model#getTop <em>Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' reference.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(Capsule value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link UMLRT.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see UMLRT.UMLRTPackage#getModel_Protocol()
	 * @model containment="true"
	 * @generated
	 */
	EList<Protocol> getProtocol();

	/**
	 * Returns the value of the '<em><b>Input Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Message</em>' reference.
	 * @see #setInputMessage(Message)
	 * @see UMLRT.UMLRTPackage#getModel_InputMessage()
	 * @model
	 * @generated
	 */
	Message getInputMessage();

	/**
	 * Sets the value of the '{@link UMLRT.Model#getInputMessage <em>Input Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Message</em>' reference.
	 * @see #getInputMessage()
	 * @generated
	 */
	void setInputMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Active Capsule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Capsule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Capsule</em>' reference.
	 * @see #setActiveCapsule(Capsule)
	 * @see UMLRT.UMLRTPackage#getModel_ActiveCapsule()
	 * @model
	 * @generated
	 */
	Capsule getActiveCapsule();

	/**
	 * Sets the value of the '{@link UMLRT.Model#getActiveCapsule <em>Active Capsule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Capsule</em>' reference.
	 * @see #getActiveCapsule()
	 * @generated
	 */
	void setActiveCapsule(Capsule value);

} // Model
