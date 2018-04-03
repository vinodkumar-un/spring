package com.ta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ta.beans.TaskReporter;

public class TATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ta/common/application-context.xml");
		TaskReporter tr = context.getBean("taskReporter", TaskReporter.class);
		int taskNo = tr.doTask(-1);
		System.out.println("taskNo " + taskNo);
	}
}






