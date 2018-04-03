package com.rw.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.rw.dto.JourneyDto;

public class ListJourneysController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<JourneyDto> journeys = null;
		ModelAndView mav = null;
		String page = "journeys";
		String view = null;

		journeys = new ArrayList<JourneyDto>();
		journeys.add(new JourneyDto("hyderabad", "banglore", 3335));
		journeys.add(new JourneyDto("banglore", "chennai", 3535));
		journeys.add(new JourneyDto("hyderabad", "pune", 6464));
		journeys.add(new JourneyDto("hyderabad", "goa", 9384));

		mav = new ModelAndView();
		mav.addObject("journeys", journeys);

		view = request.getParameter("view");
		if (view != null) {
			if (view.equals("pdf")) {
				page = "journeys-pdf";
			} else if (view.equals("xls")) {
				page = "journeys-xls";
			}
		}
		mav.setViewName(page);

		return mav;
	}

}
