package com.rbtm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rbtm.dto.JourneyDto;

@Controller
public class AgentDashboardController {
	@RequestMapping("/agent-dashboard.htm")
	public String showDashboard(Model model) {
		List<JourneyDto> journeys = null;

		journeys = new ArrayList<JourneyDto>();
		journeys.add(new JourneyDto(1, "Hyderabad", "Banglore"));
		journeys.add(new JourneyDto(2, "Hyderabad", "Chennai"));
		journeys.add(new JourneyDto(3, "Hyderabad", "Pune"));
		journeys.add(new JourneyDto(4, "Hyderabad", "Mumbai"));

		model.addAttribute("journeys", journeys);
		return "agent-dashboard";
	}
}
