package com.jcaw.test;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AWAppConfig {
	@Bean(name = "sand-machine")
	public Machine newSandMachine() {
		return new Machine();
	}

	@Primary
	@Bean(name = "rock-machine")
	public Machine newRockMachine() {
		return new Machine();
	}

	@Bean(name = "controlBoard", autowire = Autowire.BY_TYPE)
	public ControlBoard newControlBoard() {
		return new ControlBoard();
	}
}
