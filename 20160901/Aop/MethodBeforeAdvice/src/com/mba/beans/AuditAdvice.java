package com.mba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.mba.util.SecurityHolder;

public class AuditAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// before target class method executes perform auditing
		System.out.print(SecurityHolder.getInstance().getLoggedInUser()
				+ " called " + method.getName() + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");
		// done with cross-cutting logic, dont do anything automatically control
		// will be passed to target class method
	}

}
