package sg.gov.cpf.beacon.module14;

public class Excercise14 {
	public static void main(String args[]) {
		Employee emp=new Employee("sur",21,"female");
		//emp.display();
		EmployeeValidation ev= new EmployeeValidation();
	
	    ev.validateInput(emp);

}
}
