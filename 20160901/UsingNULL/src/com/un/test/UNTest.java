package com.un.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.un.beans.Toy;

public class UNTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/un/common/application-context.xml"));
		Toy toy = factory.getBean("toy", Toy.class);
		System.out.println(toy);
	}
}






