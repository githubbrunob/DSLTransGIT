/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.ui.launch;

/**
 * A class that provides the tabs for the launch configuration.
 */
public class PlLaunchConfigurationTabGroup extends org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup {
	
	public void createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog dialog, String mode) {
		// Set the overrideLaunchConfigurationTabGroup option to false to implement this
		// method.
		setTabs(new org.eclipse.debug.ui.ILaunchConfigurationTab[] {new mprolog.resource.pl.ui.launch.PlLaunchConfigurationMainTab()});
	}
	
}
