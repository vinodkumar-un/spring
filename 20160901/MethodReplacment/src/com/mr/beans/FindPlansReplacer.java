package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlansReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object target, Method method, Object[] args)
			throws Throwable {
		if (method.getName().equals("findPlans")) {
			int ageGroup = 0;
			int zip = 0;
			int copay = 0;
			int networkType = 0;
			int coverageType = 0;

			ageGroup = (Integer) args[0];
			zip = (Integer) args[1];
			copay = (Integer) args[2];
			networkType = (Integer) args[3];
			coverageType = (Integer) args[4];
			System.out.println("computing the matching plans with ageGroup : "
					+ ageGroup + " zip : " + zip + " copay : " + copay
					+ " networkType : " + networkType + " coverageType : "
					+ coverageType);
			// business rules in re-computing the plans with new algorithm
			return new String[] { "Abhaya Gold", "Abhaya Silver" };
		}
		return null;
	}
}
