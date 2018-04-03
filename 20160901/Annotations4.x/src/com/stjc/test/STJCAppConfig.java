package com.stjc.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.stjc.test" })
public class STJCAppConfig {
	@Bean(name = "mircrophone")
	public Microphone newMicrophone() {
		return new Microphone();
	}
}
