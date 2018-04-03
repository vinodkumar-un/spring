package com.redbus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.redbus.command.JourneyCommand;
import com.redbus.dto.JourneyDto;
import com.redbus.service.ManageJourneyService;

public class EditJourneyFormController extends SimpleFormController {
	private ManageJourneyService manageJourneyService;

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		int journeyId = 0;
		JourneyDto journeyDto = null;
		JourneyCommand jCommand = null;

		journeyId = Integer.parseInt(request.getParameter("jId"));
		journeyDto = manageJourneyService.getJourney(journeyId);

		jCommand = new JourneyCommand();
		jCommand.setJourneyId(journeyDto.getJourneyId());
		jCommand.setSource(journeyDto.getSource());
		jCommand.setDestination(journeyDto.getDestination());
		jCommand.setJourneyDate(journeyDto.getJourneyDate());
		jCommand.setAmount(journeyDto.getAmount());

		return jCommand;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		JourneyCommand journeyCommand = null;
		ModelAndView mav = null;

		journeyCommand = (JourneyCommand) command;
		manageJourneyService.updateJourney(journeyCommand);

		mav = new ModelAndView();
		mav.setViewName("redirect:/journeys.htm");

		return mav;
	}

	public void setManageJourneyService(
			ManageJourneyService manageJourneyService) {
		this.manageJourneyService = manageJourneyService;
	}

}
