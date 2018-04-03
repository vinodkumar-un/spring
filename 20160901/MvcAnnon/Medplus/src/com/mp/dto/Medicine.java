package com.mp.dto;

public class Medicine {
	protected String medicineName;
	protected int units;

	public Medicine(String medicineName, int units) {
		super();
		this.medicineName = medicineName;
		this.units = units;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

}
