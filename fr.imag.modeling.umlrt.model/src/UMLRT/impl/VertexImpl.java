/**
 */
package UMLRT.impl;

import UMLRT.StateMachine;
import UMLRT.Transition;
import UMLRT.UMLRTPackage;
import UMLRT.Vertex;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UMLRT.impl.VertexImpl#getIntrans <em>Intrans</em>}</li>
 *   <li>{@link UMLRT.impl.VertexImpl#getOuttrans <em>Outtrans</em>}</li>
 *   <li>{@link UMLRT.impl.VertexImpl#getOwningsm <em>Owningsm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertexImpl extends MinimalEObjectImpl.Container implements Vertex {
	/**
	 * The cached value of the '{@link #getIntrans() <em>Intrans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntrans()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> intrans;

	/**
	 * The cached value of the '{@link #getOuttrans() <em>Outtrans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuttrans()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outtrans;

	/**
	 * The cached value of the '{@link #getOwningsm() <em>Owningsm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningsm()
	 * @generated
	 * @ordered
	 */
	protected StateMachine owningsm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLRTPackage.Literals.VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIntrans() {
		if (intrans == null) {
			intrans = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, UMLRTPackage.VERTEX__INTRANS, UMLRTPackage.TRANSITION__DESTINATION);
		}
		return intrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOuttrans() {
		if (outtrans == null) {
			outtrans = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, UMLRTPackage.VERTEX__OUTTRANS, UMLRTPackage.TRANSITION__SOURCE);
		}
		return outtrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getOwningsm() {
		if (owningsm != null && owningsm.eIsProxy()) {
			InternalEObject oldOwningsm = (InternalEObject)owningsm;
			owningsm = (StateMachine)eResolveProxy(oldOwningsm);
			if (owningsm != oldOwningsm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLRTPackage.VERTEX__OWNINGSM, oldOwningsm, owningsm));
			}
		}
		return owningsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetOwningsm() {
		return owningsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningsm(StateMachine newOwningsm) {
		StateMachine oldOwningsm = owningsm;
		owningsm = newOwningsm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLRTPackage.VERTEX__OWNINGSM, oldOwningsm, owningsm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLRTPackage.VERTEX__INTRANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntrans()).basicAdd(otherEnd, msgs);
			case UMLRTPackage.VERTEX__OUTTRANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOuttrans()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLRTPackage.VERTEX__INTRANS:
				return ((InternalEList<?>)getIntrans()).basicRemove(otherEnd, msgs);
			case UMLRTPackage.VERTEX__OUTTRANS:
				return ((InternalEList<?>)getOuttrans()).basicRemove(otherEnd, msgs);
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
			case UMLRTPackage.VERTEX__INTRANS:
				return getIntrans();
			case UMLRTPackage.VERTEX__OUTTRANS:
				return getOuttrans();
			case UMLRTPackage.VERTEX__OWNINGSM:
				if (resolve) return getOwningsm();
				return basicGetOwningsm();
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
			case UMLRTPackage.VERTEX__INTRANS:
				getIntrans().clear();
				getIntrans().addAll((Collection<? extends Transition>)newValue);
				return;
			case UMLRTPackage.VERTEX__OUTTRANS:
				getOuttrans().clear();
				getOuttrans().addAll((Collection<? extends Transition>)newValue);
				return;
			case UMLRTPackage.VERTEX__OWNINGSM:
				setOwningsm((StateMachine)newValue);
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
			case UMLRTPackage.VERTEX__INTRANS:
				getIntrans().clear();
				return;
			case UMLRTPackage.VERTEX__OUTTRANS:
				getOuttrans().clear();
				return;
			case UMLRTPackage.VERTEX__OWNINGSM:
				setOwningsm((StateMachine)null);
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
			case UMLRTPackage.VERTEX__INTRANS:
				return intrans != null && !intrans.isEmpty();
			case UMLRTPackage.VERTEX__OUTTRANS:
				return outtrans != null && !outtrans.isEmpty();
			case UMLRTPackage.VERTEX__OWNINGSM:
				return owningsm != null;
		}
		return super.eIsSet(featureID);
	}

} //VertexImpl
