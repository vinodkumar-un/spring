package com.bi.beans;

import java.beans.ConstructorProperties;

public class Bus {
	private int id;
	private String model;
	private String manufacturer;
	private String color;
	private String fuelType;
	private float price;

	@ConstructorProperties({ "id", "model", "manufacturer", "color",
			"fuelType", "price" })
	public Bus(int id, String model, String manufacturer, String color,
			String fuelType, float price) {
		this.id = id;
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.fuelType = fuelType;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", model=" + model + ", manufacturer="
				+ manufacturer + ", color=" + color + ", fuelType=" + fuelType
				+ ", price=" + price + "]";
	}

}
