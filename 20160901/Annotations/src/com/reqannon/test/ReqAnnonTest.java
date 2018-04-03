package com.reqannon.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReqAnnonTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/reqannon/test/req-annon-beans.xml");
		Motor motor = context.getBean("motor", Motor.class);
		System.out.println(motor);
	}
}
