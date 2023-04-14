package javaProjectSG;

public class Exception {
	 public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		   
		   try {
		   int a[]=new int[5];  
		   a[10]=50; //ArrayIndexOutOfBoundsException  
		   
		   
		   }
		   
		   
		   catch(ArithmeticException e)
		   {
			   System.out.println(e);
			   }  
		   
		   catch(Exception e)
		   {
			   System.out.println(e);
			   }
		   
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  

}
