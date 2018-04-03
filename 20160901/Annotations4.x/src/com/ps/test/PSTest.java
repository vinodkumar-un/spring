package com.ps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PSTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.ps.test");
		Astronaut astronaut = context.getBean("astronaut", Astronaut.class);
		astronaut.test();
		System.out.println(astronaut);
	}
}
