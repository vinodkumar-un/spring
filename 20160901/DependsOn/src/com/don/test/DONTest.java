package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.don.beans.LoanService;

public class DONTest {
	public static void main(String[] args) throws Exception {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/don/common/application-context.xml"));
		LoanService loanService = factory.getBean("loanService",
				LoanService.class);
		double instAmount = loanService.calculateInterestAmount(100000L, 36,
				"home", "salaries", "hyderabad");
		System.out.println("interest amount : " + instAmount);
	}
}
