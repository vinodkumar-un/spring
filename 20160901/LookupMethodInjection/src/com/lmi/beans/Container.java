package com.lmi.beans;

abstract public class Container {
	public void receive(String data) {
		RequestHandler handler = null;
		handler = getRequestHandler();
		handler.setData(data);
		handler.handleRequest();
	}

	protected abstract RequestHandler getRequestHandler();
}
