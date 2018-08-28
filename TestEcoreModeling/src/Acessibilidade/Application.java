/**
 */
package Acessibilidade;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Acessibilidade.Application#getNomeProjeto <em>Nome Projeto</em>}</li>
 *   <li>{@link Acessibilidade.Application#getWindows <em>Windows</em>}</li>
 * </ul>
 *
 * @see Acessibilidade.AcessibilidadePackage#getApplication()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome Projeto</b></em>' attribute.
	 * The default value is <code>"MyProject"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Projeto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Projeto</em>' attribute.
	 * @see #setNomeProjeto(String)
	 * @see Acessibilidade.AcessibilidadePackage#getApplication_NomeProjeto()
	 * @model default="MyProject" id="true" volatile="true"
	 * @generated
	 */
	String getNomeProjeto();

	/**
	 * Sets the value of the '{@link Acessibilidade.Application#getNomeProjeto <em>Nome Projeto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Projeto</em>' attribute.
	 * @see #getNomeProjeto()
	 * @generated
	 */
	void setNomeProjeto(String value);

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
	 * The list contents are of type {@link Acessibilidade.Window}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference list.
	 * @see Acessibilidade.AcessibilidadePackage#getApplication_Windows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Window> getWindows();

} // Application
