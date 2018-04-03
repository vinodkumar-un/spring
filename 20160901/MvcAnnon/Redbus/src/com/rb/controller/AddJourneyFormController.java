package com.rb.controller;

import java.util.Calendar;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rb.form.JourneyForm;
import com.rb.service.ManageJourneyService;
import com.rb.validator.JourneyFormValidator;

@Controller
@RequestMapping("/add-journey.htm")
public class AddJourneyFormController {
	@Autowired
	private JourneyFormValidator journeyFormValidator;

	@Autowired
	private ManageJourneyService manageJourneyService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(journeyFormValidator);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showJourneyForm(Model model) {
		JourneyForm journeyForm = null;

		journeyForm = new JourneyForm();
		model.addAttribute("journey", journeyForm);
		return "add-journey";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addJourney(Model model,
			@Valid @ModelAttribute("journey") JourneyForm journeyForm,
			BindingResult errors) {
		if (errors.hasErrors()) {
			// display back source page
			return "add-journey";
		}

		// no errors
		int journeyId = manageJourneyService.addJourney(journeyForm);
		model.addAttribute("journeyId", journeyId);
		return "journey-details";

	}

}
