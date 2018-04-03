package com.rb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.rb.bo.JourneyBo;
import com.rb.entities.Bus;
import com.rb.entities.Journey;

@Repository
public class JourneyDao {
	@Autowired
	protected HibernateTemplate hibernateTemplate;

	public int saveJourney(JourneyBo journeyBo) {
		Journey journey = null;
		int journeyId = 0;
		Bus bus = null;

		bus = hibernateTemplate.load(Bus.class, journeyBo.getBusNo());
		journey = new Journey();
		journey.setSource(journeyBo.getSource());
		journey.setDestination(journeyBo.getDestination());
		journey.setAmount(journeyBo.getAmount());
		journey.setJourneyDate(journeyBo.getJourneyDate());
		journey.setBus(bus);

		journeyId = (int) hibernateTemplate.save(journey);
		return journeyId;
	}
}
