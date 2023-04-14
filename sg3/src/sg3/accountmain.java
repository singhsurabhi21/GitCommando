package sg3;

public class accountmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer("surabhi","singh");
		Privileged p=new Privileged(c,"Privileged",1000);
		System.out.println("Depositing 50");
		p.deposit(50);
		System.out.println("\n");
		p.withdraw(550);
		System.out.println("\n");
		p.withdraw(1000);
		System.out.println("\n");
		p.display();

	}

}
