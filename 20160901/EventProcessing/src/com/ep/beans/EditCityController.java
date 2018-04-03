package com.ep.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EditCityController implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	public void editCity(int cityId, String cityName) {
		System.out.println("updated city in db");
		RefreshEvent event = new RefreshEvent(this);
		event.setTable("tblcities");
		publisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

}
