package com.sg.java.training.codingactivity03;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contribution c = new Contribution("12/12", 500);
		ContributionUtility cu = new ContributionUtility();
		Contribution c1 = new Contribution("11/11", 700);
		cu.addContribution(c);
		cu.addContribution(c1);
		cu.display();
		cu.updateContribution("12/12", c);
		cu.display();
	}
}
