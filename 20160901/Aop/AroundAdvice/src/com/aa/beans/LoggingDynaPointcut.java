package com.aa.beans;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class LoggingDynaPointcut extends DynamicMethodMatcherPointcut {
	@Override
	public boolean matches(Method method, Class<?> classType, Object[] args) {
		if (classType.isAssignableFrom(Calculator.class)) {
			if ((method.getName().equals("add") && (Integer) args[0] > 100 && (Integer) args[1] > 100)
					|| method.getName().equals("multiply")) {
				return true;
			}
		}
		return false;
	}

}




