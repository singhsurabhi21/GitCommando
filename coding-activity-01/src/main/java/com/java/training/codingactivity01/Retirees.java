package com.java.training.codingactivity01;

public class Retirees {
	int retires[]=new int[10];
	int x=0;
	public int getRetiresAgeList(int ages[])
	{
		for(int i=0;i<ages.length;i++) {
			if(ages[i]>60) {
				x++;
			}
		}
		return x;
	}
	public void displayRetiresAge() {
		System.out.print("Ages for retirement :");
		for(int i=0;i<x;i++) {
			System.out.print(retires[i] +" ");
			
		}
	}

}
