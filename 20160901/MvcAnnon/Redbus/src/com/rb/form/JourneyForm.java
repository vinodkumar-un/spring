package com.rb.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class JourneyForm {
	protected String source;
	protected String destination;
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	protected Date journeyDate;
	protected int busNo;
	protected float amount;

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

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
