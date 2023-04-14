package sg.gov.cpf.beacon.module14;

public class EmployeeValidation extends Exception {
	public void validateInput(Employee emp){
		
		int len=emp.name.length();
		if(len<3) {
			System.out.println(emp.name);
		}
		
		else if(emp.age>=18 && emp.age<=65) {
			System.out.println("invalid");
		}
			
		
		else if(emp.gender=="male" | emp.gender=="female"){
	}
		else {
			DetailException();
		}

}}
