package com.sdp.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.sdp.beans.IMessageProducer;
import com.sdp.beans.MessageWriter;
import com.sdp.util.AppFactory;

public class SDPTest {
	public static void main(String[] args) throws FileNotFoundException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException, IOException {
		MessageWriter messageWriter = null;
		IMessageProducer messageProducer = null;

		messageWriter = (MessageWriter) AppFactory
				.createObject("messageWriter.class");
		messageProducer = (IMessageProducer) AppFactory
				.createObject("messageProducer.class");

		messageWriter.setMessageProducer(messageProducer);

		messageWriter.writeMessage("Strategy Design Pattern works!");
	}
}
