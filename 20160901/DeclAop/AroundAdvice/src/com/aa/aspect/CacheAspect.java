package com.aa.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

import com.aa.util.Cache;

public class CacheAspect {
	private Cache cache;

	public Object doCache(ProceedingJoinPoint pjp) throws Throwable {
		Map<String, Object> methodMap = null;
		String methodName = null;
		Object[] args = null;
		String key = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();
		key = buildKey(methodName, args);

		if (cache.containsKey(methodName)) {
			methodMap = (Map<String, Object>) cache.get(methodName);
			if (methodMap.containsKey(key)) {
				return methodMap.get(key);
			}
		}
		Object ret = pjp.proceed();
		if (methodMap == null) {
			methodMap = new HashMap<String, Object>();
		}
		methodMap.put(key, ret);
		cache.put(methodName, methodMap);
		return ret;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

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
}
