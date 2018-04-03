package com.don.accessors;

abstract public class AbstractAccessor implements IAccessor {
	protected String key;

	public AbstractAccessor(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

}
