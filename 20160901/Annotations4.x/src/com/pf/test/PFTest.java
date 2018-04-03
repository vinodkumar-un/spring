package com.pf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

public class PFTest {
	public static void main(String[] args) {
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,
				"test");
		ApplicationContext context = new AnnotationConfigApplicationContext(
				RootAppConfig.class);
		ConnectionManager cm = context.getBean("connectionManager",
				ConnectionManager.class);
		System.out.println(cm);
	}
}
