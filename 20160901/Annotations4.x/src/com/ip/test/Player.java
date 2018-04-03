package com.ip.test;

public class Player {
	private int playerNo;
	private String playerName;

	public int getPlayerNo() {
		return playerNo;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [playerNo=" + playerNo + ", playerName=" + playerName
				+ "]";
	}

}
