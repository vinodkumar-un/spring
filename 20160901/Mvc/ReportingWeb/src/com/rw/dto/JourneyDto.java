package com.rw.dto;

public class JourneyDto {
	protected String source;
	protected String destination;
	protected int busNo;

	public JourneyDto(String source, String destination, int busNo) {
		this.source = source;
		this.destination = destination;
		this.busNo = busNo;
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

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

}
