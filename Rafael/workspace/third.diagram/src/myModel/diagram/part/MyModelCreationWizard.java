/*
 * 
 */
package myModel.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class MyModelCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected myModel.diagram.part.MyModelCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected myModel.diagram.part.MyModelCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(myModel.diagram.part.Messages.MyModelCreationWizardTitle);
		setDefaultPageImageDescriptor(myModel.diagram.part.MyModelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewMyModelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new myModel.diagram.part.MyModelCreationWizardPage("DiagramModelFile", getSelection(), //$NON-NLS-1$
				"mymodel_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(myModel.diagram.part.Messages.MyModelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(myModel.diagram.part.Messages.MyModelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new myModel.diagram.part.MyModelCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"mymodel") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".mymodel_diagram".length()); //$NON-NLS-1$
					setFileName(myModel.diagram.part.MyModelDiagramEditorUtil.getUniqueFileName(getContainerFullPath(),
							fileName, "mymodel")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(myModel.diagram.part.Messages.MyModelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(myModel.diagram.part.Messages.MyModelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = myModel.diagram.part.MyModelDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						myModel.diagram.part.MyModelDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								myModel.diagram.part.Messages.MyModelCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						myModel.diagram.part.Messages.MyModelCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				myModel.diagram.part.MyModelDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
