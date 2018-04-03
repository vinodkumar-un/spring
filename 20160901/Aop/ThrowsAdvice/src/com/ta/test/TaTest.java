package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.beans.GlobalExceptionLoggerAdvice;
import com.ta.beans.TaskReporter;

public class TaTest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new TaskReporter());
		pf.addAdvice(new GlobalExceptionLoggerAdvice());

		TaskReporter proxy = (TaskReporter) pf.getProxy();
		int taskNo = proxy.handleTask(35);
		System.out.println("taskNO : " + taskNo);
		taskNo = proxy.handleTask(-1);
		System.out.println("taskNO : " + taskNo);
	}
}




