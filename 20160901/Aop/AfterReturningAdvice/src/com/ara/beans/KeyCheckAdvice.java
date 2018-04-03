package com.ara.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class KeyCheckAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object ret, Method method, Object[] args,
			Object target) throws Throwable {
		// weak key has been generated so dis-card
		if ((Integer) ret <= 0) {
			throw new IllegalArgumentException(
					"key len no supported/weak key generated");
		}
	}
}





