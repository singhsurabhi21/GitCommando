package sg2;

public class passbyreference {
	public static void main(String[] args) {
		user student=new user();
		user student1=new user("surabhi",21);
		user student2=student1;
		System.out.println(student1==student2);
		System.out.println("value of name before student modification =" + student.getName());
		modifyStudent(student);
		System.out.println("value of name after student modification =" + student.getName());
	}
	private static void modifyStudent(user student) {
		student.setName("surabhi");
		
	}

}
