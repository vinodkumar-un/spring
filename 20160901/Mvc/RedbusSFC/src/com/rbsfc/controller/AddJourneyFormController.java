package com.rbsfc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.rbsfc.command.JourneyCommand;

public class AddJourneyFormController extends SimpleFormController {
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		ModelAndView mav = null;
		JourneyCommand jCommand = null;

		jCommand = (JourneyCommand) command;
		mav = new ModelAndView();
		mav.addObject("source", jCommand.getSource());
		mav.setViewName("success");

		return mav;
	}
}
