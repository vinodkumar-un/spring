package com.dc.beans;

public class Chain {
	private int id;
	private String manufacturer;

	public void setId(int id) {
		this.id = id;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Chain [id=" + id + ", manufacturer=" + manufacturer + "]";
	}

}
