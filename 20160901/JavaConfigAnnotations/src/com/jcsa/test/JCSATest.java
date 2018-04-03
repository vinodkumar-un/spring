package com.jcsa.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class JCSATest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"com.jcsa.test");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		Rocket rocket = context.getBean("rocket", Rocket.class);
		rocket.launch();
	}
}
