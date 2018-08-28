/**
 */
package Acessibilidade.impl;

import Acessibilidade.AcessibilidadePackage;
import Acessibilidade.Widget;
import Acessibilidade.Window;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Acessibilidade.impl.WindowImpl#getId <em>Id</em>}</li>
 *   <li>{@link Acessibilidade.impl.WindowImpl#isIsLaucher <em>Is Laucher</em>}</li>
 *   <li>{@link Acessibilidade.impl.WindowImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowImpl extends EObjectImpl implements Window {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLaucher() <em>Is Laucher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLaucher()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LAUCHER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsLaucher() <em>Is Laucher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLaucher()
	 * @generated
	 * @ordered
	 */
	protected boolean isLaucher = IS_LAUCHER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<Widget> widgets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcessibilidadePackage.Literals.WINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.WINDOW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLaucher() {
		return isLaucher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLaucher(boolean newIsLaucher) {
		boolean oldIsLaucher = isLaucher;
		isLaucher = newIsLaucher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.WINDOW__IS_LAUCHER, oldIsLaucher, isLaucher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Widget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<Widget>(Widget.class, this, AcessibilidadePackage.WINDOW__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcessibilidadePackage.WINDOW__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
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
			case AcessibilidadePackage.WINDOW__ID:
				return getId();
			case AcessibilidadePackage.WINDOW__IS_LAUCHER:
				return isIsLaucher();
			case AcessibilidadePackage.WINDOW__WIDGETS:
				return getWidgets();
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
			case AcessibilidadePackage.WINDOW__ID:
				setId((String)newValue);
				return;
			case AcessibilidadePackage.WINDOW__IS_LAUCHER:
				setIsLaucher((Boolean)newValue);
				return;
			case AcessibilidadePackage.WINDOW__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends Widget>)newValue);
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
			case AcessibilidadePackage.WINDOW__ID:
				setId(ID_EDEFAULT);
				return;
			case AcessibilidadePackage.WINDOW__IS_LAUCHER:
				setIsLaucher(IS_LAUCHER_EDEFAULT);
				return;
			case AcessibilidadePackage.WINDOW__WIDGETS:
				getWidgets().clear();
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
			case AcessibilidadePackage.WINDOW__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AcessibilidadePackage.WINDOW__IS_LAUCHER:
				return isLaucher != IS_LAUCHER_EDEFAULT;
			case AcessibilidadePackage.WINDOW__WIDGETS:
				return widgets != null && !widgets.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", isLaucher: ");
		result.append(isLaucher);
		result.append(')');
		return result.toString();
	}

} //WindowImpl
