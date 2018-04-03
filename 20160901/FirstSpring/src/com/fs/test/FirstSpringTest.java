package com.fs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fs.beans.MessageWriter;

public class FirstSpringTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/fs/common/application-context.xml"));

		MessageWriter messageWriter = (MessageWriter) factory
				.getBean("messageWriter");

		messageWriter.writeMessage("Welcome to spring");
	}
}





