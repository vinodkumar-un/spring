package com.nbf.beans;

public class Passport {
	private String passportNo;
	private String holderName;
	private Address address;

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", holderName="
				+ holderName + ", address=" + address + "]";
	}

}
