package sg2;


public class passbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		int y=2;
		System.out.print("values before primitive modification:");;
		System.out.println("x="+x+";y= " +y);
		modifyPrimitiveTypes(x,y);
		System.out.print("values after primitive modification:");;
		System.out.println("x="+x+";y= " +y);
	}
	private static void modifyPrimitiveTypes(int x,int y)
	{
		x=5;
		y=10;
		
		
		

	}

}
class user{
	
	String name;
	int age;
	
	public user(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public user() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
