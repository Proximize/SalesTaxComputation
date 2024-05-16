package com.tax;

public class TaxRateCA implements TaxStrategy{

	public static final double STATE_FIX_RATE = 0.065; //6.5% California
	
	@Override
	public double computeSalesTax(double amount)
	{
		return STATE_FIX_RATE * amount;
	}
}
