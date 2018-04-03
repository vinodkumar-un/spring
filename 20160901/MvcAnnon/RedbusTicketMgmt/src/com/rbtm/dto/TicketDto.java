package com.rbtm.dto;

import java.util.Date;

public class TicketDto {
	protected int ticketNo;
	protected String holderName;
	protected Date journeyDate;

	public TicketDto(int ticketNo, String holderName, Date journeyDate) {
		this.ticketNo = ticketNo;
		this.holderName = holderName;
		this.journeyDate = journeyDate;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

}
