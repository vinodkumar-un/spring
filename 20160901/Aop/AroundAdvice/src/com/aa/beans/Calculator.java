package com.aa.beans;

public class Calculator {
	public int add(int a, int b) {
		System.out.println("in add()");
		return a + b;
	}

	public int multiply(int a, int b) {
		System.out.println("in multiply()");
		return a * b;
	}

	public int substract(int a, int b) {
		System.out.println("in substract()");
		return b - a;
	}
}
