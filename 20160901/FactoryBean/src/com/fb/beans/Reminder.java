package com.fb.beans;

import java.util.Calendar;

public class Reminder {
	private String event;
	private Calendar eventDate;

	public String getReminder() {
		return "Reminder [event=" + event + ", eventDate=" + eventDate + "]";
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setEventDate(Calendar eventDate) {
		this.eventDate = eventDate;
	}

}
