package javaProjectSG;
class Car {
	  String make;
	  String model;
	  int year;

	  public Car(String make, String model, int year) {
	    this.make = make;
	    this.model = model;
	    this.year = year;
	  }

	  public void start() {
	    System.out.println("The " + year + " " + make + " " + model + " has started.");
	  }
	}

public class classObject {
	 public static void main(String[] args) {
		    Car myCar = new Car("Honda", "Civic", 2020);
		    myCar.start();
		  }

}
