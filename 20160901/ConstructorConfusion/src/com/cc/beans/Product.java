package com.cc.beans;

public class Product {
	private int id;
	private String productName;
	private double price;

	public Product(int id, String productName) {
		this.id = id;
		this.productName = productName;
	}

	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName
				+ ", price=" + price + "]";
	}

}
