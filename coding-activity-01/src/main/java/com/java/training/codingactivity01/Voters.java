package com.java.training.codingactivity01;

public class Voters {
	int voters[]=new int[10];
	int x=0;
	public int getVoterAgeList(int ages[]) {
		for(int i=0;i<ages.length;i++) {
			if(ages[i]>18) {
				voters[x]=ages[i];
				x++;
			}
		}
		return x;
	}
	public void displayVoterAge()
	{System.out.print("Ages allowed to vote :");
	for(int i=0;i<x;i++) {
		System.out.println(voters[i] +" ");
	}
	}
}
