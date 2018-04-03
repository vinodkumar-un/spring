package com.aa.beans;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aa.util.Cache;

public class CacheAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		Map<String, Object> methodMap = null;
		String methodSignature = null;
		String methodName = null;
		Object[] args = null;
		Cache cache = null;
		Object ret = null;
		String key = null;

		cache = Cache.getInstance();
		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();

		methodSignature = buildMethodSignature(methodInvocation.getMethod());
		key = buildKey(methodName, args);

		if (cache.containsKey(methodSignature) == true) {
			methodMap = (Map<String, Object>) cache.get(methodSignature);

			// if found skip executing the target class method
			if (methodMap.containsKey(key) == true) {
				return methodMap.get(key);
			}
		}
		// data is not found in the cache, so execute target class method
		ret = methodInvocation.proceed();
		// store the data into the cache
		if (methodMap == null) {
			methodMap = new HashMap<String, Object>();
		}
		methodMap.put(key, ret);
		cache.put(methodSignature, methodMap);
		return ret;
	}

	/**
	 * Builds method call as key e.g.. add(10, 20)
	 * 
	 * @param methodName
	 * @param args
	 * @return
	 */
	private String buildKey(String methodName, Object[] args) {
		StringBuilder builder = null;

		builder = new StringBuilder();
		builder.append(methodName).append("(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				builder.append(args[i]);
				continue;
			}
			builder.append(",").append(args[i]);
		}
		builder.append(")");
		return builder.toString();
	}

	/**
	 * Build method signature as key e.g.. add(int, int)
	 * 
	 * @param method
	 * @return
	 */
	public String buildMethodSignature(Method method) {
		StringBuilder builder = null;
		Class<?>[] argTypes = null;

		builder = new StringBuilder();
		builder.append(method.getName()).append("(");
		argTypes = method.getParameterTypes();
		for (int i = 0; i < argTypes.length; i++) {
			if (i == 0) {
				builder.append(argTypes[i].getName());
				continue;
			}
			builder.append(",").append(argTypes[i].getName());
		}
		builder.append(")");
		return builder.toString();
	}

}
