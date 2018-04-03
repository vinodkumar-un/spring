package com.idr.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car {
	private String engineId;

	public Car(String engineId) {
		this.engineId = engineId;
	}

	public void drive() {
		int status = 0;
		IEngine engine;
		BeanFactory factory = null;

		factory = new XmlBeanFactory(new ClassPathResource(
				"com/idr/common/application-context.xml"));
		engine = factory.getBean(engineId, IEngine.class);
		status = engine.start();
		if (status == 1) {
			System.out.println("driving car");
		} else {
			System.out.println("failed to start engine");
		}
	}
}
