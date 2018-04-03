package com.rb.dto;

import java.io.Serializable;
import java.util.Date;

public class QuickJourneyDto implements Serializable {
	private int journeyNo;
	private String source;
	private String destination;
	private Date journeyDate;
	private String serviceNo;
	private String busType;
	private float amount;

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

	public String getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
