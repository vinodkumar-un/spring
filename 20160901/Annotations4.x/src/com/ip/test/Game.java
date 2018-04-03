package com.ip.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Game {
	@Autowired
	@Qualifier("player1")
	private Player player1;
	@Autowired
	@Qualifier("player2")
	private Player player2;

	public void start() {
		System.out.println("player1 : " + player1.getPlayerName()
				+ " player2 : " + player2.getPlayerName() + "  are playing...");
	}
}
