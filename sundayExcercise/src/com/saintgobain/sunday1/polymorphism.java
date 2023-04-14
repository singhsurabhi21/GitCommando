package com.saintgobain.sunday1;

 class polymorphism {
	void yes() {
		System.out.println("yes");
	}
 
	
		void yes(int a){
		System.out.println(a);
	}
	}
	class yes2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism p=new polymorphism();
		p.yes();
		p.yes(10);
		
	}

}
