package com;
import com.tax.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		TaxService taxService = new TaxService();
		Scanner scanner = new Scanner(System.in);
		double amount = 0;
		double salesTax = 0;
		//UI and input
	    System.out.println("STATE TAX PERCENTAGE \nMN = 6.78% \nCA = 6.5% \nNY = 4.00% \nNM = 5.125% \nTX = 6.25%");
	    System.out.println("ENTER AMOUNT: ");
	   
		try {amount = Double.parseDouble(scanner.nextLine());} 
		catch (Exception e) {System.out.println("PLEASE ENTER PROPER AMOUNT");}
	    System.out.println("ENTER STATE: ");
	    String state = scanner.nextLine().toUpperCase(); 
	    scanner.close();
	    
		//Switch
		switch(state) {
		case "MN":
			taxService.setTaxStrategy(new TaxRateMN());
			break;
		case "CA":
			taxService.setTaxStrategy(new TaxRateCA());
			break;
		case "NY":
			taxService.setTaxStrategy(new TaxRateNY());
			break;
		case "NM":
			taxService.setTaxStrategy(new TaxRateNM());
			break;
		case "TX":
			taxService.setTaxStrategy(new TaxRateTX());
			break;
		}
		//
		
		try {salesTax = taxService.computeTax(amount);} 
		catch (Exception e) {System.out.println("PLEASE ENTER A VALID STATE");}
		
		System.out.println("TAX = $" + salesTax);
	}

}




