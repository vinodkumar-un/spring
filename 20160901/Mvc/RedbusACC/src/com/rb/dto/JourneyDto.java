package com.rb.dto;

import java.util.Date;

public class JourneyDto {
	protected String source;
	protected String dest;
	protected Date journeyDt;
	protected String busType;
	protected float amount;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public Date getJourneyDt() {
		return journeyDt;
	}

	public void setJourneyDt(Date journeyDt) {
		this.journeyDt = journeyDt;
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
