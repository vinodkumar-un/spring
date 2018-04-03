package com.sfmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sfmi.beans.Remainder;

public class SFMITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/sfmi/common/application-context.xml"));
		Remainder remainder = factory.getBean("remainder", Remainder.class);
		System.out.println(remainder.getReminder());
	}
}
