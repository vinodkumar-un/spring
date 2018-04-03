package com.ps.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/ps/test/aeroeng.properties")
public class Astronaut {
	@Autowired
	private Environment environment;
	
	@Value("${hours}")
	private String hoursOfStay;

	public void test() {
		String place = null;

		place = environment.getProperty("astronautPlace");
		System.out.println("remote testing at  : " + place);
	}

	@Override
	public String toString() {
		return "Astronaut [hoursOfStay=" + hoursOfStay + ", environment="
				+ environment + "]";
	}

}
