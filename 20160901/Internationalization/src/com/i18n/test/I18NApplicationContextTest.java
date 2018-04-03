package com.i18n.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18NApplicationContextTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/i18n/common/application-context.xml");
		String message = context.getMessage("home.title", null,
				Locale.getDefault());
		System.out.println(message);
	}
}





