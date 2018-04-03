package com.ep.beans;

import org.springframework.context.ApplicationListener;

public class RefreshEventListener implements ApplicationListener<RefreshEvent> {
	@Override
	public void onApplicationEvent(RefreshEvent event) {
		System.out.println("cache manager reload data for table : "
				+ event.getTable());
	}
}
