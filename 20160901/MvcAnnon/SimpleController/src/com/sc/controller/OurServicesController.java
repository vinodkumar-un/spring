package com.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OurServicesController {
	@RequestMapping("/our-services.htm")
	public String showOurServices() {
		return "our-services";
	}
}
