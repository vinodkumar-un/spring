package com.sci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sci.beans.Radio;

public class SCITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/sci/common/application-context.xml"));
		Radio radio = factory.getBean("radio", Radio.class);

		radio.listen();
	}
}
