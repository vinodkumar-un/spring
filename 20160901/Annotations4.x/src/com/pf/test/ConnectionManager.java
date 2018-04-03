package com.pf.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConnectionManager {
	@Value("${db.driverClassname}")
	private String driverClassname;
	@Value("${db.url}")
	private String url;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;

	@Override
	public String toString() {
		return "ConnectionManager [driverClassname=" + driverClassname
				+ ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}

}
