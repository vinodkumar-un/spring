package com.ba.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ApplyDiscountsAdvice implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object ret, Method method, Object[] args,
			Object target) throws Throwable {
		Double billAmount = null;
		RewardCard rewardCard = null;

		billAmount = (Double) ret;
		rewardCard = (RewardCard) args[1];

		if (rewardCard.getType().equals("gold") && billAmount > 3000) {
			System.out
					.println("Congratulations, you can avail 40% discount on your next purchase, coupon code : cp40");
		} else if (rewardCard.getType().equals("silver") && billAmount > 4000) {
			System.out
					.println("Congratulations, you can avail 30% discount on your next purchase, coupon code : cp30");
		}

	}
}
