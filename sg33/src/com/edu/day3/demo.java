package com.edu.day3;

public abstract class demo {
	public String bankName;
	public demo(String bankName) {
		this.bankName=bankName;
	}
	public abstract float getRateOfInterest();
	public void displayInterestRate() {
		System.out.println(this.bankName +"interest rate is" +getRateOfInterest() +"%.");
	}

	
}
