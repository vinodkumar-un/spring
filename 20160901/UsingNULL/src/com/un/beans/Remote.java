package com.un.beans;

public class Remote {
	private int id;
	private int frequency;

	public void setId(int id) {
		this.id = id;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Remote [id=" + id + ", frequency=" + frequency + "]";
	}

}
