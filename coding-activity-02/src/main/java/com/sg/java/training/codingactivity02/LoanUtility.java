package com.sg.java.training.codingactivity02;

public class LoanUtility {
	public void validateLoan(int Contribution_Month) throws InvalidLoanException {
		if(Contribution_Month<36) {
			throw new InvalidLoanException("invalid month contribution enter valid details");
			
		
		}
		else
		{
			System.out.println(" ");
		}
	
	}

}
