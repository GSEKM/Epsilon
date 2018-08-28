/**
 */
package Acessibilidade;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Acessibilidade.Widget#getId <em>Id</em>}</li>
 *   <li>{@link Acessibilidade.Widget#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link Acessibilidade.Widget#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link Acessibilidade.Widget#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link Acessibilidade.Widget#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link Acessibilidade.Widget#getWidth <em>Width</em>}</li>
 *   <li>{@link Acessibilidade.Widget#getHeight <em>Height</em>}</li>
 *   <li>{@link Acessibilidade.Widget#getContentDescription <em>Content Description</em>}</li>
 * </ul>
 *
 * @see Acessibilidade.AcessibilidadePackage#getWidget()
 * @model annotation="gmf.node figure='figures.PersonFigure' label.icon='false' label='contentDescription' label.placement='external'"
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Acessibilidade.AcessibilidadePackage#getWidget_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Acessibilidade.Widget#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Top</em>' attribute.
	 * @see #setMarginTop(int)
	 * @see Acessibilidade.AcessibilidadePackage#getWidget_MarginTop()
	 * @model
	 * @generated
	 */
	int getMarginTop();

	/**
	 * Sets the value of the '{@link Acessibilidade.Widget#getMarginTop <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Top</em>' attribute.
	 * @see #getMarginTop()
	 * @generated
	 */
	void setMarginTop(int value);

	/**
	 * Returns the value of the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Bottom</em>' attribute.
	 * @see #setMarginBottom(int)
	 * @see Acessibilidade.AcessibilidadePackage#getWidget_MarginBottom()
	 * @model
	 * @generated
	 */
	int getMarginBottom();

	/**
	 * Sets the value of the '{@link Acessibilidade.Widget#getMarginBottom <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Bottom</em>' attribute.
	 * @see #getMarginBottom()
	 * @generated
	 */
	void setMarginBottom(int value);

	/**
	 * Returns the value of the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Left</em>' attribute.
	 * @see #setMarginLeft(int)
	 * @see Acessibilidade.AcessibilidadePackage#getWidget_MarginLeft()
	 * @model
	 * @generated
	 */
	int getMarginLeft();

	/**
	 * Sets the value of the '{@link Acessibilidade.Widget#getMarginLeft <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Left</em>' attribute.
	 * @see #getMarginLeft()
	 * @generated
	 */
	void setMarginLeft(int value);

	/**
	 * Returns the value of the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Right</em>' attribute.
	 * @see #setMarginRight(int)
	 * @see Acessibilidade.AcessibilidadePackage#getWidget_MarginRight()
	 * @model
	 * @generated
	 */
	int getMarginRight();

	/**
	 * Sets the value of the '{@link Acessibilidade.Widget#getMarginRight <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Right</em>' attribute.
	 * @see #getMarginRight()
	 * @generated
	 */
	void setMarginRight(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see Acessibilidade.AcessibilidadePackage#getWidget_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link Acessibilidade.Widget#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see Acessibilidade.AcessibilidadePackage#getWidget_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link Acessibilidade.Widget#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Description</em>' attribute.
	 * @see #setContentDescription(String)
	 * @see Acessibilidade.AcessibilidadePackage#getWidget_ContentDescription()
	 * @model
	 * @generated
	 */
	String getContentDescription();

	/**
	 * Sets the value of the '{@link Acessibilidade.Widget#getContentDescription <em>Content Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Description</em>' attribute.
	 * @see #getContentDescription()
	 * @generated
	 */
	void setContentDescription(String value);

} // Widget
