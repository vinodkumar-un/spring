package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.PlanFinder;

public class MRTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/mr/common/application-context.xml"));
		PlanFinder planFinder = factory.getBean("planFinder", PlanFinder.class);
		String[] plans = planFinder.findPlans(1, 2828, 10, 2, 2);
		System.out.println("Matching plans : ");
		for (String plan : plans) {
			System.out.println(plan);
		}
	}
}
