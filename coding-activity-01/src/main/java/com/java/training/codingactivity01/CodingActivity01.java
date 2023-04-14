package com.java.training.codingactivity01;

import java.util.Scanner;

public class CodingActivity01 {

	public static void displayOptions(int ages[]) {
		// TODO Auto-generated method stub
		Voters vote=new Voters();
		Retirees retire=new Retirees();
		System.out.print("Ages :");
		for(int i=0;i<ages.length;i++) {
			System.out.print(ages[i]+" ");
		}
		int choice;
		do {
			System.out.println("\nChoose from the following choices.");
			System.out.println("1 Display ages that are allowed to vote");
			System.out.println("2 Display ages that are allowed to retire");
			System.out.println("3 Exit");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:vote.getVoterAgeList(ages);
			vote.displayVoterAge();
			break;
			case 2:
				retire.getRetiresAgeList(ages);
			retire.displayRetiresAge();
			break;
			case 3:System.out.println("Program Terminated");
			break;
			default:System.out.println("Invalid Option");
			break;
			}

	}
		while(choice<3);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ages[]=new int[10];
	System.out.println("enter 10 ages");
	for(int i=0;i<ages.length;i++) {
		ages[i]=sc.nextInt();
	}displayOptions(ages);
	}

}
