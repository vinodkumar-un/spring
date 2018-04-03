package com.pv.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("#{beanvalues.Rocket_launchPadType}")
	private String launchPadType;

	@Override
	public String toString() {
		return "Rocket [launchPadType=" + launchPadType + "]";
	}

}
