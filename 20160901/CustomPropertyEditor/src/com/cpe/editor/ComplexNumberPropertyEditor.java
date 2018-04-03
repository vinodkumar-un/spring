package com.cpe.editor;

import java.beans.PropertyEditorSupport;

import com.cpe.beans.ComplexNumber;

public class ComplexNumberPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String value) throws IllegalArgumentException {
		ComplexNumber complexNumber = null;
		int base = 0;
		int expo = 0;
		String[] tokens = null;

		tokens = value.split(",");
		base = Integer.parseInt(tokens[0]);
		expo = Integer.parseInt(tokens[1]);
		complexNumber = new ComplexNumber();
		complexNumber.setBase(base);
		complexNumber.setExpo(expo);
		setValue(complexNumber);
	}

}
