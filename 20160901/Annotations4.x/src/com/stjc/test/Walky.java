package com.stjc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Walky {
	@Autowired
	private Microphone microphone;

	public void speak(String message) {
		microphone.transfer(message);
	}
}
