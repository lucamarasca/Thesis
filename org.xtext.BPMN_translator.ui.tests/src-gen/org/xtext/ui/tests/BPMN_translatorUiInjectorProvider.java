/*
 * generated by Xtext 2.23.0
 */
package org.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.BPMN_translator.ui.internal.BPMN_translatorActivator;

public class BPMN_translatorUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BPMN_translatorActivator.getInstance().getInjector("org.xtext.BPMN_translator");
	}

}
