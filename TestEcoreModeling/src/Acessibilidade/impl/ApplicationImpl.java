/**
 */
package Acessibilidade.impl;

import Acessibilidade.AcessibilidadePackage;
import Acessibilidade.Application;
import Acessibilidade.Window;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Acessibilidade.impl.ApplicationImpl#getNomeProjeto <em>Nome Projeto</em>}</li>
 *   <li>{@link Acessibilidade.impl.ApplicationImpl#getWindows <em>Windows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The default value of the '{@link #getNomeProjeto() <em>Nome Projeto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeProjeto()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_PROJETO_EDEFAULT = "MyProject";

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<Window> windows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AcessibilidadePackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomeProjeto() {
		// TODO: implement this method to return the 'Nome Projeto' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeProjeto(String newNomeProjeto) {
		// TODO: implement this method to set the 'Nome Projeto' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Window> getWindows() {
		if (windows == null) {
			windows = new EObjectContainmentEList<Window>(Window.class, this, AcessibilidadePackage.APPLICATION__WINDOWS);
		}
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AcessibilidadePackage.APPLICATION__WINDOWS:
				return ((InternalEList<?>)getWindows()).basicRemove(otherEnd, msgs);
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
			case AcessibilidadePackage.APPLICATION__NOME_PROJETO:
				return getNomeProjeto();
			case AcessibilidadePackage.APPLICATION__WINDOWS:
				return getWindows();
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
			case AcessibilidadePackage.APPLICATION__NOME_PROJETO:
				setNomeProjeto((String)newValue);
				return;
			case AcessibilidadePackage.APPLICATION__WINDOWS:
				getWindows().clear();
				getWindows().addAll((Collection<? extends Window>)newValue);
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
			case AcessibilidadePackage.APPLICATION__NOME_PROJETO:
				setNomeProjeto(NOME_PROJETO_EDEFAULT);
				return;
			case AcessibilidadePackage.APPLICATION__WINDOWS:
				getWindows().clear();
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
			case AcessibilidadePackage.APPLICATION__NOME_PROJETO:
				return NOME_PROJETO_EDEFAULT == null ? getNomeProjeto() != null : !NOME_PROJETO_EDEFAULT.equals(getNomeProjeto());
			case AcessibilidadePackage.APPLICATION__WINDOWS:
				return windows != null && !windows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
