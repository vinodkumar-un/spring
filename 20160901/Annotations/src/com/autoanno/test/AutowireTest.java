package com.autoanno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/autoanno/test/autowire-annotation-beans.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
	}
}
