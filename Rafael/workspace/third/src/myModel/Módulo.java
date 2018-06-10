/**
 */
package myModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Módulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myModel.Módulo#getMódulos <em>Módulos</em>}</li>
 * </ul>
 *
 * @see myModel.MyModelPackage#getMódulo()
 * @model abstract="true"
 *        annotation="gmf.link label='test' source='source' target='target' style='dot'"
 * @generated
 */
public interface Módulo extends EObject {
	/**
	 * Returns the value of the '<em><b>Módulos</b></em>' reference list.
	 * The list contents are of type {@link myModel.Arduino}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Módulos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Módulos</em>' reference list.
	 * @see myModel.MyModelPackage#getMódulo_Módulos()
	 * @model
	 * @generated
	 */
	EList<Arduino> getMódulos();

} // Módulo
