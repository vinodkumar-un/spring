package com.idr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.idr.beans.Car;

public class IDRTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/idr/common/application-context.xml"));
		Car car = factory.getBean("car", Car.class);
		car.drive();
	}
}



