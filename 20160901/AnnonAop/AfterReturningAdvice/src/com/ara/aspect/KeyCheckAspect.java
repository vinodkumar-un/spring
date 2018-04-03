package com.ara.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class KeyCheckAspect {
	@Pointcut("execution(* com.ara.beans.*.*(..))")
	public void commonPointcut() {
	}

	@AfterReturning(value = "commonPointcut()", returning = "ret")
	public void validateKey(JoinPoint jp, Object ret) {
		if ((Integer) ret <= 0) {
			throw new IllegalArgumentException("weak key");
		}
	}

	@AfterThrowing(value = "commonPointcut()", throwing = "iae")
	public void logException(JoinPoint jp, IllegalArgumentException iae) {
		System.out.println("exception : " + iae.getMessage());
	}

}
