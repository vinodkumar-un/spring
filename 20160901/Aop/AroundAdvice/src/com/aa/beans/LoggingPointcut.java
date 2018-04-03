package com.aa.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class LoggingPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> classType) {
		if (classType == Calculator.class
				&& (method.getName().equals("add") || method.getName().equals(
						"multiply"))) {
			return true;
		}
		return false;
	}

}
