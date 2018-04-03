package com.lmi.beans;

public class RequestHandler {
	private String data;

	public void handleRequest() {
		System.out.println(" processing request with data : " + data
				+ " by agent : " + this.hashCode());
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
