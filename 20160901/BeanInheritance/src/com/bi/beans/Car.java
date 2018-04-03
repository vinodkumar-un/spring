package com.bi.beans;

public class Car {
	private int id;
	private String model;
	private String manufacturer;
	private String color;
	private String fuelType;
	private float price;

	public void setId(int id) {
		this.id = id;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", manufacturer="
				+ manufacturer + ", color=" + color + ", fuelType=" + fuelType
				+ ", price=" + price + "]";
	}

}
