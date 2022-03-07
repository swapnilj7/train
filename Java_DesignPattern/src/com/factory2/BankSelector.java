package com.factory2;

public class BankSelector {

	public static void main(String[] args) {
		float rateOfInterest = new BankFactory().selectBank("axis").getRateOfInterest();
		
		
		System.out.println(rateOfInterest);
	}
	
}
