package com.redbus.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.redbus.dto.JourneyDto;
import com.redbus.service.ManageJourneyService;

public class ListJouneysController extends AbstractController {
	private ManageJourneyService manageJourneyService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<JourneyDto> journeys = null;
		ModelAndView mav = null;

		journeys = manageJourneyService.getJourneys();
		mav = new ModelAndView();
		mav.addObject("journeys", journeys);
		mav.setViewName("journeys");

		return mav;
	}

	public void setManageJourneyService(
			ManageJourneyService manageJourneyService) {
		this.manageJourneyService = manageJourneyService;
	}

}
