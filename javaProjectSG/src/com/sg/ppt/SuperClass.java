package com.sg.ppt;

class Animal {
	   String name;
	   
	   public Animal(String name) {
	      this.name = name;
	   }
	}

	class SuperClass extends Animal {
	   int age;
	   
	   public SuperClass(String name, int age) {
	      super(name); // calling the constructor of the Animal class
	      this.age = age;
	   }
	}
