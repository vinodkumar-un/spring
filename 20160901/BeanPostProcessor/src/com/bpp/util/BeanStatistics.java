package com.bpp.util;

import java.util.concurrent.atomic.AtomicInteger;

public class BeanStatistics {
	private static AtomicInteger instances = new AtomicInteger(0);

	public static void increment() {
		instances.incrementAndGet();
	}

	public static int getInstances() {
		return instances.get();
	}
}
