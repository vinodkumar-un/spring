package com.rbtm.dto;

public class JourneyDto {
	protected int journeyId;
	protected String source;
	protected String destination;

	public JourneyDto(int journeyId, String source, String destination) {
		this.journeyId = journeyId;
		this.source = source;
		this.destination = destination;
	}

	public int getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
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

}
