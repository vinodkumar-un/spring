package com.mr.beans;

public class PlanFinder {
	public String[] findPlans(int ageGroup, int zip, int copay,
			int networkType, int coverageType) {
		return new String[] { "Jeevan Anand", "Jeevan Saral" };
	}

	public String[] findPlans(int ageGroup, int zip) {
		return new String[] { "plan1", "plan2" };
	}
}
