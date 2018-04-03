package com.rb.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class JourneyCriteriaCommand {
	protected String source;
	protected String dest;
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	protected Date journeyDt;

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

}
