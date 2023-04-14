package com.saintgobain.sunday1;

public class constructor {
	constructor(){
		System.out.println("hello");
	}
	constructor(int age){
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor ct=new constructor();
		constructor ct2=new constructor(10);
		

	}

}
