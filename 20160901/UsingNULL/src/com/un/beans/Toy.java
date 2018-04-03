package com.un.beans;

public class Toy {
	private Remote remote;

	public Toy(Remote remote) {
		this.remote = remote;
	}

	@Override
	public String toString() {
		return "Toy [remote=" + remote + "]";
	}

}
