package com.ara.aspect;

import org.aspectj.lang.JoinPoint;

public class KeyCheckAspect {
	public void validateKey(JoinPoint jp, Object ret) {
		if ((Integer) ret <= 0) {
			throw new IllegalArgumentException("weak key generated");
		}
	}
}
