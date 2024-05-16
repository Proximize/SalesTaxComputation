package com.tax;

public class TaxRateMN implements TaxStrategy {
	
	public static final double STATE_FIX_RATE = 0.0678; //6.78% Minnesota
	
	@Override
	public double computeSalesTax(double amount)
	{
		return STATE_FIX_RATE * amount;
	}
}
