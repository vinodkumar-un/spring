package com.mba.util;

import com.mba.security.bean.UserInfo;

public class SecurityHolder {
	private static SecurityHolder instance;
	private ThreadLocal<UserInfo> credentials;

	private SecurityHolder() {
		credentials = new ThreadLocal<UserInfo>();
	}

	public synchronized static SecurityHolder getInstance() {
		if (instance == null) {
			instance = new SecurityHolder();
		}
		return instance;
	}

	public void login(String user, String password) {
		UserInfo userInfo = null;

		userInfo = new UserInfo(user, password);
		credentials.set(userInfo);
	}

	public void logout() {
		credentials.set(null);
	}

	public boolean isAuthenticated() {
		UserInfo userInfo = null;

		userInfo = credentials.get();
		if (userInfo != null) {
			if (userInfo.getUser().equals("john")
					&& userInfo.getPassword().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		UserInfo userInfo = null;

		userInfo = credentials.get();
		if (userInfo != null) {
			return userInfo.getUser();
		}
		return null;
	}
}
