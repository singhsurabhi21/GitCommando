package com.sg.java.training.codingactivity02;

public class Customer {
	private String firstName;
	private String lastName;
	private double amountLoan;
	private int terms;
	private int monthsOfContribution;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getAmountLoan() {
		return amountLoan;
	}
	public void setAmountLoan(double amountLoan) {
		this.amountLoan = amountLoan;
	}
	public int getTerms() {
		return terms;
	}
	public void setTerms(int terms) {
		this.terms = terms;
	}
	public int getMonthsOfContribution() {
		return monthsOfContribution;
	}
	public void setMonthsOfContribution(int monthsOfContribution) {
		this.monthsOfContribution = monthsOfContribution;
	}
	public void displayDetails() {
		Customer c=new Customer();
		c.setFirstName("surabhi");
		c.setLastName("singh");
		c.setAmountLoan(30000);
		c.setTerms(36);
		c.setMonthsOfContribution(40);
		System.out.println("Customer Name :" +c.getFirstName() +" " +c.getLastName());
		System.out.println("Loan Amount :" +c.getAmountLoan());
		System.out.println("Loan Terms :"+ " "+c.getTerms());
		System.out.println("Months of contro:" +c.getMonthsOfContribution());
	}

}
