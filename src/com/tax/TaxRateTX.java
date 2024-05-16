package com.tax;

public class TaxRateTX implements TaxStrategy{

	public static final double STATE_FIX_RATE = 0.0625; //6.25% Texas
	
	@Override
	public double computeSalesTax(double amount)
	{
		return STATE_FIX_RATE * amount;
	}
}
