package com.cpe.registrar;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.cpe.beans.ComplexNumber;
import com.cpe.editor.ComplexNumberPropertyEditor;

public class ApplicationPropertyEditorRegistrar implements
		PropertyEditorRegistrar {
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(ComplexNumber.class,
				new ComplexNumberPropertyEditor());
	}
}
