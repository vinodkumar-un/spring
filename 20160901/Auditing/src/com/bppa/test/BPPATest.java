package com.bppa.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bppa.beans.UpdateEmployeeController;

public class BPPATest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bppa/common/application-context.xml"));
		BeanPostProcessor bpp = factory.getBean("valueObjectBeanPostProcessor",
				BeanPostProcessor.class);
		((ConfigurableListableBeanFactory) factory).addBeanPostProcessor(bpp);
		UpdateEmployeeController uec = factory.getBean(
				"updateEmployeeController", UpdateEmployeeController.class);
		uec.editEmployee(1, "Sriman", "P", 630000f);
	}
}
