package com.bl.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Calculator implements InitializingBean, DisposableBean {
	private int a;
	private int b;
	private int sum;

	public Calculator(int a) {
		this.a = a;

	}

	/*
	 * public void init() { System.out.println("init()"); this.sum = this.a +
	 * this.b; }
	 */

	@Override
	public void destroy() throws Exception {
		System.out.println("destroyed..");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		this.sum = a + b;
	}

	public void setB(int b) {
		this.b = b;
	}

	/*
	 * public void shutdown() { System.out.println("shutdown()"); }
	 */

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}

}
