package com.ifmi.beans;

import com.ifmi.ext.beans.StockManager;
import com.ifmi.ext.beans.StockManagerImpl;

public class BseStockTradeServiceLocator {
	public StockManager locateStockManager() {
		// jndi lookup to retrieve the stock manager object
		return new StockManagerImpl(); // in actual application the impl class
										// will not be available
	}
}
