package com.saintgobain.sunday1;

public class staticMethod {
	static void mystaticmethod() {
		System.out.println("hello");
	}
	public void mypublicmethod() {
		System.out.println("hh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mystaticmethod();
		staticMethod sm=new staticMethod();
		sm.mypublicmethod();

	}

}
