package com.sg.ppt;

abstract class Person{
	abstract void eat();
	}

public class anonymouse {
	public static void main(String args[]) {
		Person p=new Person() {
			void eat() {
				System.out.println("nice fruits");}
			};
			p.eat();
		}
	}


