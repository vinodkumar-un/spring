package com.cc.beans;

import java.beans.ConstructorProperties;

public class Warehouse {
	private int id;
	private String warehouseName;
	private long capacity;

	@ConstructorProperties({"warehouseName","id"})
	public Warehouse(String warehouseName, int id) {
		this.warehouseName = warehouseName;
		this.id = id;
	}

	@ConstructorProperties({"warehouseName", "capacity"})
	public Warehouse(String warehouseName, long capacity) {
		this.warehouseName = warehouseName;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Warehouse [id=" + id + ", warehouseName=" + warehouseName
				+ ", capacity=" + capacity + "]";
	}

}
