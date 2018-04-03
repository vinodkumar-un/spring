package com.ijc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IJCTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ijc/test/application-context.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}
}
