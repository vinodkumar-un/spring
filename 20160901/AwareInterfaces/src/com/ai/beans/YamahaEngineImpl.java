package com.ai.beans;

public class YamahaEngineImpl implements IEngine {

	@Override
	public int start() {
		System.out.println("Yamaha engine started..");
		return 1;
	}

}
