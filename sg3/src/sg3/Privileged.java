package sg3;

public class Privileged extends Account{
	double overDraftLimit;
	
	public Privileged(Customer customer, String accountType, double overDraftLimit) {
		super(customer, accountType);
		
	}
	public void withdraw(double amount) {
		super.withdraw(amount);
		System.out.println("please wait while withdrawing" +amount);
		if(amount<overDraftLimit) {
			overDraftLimit=overDraftLimit+super.balance;
			System.out.println("amount requested");
			System.out.println("Successful transaction");
			super.balance=super.balance-amount;
		}
		else {
			System.out.println("overdraft limit");
		}
		
	}
	public void display() {
		super.display();
			
		System.out.println("overdraft limit" +overDraftLimit);
		
	}
}
