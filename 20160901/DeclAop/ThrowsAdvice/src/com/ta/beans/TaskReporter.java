package com.ta.beans;

public class TaskReporter {
	public int doTask(int taskNo) {
		if (taskNo <= 0) {
			throw new IllegalArgumentException("invalid taskNo");
		}
		return taskNo;
	}
}
