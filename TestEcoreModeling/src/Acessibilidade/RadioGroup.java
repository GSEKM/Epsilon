/**
 */
package Acessibilidade;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Acessibilidade.RadioGroup#getRadioButtons <em>Radio Buttons</em>}</li>
 * </ul>
 *
 * @see Acessibilidade.AcessibilidadePackage#getRadioGroup()
 * @model
 * @generated
 */
public interface RadioGroup extends Input {
	/**
	 * Returns the value of the '<em><b>Radio Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link Acessibilidade.RadioButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio Buttons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio Buttons</em>' containment reference list.
	 * @see Acessibilidade.AcessibilidadePackage#getRadioGroup_RadioButtons()
	 * @model containment="true"
	 * @generated
	 */
	EList<RadioButton> getRadioButtons();

} // RadioGroup
