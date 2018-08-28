
/*
 * 
 */
package Acessibilidade.diagram.part;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;

/**
 * @generated
 */
public class AcessibilidadePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Acessibilidade.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createButton1CreationTool());
		paletteContainer.add(createComboBox2CreationTool());
		paletteContainer.add(createImage3CreationTool());
		paletteContainer.add(createImageButton4CreationTool());
		paletteContainer.add(createInput5CreationTool());
		paletteContainer.add(createOutput6CreationTool());
		paletteContainer.add(createRadioGroup7CreationTool());
		paletteContainer.add(createText_Input8CreationTool());
		paletteContainer.add(createText_Output9CreationTool());
		paletteContainer.add(createWidget10CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton1CreationTool() {
		ToolEntry entry = new ToolEntry(Acessibilidade.diagram.part.Messages.Button1CreationTool_title,
				Acessibilidade.diagram.part.Messages.Button1CreationTool_desc, null, null) {
		};
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComboBox2CreationTool() {
		ToolEntry entry = new ToolEntry(Acessibilidade.diagram.part.Messages.ComboBox2CreationTool_title,
				Acessibilidade.diagram.part.Messages.ComboBox2CreationTool_desc, null, null) {
		};
		entry.setId("createComboBox2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImage3CreationTool() {
		ToolEntry entry = new ToolEntry(Acessibilidade.diagram.part.Messages.Image3CreationTool_title,
				Acessibilidade.diagram.part.Messages.Image3CreationTool_desc, null, null) {
		};
		entry.setId("createImage3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImageButton4CreationTool() {
		ToolEntry entry = new ToolEntry(Acessibilidade.diagram.part.Messages.ImageButton4CreationTool_title,
				Acessibilidade.diagram.part.Messages.ImageButton4CreationTool_desc, null, null) {
		};
		entry.setId("createImageButton4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInput5CreationTool() {
		ToolEntry entry = new ToolEntry(Acessibilidade.diagram.part.Messages.Input5CreationTool_title,
				Acessibilidade.diagram.part.Messages.Input5CreationTool_desc, null, null) {
		};
		entry.setId("createInput5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutput6CreationTool() {
		ToolEntry entry = new ToolEntry(Acessibilidade.diagram.part.Messages.Output6CreationTool_title,
				Acessibilidade.diagram.part.Messages.Output6CreationTool_desc, null, null) {
		};
		entry.setId("createOutput6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadioGroup7CreationTool() {
		ToolEntry entry = new ToolEntry(Acessibilidade.diagram.part.Messages.RadioGroup7CreationTool_title,
				Acessibilidade.diagram.part.Messages.RadioGroup7CreationTool_desc, null, null) {
		};
		entry.setId("createRadioGroup7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createText_Input8CreationTool() {
		ToolEntry entry = new ToolEntry(Acessibilidade.diagram.part.Messages.Text_Input8CreationTool_title,
				Acessibilidade.diagram.part.Messages.Text_Input8CreationTool_desc, null, null) {
		};
		entry.setId("createText_Input8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createText_Output9CreationTool() {
		ToolEntry entry = new ToolEntry(Acessibilidade.diagram.part.Messages.Text_Output9CreationTool_title,
				Acessibilidade.diagram.part.Messages.Text_Output9CreationTool_desc, null, null) {
		};
		entry.setId("createText_Output9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWidget10CreationTool() {
		ToolEntry entry = new ToolEntry(Acessibilidade.diagram.part.Messages.Widget10CreationTool_title,
				Acessibilidade.diagram.part.Messages.Widget10CreationTool_desc, null, null) {
		};
		entry.setId("createWidget10CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
