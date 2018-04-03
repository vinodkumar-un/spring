package com.rb.service;

import java.util.ArrayList;
import java.util.List;

import com.rb.bo.JourneyBusDetailsBo;
import com.rb.dao.JourneyDao;
import com.rb.dto.QuickJourneyDto;

public class ManageJourneyService {
	private JourneyDao journeyDao;

	public JourneyDao getJourneyDao() {
		return journeyDao;
	}

	public List<QuickJourneyDto> getQuickJourneys() {
		List<JourneyBusDetailsBo> journeyBusDetails = null;
		List<QuickJourneyDto> journeyDtos = null;
		QuickJourneyDto journeyDto = null;

		journeyBusDetails = journeyDao.getRecentJourneys();
		journeyDtos = new ArrayList<QuickJourneyDto>();
		for (JourneyBusDetailsBo bo : journeyBusDetails) {
			journeyDto = new QuickJourneyDto();

			journeyDto.setJourneyNo(bo.getJourneyNo());
			journeyDto.setSource(bo.getSource());
			journeyDto.setDestination(bo.getDestination());
			journeyDto.setJourneyDate(bo.getJourneyDate());
			journeyDto.setAmount(bo.getAmount());
			journeyDto.setBusType(bo.getBus().getBusType());
			journeyDto.setServiceNo(bo.getBus().getServiceNo());

			journeyDtos.add(journeyDto);
		}
		return journeyDtos;
	}

	public void setJourneyDao(JourneyDao journeyDao) {
		this.journeyDao = journeyDao;
	}

}
