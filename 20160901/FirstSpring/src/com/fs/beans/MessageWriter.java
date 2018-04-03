package com.fs.beans;

public class MessageWriter {
	private IMessageProducer messageProducer;

	public void writeMessage(String message) {
		String cMessage = null;

		cMessage = messageProducer.convertMessage(message);
		System.out.println(cMessage);
	}

	public void setMessageProducer(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

}
