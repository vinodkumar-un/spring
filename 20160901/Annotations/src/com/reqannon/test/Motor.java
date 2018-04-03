package com.reqannon.test;

import org.springframework.beans.factory.annotation.Required;

public class Motor {
	private Chain chain;

	@Required
	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "Motor [chain=" + chain + "]";
	}

}
