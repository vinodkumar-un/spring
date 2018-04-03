package com.sci.beans;

public class Radio {
	private IReceiver receiver;

	public Radio(IReceiver receiver) {
		System.out.println("radio");
		this.receiver = receiver;
	}

	public void listen() {
		receiver.tuneup();
		System.out.println("listening...");
	}

}
