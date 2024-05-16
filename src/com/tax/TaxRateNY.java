package com.tax;

public class TaxRateNY implements TaxStrategy{

	public static final double STATE_FIX_RATE = 0.04; //4.00% New York
	
	@Override
	public double computeSalesTax(double amount)
	{
		return STATE_FIX_RATE * amount;
	}
}
