package com.pe.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

public class Profile {
	private int id;
	private String name;
	private Date dateOfBirth;
	private File picture;
	private URL webSite;
	private String[] friends;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setPicture(File picture) {
		this.picture = picture;
	}

	public void setWebSite(URL webSite) {
		this.webSite = webSite;
	}

	public void setFriends(String[] friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + ", picture=" + picture + ", webSite=" + webSite
				+ ", friends=" + Arrays.toString(friends) + "]";
	}

}
