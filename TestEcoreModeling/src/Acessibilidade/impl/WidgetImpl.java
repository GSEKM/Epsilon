/**
 */
package Acessibilidade.impl;

import Acessibilidade.AcessibilidadePackage;
import Acessibilidade.Widget;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Acessibilidade.impl.WidgetImpl#getId <em>Id</em>}</li>
 *   <li>{@link Acessibilidade.impl.WidgetImpl#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link Acessibilidade.impl.WidgetImpl#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link Acessibilidade.impl.WidgetImpl#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link Acessibilidade.impl.WidgetImpl#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link Acessibilidade.impl.WidgetImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link Acessibilidade.impl.WidgetImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link Acessibilidade.impl.WidgetImpl#getContentDescription <em>Content Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetImpl extends EObjectImpl implements Widget {
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
	 * The default value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_TOP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
	protected int marginTop = MARGIN_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_BOTTOM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
	protected int marginBottom = MARGIN_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
	protected int marginLeft = MARGIN_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginRight() <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginRight()
	 * @generated
	 * @ordered
	 */
	protected static final int MARGIN_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMarginRight() <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginRight()
	 * @generated
	 * @ordered
	 */
	protected int marginRight = MARGIN_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

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
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcessibilidadePackage.Literals.WIDGET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.WIDGET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginTop() {
		return marginTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginTop(int newMarginTop) {
		int oldMarginTop = marginTop;
		marginTop = newMarginTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.WIDGET__MARGIN_TOP, oldMarginTop, marginTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginBottom() {
		return marginBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginBottom(int newMarginBottom) {
		int oldMarginBottom = marginBottom;
		marginBottom = newMarginBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.WIDGET__MARGIN_BOTTOM, oldMarginBottom, marginBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginLeft() {
		return marginLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginLeft(int newMarginLeft) {
		int oldMarginLeft = marginLeft;
		marginLeft = newMarginLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.WIDGET__MARGIN_LEFT, oldMarginLeft, marginLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMarginRight() {
		return marginRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginRight(int newMarginRight) {
		int oldMarginRight = marginRight;
		marginRight = newMarginRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.WIDGET__MARGIN_RIGHT, oldMarginRight, marginRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.WIDGET__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.WIDGET__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AcessibilidadePackage.WIDGET__CONTENT_DESCRIPTION, oldContentDescription, contentDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AcessibilidadePackage.WIDGET__ID:
				return getId();
			case AcessibilidadePackage.WIDGET__MARGIN_TOP:
				return getMarginTop();
			case AcessibilidadePackage.WIDGET__MARGIN_BOTTOM:
				return getMarginBottom();
			case AcessibilidadePackage.WIDGET__MARGIN_LEFT:
				return getMarginLeft();
			case AcessibilidadePackage.WIDGET__MARGIN_RIGHT:
				return getMarginRight();
			case AcessibilidadePackage.WIDGET__WIDTH:
				return getWidth();
			case AcessibilidadePackage.WIDGET__HEIGHT:
				return getHeight();
			case AcessibilidadePackage.WIDGET__CONTENT_DESCRIPTION:
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
			case AcessibilidadePackage.WIDGET__ID:
				setId((String)newValue);
				return;
			case AcessibilidadePackage.WIDGET__MARGIN_TOP:
				setMarginTop((Integer)newValue);
				return;
			case AcessibilidadePackage.WIDGET__MARGIN_BOTTOM:
				setMarginBottom((Integer)newValue);
				return;
			case AcessibilidadePackage.WIDGET__MARGIN_LEFT:
				setMarginLeft((Integer)newValue);
				return;
			case AcessibilidadePackage.WIDGET__MARGIN_RIGHT:
				setMarginRight((Integer)newValue);
				return;
			case AcessibilidadePackage.WIDGET__WIDTH:
				setWidth((Integer)newValue);
				return;
			case AcessibilidadePackage.WIDGET__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case AcessibilidadePackage.WIDGET__CONTENT_DESCRIPTION:
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
			case AcessibilidadePackage.WIDGET__ID:
				setId(ID_EDEFAULT);
				return;
			case AcessibilidadePackage.WIDGET__MARGIN_TOP:
				setMarginTop(MARGIN_TOP_EDEFAULT);
				return;
			case AcessibilidadePackage.WIDGET__MARGIN_BOTTOM:
				setMarginBottom(MARGIN_BOTTOM_EDEFAULT);
				return;
			case AcessibilidadePackage.WIDGET__MARGIN_LEFT:
				setMarginLeft(MARGIN_LEFT_EDEFAULT);
				return;
			case AcessibilidadePackage.WIDGET__MARGIN_RIGHT:
				setMarginRight(MARGIN_RIGHT_EDEFAULT);
				return;
			case AcessibilidadePackage.WIDGET__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case AcessibilidadePackage.WIDGET__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case AcessibilidadePackage.WIDGET__CONTENT_DESCRIPTION:
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
			case AcessibilidadePackage.WIDGET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AcessibilidadePackage.WIDGET__MARGIN_TOP:
				return marginTop != MARGIN_TOP_EDEFAULT;
			case AcessibilidadePackage.WIDGET__MARGIN_BOTTOM:
				return marginBottom != MARGIN_BOTTOM_EDEFAULT;
			case AcessibilidadePackage.WIDGET__MARGIN_LEFT:
				return marginLeft != MARGIN_LEFT_EDEFAULT;
			case AcessibilidadePackage.WIDGET__MARGIN_RIGHT:
				return marginRight != MARGIN_RIGHT_EDEFAULT;
			case AcessibilidadePackage.WIDGET__WIDTH:
				return width != WIDTH_EDEFAULT;
			case AcessibilidadePackage.WIDGET__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case AcessibilidadePackage.WIDGET__CONTENT_DESCRIPTION:
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
		result.append(", marginTop: ");
		result.append(marginTop);
		result.append(", marginBottom: ");
		result.append(marginBottom);
		result.append(", marginLeft: ");
		result.append(marginLeft);
		result.append(", MarginRight: ");
		result.append(marginRight);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", contentDescription: ");
		result.append(contentDescription);
		result.append(')');
		return result.toString();
	}

} //WidgetImpl
