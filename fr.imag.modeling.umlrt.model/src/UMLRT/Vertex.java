/**
 */
package UMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UMLRT.Vertex#getIntrans <em>Intrans</em>}</li>
 *   <li>{@link UMLRT.Vertex#getOuttrans <em>Outtrans</em>}</li>
 *   <li>{@link UMLRT.Vertex#getOwningsm <em>Owningsm</em>}</li>
 * </ul>
 *
 * @see UMLRT.UMLRTPackage#getVertex()
 * @model
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Intrans</b></em>' reference list.
	 * The list contents are of type {@link UMLRT.Transition}.
	 * It is bidirectional and its opposite is '{@link UMLRT.Transition#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intrans</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intrans</em>' reference list.
	 * @see UMLRT.UMLRTPackage#getVertex_Intrans()
	 * @see UMLRT.Transition#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<Transition> getIntrans();

	/**
	 * Returns the value of the '<em><b>Outtrans</b></em>' reference list.
	 * The list contents are of type {@link UMLRT.Transition}.
	 * It is bidirectional and its opposite is '{@link UMLRT.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outtrans</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outtrans</em>' reference list.
	 * @see UMLRT.UMLRTPackage#getVertex_Outtrans()
	 * @see UMLRT.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOuttrans();

	/**
	 * Returns the value of the '<em><b>Owningsm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owningsm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owningsm</em>' reference.
	 * @see #setOwningsm(StateMachine)
	 * @see UMLRT.UMLRTPackage#getVertex_Owningsm()
	 * @model required="true"
	 * @generated
	 */
	StateMachine getOwningsm();

	/**
	 * Sets the value of the '{@link UMLRT.Vertex#getOwningsm <em>Owningsm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owningsm</em>' reference.
	 * @see #getOwningsm()
	 * @generated
	 */
	void setOwningsm(StateMachine value);

} // Vertex
