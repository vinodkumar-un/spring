package com.rb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.rb.dto.QuickJourneyDto;
import com.rb.service.ManageJourneyService;

public class QuickJourneyController extends AbstractController {
	private ManageJourneyService manageJourneyService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<QuickJourneyDto> journeys = null;
		ModelAndView mav = null;

		mav = new ModelAndView();
		journeys = manageJourneyService.getQuickJourneys();
		mav.addObject("journeys", journeys);
		mav.setViewName("quick-journeys");

		return mav;
	}

	public void setManageJourneyService(
			ManageJourneyService manageJourneyService) {
		this.manageJourneyService = manageJourneyService;
	}

}
