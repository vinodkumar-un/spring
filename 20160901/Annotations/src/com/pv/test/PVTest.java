package com.pv.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PVTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/pv/test/pv-beans.xml");
		Rocket rocket = context.getBean("rocket", Rocket.class);
		System.out.println(rocket);
	}
}
