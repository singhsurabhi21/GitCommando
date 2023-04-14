package com.sg.ppt;



public class MyGenericProgram {

	
	  public static void main(String[] args) {
	      MyGenericClass<String> stringObj = new MyGenericClass<>("Hello");
	      MyGenericClass<Integer> intObj = new MyGenericClass<>(42);

	      String strValue = stringObj.getValue();  // returns "Hello"
	      int intValue = intObj.getValue();        // returns 42

	      System.out.println("String value: " + strValue);
	      System.out.println("Integer value: " + intValue);
	   }
	}

	class MyGenericClass<T> {
	   private T value;

	   public MyGenericClass(T value) {
	      this.value = value;
	   }

	   public T getValue() {
	      return value;
	   }

	   public void setValue(T value) {
	      this.value = value;
	   }
	}
