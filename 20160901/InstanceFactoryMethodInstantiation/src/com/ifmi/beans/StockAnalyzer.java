package com.ifmi.beans;

import com.ifmi.ext.beans.StockManager;

public class StockAnalyzer {
	private StockManager stockManager;

	public void analyze(String stockName) {
		double price = 0;

		price = stockManager.getStockPrice(stockName);
		System.out.println("price:  " + price);
	}

	public void setStockManager(StockManager stockManager) {
		this.stockManager = stockManager;
	}

}
