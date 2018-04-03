package com.sdp.util;

import com.sdp.beans.HtmlMessageProducerImpl;
import com.sdp.beans.IMessageProducer;
import com.sdp.beans.PdfMessageProducerImpl;

public class MessageProducerFactory {
	public static IMessageProducer createMessageProducer(String type) {
		IMessageProducer messageProducer = null;

		if (type.equals("html")) {
			messageProducer = new HtmlMessageProducerImpl();
		} else if (type.equals("pdf")) {
			messageProducer = new PdfMessageProducerImpl();
		}
		return messageProducer;
	}
}
