package com.ta.beans;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class GlobalExceptionLoggerAdvice implements ThrowsAdvice {
	public void afterThrowing(Exception e) {
		System.out.println("generic error : " + e.getMessage());
	}

	public void afterThrowing(Method method, Object[] args, Object target,
			IllegalArgumentException e) {
		System.out.println("method : " + method.getName()
				+ " has reported exception with message : " + e.getMessage());
	}

	public void afterThrowing(IllegalArgumentException iae) {
		System.out.println("exception : " + iae.getMessage());
	}

}
