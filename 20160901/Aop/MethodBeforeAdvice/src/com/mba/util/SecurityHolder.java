package com.mba.util;

import com.mba.bean.UserDetails;

public class SecurityHolder {
	private static SecurityHolder instance;
	private ThreadLocal<UserDetails> userCredentails;

	private SecurityHolder() {
		userCredentails = new ThreadLocal<UserDetails>();
	}

	public synchronized static SecurityHolder getInstance() {
		if (instance == null) {
			instance = new SecurityHolder();
		}
		return instance;
	}

	/**
	 * Store user/password of this user at current thread of execution
	 * 
	 * @param user
	 * @param password
	 */
	public void login(String user, String password) {
		UserDetails userDetails = null;

		userDetails = new UserDetails(user, password);
		userCredentails.set(userDetails);
	}

	public void logout() {
		userCredentails.set(null);
	}

	public boolean authenticate() {
		UserDetails userDetails = null;

		userDetails = userCredentails.get();
		if (userDetails != null) {
			if (userDetails.getUser().equals("john")
					&& userDetails.getPassword().equals("welcome1")) {
				return true;
			}
		}
		return false;
	}

	public String getLoggedInUser() {
		UserDetails userDetails = null;

		userDetails = userCredentails.get();
		if (userDetails != null) {
			return userDetails.getUser();
		}
		return null;
	}
}
