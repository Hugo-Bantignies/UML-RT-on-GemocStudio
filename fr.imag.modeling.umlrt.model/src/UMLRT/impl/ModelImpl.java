/**
 */
package UMLRT.impl;

import UMLRT.Capsule;
import UMLRT.Message;
import UMLRT.Model;
import UMLRT.Protocol;
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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UMLRT.impl.ModelImpl#getCapsules <em>Capsules</em>}</li>
 *   <li>{@link UMLRT.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link UMLRT.impl.ModelImpl#getTop <em>Top</em>}</li>
 *   <li>{@link UMLRT.impl.ModelImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link UMLRT.impl.ModelImpl#getInputMessage <em>Input Message</em>}</li>
 *   <li>{@link UMLRT.impl.ModelImpl#getActiveCapsule <em>Active Capsule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getCapsules() <em>Capsules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapsules()
	 * @generated
	 * @ordered
	 */
	protected EList<Capsule> capsules;

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
	 * The cached value of the '{@link #getTop() <em>Top</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected Capsule top;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> protocol;

	/**
	 * The cached value of the '{@link #getInputMessage() <em>Input Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputMessage()
	 * @generated
	 * @ordered
	 */
	protected Message inputMessage;

	/**
	 * The cached value of the '{@link #getActiveCapsule() <em>Active Capsule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveCapsule()
	 * @generated
	 * @ordered
	 */
	protected Capsule activeCapsule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRTPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capsule> getCapsules() {
		if (capsules == null) {
			capsules = new EObjectContainmentEList<Capsule>(Capsule.class, this, UMLRTPackage.MODEL__CAPSULES);
		}
		return capsules;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRTPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capsule getTop() {
		if (top != null && top.eIsProxy()) {
			InternalEObject oldTop = (InternalEObject)top;
			top = (Capsule)eResolveProxy(oldTop);
			if (top != oldTop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRTPackage.MODEL__TOP, oldTop, top));
			}
		}
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capsule basicGetTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(Capsule newTop) {
		Capsule oldTop = top;
		top = newTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRTPackage.MODEL__TOP, oldTop, top));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Protocol> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectContainmentEList<Protocol>(Protocol.class, this, UMLRTPackage.MODEL__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getInputMessage() {
		if (inputMessage != null && inputMessage.eIsProxy()) {
			InternalEObject oldInputMessage = (InternalEObject)inputMessage;
			inputMessage = (Message)eResolveProxy(oldInputMessage);
			if (inputMessage != oldInputMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRTPackage.MODEL__INPUT_MESSAGE, oldInputMessage, inputMessage));
			}
		}
		return inputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetInputMessage() {
		return inputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputMessage(Message newInputMessage) {
		Message oldInputMessage = inputMessage;
		inputMessage = newInputMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRTPackage.MODEL__INPUT_MESSAGE, oldInputMessage, inputMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capsule getActiveCapsule() {
		if (activeCapsule != null && activeCapsule.eIsProxy()) {
			InternalEObject oldActiveCapsule = (InternalEObject)activeCapsule;
			activeCapsule = (Capsule)eResolveProxy(oldActiveCapsule);
			if (activeCapsule != oldActiveCapsule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRTPackage.MODEL__ACTIVE_CAPSULE, oldActiveCapsule, activeCapsule));
			}
		}
		return activeCapsule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capsule basicGetActiveCapsule() {
		return activeCapsule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveCapsule(Capsule newActiveCapsule) {
		Capsule oldActiveCapsule = activeCapsule;
		activeCapsule = newActiveCapsule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRTPackage.MODEL__ACTIVE_CAPSULE, oldActiveCapsule, activeCapsule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLRTPackage.MODEL__CAPSULES:
				return ((InternalEList<?>)getCapsules()).basicRemove(otherEnd, msgs);
			case UMLRTPackage.MODEL__PROTOCOL:
				return ((InternalEList<?>)getProtocol()).basicRemove(otherEnd, msgs);
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
			case UMLRTPackage.MODEL__CAPSULES:
				return getCapsules();
			case UMLRTPackage.MODEL__NAME:
				return getName();
			case UMLRTPackage.MODEL__TOP:
				if (resolve) return getTop();
				return basicGetTop();
			case UMLRTPackage.MODEL__PROTOCOL:
				return getProtocol();
			case UMLRTPackage.MODEL__INPUT_MESSAGE:
				if (resolve) return getInputMessage();
				return basicGetInputMessage();
			case UMLRTPackage.MODEL__ACTIVE_CAPSULE:
				if (resolve) return getActiveCapsule();
				return basicGetActiveCapsule();
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
			case UMLRTPackage.MODEL__CAPSULES:
				getCapsules().clear();
				getCapsules().addAll((Collection<? extends Capsule>)newValue);
				return;
			case UMLRTPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case UMLRTPackage.MODEL__TOP:
				setTop((Capsule)newValue);
				return;
			case UMLRTPackage.MODEL__PROTOCOL:
				getProtocol().clear();
				getProtocol().addAll((Collection<? extends Protocol>)newValue);
				return;
			case UMLRTPackage.MODEL__INPUT_MESSAGE:
				setInputMessage((Message)newValue);
				return;
			case UMLRTPackage.MODEL__ACTIVE_CAPSULE:
				setActiveCapsule((Capsule)newValue);
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
			case UMLRTPackage.MODEL__CAPSULES:
				getCapsules().clear();
				return;
			case UMLRTPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UMLRTPackage.MODEL__TOP:
				setTop((Capsule)null);
				return;
			case UMLRTPackage.MODEL__PROTOCOL:
				getProtocol().clear();
				return;
			case UMLRTPackage.MODEL__INPUT_MESSAGE:
				setInputMessage((Message)null);
				return;
			case UMLRTPackage.MODEL__ACTIVE_CAPSULE:
				setActiveCapsule((Capsule)null);
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
			case UMLRTPackage.MODEL__CAPSULES:
				return capsules != null && !capsules.isEmpty();
			case UMLRTPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UMLRTPackage.MODEL__TOP:
				return top != null;
			case UMLRTPackage.MODEL__PROTOCOL:
				return protocol != null && !protocol.isEmpty();
			case UMLRTPackage.MODEL__INPUT_MESSAGE:
				return inputMessage != null;
			case UMLRTPackage.MODEL__ACTIVE_CAPSULE:
				return activeCapsule != null;
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

} //ModelImpl
