package com.jcaw.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JCAWTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AWAppConfig.class);
		ControlBoard cb = context.getBean("controlBoard", ControlBoard.class);
		cb.powerOn();
	}
}





