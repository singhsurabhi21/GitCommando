package sg3;

class ParentClass{
	int a;
	private ParentClass(){
		System.out.println("Inside ParentClass constructor!");
	}
}
class ChildClass extends ParentClass{

	ChildClass(){
		System.out.println("Inside ChildClass constructor!!");		
	}
}
class ChildChildClass extends ChildClass{

	ChildChildClass(){
		System.out.println("Inside ChildChildClass constructor!!");		
	}	
}
public class parent {

	public static void main(String[] args) {

		ChildChildClass obj = new ChildChildClass();

	}

}


