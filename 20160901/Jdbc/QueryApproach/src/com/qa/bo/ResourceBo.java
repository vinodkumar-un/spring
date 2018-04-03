package com.qa.bo;

public class ResourceBo {
	private int resourceNo;
	private String resourceName;
	private String designation;
	private int experience;
	private String primarySkill;

	public int getResourceNo() {
		return resourceNo;
	}

	public void setResourceNo(int resourceNo) {
		this.resourceNo = resourceNo;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	@Override
	public String toString() {
		return "ResourceBo [resourceNo=" + resourceNo + ", resourceName="
				+ resourceName + ", designation=" + designation
				+ ", experience=" + experience + ", primarySkill="
				+ primarySkill + "]";
	}

}
