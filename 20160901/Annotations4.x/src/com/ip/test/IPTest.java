package com.ip.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;

public class IPTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				RootAppConfig.class);
		Game game = context.getBean("game", Game.class);
		game.start();
	}
}







