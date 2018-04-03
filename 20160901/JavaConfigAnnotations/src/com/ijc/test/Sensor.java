package com.ijc.test;

public class Sensor {
	private int id;
	private int range;

	public void setId(int id) {
		this.id = id;
	}

	public void setRange(int range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "Sensor [id=" + id + ", range=" + range + "]";
	}

}
