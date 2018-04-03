package com.stereotypeanno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.stereotypeanno.test");
		Toy toy = context.getBean("toy",Toy.class);
		toy.play();
	}
}






