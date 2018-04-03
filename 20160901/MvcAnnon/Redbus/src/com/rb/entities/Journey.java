package com.rb.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "JOURNEY")
public class Journey {
	@Id
	@GeneratedValue(generator = "hib_increment")
	@GenericGenerator(name = "hib_increment", strategy = "increment")
	@Column(name = "JOURNEY_NO")
	protected int journeyNo;
	protected String source;
	protected String destination;
	@Column(name = "JOURNEY_DT")
	protected Date journeyDate;
	protected float amount;

	@ManyToOne
	@JoinColumn(name = "BUS_NO")
	protected Bus bus;

	public int getJourneyNo() {
		return journeyNo;
	}

	public void setJourneyNo(int journeyNo) {
		this.journeyNo = journeyNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

}
