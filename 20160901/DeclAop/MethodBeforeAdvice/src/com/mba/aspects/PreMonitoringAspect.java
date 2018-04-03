package com.mba.aspects;

import org.aspectj.lang.JoinPoint;

import com.mba.util.SecurityHolder;

public class PreMonitoringAspect {
	private SecurityHolder securityHolder;

	public void audit(JoinPoint jp) {
		System.out.println(securityHolder.getLoggedInUser() + " has called  : "
				+ jp.getSignature().getName());
	}

	public void authenticate(JoinPoint jp) throws IllegalAccessException {
		if (securityHolder.isAuthenticated() == false) {
			throw new IllegalAccessException("invalid un/pwd");
		}
	}

	public void setSecurityHolder(SecurityHolder securityHolder) {
		this.securityHolder = securityHolder;
	}

}
