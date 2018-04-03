package com.mba.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {
	@Before("within(com.mba.beans.*)")
	public void audit(JoinPoint jp) {
		System.out.println("john called : " + jp.getSignature().getName());
	}
}
