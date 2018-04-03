package com.dn.test;

import org.springframework.stereotype.Component;

@Component
public class CacheManager {
	public CacheManager() {
		System.out.println("loading data...");
	}

}
