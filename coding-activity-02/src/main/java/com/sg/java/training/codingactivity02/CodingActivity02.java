package com.sg.java.training.codingactivity02;

public class CodingActivity02 {

	public static void main(String[] args) throws InvalidLoanException {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.setFirstName("sura");
		c.setLastName("sin");
		c.setAmountLoan(3000);
		c.setTerms(39);
		c.setMonthsOfContribution(40);
		LoanUtility lu=new LoanUtility();
		lu.validateLoan(c.getMonthsOfContribution());
		c.displayDetails();
		Loan loan1=new SalaryLoan(c);
		Payment p1=new Payment(916.6,"Cash",1);
		Payment p2=new Payment(920.0,"Bank",1);
		
		Payment p3=new Payment(930.0,"Check",1);
		loan1.addPayment(p1);
		loan1.addPayment(p2);
		loan1.addPayment(p3);
		
		

	}

}
