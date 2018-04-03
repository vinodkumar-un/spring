package com.don.beans;

import java.util.Properties;

import com.don.util.Cache;

public class LoanService {
	private Cache cache;

	public double calculateInterestAmount(long principle, int tenure,
			String loanType, String profession, String place) throws Exception {
		Properties props = null;
		float rateOfInterest = 0.0f;
		double interestAmount = 0.0f;

		if (cache.containsKey("city-ri") == false) {
			throw new Exception("no cities found");
		}
		props = (Properties) cache.get("city-ri");
		if (props.containsKey(place) == false) {
			throw new Exception("no city found");
		}
		rateOfInterest = Float.parseFloat(props.getProperty(place));
		interestAmount = principle * tenure * rateOfInterest / 100;
		return interestAmount;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
