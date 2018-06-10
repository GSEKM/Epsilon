/*
 * 
 */
package myModel.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		myModel.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		myModel.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		myModel.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		myModel.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		myModel.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
