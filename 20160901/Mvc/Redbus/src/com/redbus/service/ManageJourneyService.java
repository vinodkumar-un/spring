package com.redbus.service;

import com.redbus.bo.JourneyBo;
import com.redbus.command.JourneyCommand;
import com.redbus.dao.JourneyDao;
import com.redbus.dto.JourneyDto;

import java.util.ArrayList;
import java.util.List;

public class ManageJourneyService {
	private JourneyDao journeyDao;

	public List<JourneyDto> getJourneys() {
		List<JourneyBo> journeyBos = null;
		List<JourneyDto> journeyDtos = null;

		journeyDtos = new ArrayList<JourneyDto>();
		journeyBos = journeyDao.getJourneys();
		for (JourneyBo bo : journeyBos) {
			JourneyDto dto = new JourneyDto();
			dto.setJourneyId(bo.getJourneyId());
			dto.setSource(bo.getSource());
			dto.setDestination(bo.getDestination());
			journeyDtos.add(dto);
		}
		return journeyDtos;
	}

	public JourneyDto getJourney(int journeyId) {
		JourneyBo journeyBo = null;
		JourneyDto journeyDto = null;

		journeyDto = new JourneyDto();
		journeyBo = journeyDao.getJourney(journeyId);
		journeyDto.setJourneyId(journeyBo.getJourneyId());
		journeyDto.setSource(journeyBo.getSource());
		journeyDto.setDestination(journeyBo.getDestination());
		journeyDto.setJourneyDate(journeyBo.getJourneyDate());
		journeyDto.setBusNo(journeyBo.getBusNo());
		journeyDto.setAmount(journeyBo.getAmount());

		return journeyDto;
	}

	public void updateJourney(JourneyCommand journeyCommand) {
		JourneyBo journeyBo = null;

		journeyBo = new JourneyBo();
		journeyBo.setJourneyId(journeyCommand.getJourneyId());
		journeyBo.setSource(journeyCommand.getSource());
		journeyBo.setDestination(journeyCommand.getDestination());
		journeyBo.setJourneyDate(journeyCommand.getJourneyDate());
		journeyBo.setAmount(journeyCommand.getAmount());
		journeyDao.updateJourney(journeyBo);
	}

	public void setJourneyDao(JourneyDao journeyDao) {
		this.journeyDao = journeyDao;
	}

}
