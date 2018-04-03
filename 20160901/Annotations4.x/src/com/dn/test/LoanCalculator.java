package com.dn.test;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("cacheManager")
public class LoanCalculator {
	public LoanCalculator() {
		System.out.println("loan calculator initialized..");
	}

}
