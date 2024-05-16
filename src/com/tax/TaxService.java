package com.tax;

public class TaxService {
	
	private TaxStrategy taxStrategy;
	
	public void setTaxStrategy(TaxStrategy taxStrategy) {
		this.taxStrategy = taxStrategy;
	}

	public double computeTax(double amount)
	{
		return taxStrategy.computeSalesTax(amount);
	}
}
