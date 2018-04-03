package com.mp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mp.dto.Medicine;
import com.mp.form.CriteriaForm;

@Controller
public class SearchMedicinesController {
	@RequestMapping("/do-search-medicines.htm")
	public String doSearchMedicines(@ModelAttribute CriteriaForm criteriaForm,
			Model model) {
		List<Medicine> medicines = null;

		medicines = new ArrayList<Medicine>();
		medicines.add(new Medicine(criteriaForm.getMedicineName(), 13));
		medicines.add(new Medicine(criteriaForm.getComposition(), 10));
		medicines.add(new Medicine(criteriaForm.getManufacturer(), 1));

		model.addAttribute("medicines", medicines);
		return "medicines";
	}
}
