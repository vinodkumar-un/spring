package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mba.beans.LoanManager;
import com.mba.util.SecurityHolder;

public class MBATest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mba/common/application-context.xml");
		SecurityHolder sHolder = context.getBean("securityHolder",
				SecurityHolder.class);
		sHolder.login("john", "welcome1");
		LoanManager proxy = context.getBean("loanManager", LoanManager.class);
		System.out.println("approved? : " + proxy.approveLoan(3));
		sHolder.logout();
	}
}





