/**
 */
package UMLRT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UMLRT.PseudoState#getName <em>Name</em>}</li>
 *   <li>{@link UMLRT.PseudoState#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see UMLRT.UMLRTPackage#getPseudoState()
 * @model
 * @generated
 */
public interface PseudoState extends Vertex {
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
	 * @see UMLRT.UMLRTPackage#getPseudoState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UMLRT.PseudoState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link UMLRT.PseudoStateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see UMLRT.PseudoStateType
	 * @see #setKind(PseudoStateType)
	 * @see UMLRT.UMLRTPackage#getPseudoState_Kind()
	 * @model
	 * @generated
	 */
	PseudoStateType getKind();

	/**
	 * Sets the value of the '{@link UMLRT.PseudoState#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see UMLRT.PseudoStateType
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudoStateType value);

} // PseudoState
