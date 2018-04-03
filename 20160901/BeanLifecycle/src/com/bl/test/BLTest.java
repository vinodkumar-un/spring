package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.Calculator;
import com.bl.handler.ShutdownCallbackHandler;

public class BLTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bl/common/application-context.xml"));

		ShutdownCallbackHandler handler = factory.getBean(
				"shutdownCallbackHandler", ShutdownCallbackHandler.class);
		// register this with the jvm
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread(handler));

		Calculator calculator = factory.getBean("calculator", Calculator.class);
		System.out.println(calculator);

	}
}
