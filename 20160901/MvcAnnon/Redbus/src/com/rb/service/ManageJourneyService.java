package com.rb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rb.bo.JourneyBo;
import com.rb.dao.JourneyDao;
import com.rb.form.JourneyForm;

@Service
public class ManageJourneyService {
	@Autowired
	protected JourneyDao journeyDao;

	@Transactional(readOnly = false)
	public int addJourney(JourneyForm journeyForm) {
		JourneyBo journeyBo = null;
		int journeyId = 0;

		journeyBo = new JourneyBo();
		journeyBo.setSource(journeyForm.getSource());
		journeyBo.setDestination(journeyForm.getDestination());
		journeyBo.setJourneyDate(journeyForm.getJourneyDate());
		journeyBo.setBusNo(journeyForm.getBusNo());
		journeyBo.setAmount(journeyForm.getAmount());

		journeyId = journeyDao.saveJourney(journeyBo);

		return journeyId;
	}

}
