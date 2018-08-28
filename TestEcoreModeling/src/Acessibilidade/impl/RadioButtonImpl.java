/**
 */
package Acessibilidade.impl;

import Acessibilidade.AcessibilidadePackage;
import Acessibilidade.RadioButton;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Acessibilidade.impl.RadioButtonImpl#getId <em>Id</em>}</li>
 *   <li>{@link Acessibilidade.impl.RadioButtonImpl#getText <em>Text</em>}</li>
 *   <li>{@link Acessibilidade.impl.RadioButtonImpl#getContentDescription <em>Content Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RadioButtonImpl extends EObjectImpl implements RadioButton {
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentDescription() <em>Content Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentDescription() <em>Content Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDescription()
	 * @generated
	 * @ordered
	 */
	protected String contentDescription = CONTENT_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcessibilidadePackage.Literals.RADIO_BUTTON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.RADIO_BUTTON__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.RADIO_BUTTON__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentDescription() {
		return contentDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentDescription(String newContentDescription) {
		String oldContentDescription = contentDescription;
		contentDescription = newContentDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.RADIO_BUTTON__CONTENT_DESCRIPTION, oldContentDescription, contentDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcessibilidadePackage.RADIO_BUTTON__ID:
				return getId();
			case AcessibilidadePackage.RADIO_BUTTON__TEXT:
				return getText();
			case AcessibilidadePackage.RADIO_BUTTON__CONTENT_DESCRIPTION:
				return getContentDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AcessibilidadePackage.RADIO_BUTTON__ID:
				setId((String)newValue);
				return;
			case AcessibilidadePackage.RADIO_BUTTON__TEXT:
				setText((String)newValue);
				return;
			case AcessibilidadePackage.RADIO_BUTTON__CONTENT_DESCRIPTION:
				setContentDescription((String)newValue);
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
			case AcessibilidadePackage.RADIO_BUTTON__ID:
				setId(ID_EDEFAULT);
				return;
			case AcessibilidadePackage.RADIO_BUTTON__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case AcessibilidadePackage.RADIO_BUTTON__CONTENT_DESCRIPTION:
				setContentDescription(CONTENT_DESCRIPTION_EDEFAULT);
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
			case AcessibilidadePackage.RADIO_BUTTON__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AcessibilidadePackage.RADIO_BUTTON__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case AcessibilidadePackage.RADIO_BUTTON__CONTENT_DESCRIPTION:
				return CONTENT_DESCRIPTION_EDEFAULT == null ? contentDescription != null : !CONTENT_DESCRIPTION_EDEFAULT.equals(contentDescription);
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
		result.append(", text: ");
		result.append(text);
		result.append(", contentDescription: ");
		result.append(contentDescription);
		result.append(')');
		return result.toString();
	}

} //RadioButtonImpl
