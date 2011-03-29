/*
 * generated by Xtext
 */
package org.guicecon.modules.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.guicecon.modules.guiceModules.Binding;
import org.guicecon.modules.guiceModules.Key;
import org.guicecon.modules.guiceModules.Module;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class GuiceModulesLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public GuiceModulesLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(Module m) {
		return m.getName();
	}

	String text(Binding binding) {
		StringBuilder sb = new StringBuilder();
		Key key = binding.getFrom();
		if (key.getAnnotation()!=null) {
			sb.append("@").append(key.getAnnotation().getAnnotation().getSimpleName()).append(" ");
		}
		sb.append(key.getType().getSimpleName());
		return sb.toString();
	}
}