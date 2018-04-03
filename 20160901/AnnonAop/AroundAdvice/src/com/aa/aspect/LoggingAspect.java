package com.aa.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	@Around("execution(* com.aa.beans.Calculator.*(..))")
	public Object log(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("entered into method : "
				+ pjp.getSignature().getName());
		Object ret = pjp.proceed();
		System.out.println("exiting from : " + pjp.getSignature().getName()
				+ " with ret " + ret);
		return ret;
	}
}
