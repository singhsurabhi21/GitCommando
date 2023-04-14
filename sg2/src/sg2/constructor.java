package sg2;

public class constructor {

	public static void main(String[] args) {
		constructor d = new constructor();
	}

	public constructor() {
		System.out.println("Employee Constructor");
	}


	public constructor Employee() {
		System.out.println("Employee Method");
		return new constructor();
	}
		
	}


