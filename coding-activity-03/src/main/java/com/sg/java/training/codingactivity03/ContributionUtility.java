package com.sg.java.training.codingactivity03;

import java.util.ArrayList;
import java.util.List;

public class ContributionUtility {
	private List<Contribution> contributionList = new ArrayList<Contribution>();

	public List<Contribution> getContributionList() {
		return contributionList;
	}

	public void setContributionList(List<Contribution> contributionList) {
		this.contributionList = contributionList;
	}

	public void addContribution(Contribution contribution) {
		contributionList.add(contribution);
	}

	public void updateContribution(String ContributionDate, Contribution contribution) {
		if (contribution.getContributionDate().equals(ContributionDate)) {
			contribution.setContributionAmount(1000);
		}
	}

	public void display() {
		for (int i = 0; i < contributionList.size(); i++) {
			System.out.print(contributionList.get(i).getContributionDate() + " ");

			System.out.println(contributionList.get(i).getContributionAmount());
		}

	}
}
