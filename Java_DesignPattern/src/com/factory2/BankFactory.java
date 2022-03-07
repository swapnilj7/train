package com.factory2;

public class BankFactory {
	
	public RateOfInterest selectBank(String bank) {
		
		if(bank.equalsIgnoreCase("sbi")) {
			return new SBIbank();
		}
		else if (bank.equalsIgnoreCase("icici")) {
			return new ICICIBank();
		}
		
	else if (bank.equalsIgnoreCase("Axis")) {
		return new AxisBank();
		
	}
		return null;
	}
}
