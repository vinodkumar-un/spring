package com.rbsfc.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class JourneyCommand {
	protected String source;
	protected String dest;
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	protected Date journeyDate;
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

}
