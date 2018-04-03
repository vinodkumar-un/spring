package com.rbtm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rbtm.dto.TicketDto;

@Controller
public class ListSoldTicketsController {
	@RequestMapping("/sold-tickets.htm")
	public String soldTickets(@RequestParam("journeyId") int journeyId,
			Model model) {
		List<TicketDto> tickets = null;

		tickets = new ArrayList<TicketDto>();
		tickets.add(new TicketDto(journeyId, "John", new Date()));
		tickets.add(new TicketDto(2, "Brain", new Date()));
		tickets.add(new TicketDto(3, "Mathew", new Date()));
		tickets.add(new TicketDto(4, "Steve", new Date()));
		tickets.add(new TicketDto(5, "Mark", new Date()));

		model.addAttribute("tickets", tickets);
		return "sold-tickets";
	}
}
