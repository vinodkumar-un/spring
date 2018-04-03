package com.lm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LMTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.lm.test");
		Container container = context.getBean("container", Container.class);
		container.receive("data1");
	}
}
