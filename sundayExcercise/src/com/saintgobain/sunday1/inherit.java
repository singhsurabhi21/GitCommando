package com.saintgobain.sunday1;
 class inherit {
	 void eat()
	 {
		 System.out.println("tee");
	 }}
	 class inherit2 extends inherit{
		 int age=10;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inherit2 i2=new inherit2();
		System.out.println(i2.age);
		i2.eat();

	}}


