package com.i18n.test;

import java.util.Locale;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ClassPathResource;

public class I18NTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/i18n/common/application-context.xml"));
		MessageSource messageSource = factory.getBean("messageSource",
				MessageSource.class);
		String title = messageSource.getMessage("home.title", null,
				Locale.CANADA_FRENCH);
		System.out.println(title);
		System.out.println(messageSource.getMessage("field1.blank", new Object[]{"firstName"},
				"No message found",Locale.getDefault()));
	}
}





