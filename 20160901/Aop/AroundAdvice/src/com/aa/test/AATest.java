package com.aa.test;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.aa.beans.Calculator;
import com.aa.beans.LoggingAdvice;
import com.aa.beans.LoggingDynaPointcut;

public class AATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		// advisor
		Advisor loggingAdvisor = new DefaultPointcutAdvisor(
				new LoggingDynaPointcut(), new LoggingAdvice());
		pf.addAdvisor(loggingAdvisor);

		Calculator proxy = (Calculator) pf.getProxy();
		int sum = proxy.add(101, 201);
		System.out.println("sum : " + sum);
		int mul = proxy.multiply(10, 20);
		System.out.println("multiply : " + mul);
		int sub = proxy.substract(10, 20);
		System.out.println("substract : " + sub);
	}
}
