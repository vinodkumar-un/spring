package com.jcaw.test;

public class ControlBoard {
	private Machine machine;

	public void powerOn() {
		machine.run();
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

}
