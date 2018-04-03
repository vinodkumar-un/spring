package com.dc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dc.beans.Motor;

public class DCTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/dc/common/application-context.xml"));
		Motor motor = (Motor) factory.getBean("motor");
		System.out.println(motor);
	}
}





