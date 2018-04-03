package com.rb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.rb.command.JourneyCriteriaCommand;
import com.rb.dto.JourneyDto;

public class SearchJourneyCommandController extends AbstractCommandController {
	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command,
			BindException bindException) throws Exception {
		List<JourneyDto> journeys = null;
		JourneyDto journey = null;
		JourneyCriteriaCommand jcCommand = null;

		jcCommand = (JourneyCriteriaCommand) command;
		journeys = new ArrayList<JourneyDto>();
		journey = new JourneyDto();
		journey.setSource(jcCommand.getSource());
		journey.setDest(jcCommand.getDest());
		journey.setJourneyDt(jcCommand.getJourneyDt());
		journey.setBusType("A/C Sleeper");
		journey.setAmount(3938.34f);

		journeys.add(journey);

		journey = new JourneyDto();
		journey.setSource(jcCommand.getSource());
		journey.setDest(jcCommand.getDest());
		journey.setJourneyDt(jcCommand.getJourneyDt());
		journey.setBusType("A/C Semi Sleeper Volvo");
		journey.setAmount(938.34f);
		journeys.add(journey);

		ModelAndView mav = new ModelAndView();
		mav.addObject("journeys", journeys);
		mav.setViewName("avail-journeys");

		return mav;
	}

}
