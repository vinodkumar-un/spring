package com.pac.beans;

public class Person {
	private Address address;

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}

}
