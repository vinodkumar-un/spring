package com.sfmi.beans;

import java.util.Calendar;

public class Remainder {
	private String even;
	private Calendar eventDate;

	public String getReminder() {
		return "Reminder [even=" + even + ", eventDate=" + eventDate + "]";
	}

	public void setEven(String even) {
		this.even = even;
	}

	public void setEventDate(Calendar eventDate) {
		this.eventDate = eventDate;
	}

}
