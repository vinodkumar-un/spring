package com.jc.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {
	@Bean(name = "scooter")
	@Lazy
	public Scooter newScooter() {
		return new Scooter();
	}

}
