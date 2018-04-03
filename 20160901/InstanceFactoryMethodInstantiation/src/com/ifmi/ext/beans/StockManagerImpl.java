package com.ifmi.ext.beans;

public class StockManagerImpl implements StockManager {
	@Override
	public double getStockPrice(String stockName) {
		double price = 0;

		if (stockName != null && stockName.trim().length() > 0) {
			if (stockName.equals("cipla")) {
				price = 353.23;
			} else if (stockName.equals("ranbaxy")) {
				price = 928.34;
			} else {
				price = 293.34;
			}
		}
		return price;
	}
}
