/*
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DemoFkdStandaloneSetup extends DemoFkdStandaloneSetupGenerated {

	public static void doSetup() {
		new DemoFkdStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}