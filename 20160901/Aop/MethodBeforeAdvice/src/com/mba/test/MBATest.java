package com.mba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.mba.beans.AuditAdvice;
import com.mba.beans.LoanManager;
import com.mba.beans.SecurityCheckAdvice;
import com.mba.util.SecurityHolder;

public class MBATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanManager());
		pf.addAdvice(new SecurityCheckAdvice());
		pf.addAdvice(new AuditAdvice());
		SecurityHolder sHolder = SecurityHolder.getInstance();
		sHolder.login("john", "welcome1");

		LoanManager proxy = (LoanManager) pf.getProxy();
		System.out.println("approved : ? " + proxy.approveLoan(2));
		sHolder.logout();
	}
}
