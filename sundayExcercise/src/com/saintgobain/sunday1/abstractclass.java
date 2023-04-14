package com.saintgobain.sunday1;

 abstract class abstractclass {
	public abstract void sum();
	public void add() {
		System.out.println(4+5);
	}
 }
 class ab2 extends abstractclass{
	 public void sum() {
		 System.out.println("tt");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ab2 ab=new ab2();
		ab.sum();
		
		ab.add();

	}

}
