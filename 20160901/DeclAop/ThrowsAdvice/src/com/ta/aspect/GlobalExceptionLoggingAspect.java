package com.ta.aspect;

import org.aspectj.lang.JoinPoint;

public class GlobalExceptionLoggingAspect {
	public void logException(JoinPoint jp, IllegalArgumentException iae,
			int assignedTaskNo) {
		System.out.println("exception caused for taskNo : " + assignedTaskNo
				+ " with message : " + iae.getMessage());
	}
}
