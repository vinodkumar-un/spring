package com.rb.bo;

import java.util.Date;

public class JourneyBo {
	protected int journeyNo;
	protected String source;
	protected String destination;
	protected Date journeyDate;
	protected int busNo;
	protected float amount;

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
