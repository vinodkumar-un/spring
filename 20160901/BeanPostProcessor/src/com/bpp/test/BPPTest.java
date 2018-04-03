package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.Engine;
import com.bpp.beans.Motor;
import com.bpp.postprocessors.InstanceTrackerBeanPostProcessor;
import com.bpp.util.BeanStatistics;

public class BPPTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bpp/common/application-context.xml"));
		BeanPostProcessor bpp = factory.getBean(
				"instanceTrackerBeanPostProcessor", BeanPostProcessor.class);

		((ConfigurableListableBeanFactory) factory).addBeanPostProcessor(bpp);

		Motor motor = factory.getBean("motor", Motor.class);
		Engine engine = factory.getBean("engine", Engine.class);
		System.out.println("objects : " + BeanStatistics.getInstances());
	}
}






