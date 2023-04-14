package com.sg.java.training.codingactivity02;

import java.util.ArrayList;
import java.util.List;

public abstract class Loan {
	private Customer customer;
	private List<Payment> payments=new ArrayList<Payment>();
	public Loan(Customer customer) {
		super();
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	public void addPayment(Payment payment) {
		payments.add(payment);
		
	}
	public double getTotalPayment() {
		double totalPayment=0.0;
		for(int i=0;i<payments.size();i++) {
			totalPayment=totalPayment+payments.get(i).getAmountPaid();
		}
		return totalPayment;
	}
	public abstract  double getInteresrRate();
	
	public double getTotalInterest() {
		return 0;
	}
	public double getMonthlyAmortization() {
		double monthlyWithoutInterest=customer.getAmountLoan();
		double monthlyInterest= monthlyWithoutInterest* getInteresrRate();
		return customer.getTerms();
		
		
	}
	public double getOutstandingBalance() {
		return 0;
	}
	public void printStatement() {
		System.out.println("Interest Rate :\t\t" + getInteresrRate());
		System.out.format("Monthly Authorization: \t%.2f\n", getMonthlyAmortization());
		System.out.println("----------------------");
		System.out.println("Mode of Payment\t\tAmount");
		//getPayments().forEach(p->System.out.formate(p.getModesOfPayment()+ "\t\t\t%.2f\n",p.getAmountPaid()));
		System.out.println("--------------------");
		System.out.format("Total Payment :\t\t%.2f\n",getTotalPayment());
		System.out.format("Outstanding Balance :\t\t%.2f\n",getOutstandingBalance());		
	}

	

}

