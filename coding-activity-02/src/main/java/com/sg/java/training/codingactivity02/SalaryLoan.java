package com.sg.java.training.codingactivity02;

public class SalaryLoan extends Loan {

	public SalaryLoan(Customer customer) {
		super(customer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getInteresrRate() {
		// TODO Auto-generated method stub
		return 0.01;
	}
}
