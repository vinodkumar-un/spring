package com.stereotypeanno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/stereotypeanno/test/stereotype-beans.xml");
		Toy toy1 = context.getBean("toy", Toy.class);
		Toy toy2 = context.getBean("toy", Toy.class);
		System.out.println("toy1 == toy2 ? : " + (toy1 == toy2));
	}
}
