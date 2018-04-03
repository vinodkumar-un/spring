package com.rb.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.rb.form.JourneyForm;

@Component
public class JourneyFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(JourneyForm.class);
	}

	@Override
	public void validate(Object object, Errors errors) {
		JourneyForm form = null;

		form = (JourneyForm) object;
		if (form.getSource() == null || form.getSource().trim().length() <= 0) {
			errors.rejectValue("source", "source.blank");
		}
		if (form.getDestination() == null
				|| form.getDestination().trim().length() <= 0) {
			errors.rejectValue("destination", "destination.blank");
		}

		if (form.getAmount() <= 0) {
			errors.rejectValue("amount", "amount.invalid");
		}
	}

}
