package com.ba.beans;

public class Sensor {
	private int id;
	private String range;

	public void setId(int id) {
		this.id = id;
	}

	public void setRange(String range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "Sensor [id=" + id + ", range=" + range + "]";
	}

}
