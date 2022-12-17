/*
 * generated by Xtext 2.28.0
 */
package com.epistimis.face.template.ide;

import com.epistimis.face.template.TemplateRuntimeModule;
import com.epistimis.face.template.TemplateStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class TemplateIdeSetup extends TemplateStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new TemplateRuntimeModule(), new TemplateIdeModule()));
	}
	
}
