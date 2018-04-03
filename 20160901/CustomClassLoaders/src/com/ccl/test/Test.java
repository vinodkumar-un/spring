package com.ccl.test;

import com.ccl.loader.CustomClassLoader;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		CustomClassLoader customClassLoader = new CustomClassLoader(
				Test.class.getClassLoader());

		Class toyClass = Class.forName("com.ccl.beans.Toy", true,
				customClassLoader);
		System.out.println(toyClass.getClassLoader().getClass().getName());
	}
}




