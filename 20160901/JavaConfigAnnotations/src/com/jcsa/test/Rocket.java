package com.jcsa.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

@Named("rocket")
public class Rocket {
	@PostConstruct
	public void initialize() {
		System.out.println("verifying...");
	}

	public void launch() {
		System.out.println("launching...");
	}

	@PreDestroy
	public void shutdown() {
		System.out.println("cleaning...");
	}
}
