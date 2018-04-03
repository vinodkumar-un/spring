package com.ba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ba.beans.ApplyDiscountsAdvice;
import com.ba.beans.BillGenerator;
import com.ba.beans.RewardCard;

public class BATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new BillGenerator());
		pf.addAdvice(new ApplyDiscountsAdvice());

		BillGenerator proxy = (BillGenerator) pf.getProxy();
		RewardCard rewardCard = new RewardCard();
		rewardCard.setType("gold");
		double amount = proxy.doBilling(null, rewardCard);
		System.out.println("amount : " + amount);

	}
}
