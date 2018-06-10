
/*
 * 
 */
package myModel.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class MyModelPaletteFactory {

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
		PaletteDrawer paletteContainer = new PaletteDrawer(myModel.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createModule1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createModule1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(myModel.diagram.part.Messages.Module1CreationTool_title,
				myModel.diagram.part.Messages.Module1CreationTool_desc,
				Collections.singletonList(myModel.diagram.providers.MyModelElementTypes.Module_2001));
		entry.setId("createModule1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(myModel.diagram.providers.MyModelElementTypes
				.getImageDescriptor(myModel.diagram.providers.MyModelElementTypes.Module_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
