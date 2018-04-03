package com.ta.beans;

public class TaskReporter {
	public int handleTask(int taskNo) {
		if (taskNo <= 0) {
			throw new IllegalArgumentException("invalid taskNo");
		}
		return taskNo;
	}
}
