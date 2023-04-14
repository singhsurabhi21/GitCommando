package com.edu.coding_excercise;

public class Account {
	private Contributor c;
	private String accountType;
	public Account(Contributor c, String accountType) {
		super();
		this.c = c;
		this.accountType = accountType;
	}
	public Contributor getC() {
		return c;
	}
	public void setC(Contributor c) {
		this.c = c;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	

}
