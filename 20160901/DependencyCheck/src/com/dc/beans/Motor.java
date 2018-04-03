package com.dc.beans;

public class Motor {
	private int id;
	private String type;
	private Chain chain;

	public Motor() {
		System.out.println("Motor()");
	}

	public void setId(int id) {
		System.out.println(" id : " + id);
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "Motor [id=" + id + ", type=" + type + ", chain=" + chain + "]";
	}

}
