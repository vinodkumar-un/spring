package com.ip.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfig {
	@Autowired
	private Environment environment;

	@Bean(name = "player1")
	public Player newPlayer1() {
		Player player1 = new Player();
		player1.setPlayerNo(Integer.parseInt(environment
				.getProperty("playerNo1")));
		player1.setPlayerName(environment.getProperty("playerName1"));
		return player1;
	}

	@Bean(name = "player2")
	public Player newPlayer2() {
		Player player2 = new Player();
		player2.setPlayerNo(Integer.parseInt(environment
				.getProperty("playerNo2")));
		player2.setPlayerName(environment.getProperty("playerName2"));
		return player2;
	}
}
