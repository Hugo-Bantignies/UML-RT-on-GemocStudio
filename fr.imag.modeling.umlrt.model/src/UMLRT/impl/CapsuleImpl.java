/**
 */
package UMLRT.impl;

import UMLRT.Capsule;
import UMLRT.CapsulePart;
import UMLRT.Connector;
import UMLRT.Port;
import UMLRT.StateMachine;
import UMLRT.UMLRTPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capsule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UMLRT.impl.CapsuleImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link UMLRT.impl.CapsuleImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link UMLRT.impl.CapsuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link UMLRT.impl.CapsuleImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link UMLRT.impl.CapsuleImpl#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapsuleImpl extends MinimalEObjectImpl.Container implements Capsule {
	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<CapsulePart> parts;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

	/**
	 * The cached value of the '{@link #getStatemachine() <em>Statemachine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatemachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine statemachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapsuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRTPackage.Literals.CAPSULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapsulePart> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<CapsulePart>(CapsulePart.class, this, UMLRTPackage.CAPSULE__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, UMLRTPackage.CAPSULE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRTPackage.CAPSULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<Connector>(Connector.class, this, UMLRTPackage.CAPSULE__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStatemachine() {
		return statemachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatemachine(StateMachine newStatemachine, NotificationChain msgs) {
		StateMachine oldStatemachine = statemachine;
		statemachine = newStatemachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLRTPackage.CAPSULE__STATEMACHINE, oldStatemachine, newStatemachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatemachine(StateMachine newStatemachine) {
		if (newStatemachine != statemachine) {
			NotificationChain msgs = null;
			if (statemachine != null)
				msgs = ((InternalEObject)statemachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UMLRTPackage.CAPSULE__STATEMACHINE, null, msgs);
			if (newStatemachine != null)
				msgs = ((InternalEObject)newStatemachine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UMLRTPackage.CAPSULE__STATEMACHINE, null, msgs);
			msgs = basicSetStatemachine(newStatemachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRTPackage.CAPSULE__STATEMACHINE, newStatemachine, newStatemachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLRTPackage.CAPSULE__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case UMLRTPackage.CAPSULE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case UMLRTPackage.CAPSULE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case UMLRTPackage.CAPSULE__STATEMACHINE:
				return basicSetStatemachine(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLRTPackage.CAPSULE__PARTS:
				return getParts();
			case UMLRTPackage.CAPSULE__PORTS:
				return getPorts();
			case UMLRTPackage.CAPSULE__NAME:
				return getName();
			case UMLRTPackage.CAPSULE__CONNECTOR:
				return getConnector();
			case UMLRTPackage.CAPSULE__STATEMACHINE:
				return getStatemachine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLRTPackage.CAPSULE__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends CapsulePart>)newValue);
				return;
			case UMLRTPackage.CAPSULE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case UMLRTPackage.CAPSULE__NAME:
				setName((String)newValue);
				return;
			case UMLRTPackage.CAPSULE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case UMLRTPackage.CAPSULE__STATEMACHINE:
				setStatemachine((StateMachine)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLRTPackage.CAPSULE__PARTS:
				getParts().clear();
				return;
			case UMLRTPackage.CAPSULE__PORTS:
				getPorts().clear();
				return;
			case UMLRTPackage.CAPSULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UMLRTPackage.CAPSULE__CONNECTOR:
				getConnector().clear();
				return;
			case UMLRTPackage.CAPSULE__STATEMACHINE:
				setStatemachine((StateMachine)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLRTPackage.CAPSULE__PARTS:
				return parts != null && !parts.isEmpty();
			case UMLRTPackage.CAPSULE__PORTS:
				return ports != null && !ports.isEmpty();
			case UMLRTPackage.CAPSULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UMLRTPackage.CAPSULE__CONNECTOR:
				return connector != null && !connector.isEmpty();
			case UMLRTPackage.CAPSULE__STATEMACHINE:
				return statemachine != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CapsuleImpl
