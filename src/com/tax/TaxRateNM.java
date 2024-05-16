package com.tax;

public class TaxRateNM implements TaxStrategy{

	public static final double STATE_FIX_RATE = 0.05125; //5.125% New Mexico
	
	@Override
	public double computeSalesTax(double amount)
	{
		return STATE_FIX_RATE * amount;
	}
}
