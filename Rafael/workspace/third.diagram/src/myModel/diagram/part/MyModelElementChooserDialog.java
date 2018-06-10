/*
 * 
 */
package myModel.diagram.part;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.part.DefaultElementChooserDialog;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;

/**
 * @generated
 */
public class MyModelElementChooserDialog extends DefaultElementChooserDialog {

	/**
	* @generated
	*/
	public MyModelElementChooserDialog(Shell parentShell, View view) {
		this(parentShell, view, false);
	}

	/**
	* @generated
	*/
	public MyModelElementChooserDialog(Shell parentShell, View view, boolean allowMultiSelection) {
		super(parentShell, view, new MyModelElementChooserDialogContextImpl(allowMultiSelection));
	}

	/**
	* @generated
	*/
	private static class MyModelElementChooserDialogContextImpl implements DefaultElementChooserDialog.Context {

		/**
		* @generated
		*/
		private static final String[] FILE_EXTENSIONS = new String[] { "myModel" };

		/**
		* @generated
		*/
		private final boolean myAllowMultiSelection;

		/**
		* @generated
		*/
		private MyModelElementChooserDialogContextImpl(boolean allowMultiSelection) {
			myAllowMultiSelection = allowMultiSelection;
		}

		/**
		* @generated
		*/
		@Override

		public AdapterFactory getAdapterFactory() {
			return myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
		}

		/**
		* @generated
		*/
		@Override

		public PreferencesHint getPreferenceHint() {
			return myModel.diagram.part.MyModelDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
		}

		/**
		* @generated
		*/
		@Override

		public String[] getFileExtesions() {
			return FILE_EXTENSIONS.clone();
		}

		/**
		* @generated
		*/
		@Override

		public String getDialogTitle() {
			return myModel.diagram.part.Messages.MyModelElementChooserDialog_SelectModelElementTitle;
		}

		/**
		* @generated
		*/
		@Override
		public ITreeContentProvider getTreeContentProvider() {
			return new BaseWorkbenchContentProvider();
		}

		/**
		* @generated
		*/
		public boolean allowMultiSelection() {
			return myAllowMultiSelection;
		}

	}

}
