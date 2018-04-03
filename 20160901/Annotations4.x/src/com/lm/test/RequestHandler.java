package com.lm.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RequestHandler {
	private String data;

	public void setData(String data) {
		this.data = data;
	}

	public void process() {
		System.out.println("processing : " + data);
	}
}
