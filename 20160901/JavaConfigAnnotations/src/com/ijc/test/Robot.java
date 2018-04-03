package com.ijc.test;

import javax.annotation.Resource;

public class Robot {
	@Resource(name="sensor2")
	private Sensor sensor;

	@Override
	public String toString() {
		return "Robot [sensor=" + sensor + "]";
	}

}
