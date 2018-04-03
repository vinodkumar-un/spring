package com.sdp.beans;

public class PdfMessageProducerImpl implements IMessageProducer {
	@Override
	public String convertMessage(String message) {
		return "<pdf>" + message + "</pdf>";
	}
}
