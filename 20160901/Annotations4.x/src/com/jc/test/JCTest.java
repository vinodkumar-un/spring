package com.jc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JCTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		/*Scooter scooter1 = context.getBean("scooter", Scooter.class);
		Scooter scooter2 = context.getBean("scooter", Scooter.class);
		System.out.println("scooter1 = scooter2 : ? "+ (scooter1 == scooter2));*/
		
	}
}
