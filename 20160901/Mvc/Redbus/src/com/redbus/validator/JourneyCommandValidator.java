package com.redbus.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.redbus.command.JourneyCommand;

public class JourneyCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		if (classType.isAssignableFrom(JourneyCommand.class)) {
			return true;
		}
		return false;
	}

	@Override
	public void validate(Object command, Errors errors) {
		JourneyCommand jCommand = null;

		jCommand = (JourneyCommand) command;
		if (jCommand.getSource() == null
				|| "".equals(jCommand.getSource().trim())) {
			errors.rejectValue("source", "source.blank");
		}
		if (jCommand.getDestination() == null
				|| "".equals(jCommand.getDestination().trim())) {
			errors.rejectValue("destination", "dest.blank");
		}
		if (jCommand.getJourneyDate() == null) {
			errors.rejectValue("journeyDate", "journeyDt.invalid");
		}
		if (jCommand.getAmount() <= 0) {
			errors.rejectValue("amount", "amount.invalid");
		}
	}

}
