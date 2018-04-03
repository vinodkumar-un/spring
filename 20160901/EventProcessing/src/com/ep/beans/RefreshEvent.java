package com.ep.beans;

import org.springframework.context.ApplicationEvent;

public class RefreshEvent extends ApplicationEvent {
	private String table;

	public RefreshEvent(Object source) {
		super(source);
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

}
